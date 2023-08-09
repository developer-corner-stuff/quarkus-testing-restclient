package io.arrogantprogrammer.quarkus.testing.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.arrogantprogrammer.quarkus.testing.wiremock.utils.TestValues;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class WiremockApiFootballProxy implements QuarkusTestResourceLifecycleManager {

    private WireMockServer wireMockServer;

    public Map<String, String> start() {
        wireMockServer = new WireMockServer(8089);
        wireMockServer.start();
        configureFor(8089);

        stubFor(
                get(urlEqualTo("/fixtures?league=39&season=2023&date=2023-08-11"))
                        .willReturn(
                                aResponse()
                                        .withHeader("Content-Type", "application/json")
                                        .withBody(TestValues.RESPONSE_FIXTURES)));

        stubFor(
                get(urlMatching(".*"))
                        .atPriority(10)
                        .willReturn(aResponse().proxiedFrom("https://v3.football.api-sports.io")));

        return Collections.singletonMap("quarkus.rest-client.football-api.url", wireMockServer.baseUrl());
    }

    @Override
    public void stop() {
        if (wireMockServer != null) {
            wireMockServer.stop();
        }
    }
}

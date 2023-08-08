package io.arrogantprogrammer.quarkus.testing.wiremock.utils;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;


public class PremierLeageStandingsTestLifecycleManager implements QuarkusTestResourceLifecycleManager {

    private WireMockServer wireMockServer;

    @Override
    public Map<String, String> start() {

        wireMockServer = new WireMockServer();
        wireMockServer.start();

        wireMockServer.stubFor(get(urlEqualTo(TestValues.API_URL))
                .withQueryParams(new HashMap<>(){{
                    put("league", equalTo("39"));
                    put("season", equalTo("2023"));
                    put("date", equalTo("2023-08-11"));
                }})
                .withHeader(TestValues.API_AUTH_KEY, equalTo(TestValues.API_AUTH_VALUE))
                .willReturn(aResponse()
                        .withBody(TestValues.RESPONSE_FIXTURES)));

        return Collections.singletonMap("quarkus.rest-client.football-api.url", wireMockServer.baseUrl());
    }

    @Override
    public void stop() {

        wireMockServer.stop();
    }
}

package io.arrogantprogrammer.quarkus.testing.wiremock.utils;

import com.github.tomakehurst.wiremock.client.WireMock;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.tomakehurst.wiremock.client.WireMock.*;


public class PremierLeageStandingsTestLifecycleManager implements QuarkusTestResourceLifecycleManager {

    static final Logger LOGGER = LoggerFactory.getLogger(PremierLeageStandingsTestLifecycleManager.class);

    private WireMockServer wireMockServer;

    @Override
    public Map<String, String> start() {

        wireMockServer = new WireMockServer(8089);
        wireMockServer.start();
        configureFor(8089);

        LOGGER.debug("started WireMockServer");

        stubFor(get(urlMatching(".*")).atPriority(10)
                .willReturn(aResponse().proxiedFrom("https://v3.football.api-sports.io")));

        stubFor(get(urlEqualTo("/fixtures"))
                .atPriority(1)
                .withHeader("x-apisports-key", equalTo("b82c3f6f738fc7196d75bfba223a2c9f"))
                .withQueryParams(new HashMap<>(){{
                    put("league", equalTo("39"));
                    put("season", equalTo("2023"));
                    put("date", equalTo("2023-08-11"));
                }})
                .willReturn(
                        aResponse()
                        .withBody(TestValues.RESPONSE_FIXTURES)));



        wireMockServer.getStubMappings().stream().forEach(stubMapping -> {
            LOGGER.debug(stubMapping.toString());
        });

        return Collections.singletonMap("quarkus.rest-client.football-api.url", wireMockServer.baseUrl());
    }

    @Override
    public void stop() {

        wireMockServer.stop();
    }
}

package io.arrogantprogrammer.quarkus.testing.wiremock;

import io.arrogantprogrammer.quarkus.testing.wiremock.domain.FootballApiResponse;
import io.arrogantprogrammer.quarkus.testing.wiremock.utils.PremierLeageStandingsTestLifecycleManager;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
@QuarkusTestResource(WiremockApiFootballProxy.class)
public class ApiFootballServiceTest {

    static final Logger LOGGER = LoggerFactory.getLogger(ApiFootballServiceTest.class);

    @Inject
    @RestClient
    ApiFootballService apiFootballService;

    @Test
    public void testApiService() {
        FootballApiResponse footballApiResponse = apiFootballService.getFixturesByDate("39", "2023", "2023-08-11");
        assertNotNull(footballApiResponse);
        LOGGER.debug(footballApiResponse.toString());
        assertEquals("Maine Road", footballApiResponse.getResponse().get(0).getFixture().getVenue().getName());
    }
}

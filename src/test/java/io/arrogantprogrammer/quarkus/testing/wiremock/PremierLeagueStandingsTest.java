package io.arrogantprogrammer.quarkus.testing.wiremock;

import io.arrogantprogrammer.quarkus.testing.wiremock.utils.TestValues;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class PremierLeagueStandingsTest {

    static final Logger LOGGER = LoggerFactory.getLogger(PremierLeagueStandingsTest.class);

    @InjectMock
    @RestClient
    ApiFootballService apiFootballService;

    @BeforeEach
    public void setUp() {
        Mockito.when(apiFootballService.getFixturesByDate("39", "2023", "2023-08-11")).thenReturn(TestValues.mockApiFootballResponse());
    }

    @Test
    public void testFixtures() {

        Response res  = given()
                .get("/plfixtures")
                .then().extract().response();

        assertNotNull(res);

        LOGGER.debug(res.toString());

        JsonPath jsonPath = new JsonPath(res.asString());
        String league = jsonPath.getString("parameters.league");
        String venue = jsonPath.getString("response[0].fixture.venue.name");

        assertEquals("Maine Road", venue);
    }

}

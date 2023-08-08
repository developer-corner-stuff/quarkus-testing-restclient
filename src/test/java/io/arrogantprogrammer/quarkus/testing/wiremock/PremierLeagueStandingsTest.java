package io.arrogantprogrammer.quarkus.testing.wiremock;

import io.arrogantprogrammer.quarkus.testing.wiremock.utils.PremierLeageStandingsTestLifecycleManager;
import io.arrogantprogrammer.quarkus.testing.wiremock.utils.TestValues;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest @QuarkusTestResource(PremierLeageStandingsTestLifecycleManager.class)
public class PremierLeagueStandingsTest {

    static final Logger LOGGER = LoggerFactory.getLogger(PremierLeagueStandingsTest.class);
    @Test
    public void testFixtures() {

        Response res  = given()
                .get("/fixtures").then().extract().response();

        LOGGER.debug(res.toString());
        JsonPath jsonPath = new JsonPath(res.asString());
        String league = jsonPath.getString("parameters.league");
        String venue = jsonPath.getString("response[0].fixture.venue.name");

        assertEquals("Turf Moor", venue);
    }

}

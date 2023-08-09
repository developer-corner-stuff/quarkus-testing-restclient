package io.arrogantprogrammer.quarkus.testing.wiremock;

import io.arrogantprogrammer.quarkus.testing.wiremock.domain.FootballApiResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

@Path("/plfixtures")
public class FootballFixtureService {

    private static final Logger LOGGER = getLogger(FootballFixtureService.class);

    @RestClient
    ApiFootballService apiFootballService;

    @GET
    public Response getPremierLeagueFixtures() {
        FootballApiResponse footballApiResponse = apiFootballService.getFixturesByDate("39", "2023", "2023-08-11");
        return Response.ok().entity(footballApiResponse).build();
    }
}

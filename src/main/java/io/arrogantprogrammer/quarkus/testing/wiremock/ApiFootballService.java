package io.arrogantprogrammer.quarkus.testing.wiremock;

import io.arrogantprogrammer.quarkus.testing.wiremock.domain.FootballApiResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "football-api")
@ClientHeaderParam(name = "x-apisports-key", value = "${football-api.key}")
public interface ApiFootballService {

    @GET
    @Path("/fixtures")
    public FootballApiResponse getFixturesByDate(@QueryParam("league") String league, @QueryParam("season") String season, @QueryParam("date") String date);


}

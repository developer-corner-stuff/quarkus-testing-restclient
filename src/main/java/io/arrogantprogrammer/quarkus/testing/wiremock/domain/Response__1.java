
package io.arrogantprogrammer.quarkus.testing.wiremock.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fixture",
    "league",
    "teams",
    "goals",
    "score"
})
@Generated("jsonschema2pojo")
public class Response__1 {

    @JsonProperty("fixture")
    private Fixture fixture;
    @JsonProperty("league")
    private League league;
    @JsonProperty("teams")
    private Teams teams;
    @JsonProperty("goals")
    private Goals goals;
    @JsonProperty("score")
    private Score score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fixture")
    public Fixture getFixture() {
        return fixture;
    }

    @JsonProperty("fixture")
    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Response__1 withFixture(Fixture fixture) {
        this.fixture = fixture;
        return this;
    }

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    public Response__1 withLeague(League league) {
        this.league = league;
        return this;
    }

    @JsonProperty("teams")
    public Teams getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Response__1 withTeams(Teams teams) {
        this.teams = teams;
        return this;
    }

    @JsonProperty("goals")
    public Goals getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Response__1 withGoals(Goals goals) {
        this.goals = goals;
        return this;
    }

    @JsonProperty("score")
    public Score getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Score score) {
        this.score = score;
    }

    public Response__1 withScore(Score score) {
        this.score = score;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Response__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Response__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fixture");
        sb.append('=');
        sb.append(((this.fixture == null)?"<null>":this.fixture));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null)?"<null>":this.goals));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.fixture == null)? 0 :this.fixture.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.goals == null)? 0 :this.goals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response__1) == false) {
            return false;
        }
        Response__1 rhs = ((Response__1) other);
        return (((((((this.fixture == rhs.fixture)||((this.fixture!= null)&&this.fixture.equals(rhs.fixture)))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.goals == rhs.goals)||((this.goals!= null)&&this.goals.equals(rhs.goals))));
    }

}


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
    "id",
    "referee",
    "timezone",
    "date",
    "timestamp",
    "periods",
    "venue",
    "status"
})
@Generated("jsonschema2pojo")
public class Fixture {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("referee")
    private Object referee;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("date")
    private String date;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("periods")
    private Periods periods;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("status")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Fixture withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("referee")
    public Object getReferee() {
        return referee;
    }

    @JsonProperty("referee")
    public void setReferee(Object referee) {
        this.referee = referee;
    }

    public Fixture withReferee(Object referee) {
        this.referee = referee;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Fixture withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Fixture withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Fixture withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("periods")
    public Periods getPeriods() {
        return periods;
    }

    @JsonProperty("periods")
    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    public Fixture withPeriods(Periods periods) {
        this.periods = periods;
        return this;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Fixture withVenue(Venue venue) {
        this.venue = venue;
        return this;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public Fixture withStatus(Status status) {
        this.status = status;
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

    public Fixture withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fixture.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("referee");
        sb.append('=');
        sb.append(((this.referee == null)?"<null>":this.referee));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("periods");
        sb.append('=');
        sb.append(((this.periods == null)?"<null>":this.periods));
        sb.append(',');
        sb.append("venue");
        sb.append('=');
        sb.append(((this.venue == null)?"<null>":this.venue));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.venue == null)? 0 :this.venue.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.periods == null)? 0 :this.periods.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.referee == null)? 0 :this.referee.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fixture) == false) {
            return false;
        }
        Fixture rhs = ((Fixture) other);
        return ((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.venue == rhs.venue)||((this.venue!= null)&&this.venue.equals(rhs.venue))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.periods == rhs.periods)||((this.periods!= null)&&this.periods.equals(rhs.periods))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.referee == rhs.referee)||((this.referee!= null)&&this.referee.equals(rhs.referee))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}

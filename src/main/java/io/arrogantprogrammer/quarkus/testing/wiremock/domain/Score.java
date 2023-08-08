
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
    "halftime",
    "fulltime",
    "extratime",
    "penalty"
})
@Generated("jsonschema2pojo")
public class Score {

    @JsonProperty("halftime")
    private Halftime halftime;
    @JsonProperty("fulltime")
    private Fulltime fulltime;
    @JsonProperty("extratime")
    private Extratime extratime;
    @JsonProperty("penalty")
    private Penalty penalty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("halftime")
    public Halftime getHalftime() {
        return halftime;
    }

    @JsonProperty("halftime")
    public void setHalftime(Halftime halftime) {
        this.halftime = halftime;
    }

    public Score withHalftime(Halftime halftime) {
        this.halftime = halftime;
        return this;
    }

    @JsonProperty("fulltime")
    public Fulltime getFulltime() {
        return fulltime;
    }

    @JsonProperty("fulltime")
    public void setFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
    }

    public Score withFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
        return this;
    }

    @JsonProperty("extratime")
    public Extratime getExtratime() {
        return extratime;
    }

    @JsonProperty("extratime")
    public void setExtratime(Extratime extratime) {
        this.extratime = extratime;
    }

    public Score withExtratime(Extratime extratime) {
        this.extratime = extratime;
        return this;
    }

    @JsonProperty("penalty")
    public Penalty getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    public Score withPenalty(Penalty penalty) {
        this.penalty = penalty;
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

    public Score withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Score.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("halftime");
        sb.append('=');
        sb.append(((this.halftime == null)?"<null>":this.halftime));
        sb.append(',');
        sb.append("fulltime");
        sb.append('=');
        sb.append(((this.fulltime == null)?"<null>":this.fulltime));
        sb.append(',');
        sb.append("extratime");
        sb.append('=');
        sb.append(((this.extratime == null)?"<null>":this.extratime));
        sb.append(',');
        sb.append("penalty");
        sb.append('=');
        sb.append(((this.penalty == null)?"<null>":this.penalty));
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
        result = ((result* 31)+((this.fulltime == null)? 0 :this.fulltime.hashCode()));
        result = ((result* 31)+((this.extratime == null)? 0 :this.extratime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.halftime == null)? 0 :this.halftime.hashCode()));
        result = ((result* 31)+((this.penalty == null)? 0 :this.penalty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Score) == false) {
            return false;
        }
        Score rhs = ((Score) other);
        return ((((((this.fulltime == rhs.fulltime)||((this.fulltime!= null)&&this.fulltime.equals(rhs.fulltime)))&&((this.extratime == rhs.extratime)||((this.extratime!= null)&&this.extratime.equals(rhs.extratime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.halftime == rhs.halftime)||((this.halftime!= null)&&this.halftime.equals(rhs.halftime))))&&((this.penalty == rhs.penalty)||((this.penalty!= null)&&this.penalty.equals(rhs.penalty))));
    }

}

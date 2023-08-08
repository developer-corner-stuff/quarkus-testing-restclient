
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
    "first",
    "second"
})
@Generated("jsonschema2pojo")
public class Periods {

    @JsonProperty("first")
    private Object first;
    @JsonProperty("second")
    private Object second;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("first")
    public Object getFirst() {
        return first;
    }

    @JsonProperty("first")
    public void setFirst(Object first) {
        this.first = first;
    }

    public Periods withFirst(Object first) {
        this.first = first;
        return this;
    }

    @JsonProperty("second")
    public Object getSecond() {
        return second;
    }

    @JsonProperty("second")
    public void setSecond(Object second) {
        this.second = second;
    }

    public Periods withSecond(Object second) {
        this.second = second;
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

    public Periods withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Periods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("first");
        sb.append('=');
        sb.append(((this.first == null)?"<null>":this.first));
        sb.append(',');
        sb.append("second");
        sb.append('=');
        sb.append(((this.second == null)?"<null>":this.second));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.first == null)? 0 :this.first.hashCode()));
        result = ((result* 31)+((this.second == null)? 0 :this.second.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Periods) == false) {
            return false;
        }
        Periods rhs = ((Periods) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.first == rhs.first)||((this.first!= null)&&this.first.equals(rhs.first))))&&((this.second == rhs.second)||((this.second!= null)&&this.second.equals(rhs.second))));
    }

}

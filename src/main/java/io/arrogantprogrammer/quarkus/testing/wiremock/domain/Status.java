
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
    "long",
    "short",
    "elapsed"
})
@Generated("jsonschema2pojo")
public class Status {

    @JsonProperty("long")
    private String _long;
    @JsonProperty("short")
    private String _short;
    @JsonProperty("elapsed")
    private Object elapsed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("long")
    public String getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(String _long) {
        this._long = _long;
    }

    public Status withLong(String _long) {
        this._long = _long;
        return this;
    }

    @JsonProperty("short")
    public String getShort() {
        return _short;
    }

    @JsonProperty("short")
    public void setShort(String _short) {
        this._short = _short;
    }

    public Status withShort(String _short) {
        this._short = _short;
        return this;
    }

    @JsonProperty("elapsed")
    public Object getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Object elapsed) {
        this.elapsed = elapsed;
    }

    public Status withElapsed(Object elapsed) {
        this.elapsed = elapsed;
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

    public Status withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_long");
        sb.append('=');
        sb.append(((this._long == null)?"<null>":this._long));
        sb.append(',');
        sb.append("_short");
        sb.append('=');
        sb.append(((this._short == null)?"<null>":this._short));
        sb.append(',');
        sb.append("elapsed");
        sb.append('=');
        sb.append(((this.elapsed == null)?"<null>":this.elapsed));
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
        result = ((result* 31)+((this.elapsed == null)? 0 :this.elapsed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._short == null)? 0 :this._short.hashCode()));
        result = ((result* 31)+((this._long == null)? 0 :this._long.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return (((((this.elapsed == rhs.elapsed)||((this.elapsed!= null)&&this.elapsed.equals(rhs.elapsed)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._short == rhs._short)||((this._short!= null)&&this._short.equals(rhs._short))))&&((this._long == rhs._long)||((this._long!= null)&&this._long.equals(rhs._long))));
    }

}

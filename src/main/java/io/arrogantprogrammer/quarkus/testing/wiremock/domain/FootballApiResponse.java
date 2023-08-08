
package io.arrogantprogrammer.quarkus.testing.wiremock.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "get",
    "parameters",
    "errors",
    "results",
    "paging",
    "response"
})
@Generated("jsonschema2pojo")
public class FootballApiResponse {

    @JsonProperty("get")
    private String get;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("errors")
    private List<Object> errors = new ArrayList<Object>();
    @JsonProperty("results")
    private Integer results;
    @JsonProperty("paging")
    private Paging paging;
    @JsonProperty("response")
    private List<Response__1> response = new ArrayList<Response__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("get")
    public String getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(String get) {
        this.get = get;
    }

    public FootballApiResponse withGet(String get) {
        this.get = get;
        return this;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public FootballApiResponse withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @JsonProperty("errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public FootballApiResponse withErrors(List<Object> errors) {
        this.errors = errors;
        return this;
    }

    @JsonProperty("results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Integer results) {
        this.results = results;
    }

    public FootballApiResponse withResults(Integer results) {
        this.results = results;
        return this;
    }

    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public FootballApiResponse withPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    @JsonProperty("response")
    public List<Response__1> getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(List<Response__1> response) {
        this.response = response;
    }

    public FootballApiResponse withResponse(List<Response__1> response) {
        this.response = response;
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

    public FootballApiResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FootballApiResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("get");
        sb.append('=');
        sb.append(((this.get == null)?"<null>":this.get));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("errors");
        sb.append('=');
        sb.append(((this.errors == null)?"<null>":this.errors));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("paging");
        sb.append('=');
        sb.append(((this.paging == null)?"<null>":this.paging));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
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
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.get == null)? 0 :this.get.hashCode()));
        result = ((result* 31)+((this.paging == null)? 0 :this.paging.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.errors == null)? 0 :this.errors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FootballApiResponse) == false) {
            return false;
        }
        FootballApiResponse rhs = ((FootballApiResponse) other);
        return ((((((((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response)))&&((this.get == rhs.get)||((this.get!= null)&&this.get.equals(rhs.get))))&&((this.paging == rhs.paging)||((this.paging!= null)&&this.paging.equals(rhs.paging))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.errors == rhs.errors)||((this.errors!= null)&&this.errors.equals(rhs.errors))));
    }

}

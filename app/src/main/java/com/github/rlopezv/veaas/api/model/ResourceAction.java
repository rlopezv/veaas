package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes the action to execute on a resource
 */
@Schema(description = "Describes the action to execute on a resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ResourceAction   {
  @JsonProperty("disabled")
  private Boolean disabled;

  @JsonProperty("name")
  private String name;

  @JsonProperty("params")
  @Valid
  private List<ResourceActionParam> params = null;

  public ResourceAction disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
  */
 @Schema(defaultValue =  "")
 public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public ResourceAction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue =  "")
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceAction params(List<ResourceActionParam> params) {
    this.params = params;
    return this;
  }

  public ResourceAction addParamsItem(ResourceActionParam paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
  */
 @Schema(defaultValue = "")
  @Valid

  public List<ResourceActionParam> getParams() {
    return params;
  }

  public void setParams(List<ResourceActionParam> params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceAction ResourceAction = (ResourceAction) o;
    return Objects.equals(this.disabled, ResourceAction.disabled) &&
        Objects.equals(this.name, ResourceAction.name) &&
        Objects.equals(this.params, ResourceAction.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, name, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceAction {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1ResourceActionParamDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the action to execute on a resource
 */
@Schema(description = "Describes the action to execute on a resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ResourceActionDto   {
  @JsonProperty("disabled")
  private Boolean disabled;

  @JsonProperty("name")
  private String name;

  @JsonProperty("params")
  @Valid
  private List<V1ResourceActionParamDto> params = null;

  public V1ResourceActionDto disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
  */
 @Schema(defaultValue = "")


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public V1ResourceActionDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ResourceActionDto params(List<V1ResourceActionParamDto> params) {
    this.params = params;
    return this;
  }

  public V1ResourceActionDto addParamsItem(V1ResourceActionParamDto paramsItem) {
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

  public List<V1ResourceActionParamDto> getParams() {
    return params;
  }

  public void setParams(List<V1ResourceActionParamDto> params) {
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
    V1ResourceActionDto v1ResourceAction = (V1ResourceActionDto) o;
    return Objects.equals(this.disabled, v1ResourceAction.disabled) &&
        Objects.equals(this.name, v1ResourceAction.name) &&
        Objects.equals(this.params, v1ResourceAction.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, name, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceActionDto {\n");
    
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


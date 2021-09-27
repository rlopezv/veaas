package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies elements to be ignored where checking differences amond desired and current status
 */
@Schema(description = "Identifies elements to be ignored where checking differences amond desired and current status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1OverrideIgnoreDiffDto   {
  @JsonProperty("jSONPointers")
  @Valid
  private List<String> jSONPointers = null;

  @JsonProperty("jqPathExpressions")
  @Valid
  private List<String> jqPathExpressions = null;

  public V1OverrideIgnoreDiffDto jSONPointers(List<String> jSONPointers) {
    this.jSONPointers = jSONPointers;
    return this;
  }

  public V1OverrideIgnoreDiffDto addJSONPointersItem(String jSONPointersItem) {
    if (this.jSONPointers == null) {
      this.jSONPointers = new ArrayList<>();
    }
    this.jSONPointers.add(jSONPointersItem);
    return this;
  }

  /**
   * Get jSONPointers
   * @return jSONPointers
  */
 @Schema(defaultValue = "")


  public List<String> getjSONPointers() {
    return jSONPointers;
  }

  public void setjSONPointers(List<String> jSONPointers) {
    this.jSONPointers = jSONPointers;
  }

  public V1OverrideIgnoreDiffDto jqPathExpressions(List<String> jqPathExpressions) {
    this.jqPathExpressions = jqPathExpressions;
    return this;
  }

  public V1OverrideIgnoreDiffDto addJqPathExpressionsItem(String jqPathExpressionsItem) {
    if (this.jqPathExpressions == null) {
      this.jqPathExpressions = new ArrayList<>();
    }
    this.jqPathExpressions.add(jqPathExpressionsItem);
    return this;
  }

  /**
   * Get jqPathExpressions
   * @return jqPathExpressions
  */
 @Schema(defaultValue = "")


  public List<String> getJqPathExpressions() {
    return jqPathExpressions;
  }

  public void setJqPathExpressions(List<String> jqPathExpressions) {
    this.jqPathExpressions = jqPathExpressions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OverrideIgnoreDiffDto v1OverrideIgnoreDiff = (V1OverrideIgnoreDiffDto) o;
    return Objects.equals(this.jSONPointers, v1OverrideIgnoreDiff.jSONPointers) &&
        Objects.equals(this.jqPathExpressions, v1OverrideIgnoreDiff.jqPathExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jSONPointers, jqPathExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OverrideIgnoreDiffDto {\n");
    
    sb.append("    jSONPointers: ").append(toIndentedString(jSONPointers)).append("\n");
    sb.append("    jqPathExpressions: ").append(toIndentedString(jqPathExpressions)).append("\n");
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


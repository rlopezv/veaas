package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Stream result of workSpaceLogEntry
 */
@Schema(description = "Stream result of workSpaceLogEntry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class InlineResponse2001Dto   {
  @JsonProperty("result")
  private WorkSpaceLogEntryDto result;

  public InlineResponse2001Dto result(WorkSpaceLogEntryDto result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceLogEntryDto getResult() {
    return result;
  }

  public void setResult(WorkSpaceLogEntryDto result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Dto inlineResponse2001 = (InlineResponse2001Dto) o;
    return Objects.equals(this.result, inlineResponse2001.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Dto {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


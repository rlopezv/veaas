package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.RuntimeErrorDto;
import com.github.rlopezv.veaas.api.model.WorkSpaceLogEntryDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Stream result of workSpaceLogEntry
 */
@Schema(description = "Stream result of workSpaceLogEntry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class InlineResponse200Dto   {
  @JsonProperty("error")
  private RuntimeErrorDto error;

  @JsonProperty("result")
  private WorkSpaceLogEntryDto result;

  public InlineResponse200Dto error(RuntimeErrorDto error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
 @Schema(defaultValue = "")

  @Valid

  public RuntimeErrorDto getError() {
    return error;
  }

  public void setError(RuntimeErrorDto error) {
    this.error = error;
  }

  public InlineResponse200Dto result(WorkSpaceLogEntryDto result) {
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
    InlineResponse200Dto inlineResponse200 = (InlineResponse200Dto) o;
    return Objects.equals(this.error, inlineResponse200.error) &&
        Objects.equals(this.result, inlineResponse200.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Dto {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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


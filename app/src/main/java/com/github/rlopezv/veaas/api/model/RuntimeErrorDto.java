package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.ContentAnyDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RuntimeErrorDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RuntimeErrorDto   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("details")
  @Valid
  private List<ContentAnyDto> details = null;

  @JsonProperty("error")
  private String error;

  @JsonProperty("message")
  private String message;

  public RuntimeErrorDto code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
 @Schema(defaultValue = "")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RuntimeErrorDto details(List<ContentAnyDto> details) {
    this.details = details;
    return this;
  }

  public RuntimeErrorDto addDetailsItem(ContentAnyDto detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
 @Schema(defaultValue = "")

  @Valid

  public List<ContentAnyDto> getDetails() {
    return details;
  }

  public void setDetails(List<ContentAnyDto> details) {
    this.details = details;
  }

  public RuntimeErrorDto error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
 @Schema(defaultValue = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RuntimeErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
 @Schema(defaultValue = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeErrorDto runtimeError = (RuntimeErrorDto) o;
    return Objects.equals(this.code, runtimeError.code) &&
        Objects.equals(this.details, runtimeError.details) &&
        Objects.equals(this.error, runtimeError.error) &&
        Objects.equals(this.message, runtimeError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, error, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeErrorDto {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


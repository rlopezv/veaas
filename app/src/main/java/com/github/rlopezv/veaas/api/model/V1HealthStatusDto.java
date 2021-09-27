package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HealthStatus contains information about the currently observed health state of an workSpace or resource
 */
@Schema(description = "HealthStatus contains information about the currently observed health state of an workSpace or resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1HealthStatusDto   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("status")
  private String status;

  public V1HealthStatusDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message is a human-readable informational message describing the health status
   * @return message
  */
 @Schema(defaultValue = "Message is a human-readable informational message describing the health status")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1HealthStatusDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status holds the status code of the workSpace or resource
   * @return status
  */
 @Schema(defaultValue = "Status holds the status code of the workSpace or resource")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HealthStatusDto v1HealthStatus = (V1HealthStatusDto) o;
    return Objects.equals(this.message, v1HealthStatus.message) &&
        Objects.equals(this.status, v1HealthStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HealthStatusDto {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


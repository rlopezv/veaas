package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ConnectionState contains information about remote resource connection state, currently used for providers and repositories
 */
@Schema(description = "ConnectionState contains information about remote resource connection state, currently used for providers and repositories")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ConnectionState   {
  @JsonProperty("attemptedAt")
  private Time attemptedAt;

  @JsonProperty("message")
  private String message;

  @JsonProperty("status")
  private String status;

  public ConnectionState attemptedAt(Time attemptedAt) {
    this.attemptedAt = attemptedAt;
    return this;
  }

  /**
   * Get attemptedAt
   * @return attemptedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getAttemptedAt() {
    return attemptedAt;
  }

  public void setAttemptedAt(Time attemptedAt) {
    this.attemptedAt = attemptedAt;
  }

  public ConnectionState message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message contains human readable information about the connection status
   * @return message
  */
 @Schema(defaultValue = "Message contains human readable information about the connection status")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConnectionState status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status contains the current status indicator for the connection
   * @return status
  */
 @Schema(defaultValue = "Status contains the current status indicator for the connection")


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
    ConnectionState ConnectionState = (ConnectionState) o;
    return Objects.equals(this.attemptedAt, ConnectionState.attemptedAt) &&
        Objects.equals(this.message, ConnectionState.message) &&
        Objects.equals(this.status, ConnectionState.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptedAt, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionState {\n");
    
    sb.append("    attemptedAt: ").append(toIndentedString(attemptedAt)).append("\n");
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


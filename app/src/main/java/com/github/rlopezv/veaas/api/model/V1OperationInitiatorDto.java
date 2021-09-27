package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationInitiator contains information about the initiator of an operation
 */
@Schema(description = "OperationInitiator contains information about the initiator of an operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1OperationInitiatorDto   {
  @JsonProperty("automated")
  private Boolean automated;

  @JsonProperty("username")
  private String username;

  public V1OperationInitiatorDto automated(Boolean automated) {
    this.automated = automated;
    return this;
  }

  /**
   * Automated is set to true if operation was initiated automatically by the workSpace controller.
   * @return automated
  */
 @Schema(defaultValue = "Automated is set to true if operation was initiated automatically by the workSpace controller.")


  public Boolean getAutomated() {
    return automated;
  }

  public void setAutomated(Boolean automated) {
    this.automated = automated;
  }

  public V1OperationInitiatorDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username contains the name of a user who started operation
   * @return username
  */
 @Schema(defaultValue = "Username contains the name of a user who started operation")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OperationInitiatorDto v1OperationInitiator = (V1OperationInitiatorDto) o;
    return Objects.equals(this.automated, v1OperationInitiator.automated) &&
        Objects.equals(this.username, v1OperationInitiator.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OperationInitiatorDto {\n");
    
    sb.append("    automated: ").append(toIndentedString(automated)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


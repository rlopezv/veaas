package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1TimeDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceCondition contains details about an workSpace condition, which ishould be usally an error or warning
 */
@Schema(description = "WorkSpaceCondition contains details about an workSpace condition, which ishould be usally an error or warning")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceConditionDto   {
  @JsonProperty("lastTransitionTime")
  private V1TimeDto lastTransitionTime;

  @JsonProperty("message")
  private String message;

  @JsonProperty("type")
  private String type;

  public V1WorkSpaceConditionDto lastTransitionTime(V1TimeDto lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Get lastTransitionTime
   * @return lastTransitionTime
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(V1TimeDto lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1WorkSpaceConditionDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message contains human-readable message indicating details about condition
   * @return message
  */
 @Schema(defaultValue = "Message contains human-readable message indicating details about condition")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1WorkSpaceConditionDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type is an workSpace condition type
   * @return type
  */
 @Schema(defaultValue = "Type is an workSpace condition type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkSpaceConditionDto v1WorkSpaceCondition = (V1WorkSpaceConditionDto) o;
    return Objects.equals(this.lastTransitionTime, v1WorkSpaceCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1WorkSpaceCondition.message) &&
        Objects.equals(this.type, v1WorkSpaceCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceConditionDto {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


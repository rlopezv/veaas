package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1OverrideIgnoreDiffDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceOverride holds configuration to customize resource diffing and health assessment TODO: describe the members of this type
 */
@Schema(description = "ResourceOverride holds configuration to customize resource diffing and health assessment TODO: describe the members of this type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ResourceOverrideDto   {
  @JsonProperty("actions")
  private String actions;

  @JsonProperty("healthLua")
  private String healthLua;

  @JsonProperty("ignoreDifferences")
  private V1OverrideIgnoreDiffDto ignoreDifferences;

  public V1ResourceOverrideDto actions(String actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Get actions
   * @return actions
  */
 @Schema(defaultValue = "")


  public String getActions() {
    return actions;
  }

  public void setActions(String actions) {
    this.actions = actions;
  }

  public V1ResourceOverrideDto healthLua(String healthLua) {
    this.healthLua = healthLua;
    return this;
  }

  /**
   * Get healthLua
   * @return healthLua
  */
 @Schema(defaultValue = "")


  public String getHealthLua() {
    return healthLua;
  }

  public void setHealthLua(String healthLua) {
    this.healthLua = healthLua;
  }

  public V1ResourceOverrideDto ignoreDifferences(V1OverrideIgnoreDiffDto ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
    return this;
  }

  /**
   * Get ignoreDifferences
   * @return ignoreDifferences
  */
 @Schema(defaultValue = "")

  @Valid

  public V1OverrideIgnoreDiffDto getIgnoreDifferences() {
    return ignoreDifferences;
  }

  public void setIgnoreDifferences(V1OverrideIgnoreDiffDto ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceOverrideDto v1ResourceOverride = (V1ResourceOverrideDto) o;
    return Objects.equals(this.actions, v1ResourceOverride.actions) &&
        Objects.equals(this.healthLua, v1ResourceOverride.healthLua) &&
        Objects.equals(this.ignoreDifferences, v1ResourceOverride.ignoreDifferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, healthLua, ignoreDifferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceOverrideDto {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    healthLua: ").append(toIndentedString(healthLua)).append("\n");
    sb.append("    ignoreDifferences: ").append(toIndentedString(ignoreDifferences)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnvEntry represents an entry in the workSpace&#39;s workSpace
 */
@Schema(description = "EnvEntry represents an entry in the workSpace's workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpacev1EnvEntryDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public WorkSpacev1EnvEntryDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the variable, usually expressed in uppercase
   * @return name
  */
 @Schema(defaultValue = "Name is the name of the variable, usually expressed in uppercase")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkSpacev1EnvEntryDto value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value is the value of the variable
   * @return value
  */
 @Schema(defaultValue = "Value is the value of the variable")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpacev1EnvEntryDto workSpacev1EnvEntry = (WorkSpacev1EnvEntryDto) o;
    return Objects.equals(this.name, workSpacev1EnvEntry.name) &&
        Objects.equals(this.value, workSpacev1EnvEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpacev1EnvEntryDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


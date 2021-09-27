package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains arbitrary, human readable information as pair name value
 */
@Schema(description = "Contains arbitrary, human readable information as pair name value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1InfoDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public V1InfoDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is a human readable title for this piece of information.
   * @return name
  */
 @Schema(defaultValue = "Name is a human readable title for this piece of information.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1InfoDto value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value is human readable content.
   * @return value
  */
 @Schema(defaultValue = "Value is human readable content.")


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
    V1InfoDto v1Info = (V1InfoDto) o;
    return Objects.equals(this.name, v1Info.name) &&
        Objects.equals(this.value, v1Info.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1InfoDto {\n");
    
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


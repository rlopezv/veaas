package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TODO: describe this type TODO: describe members of this type
 */
@Schema(description = "TODO: describe this type TODO: describe members of this type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ResourceActionParam   {
  @JsonProperty("default")
  private String _default;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("value")
  private String value;

  public ResourceActionParam _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
  */
 @Schema(defaultValue =  "")
 public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public ResourceActionParam name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue =  "")
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceActionParam type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
 @Schema(defaultValue =  "")
 public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResourceActionParam value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
 @Schema(defaultValue =  "")
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
    ResourceActionParam ResourceActionParam = (ResourceActionParam) o;
    return Objects.equals(this._default, ResourceActionParam._default) &&
        Objects.equals(this.name, ResourceActionParam.name) &&
        Objects.equals(this.type, ResourceActionParam.type) &&
        Objects.equals(this.value, ResourceActionParam.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, name, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceActionParam {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


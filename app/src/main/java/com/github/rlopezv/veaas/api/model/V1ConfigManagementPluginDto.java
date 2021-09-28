package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ConfigManagementPlugin contains config management plugin configuration
 */
@Schema(description = "ConfigManagementPlugin contains config management plugin configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ConfigManagementPluginDto   {
  @JsonProperty("generate")
  private V1CommandDto generate;

  @JsonProperty("init")
  private V1CommandDto init;

  @JsonProperty("name")
  private String name;

  public V1ConfigManagementPluginDto generate(V1CommandDto generate) {
    this.generate = generate;
    return this;
  }

  /**
   * Get generate
   * @return generate
  */
 @Schema(defaultValue = "")
  @Valid

  public V1CommandDto getGenerate() {
    return generate;
  }

  public void setGenerate(V1CommandDto generate) {
    this.generate = generate;
  }

  public V1ConfigManagementPluginDto init(V1CommandDto init) {
    this.init = init;
    return this;
  }

  /**
   * Get init
   * @return init
  */
 @Schema(defaultValue = "")
  @Valid

  public V1CommandDto getInit() {
    return init;
  }

  public void setInit(V1CommandDto init) {
    this.init = init;
  }

  public V1ConfigManagementPluginDto name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConfigManagementPluginDto v1ConfigManagementPlugin = (V1ConfigManagementPluginDto) o;
    return Objects.equals(this.generate, v1ConfigManagementPlugin.generate) &&
        Objects.equals(this.init, v1ConfigManagementPlugin.init) &&
        Objects.equals(this.name, v1ConfigManagementPlugin.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generate, init, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConfigManagementPluginDto {\n");
    
    sb.append("    generate: ").append(toIndentedString(generate)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


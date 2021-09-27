package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.WorkSpacev1EnvEntryDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceSourcePlugin holds options specific to config management plugins
 */
@Schema(description = "WorkSpaceSourcePlugin holds options specific to config management plugins")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceSourcePluginDto   {
  @JsonProperty("env")
  @Valid
  private List<WorkSpacev1EnvEntryDto> env = null;

  @JsonProperty("name")
  private String name;

  public V1WorkSpaceSourcePluginDto env(List<WorkSpacev1EnvEntryDto> env) {
    this.env = env;
    return this;
  }

  public V1WorkSpaceSourcePluginDto addEnvItem(WorkSpacev1EnvEntryDto envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
  */
 @Schema(defaultValue = "")

  @Valid

  public List<WorkSpacev1EnvEntryDto> getEnv() {
    return env;
  }

  public void setEnv(List<WorkSpacev1EnvEntryDto> env) {
    this.env = env;
  }

  public V1WorkSpaceSourcePluginDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue = "")


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
    V1WorkSpaceSourcePluginDto v1WorkSpaceSourcePlugin = (V1WorkSpaceSourcePluginDto) o;
    return Objects.equals(this.env, v1WorkSpaceSourcePlugin.env) &&
        Objects.equals(this.name, v1WorkSpaceSourcePlugin.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceSourcePluginDto {\n");
    
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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


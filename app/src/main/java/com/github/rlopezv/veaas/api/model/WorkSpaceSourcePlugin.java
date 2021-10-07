package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceSourcePlugin holds options specific to config management plugins
 */
@Schema(description = "WorkSpaceSourcePlugin holds options specific to config management plugins")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceSourcePlugin   {
  @JsonProperty("env")
  @Valid
  private List<WorkSpaceEnvEntry> env = null;

  @JsonProperty("name")
  private String name;

  public WorkSpaceSourcePlugin env(List<WorkSpaceEnvEntry> env) {
    this.env = env;
    return this;
  }

  public WorkSpaceSourcePlugin addEnvItem(WorkSpaceEnvEntry envItem) {
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

  public List<WorkSpaceEnvEntry> getEnv() {
    return env;
  }

  public void setEnv(List<WorkSpaceEnvEntry> env) {
    this.env = env;
  }

  public WorkSpaceSourcePlugin name(String name) {
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
    WorkSpaceSourcePlugin WorkSpaceSourcePlugin = (WorkSpaceSourcePlugin) o;
    return Objects.equals(this.env, WorkSpaceSourcePlugin.env) &&
        Objects.equals(this.name, WorkSpaceSourcePlugin.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceSourcePlugin {\n");
    
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


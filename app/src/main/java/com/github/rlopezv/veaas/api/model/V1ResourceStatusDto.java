package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceStatus holds the current sync and health status of a resource
 */
@Schema(description = "ResourceStatus holds the current sync and health status of a resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ResourceStatusDto   {
  @JsonProperty("group")
  private String group;

  @JsonProperty("health")
  private V1HealthStatusDto health;

  @JsonProperty("hook")
  private Boolean hook;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("requiresPruning")
  private Boolean requiresPruning;

  @JsonProperty("status")
  private String status;

  @JsonProperty("version")
  private String version;

  public V1ResourceStatusDto group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
 @Schema(defaultValue =  "")
 public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1ResourceStatusDto health(V1HealthStatusDto health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
  */
 @Schema(defaultValue = "")
  @Valid

  public V1HealthStatusDto getHealth() {
    return health;
  }

  public void setHealth(V1HealthStatusDto health) {
    this.health = health;
  }

  public V1ResourceStatusDto hook(Boolean hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
  */
 @Schema(defaultValue =  "")
 public Boolean getHook() {
    return hook;
  }

  public void setHook(Boolean hook) {
    this.hook = hook;
  }

  public V1ResourceStatusDto kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
 @Schema(defaultValue =  "")
 public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ResourceStatusDto name(String name) {
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

  public V1ResourceStatusDto namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
 @Schema(defaultValue =  "")
 public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ResourceStatusDto requiresPruning(Boolean requiresPruning) {
    this.requiresPruning = requiresPruning;
    return this;
  }

  /**
   * Get requiresPruning
   * @return requiresPruning
  */
 @Schema(defaultValue =  "")
 public Boolean getRequiresPruning() {
    return requiresPruning;
  }

  public void setRequiresPruning(Boolean requiresPruning) {
    this.requiresPruning = requiresPruning;
  }

  public V1ResourceStatusDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
 @Schema(defaultValue =  "")
 public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1ResourceStatusDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
 @Schema(defaultValue =  "")
 public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceStatusDto v1ResourceStatus = (V1ResourceStatusDto) o;
    return Objects.equals(this.group, v1ResourceStatus.group) &&
        Objects.equals(this.health, v1ResourceStatus.health) &&
        Objects.equals(this.hook, v1ResourceStatus.hook) &&
        Objects.equals(this.kind, v1ResourceStatus.kind) &&
        Objects.equals(this.name, v1ResourceStatus.name) &&
        Objects.equals(this.namespace, v1ResourceStatus.namespace) &&
        Objects.equals(this.requiresPruning, v1ResourceStatus.requiresPruning) &&
        Objects.equals(this.status, v1ResourceStatus.status) &&
        Objects.equals(this.version, v1ResourceStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, health, hook, kind, name, namespace, requiresPruning, status, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceStatusDto {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    requiresPruning: ").append(toIndentedString(requiresPruning)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


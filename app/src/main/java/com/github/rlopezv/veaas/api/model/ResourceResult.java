package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceResult holds the operation result details of a specific resource
 */
@Schema(description = "ResourceResult holds the operation result details of a specific resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ResourceResult   {
  @JsonProperty("group")
  private String group;

  @JsonProperty("hookPhase")
  private String hookPhase;

  @JsonProperty("hookType")
  private String hookType;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("message")
  private String message;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("status")
  private String status;

  @JsonProperty("syncPhase")
  private String syncPhase;

  @JsonProperty("version")
  private String version;

  public ResourceResult group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Group specifies the  group of the resource
   * @return group
  */
 @Schema(defaultValue = "Group specifies the  group of the resource")


  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public ResourceResult hookPhase(String hookPhase) {
    this.hookPhase = hookPhase;
    return this;
  }

  /**
   * HookPhase contains the state of any operation associated with this resource OR hook This can also contain values for non-hook resources.
   * @return hookPhase
  */
 @Schema(defaultValue = "HookPhase contains the state of any operation associated with this resource OR hook This can also contain values for non-hook resources.")


  public String getHookPhase() {
    return hookPhase;
  }

  public void setHookPhase(String hookPhase) {
    this.hookPhase = hookPhase;
  }

  public ResourceResult hookType(String hookType) {
    this.hookType = hookType;
    return this;
  }

  /**
   * HookType specifies the type of the hook. Empty for non-hook resources
   * @return hookType
  */
 @Schema(defaultValue = "HookType specifies the type of the hook. Empty for non-hook resources")


  public String getHookType() {
    return hookType;
  }

  public void setHookType(String hookType) {
    this.hookType = hookType;
  }

  public ResourceResult kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind specifies the  kind of the resource
   * @return kind
  */
 @Schema(defaultValue = "Kind specifies the  kind of the resource")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ResourceResult message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message contains an informational or error message for the last sync OR operation
   * @return message
  */
 @Schema(defaultValue = "Message contains an informational or error message for the last sync OR operation")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResourceResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name specifies the name of the resource
   * @return name
  */
 @Schema(defaultValue = "Name specifies the name of the resource")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceResult namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace specifies the target namespace of the resource
   * @return namespace
  */
 @Schema(defaultValue = "Namespace specifies the target namespace of the resource")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ResourceResult status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status holds the final result of the sync. Will be empty if the resources is yet to be applied/pruned and is always zero-value for hooks
   * @return status
  */
 @Schema(defaultValue = "Status holds the final result of the sync. Will be empty if the resources is yet to be applied/pruned and is always zero-value for hooks")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ResourceResult syncPhase(String syncPhase) {
    this.syncPhase = syncPhase;
    return this;
  }

  /**
   * SyncPhase indicates the particular phase of the sync that this result was acquired in
   * @return syncPhase
  */
 @Schema(defaultValue = "SyncPhase indicates the particular phase of the sync that this result was acquired in")


  public String getSyncPhase() {
    return syncPhase;
  }

  public void setSyncPhase(String syncPhase) {
    this.syncPhase = syncPhase;
  }

  public ResourceResult version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version specifies the API version of the resource
   * @return version
  */
 @Schema(defaultValue = "Version specifies the API version of the resource")


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
    ResourceResult ResourceResult = (ResourceResult) o;
    return Objects.equals(this.group, ResourceResult.group) &&
        Objects.equals(this.hookPhase, ResourceResult.hookPhase) &&
        Objects.equals(this.hookType, ResourceResult.hookType) &&
        Objects.equals(this.kind, ResourceResult.kind) &&
        Objects.equals(this.message, ResourceResult.message) &&
        Objects.equals(this.name, ResourceResult.name) &&
        Objects.equals(this.namespace, ResourceResult.namespace) &&
        Objects.equals(this.status, ResourceResult.status) &&
        Objects.equals(this.syncPhase, ResourceResult.syncPhase) &&
        Objects.equals(this.version, ResourceResult.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, hookPhase, hookType, kind, message, name, namespace, status, syncPhase, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceResult {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hookPhase: ").append(toIndentedString(hookPhase)).append("\n");
    sb.append("    hookType: ").append(toIndentedString(hookType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    syncPhase: ").append(toIndentedString(syncPhase)).append("\n");
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


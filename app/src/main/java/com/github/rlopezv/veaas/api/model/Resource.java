package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Resource contains information about live resource and its children
 */
@Schema(description = "Resource contains information about live resource and its children")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class Resource   {
  @JsonProperty("metadata")
  private ObjectMeta metadata;

  @JsonProperty("createdAt")
  private Time createdAt;

  @JsonProperty("health")
  private HealthStatus health;

  @JsonProperty("spec")
  private ResourceSpec spec;

  @JsonProperty("networkingInfo")
  private ResourceNetworkingInfo networkingInfo;

  @JsonProperty("parentRefs")
  @Valid
  private List<ResourceRef> parentRefs = null;

  @JsonProperty("resourceRef")
  private ResourceRef resourceRef;

  @JsonProperty("resourceVersion")
  private String resourceVersion;

  public Resource metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")
  @Valid

  public ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public Resource createdAt(Time createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Time createdAt) {
    this.createdAt = createdAt;
  }

  public Resource health(HealthStatus health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
  */
 @Schema(defaultValue = "")
  @Valid

  public HealthStatus getHealth() {
    return health;
  }

  public void setHealth(HealthStatus health) {
    this.health = health;
  }

  public Resource spec(ResourceSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
 @Schema(defaultValue = "")
  @Valid

  public ResourceSpec getSpec() {
    return spec;
  }

  public void setSpec(ResourceSpec spec) {
    this.spec = spec;
  }

  public Resource networkingInfo(ResourceNetworkingInfo networkingInfo) {
    this.networkingInfo = networkingInfo;
    return this;
  }

  /**
   * Get networkingInfo
   * @return networkingInfo
  */
 @Schema(defaultValue = "")
  @Valid

  public ResourceNetworkingInfo getNetworkingInfo() {
    return networkingInfo;
  }

  public void setNetworkingInfo(ResourceNetworkingInfo networkingInfo) {
    this.networkingInfo = networkingInfo;
  }

  public Resource parentRefs(List<ResourceRef> parentRefs) {
    this.parentRefs = parentRefs;
    return this;
  }

  public Resource addParentRefsItem(ResourceRef parentRefsItem) {
    if (this.parentRefs == null) {
      this.parentRefs = new ArrayList<>();
    }
    this.parentRefs.add(parentRefsItem);
    return this;
  }

  /**
   * Get parentRefs
   * @return parentRefs
  */
 @Schema(defaultValue = "")
  @Valid

  public List<ResourceRef> getParentRefs() {
    return parentRefs;
  }

  public void setParentRefs(List<ResourceRef> parentRefs) {
    this.parentRefs = parentRefs;
  }

  public Resource resourceRef(ResourceRef resourceRef) {
    this.resourceRef = resourceRef;
    return this;
  }

  /**
   * Get resourceRef
   * @return resourceRef
  */
 @Schema(defaultValue = "")
  @Valid

  public ResourceRef getResourceRef() {
    return resourceRef;
  }

  public void setResourceRef(ResourceRef resourceRef) {
    this.resourceRef = resourceRef;
  }

  public Resource resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Get resourceVersion
   * @return resourceVersion
  */
 @Schema(defaultValue =  "")
 public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource Resource = (Resource) o;
    return Objects.equals(this.metadata, Resource.metadata) &&
        Objects.equals(this.createdAt, Resource.createdAt) &&
        Objects.equals(this.health, Resource.health) &&
        Objects.equals(this.spec, Resource.spec) &&
        Objects.equals(this.networkingInfo, Resource.networkingInfo) &&
        Objects.equals(this.parentRefs, Resource.parentRefs) &&
        Objects.equals(this.resourceRef, Resource.resourceRef) &&
        Objects.equals(this.resourceVersion, Resource.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, createdAt, health, spec, networkingInfo, parentRefs, resourceRef, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    networkingInfo: ").append(toIndentedString(networkingInfo)).append("\n");
    sb.append("    parentRefs: ").append(toIndentedString(parentRefs)).append("\n");
    sb.append("    resourceRef: ").append(toIndentedString(resourceRef)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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


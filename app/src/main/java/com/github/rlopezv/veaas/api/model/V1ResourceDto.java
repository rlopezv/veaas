package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1HealthStatusDto;
import com.github.rlopezv.veaas.api.model.V1ObjectMetaDto;
import com.github.rlopezv.veaas.api.model.V1ResourceNetworkingInfoDto;
import com.github.rlopezv.veaas.api.model.V1ResourceRefDto;
import com.github.rlopezv.veaas.api.model.V1ResourceSpecDto;
import com.github.rlopezv.veaas.api.model.V1TimeDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resource contains information about live resource and its children
 */
@Schema(description = "Resource contains information about live resource and its children")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ResourceDto   {
  @JsonProperty("metadata")
  private V1ObjectMetaDto metadata;

  @JsonProperty("createdAt")
  private V1TimeDto createdAt;

  @JsonProperty("health")
  private V1HealthStatusDto health;

  @JsonProperty("spec")
  private V1ResourceSpecDto spec;

  @JsonProperty("networkingInfo")
  private V1ResourceNetworkingInfoDto networkingInfo;

  @JsonProperty("parentRefs")
  @Valid
  private List<V1ResourceRefDto> parentRefs = null;

  @JsonProperty("resourceRef")
  private V1ResourceRefDto resourceRef;

  @JsonProperty("resourceVersion")
  private String resourceVersion;

  public V1ResourceDto metadata(V1ObjectMetaDto metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ObjectMetaDto getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMetaDto metadata) {
    this.metadata = metadata;
  }

  public V1ResourceDto createdAt(V1TimeDto createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(V1TimeDto createdAt) {
    this.createdAt = createdAt;
  }

  public V1ResourceDto health(V1HealthStatusDto health) {
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

  public V1ResourceDto spec(V1ResourceSpecDto spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ResourceSpecDto getSpec() {
    return spec;
  }

  public void setSpec(V1ResourceSpecDto spec) {
    this.spec = spec;
  }

  public V1ResourceDto networkingInfo(V1ResourceNetworkingInfoDto networkingInfo) {
    this.networkingInfo = networkingInfo;
    return this;
  }

  /**
   * Get networkingInfo
   * @return networkingInfo
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ResourceNetworkingInfoDto getNetworkingInfo() {
    return networkingInfo;
  }

  public void setNetworkingInfo(V1ResourceNetworkingInfoDto networkingInfo) {
    this.networkingInfo = networkingInfo;
  }

  public V1ResourceDto parentRefs(List<V1ResourceRefDto> parentRefs) {
    this.parentRefs = parentRefs;
    return this;
  }

  public V1ResourceDto addParentRefsItem(V1ResourceRefDto parentRefsItem) {
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

  public List<V1ResourceRefDto> getParentRefs() {
    return parentRefs;
  }

  public void setParentRefs(List<V1ResourceRefDto> parentRefs) {
    this.parentRefs = parentRefs;
  }

  public V1ResourceDto resourceRef(V1ResourceRefDto resourceRef) {
    this.resourceRef = resourceRef;
    return this;
  }

  /**
   * Get resourceRef
   * @return resourceRef
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ResourceRefDto getResourceRef() {
    return resourceRef;
  }

  public void setResourceRef(V1ResourceRefDto resourceRef) {
    this.resourceRef = resourceRef;
  }

  public V1ResourceDto resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Get resourceVersion
   * @return resourceVersion
  */
 @Schema(defaultValue = "")


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
    V1ResourceDto v1Resource = (V1ResourceDto) o;
    return Objects.equals(this.metadata, v1Resource.metadata) &&
        Objects.equals(this.createdAt, v1Resource.createdAt) &&
        Objects.equals(this.health, v1Resource.health) &&
        Objects.equals(this.spec, v1Resource.spec) &&
        Objects.equals(this.networkingInfo, v1Resource.networkingInfo) &&
        Objects.equals(this.parentRefs, v1Resource.parentRefs) &&
        Objects.equals(this.resourceRef, v1Resource.resourceRef) &&
        Objects.equals(this.resourceVersion, v1Resource.resourceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, createdAt, health, spec, networkingInfo, parentRefs, resourceRef, resourceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceDto {\n");
    
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


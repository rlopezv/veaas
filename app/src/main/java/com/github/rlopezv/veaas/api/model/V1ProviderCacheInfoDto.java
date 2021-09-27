package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1TimeDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProviderCacheInfo contains information about the provider cache
 */
@Schema(description = "ProviderCacheInfo contains information about the provider cache")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ProviderCacheInfoDto   {
  @JsonProperty("apisCount")
  private String apisCount;

  @JsonProperty("lastCacheSyncTime")
  private V1TimeDto lastCacheSyncTime;

  @JsonProperty("resourcesCount")
  private String resourcesCount;

  public V1ProviderCacheInfoDto apisCount(String apisCount) {
    this.apisCount = apisCount;
    return this;
  }

  /**
   * APIsCount holds number of observed  API count
   * @return apisCount
  */
 @Schema(defaultValue = "APIsCount holds number of observed  API count")


  public String getApisCount() {
    return apisCount;
  }

  public void setApisCount(String apisCount) {
    this.apisCount = apisCount;
  }

  public V1ProviderCacheInfoDto lastCacheSyncTime(V1TimeDto lastCacheSyncTime) {
    this.lastCacheSyncTime = lastCacheSyncTime;
    return this;
  }

  /**
   * Get lastCacheSyncTime
   * @return lastCacheSyncTime
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getLastCacheSyncTime() {
    return lastCacheSyncTime;
  }

  public void setLastCacheSyncTime(V1TimeDto lastCacheSyncTime) {
    this.lastCacheSyncTime = lastCacheSyncTime;
  }

  public V1ProviderCacheInfoDto resourcesCount(String resourcesCount) {
    this.resourcesCount = resourcesCount;
    return this;
  }

  /**
   * ResourcesCount holds number of observed Kubernetes resources
   * @return resourcesCount
  */
 @Schema(defaultValue = "ResourcesCount holds number of observed Kubernetes resources")


  public String getResourcesCount() {
    return resourcesCount;
  }

  public void setResourcesCount(String resourcesCount) {
    this.resourcesCount = resourcesCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProviderCacheInfoDto v1ProviderCacheInfo = (V1ProviderCacheInfoDto) o;
    return Objects.equals(this.apisCount, v1ProviderCacheInfo.apisCount) &&
        Objects.equals(this.lastCacheSyncTime, v1ProviderCacheInfo.lastCacheSyncTime) &&
        Objects.equals(this.resourcesCount, v1ProviderCacheInfo.resourcesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apisCount, lastCacheSyncTime, resourcesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProviderCacheInfoDto {\n");
    
    sb.append("    apisCount: ").append(toIndentedString(apisCount)).append("\n");
    sb.append("    lastCacheSyncTime: ").append(toIndentedString(lastCacheSyncTime)).append("\n");
    sb.append("    resourcesCount: ").append(toIndentedString(resourcesCount)).append("\n");
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


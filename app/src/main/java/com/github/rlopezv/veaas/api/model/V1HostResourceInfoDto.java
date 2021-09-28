package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TODO: describe this type
 */
@Schema(description = "TODO: describe this type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1HostResourceInfoDto   {
  @JsonProperty("capacity")
  private String capacity;

  @JsonProperty("requestedByApp")
  private String requestedByApp;

  @JsonProperty("requestedByNeighbors")
  private String requestedByNeighbors;

  @JsonProperty("resourceName")
  private String resourceName;

  public V1HostResourceInfoDto capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
 @Schema(defaultValue =  "")
 public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public V1HostResourceInfoDto requestedByApp(String requestedByApp) {
    this.requestedByApp = requestedByApp;
    return this;
  }

  /**
   * Get requestedByApp
   * @return requestedByApp
  */
 @Schema(defaultValue =  "")
 public String getRequestedByApp() {
    return requestedByApp;
  }

  public void setRequestedByApp(String requestedByApp) {
    this.requestedByApp = requestedByApp;
  }

  public V1HostResourceInfoDto requestedByNeighbors(String requestedByNeighbors) {
    this.requestedByNeighbors = requestedByNeighbors;
    return this;
  }

  /**
   * Get requestedByNeighbors
   * @return requestedByNeighbors
  */
 @Schema(defaultValue =  "")
 public String getRequestedByNeighbors() {
    return requestedByNeighbors;
  }

  public void setRequestedByNeighbors(String requestedByNeighbors) {
    this.requestedByNeighbors = requestedByNeighbors;
  }

  public V1HostResourceInfoDto resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
  */
 @Schema(defaultValue =  "")
 public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostResourceInfoDto v1HostResourceInfo = (V1HostResourceInfoDto) o;
    return Objects.equals(this.capacity, v1HostResourceInfo.capacity) &&
        Objects.equals(this.requestedByApp, v1HostResourceInfo.requestedByApp) &&
        Objects.equals(this.requestedByNeighbors, v1HostResourceInfo.requestedByNeighbors) &&
        Objects.equals(this.resourceName, v1HostResourceInfo.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, requestedByApp, requestedByNeighbors, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostResourceInfoDto {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    requestedByApp: ").append(toIndentedString(requestedByApp)).append("\n");
    sb.append("    requestedByNeighbors: ").append(toIndentedString(requestedByNeighbors)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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


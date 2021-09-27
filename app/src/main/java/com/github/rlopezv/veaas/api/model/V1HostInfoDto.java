package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1HostResourceInfoDto;
import com.github.rlopezv.veaas.api.model.V1HostSystemInfoDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HostInfo holds host name and resources included with information regarding its characteristics
 */
@Schema(description = "HostInfo holds host name and resources included with information regarding its characteristics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1HostInfoDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("resourcesInfo")
  @Valid
  private List<V1HostResourceInfoDto> resourcesInfo = null;

  @JsonProperty("systemInfo")
  private V1HostSystemInfoDto systemInfo;

  public V1HostInfoDto name(String name) {
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

  public V1HostInfoDto resourcesInfo(List<V1HostResourceInfoDto> resourcesInfo) {
    this.resourcesInfo = resourcesInfo;
    return this;
  }

  public V1HostInfoDto addResourcesInfoItem(V1HostResourceInfoDto resourcesInfoItem) {
    if (this.resourcesInfo == null) {
      this.resourcesInfo = new ArrayList<>();
    }
    this.resourcesInfo.add(resourcesInfoItem);
    return this;
  }

  /**
   * Get resourcesInfo
   * @return resourcesInfo
  */
 @Schema(defaultValue = "")

  @Valid

  public List<V1HostResourceInfoDto> getResourcesInfo() {
    return resourcesInfo;
  }

  public void setResourcesInfo(List<V1HostResourceInfoDto> resourcesInfo) {
    this.resourcesInfo = resourcesInfo;
  }

  public V1HostInfoDto systemInfo(V1HostSystemInfoDto systemInfo) {
    this.systemInfo = systemInfo;
    return this;
  }

  /**
   * Get systemInfo
   * @return systemInfo
  */
 @Schema(defaultValue = "")

  @Valid

  public V1HostSystemInfoDto getSystemInfo() {
    return systemInfo;
  }

  public void setSystemInfo(V1HostSystemInfoDto systemInfo) {
    this.systemInfo = systemInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostInfoDto v1HostInfo = (V1HostInfoDto) o;
    return Objects.equals(this.name, v1HostInfo.name) &&
        Objects.equals(this.resourcesInfo, v1HostInfo.resourcesInfo) &&
        Objects.equals(this.systemInfo, v1HostInfo.systemInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourcesInfo, systemInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostInfoDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourcesInfo: ").append(toIndentedString(resourcesInfo)).append("\n");
    sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
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


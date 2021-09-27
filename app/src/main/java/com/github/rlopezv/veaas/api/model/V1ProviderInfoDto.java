package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1ConnectionStateDto;
import com.github.rlopezv.veaas.api.model.V1ProviderCacheInfoDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProviderInfo contains information about the provider
 */
@Schema(description = "ProviderInfo contains information about the provider")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ProviderInfoDto   {
  @JsonProperty("apiVersions")
  @Valid
  private List<String> apiVersions = null;

  @JsonProperty("workSpacesCount")
  private String workSpacesCount;

  @JsonProperty("cacheInfo")
  private V1ProviderCacheInfoDto cacheInfo;

  @JsonProperty("connectionState")
  private V1ConnectionStateDto connectionState;

  @JsonProperty("serverVersion")
  private String serverVersion;

  public V1ProviderInfoDto apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public V1ProviderInfoDto addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

  /**
   * APIVersions contains list of API versions supported by the provider
   * @return apiVersions
  */
 @Schema(defaultValue = "APIVersions contains list of API versions supported by the provider")


  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

  public V1ProviderInfoDto workSpacesCount(String workSpacesCount) {
    this.workSpacesCount = workSpacesCount;
    return this;
  }

  /**
   * WorkSpacesCount is the number of workSpaces managed on the provider
   * @return workSpacesCount
  */
 @Schema(defaultValue = "WorkSpacesCount is the number of workSpaces managed on the provider")


  public String getWorkSpacesCount() {
    return workSpacesCount;
  }

  public void setWorkSpacesCount(String workSpacesCount) {
    this.workSpacesCount = workSpacesCount;
  }

  public V1ProviderInfoDto cacheInfo(V1ProviderCacheInfoDto cacheInfo) {
    this.cacheInfo = cacheInfo;
    return this;
  }

  /**
   * Get cacheInfo
   * @return cacheInfo
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ProviderCacheInfoDto getCacheInfo() {
    return cacheInfo;
  }

  public void setCacheInfo(V1ProviderCacheInfoDto cacheInfo) {
    this.cacheInfo = cacheInfo;
  }

  public V1ProviderInfoDto connectionState(V1ConnectionStateDto connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ConnectionStateDto getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(V1ConnectionStateDto connectionState) {
    this.connectionState = connectionState;
  }

  public V1ProviderInfoDto serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  /**
   * ServerVersion contains information about the version of the provider
   * @return serverVersion
  */
 @Schema(defaultValue = "ServerVersion contains information about the version of the provider")


  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProviderInfoDto v1ProviderInfo = (V1ProviderInfoDto) o;
    return Objects.equals(this.apiVersions, v1ProviderInfo.apiVersions) &&
        Objects.equals(this.workSpacesCount, v1ProviderInfo.workSpacesCount) &&
        Objects.equals(this.cacheInfo, v1ProviderInfo.cacheInfo) &&
        Objects.equals(this.connectionState, v1ProviderInfo.connectionState) &&
        Objects.equals(this.serverVersion, v1ProviderInfo.serverVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersions, workSpacesCount, cacheInfo, connectionState, serverVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProviderInfoDto {\n");
    
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    workSpacesCount: ").append(toIndentedString(workSpacesCount)).append("\n");
    sb.append("    cacheInfo: ").append(toIndentedString(cacheInfo)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
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


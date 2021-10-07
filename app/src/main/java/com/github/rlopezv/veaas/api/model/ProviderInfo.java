package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ProviderInfo contains information about the provider
 */
@Schema(description = "ProviderInfo contains information about the provider")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ProviderInfo   {
  @JsonProperty("apiVersions")
  @Valid
  private List<String> apiVersions = null;

  @JsonProperty("workSpacesCount")
  private String workSpacesCount;

  @JsonProperty("cacheInfo")
  private ProviderCacheInfo cacheInfo;

  @JsonProperty("connectionState")
  private ConnectionState connectionState;

  @JsonProperty("serverVersion")
  private String serverVersion;

  public ProviderInfo apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public ProviderInfo addApiVersionsItem(String apiVersionsItem) {
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

  public ProviderInfo workSpacesCount(String workSpacesCount) {
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

  public ProviderInfo cacheInfo(ProviderCacheInfo cacheInfo) {
    this.cacheInfo = cacheInfo;
    return this;
  }

  /**
   * Get cacheInfo
   * @return cacheInfo
  */
 @Schema(defaultValue = "")
  @Valid

  public ProviderCacheInfo getCacheInfo() {
    return cacheInfo;
  }

  public void setCacheInfo(ProviderCacheInfo cacheInfo) {
    this.cacheInfo = cacheInfo;
  }

  public ProviderInfo connectionState(ConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
  */
 @Schema(defaultValue = "")
  @Valid

  public ConnectionState getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(ConnectionState connectionState) {
    this.connectionState = connectionState;
  }

  public ProviderInfo serverVersion(String serverVersion) {
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
    ProviderInfo ProviderInfo = (ProviderInfo) o;
    return Objects.equals(this.apiVersions, ProviderInfo.apiVersions) &&
        Objects.equals(this.workSpacesCount, ProviderInfo.workSpacesCount) &&
        Objects.equals(this.cacheInfo, ProviderInfo.cacheInfo) &&
        Objects.equals(this.connectionState, ProviderInfo.connectionState) &&
        Objects.equals(this.serverVersion, ProviderInfo.serverVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersions, workSpacesCount, cacheInfo, connectionState, serverVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderInfo {\n");
    
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


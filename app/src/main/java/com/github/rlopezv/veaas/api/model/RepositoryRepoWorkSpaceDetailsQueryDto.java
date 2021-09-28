package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RepoWorkSpaceDetailsQuery contains query information for app details request
 */
@Schema(description = "RepoWorkSpaceDetailsQuery contains query information for app details request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RepositoryRepoWorkSpaceDetailsQueryDto   {
  @JsonProperty("appName")
  private String appName;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  public RepositoryRepoWorkSpaceDetailsQueryDto appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
  */
 @Schema(defaultValue =  "")
 public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public RepositoryRepoWorkSpaceDetailsQueryDto source(V1WorkSpaceSourceDto source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public V1WorkSpaceSourceDto getSource() {
    return source;
  }

  public void setSource(V1WorkSpaceSourceDto source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRepoWorkSpaceDetailsQueryDto repositoryRepoWorkSpaceDetailsQuery = (RepositoryRepoWorkSpaceDetailsQueryDto) o;
    return Objects.equals(this.appName, repositoryRepoWorkSpaceDetailsQuery.appName) &&
        Objects.equals(this.source, repositoryRepoWorkSpaceDetailsQuery.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRepoWorkSpaceDetailsQueryDto {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


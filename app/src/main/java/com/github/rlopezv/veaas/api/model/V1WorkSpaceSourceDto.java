package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceSourceDirectoryDto;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceSourcePluginDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceSource contains all required information about the source of an workSpace
 */
@Schema(description = "WorkSpaceSource contains all required information about the source of an workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceSourceDto   {
  @JsonProperty("directory")
  private V1WorkSpaceSourceDirectoryDto directory;

  @JsonProperty("path")
  private String path;

  @JsonProperty("plugin")
  private V1WorkSpaceSourcePluginDto plugin;

  @JsonProperty("repoURL")
  private String repoURL;

  @JsonProperty("targetRevision")
  private String targetRevision;

  public V1WorkSpaceSourceDto directory(V1WorkSpaceSourceDirectoryDto directory) {
    this.directory = directory;
    return this;
  }

  /**
   * Get directory
   * @return directory
  */
 @Schema(defaultValue = "")

  @Valid

  public V1WorkSpaceSourceDirectoryDto getDirectory() {
    return directory;
  }

  public void setDirectory(V1WorkSpaceSourceDirectoryDto directory) {
    this.directory = directory;
  }

  public V1WorkSpaceSourceDto path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path is a directory path within the Git repository, and is only valid for workSpaces sourced from Git.
   * @return path
  */
 @Schema(defaultValue = "Path is a directory path within the Git repository, and is only valid for workSpaces sourced from Git.")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1WorkSpaceSourceDto plugin(V1WorkSpaceSourcePluginDto plugin) {
    this.plugin = plugin;
    return this;
  }

  /**
   * Get plugin
   * @return plugin
  */
 @Schema(defaultValue = "")

  @Valid

  public V1WorkSpaceSourcePluginDto getPlugin() {
    return plugin;
  }

  public void setPlugin(V1WorkSpaceSourcePluginDto plugin) {
    this.plugin = plugin;
  }

  public V1WorkSpaceSourceDto repoURL(String repoURL) {
    this.repoURL = repoURL;
    return this;
  }

  /**
   * RepoURL is the URL to the repository (Git) that contains the workSpace manifests
   * @return repoURL
  */
 @Schema(defaultValue = "RepoURL is the URL to the repository (Git) that contains the workSpace manifests")


  public String getRepoURL() {
    return repoURL;
  }

  public void setRepoURL(String repoURL) {
    this.repoURL = repoURL;
  }

  public V1WorkSpaceSourceDto targetRevision(String targetRevision) {
    this.targetRevision = targetRevision;
    return this;
  }

  /**
   * TargetRevision defines the revision of the source to sync the workSpace to.
   * @return targetRevision
  */
 @Schema(defaultValue = "TargetRevision defines the revision of the source to sync the workSpace to.")


  public String getTargetRevision() {
    return targetRevision;
  }

  public void setTargetRevision(String targetRevision) {
    this.targetRevision = targetRevision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkSpaceSourceDto v1WorkSpaceSource = (V1WorkSpaceSourceDto) o;
    return Objects.equals(this.directory, v1WorkSpaceSource.directory) &&
        Objects.equals(this.path, v1WorkSpaceSource.path) &&
        Objects.equals(this.plugin, v1WorkSpaceSource.plugin) &&
        Objects.equals(this.repoURL, v1WorkSpaceSource.repoURL) &&
        Objects.equals(this.targetRevision, v1WorkSpaceSource.targetRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, path, plugin, repoURL, targetRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceSourceDto {\n");
    
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
    sb.append("    targetRevision: ").append(toIndentedString(targetRevision)).append("\n");
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


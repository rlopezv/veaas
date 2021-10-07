package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceSource contains all required information about the source of an workSpace
 */
@Schema(description = "WorkSpaceSource contains all required information about the source of an workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceSource   {
  @JsonProperty("directory")
  private WorkSpaceSourceDirectory directory;

  @JsonProperty("path")
  private String path;

  @JsonProperty("plugin")
  private WorkSpaceSourcePlugin plugin;

  @JsonProperty("repoURL")
  private String repoURL;

  @JsonProperty("targetRevision")
  private String targetRevision;

  public WorkSpaceSource directory(WorkSpaceSourceDirectory directory) {
    this.directory = directory;
    return this;
  }

  /**
   * Get directory
   * @return directory
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSourceDirectory getDirectory() {
    return directory;
  }

  public void setDirectory(WorkSpaceSourceDirectory directory) {
    this.directory = directory;
  }

  public WorkSpaceSource path(String path) {
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

  public WorkSpaceSource plugin(WorkSpaceSourcePlugin plugin) {
    this.plugin = plugin;
    return this;
  }

  /**
   * Get plugin
   * @return plugin
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSourcePlugin getPlugin() {
    return plugin;
  }

  public void setPlugin(WorkSpaceSourcePlugin plugin) {
    this.plugin = plugin;
  }

  public WorkSpaceSource repoURL(String repoURL) {
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

  public WorkSpaceSource targetRevision(String targetRevision) {
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
    WorkSpaceSource WorkSpaceSource = (WorkSpaceSource) o;
    return Objects.equals(this.directory, WorkSpaceSource.directory) &&
        Objects.equals(this.path, WorkSpaceSource.path) &&
        Objects.equals(this.plugin, WorkSpaceSource.plugin) &&
        Objects.equals(this.repoURL, WorkSpaceSource.repoURL) &&
        Objects.equals(this.targetRevision, WorkSpaceSource.targetRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, path, plugin, repoURL, targetRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceSource {\n");
    
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


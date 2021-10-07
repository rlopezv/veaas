package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * VersionMessage represents version of the API server
 */
@Schema(description = "VersionMessage represents version of the API server")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class VersionVersionMessage   {
  @JsonProperty("BuildDate")
  private String buildDate;

  @JsonProperty("Compiler")
  private String compiler;

  @JsonProperty("GitCommit")
  private String gitCommit;

  @JsonProperty("GitTag")
  private String gitTag;

  @JsonProperty("GitTreeState")
  private String gitTreeState;

  @JsonProperty("Platform")
  private String platform;

  @JsonProperty("Version")
  private String version;

  public VersionVersionMessage buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

  /**
   * Get buildDate
   * @return buildDate
  */
 @Schema(defaultValue =  "")
 public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }

  public VersionVersionMessage compiler(String compiler) {
    this.compiler = compiler;
    return this;
  }

  /**
   * Get compiler
   * @return compiler
  */
 @Schema(defaultValue =  "")
 public String getCompiler() {
    return compiler;
  }

  public void setCompiler(String compiler) {
    this.compiler = compiler;
  }

  public VersionVersionMessage gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * Get gitCommit
   * @return gitCommit
  */
 @Schema(defaultValue =  "")
 public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public VersionVersionMessage gitTag(String gitTag) {
    this.gitTag = gitTag;
    return this;
  }

  /**
   * Get gitTag
   * @return gitTag
  */
 @Schema(defaultValue =  "")
 public String getGitTag() {
    return gitTag;
  }

  public void setGitTag(String gitTag) {
    this.gitTag = gitTag;
  }

  public VersionVersionMessage gitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return this;
  }

  /**
   * Get gitTreeState
   * @return gitTreeState
  */
 @Schema(defaultValue =  "")
 public String getGitTreeState() {
    return gitTreeState;
  }

  public void setGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }

  public VersionVersionMessage platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
 @Schema(defaultValue =  "")
 public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public VersionVersionMessage version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
 @Schema(defaultValue =  "")
 public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionVersionMessage versionVersionMessage = (VersionVersionMessage) o;
    return Objects.equals(this.buildDate, versionVersionMessage.buildDate) &&
        Objects.equals(this.compiler, versionVersionMessage.compiler) &&
        Objects.equals(this.gitCommit, versionVersionMessage.gitCommit) &&
        Objects.equals(this.gitTag, versionVersionMessage.gitTag) &&
        Objects.equals(this.gitTreeState, versionVersionMessage.gitTreeState) &&
        Objects.equals(this.platform, versionVersionMessage.platform) &&
        Objects.equals(this.version, versionVersionMessage.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, compiler, gitCommit, gitTag, gitTreeState, platform, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionVersionMessage {\n");
    
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTag: ").append(toIndentedString(gitTag)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


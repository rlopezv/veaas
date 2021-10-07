package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceDiff holds the diff of a live and target resource object TODO: describe members of this type
 */
@Schema(description = "ResourceDiff holds the diff of a live and target resource object TODO: describe members of this type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ResourceDiff   {
  @JsonProperty("diff")
  private String diff;

  @JsonProperty("group")
  private String group;

  @JsonProperty("hook")
  private Boolean hook;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("liveState")
  private String liveState;

  @JsonProperty("modified")
  private Boolean modified;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("normalizedLiveState")
  private String normalizedLiveState;

  @JsonProperty("predictedLiveState")
  private String predictedLiveState;

  @JsonProperty("resourceVersion")
  private String resourceVersion;

  @JsonProperty("targetState")
  private String targetState;

  public ResourceDiff diff(String diff) {
    this.diff = diff;
    return this;
  }

  /**
   * Diff contains the JSON patch between target and live resource Deprecated: use NormalizedLiveState and PredictedLiveState to render the difference
   * @return diff
  */
 @Schema(defaultValue = "Diff contains the JSON patch between target and live resource Deprecated: use NormalizedLiveState and PredictedLiveState to render the difference")


  public String getDiff() {
    return diff;
  }

  public void setDiff(String diff) {
    this.diff = diff;
  }

  public ResourceDiff group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
 @Schema(defaultValue =  "")
 public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public ResourceDiff hook(Boolean hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
  */
 @Schema(defaultValue =  "")
 public Boolean getHook() {
    return hook;
  }

  public void setHook(Boolean hook) {
    this.hook = hook;
  }

  public ResourceDiff kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
 @Schema(defaultValue =  "")
 public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ResourceDiff liveState(String liveState) {
    this.liveState = liveState;
    return this;
  }

  /**
   * TargetState contains the JSON live resource manifest
   * @return liveState
  */
 @Schema(defaultValue = "TargetState contains the JSON live resource manifest")


  public String getLiveState() {
    return liveState;
  }

  public void setLiveState(String liveState) {
    this.liveState = liveState;
  }

  public ResourceDiff modified(Boolean modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
  */
 @Schema(defaultValue =  "")
 public Boolean getModified() {
    return modified;
  }

  public void setModified(Boolean modified) {
    this.modified = modified;
  }

  public ResourceDiff name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue =  "")
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceDiff namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
 @Schema(defaultValue =  "")
 public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ResourceDiff normalizedLiveState(String normalizedLiveState) {
    this.normalizedLiveState = normalizedLiveState;
    return this;
  }

  /**
   * NormalizedLiveState contains JSON serialized live resource state with applied normalizations
   * @return normalizedLiveState
  */
 @Schema(defaultValue = "NormalizedLiveState contains JSON serialized live resource state with applied normalizations")


  public String getNormalizedLiveState() {
    return normalizedLiveState;
  }

  public void setNormalizedLiveState(String normalizedLiveState) {
    this.normalizedLiveState = normalizedLiveState;
  }

  public ResourceDiff predictedLiveState(String predictedLiveState) {
    this.predictedLiveState = predictedLiveState;
    return this;
  }

  /**
   * PredictedLiveState contains JSON serialized resource state that is calculated based on normalized and target resource state
   * @return predictedLiveState
  */
 @Schema(defaultValue = "PredictedLiveState contains JSON serialized resource state that is calculated based on normalized and target resource state")


  public String getPredictedLiveState() {
    return predictedLiveState;
  }

  public void setPredictedLiveState(String predictedLiveState) {
    this.predictedLiveState = predictedLiveState;
  }

  public ResourceDiff resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Get resourceVersion
   * @return resourceVersion
  */
 @Schema(defaultValue =  "")
 public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public ResourceDiff targetState(String targetState) {
    this.targetState = targetState;
    return this;
  }

  /**
   * TargetState contains the JSON serialized resource manifest defined in the Git
   * @return targetState
  */
 @Schema(defaultValue = "TargetState contains the JSON serialized resource manifest defined in the Git")


  public String getTargetState() {
    return targetState;
  }

  public void setTargetState(String targetState) {
    this.targetState = targetState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDiff ResourceDiff = (ResourceDiff) o;
    return Objects.equals(this.diff, ResourceDiff.diff) &&
        Objects.equals(this.group, ResourceDiff.group) &&
        Objects.equals(this.hook, ResourceDiff.hook) &&
        Objects.equals(this.kind, ResourceDiff.kind) &&
        Objects.equals(this.liveState, ResourceDiff.liveState) &&
        Objects.equals(this.modified, ResourceDiff.modified) &&
        Objects.equals(this.name, ResourceDiff.name) &&
        Objects.equals(this.namespace, ResourceDiff.namespace) &&
        Objects.equals(this.normalizedLiveState, ResourceDiff.normalizedLiveState) &&
        Objects.equals(this.predictedLiveState, ResourceDiff.predictedLiveState) &&
        Objects.equals(this.resourceVersion, ResourceDiff.resourceVersion) &&
        Objects.equals(this.targetState, ResourceDiff.targetState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diff, group, hook, kind, liveState, modified, name, namespace, normalizedLiveState, predictedLiveState, resourceVersion, targetState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDiff {\n");
    
    sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    liveState: ").append(toIndentedString(liveState)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    normalizedLiveState: ").append(toIndentedString(normalizedLiveState)).append("\n");
    sb.append("    predictedLiveState: ").append(toIndentedString(predictedLiveState)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
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


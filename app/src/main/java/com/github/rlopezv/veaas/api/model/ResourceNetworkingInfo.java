package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceNetworkingInfo holds networking resource related information TODO: describe members of this type
 */
@Schema(description = "ResourceNetworkingInfo holds networking resource related information TODO: describe members of this type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ResourceNetworkingInfo   {
  @JsonProperty("externalURLs")
  @Valid
  private List<String> externalURLs = null;

  @JsonProperty("ingress")
  @Valid
  private List<NetworkIngress> ingress = null;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("targetLabels")
  @Valid
  private Map<String, String> targetLabels = null;

  @JsonProperty("targetRefs")
  @Valid
  private List<ResourceRef> targetRefs = null;

  public ResourceNetworkingInfo externalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
    return this;
  }

  public ResourceNetworkingInfo addExternalURLsItem(String externalURLsItem) {
    if (this.externalURLs == null) {
      this.externalURLs = new ArrayList<>();
    }
    this.externalURLs.add(externalURLsItem);
    return this;
  }

  /**
   * ExternalURLs holds list of URLs which should be available externally. List is populated for ingress resources using rules hostnames.
   * @return externalURLs
  */
 @Schema(defaultValue = "ExternalURLs holds list of URLs which should be available externally. List is populated for ingress resources using rules hostnames.")


  public List<String> getExternalURLs() {
    return externalURLs;
  }

  public void setExternalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
  }

  public ResourceNetworkingInfo ingress(List<NetworkIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public ResourceNetworkingInfo addIngressItem(NetworkIngress ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

  /**
   * Get ingress
   * @return ingress
  */
 @Schema(defaultValue = "")
  @Valid

  public List<NetworkIngress> getIngress() {
    return ingress;
  }

  public void setIngress(List<NetworkIngress> ingress) {
    this.ingress = ingress;
  }

  public ResourceNetworkingInfo labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ResourceNetworkingInfo putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
 @Schema(defaultValue =  "")
 public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ResourceNetworkingInfo targetLabels(Map<String, String> targetLabels) {
    this.targetLabels = targetLabels;
    return this;
  }

  public ResourceNetworkingInfo putTargetLabelsItem(String key, String targetLabelsItem) {
    if (this.targetLabels == null) {
      this.targetLabels = new HashMap<>();
    }
    this.targetLabels.put(key, targetLabelsItem);
    return this;
  }

  /**
   * Get targetLabels
   * @return targetLabels
  */
 @Schema(defaultValue =  "")
 public Map<String, String> getTargetLabels() {
    return targetLabels;
  }

  public void setTargetLabels(Map<String, String> targetLabels) {
    this.targetLabels = targetLabels;
  }

  public ResourceNetworkingInfo targetRefs(List<ResourceRef> targetRefs) {
    this.targetRefs = targetRefs;
    return this;
  }

  public ResourceNetworkingInfo addTargetRefsItem(ResourceRef targetRefsItem) {
    if (this.targetRefs == null) {
      this.targetRefs = new ArrayList<>();
    }
    this.targetRefs.add(targetRefsItem);
    return this;
  }

  /**
   * Get targetRefs
   * @return targetRefs
  */
 @Schema(defaultValue = "")
  @Valid

  public List<ResourceRef> getTargetRefs() {
    return targetRefs;
  }

  public void setTargetRefs(List<ResourceRef> targetRefs) {
    this.targetRefs = targetRefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceNetworkingInfo ResourceNetworkingInfo = (ResourceNetworkingInfo) o;
    return Objects.equals(this.externalURLs, ResourceNetworkingInfo.externalURLs) &&
        Objects.equals(this.ingress, ResourceNetworkingInfo.ingress) &&
        Objects.equals(this.labels, ResourceNetworkingInfo.labels) &&
        Objects.equals(this.targetLabels, ResourceNetworkingInfo.targetLabels) &&
        Objects.equals(this.targetRefs, ResourceNetworkingInfo.targetRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalURLs, ingress, labels, targetLabels, targetRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceNetworkingInfo {\n");
    
    sb.append("    externalURLs: ").append(toIndentedString(externalURLs)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    targetLabels: ").append(toIndentedString(targetLabels)).append("\n");
    sb.append("    targetRefs: ").append(toIndentedString(targetRefs)).append("\n");
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


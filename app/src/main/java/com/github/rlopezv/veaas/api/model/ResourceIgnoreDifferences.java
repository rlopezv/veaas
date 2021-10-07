package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceIgnoreDifferences contains resource filter and list of json paths which should be ignored during comparison with live state.
 */
@Schema(description = "ResourceIgnoreDifferences contains resource filter and list of json paths which should be ignored during comparison with live state.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ResourceIgnoreDifferences   {
  @JsonProperty("group")
  private String group;

  @JsonProperty("jqPathExpressions")
  @Valid
  private List<String> jqPathExpressions = null;

  @JsonProperty("jsonPointers")
  @Valid
  private List<String> jsonPointers = null;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  public ResourceIgnoreDifferences group(String group) {
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

  public ResourceIgnoreDifferences jqPathExpressions(List<String> jqPathExpressions) {
    this.jqPathExpressions = jqPathExpressions;
    return this;
  }

  public ResourceIgnoreDifferences addJqPathExpressionsItem(String jqPathExpressionsItem) {
    if (this.jqPathExpressions == null) {
      this.jqPathExpressions = new ArrayList<>();
    }
    this.jqPathExpressions.add(jqPathExpressionsItem);
    return this;
  }

  /**
   * Get jqPathExpressions
   * @return jqPathExpressions
  */
 @Schema(defaultValue =  "")
 public List<String> getJqPathExpressions() {
    return jqPathExpressions;
  }

  public void setJqPathExpressions(List<String> jqPathExpressions) {
    this.jqPathExpressions = jqPathExpressions;
  }

  public ResourceIgnoreDifferences jsonPointers(List<String> jsonPointers) {
    this.jsonPointers = jsonPointers;
    return this;
  }

  public ResourceIgnoreDifferences addJsonPointersItem(String jsonPointersItem) {
    if (this.jsonPointers == null) {
      this.jsonPointers = new ArrayList<>();
    }
    this.jsonPointers.add(jsonPointersItem);
    return this;
  }

  /**
   * Get jsonPointers
   * @return jsonPointers
  */
 @Schema(defaultValue =  "")
 public List<String> getJsonPointers() {
    return jsonPointers;
  }

  public void setJsonPointers(List<String> jsonPointers) {
    this.jsonPointers = jsonPointers;
  }

  public ResourceIgnoreDifferences kind(String kind) {
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

  public ResourceIgnoreDifferences name(String name) {
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

  public ResourceIgnoreDifferences namespace(String namespace) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceIgnoreDifferences ResourceIgnoreDifferences = (ResourceIgnoreDifferences) o;
    return Objects.equals(this.group, ResourceIgnoreDifferences.group) &&
        Objects.equals(this.jqPathExpressions, ResourceIgnoreDifferences.jqPathExpressions) &&
        Objects.equals(this.jsonPointers, ResourceIgnoreDifferences.jsonPointers) &&
        Objects.equals(this.kind, ResourceIgnoreDifferences.kind) &&
        Objects.equals(this.name, ResourceIgnoreDifferences.name) &&
        Objects.equals(this.namespace, ResourceIgnoreDifferences.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, jqPathExpressions, jsonPointers, kind, name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceIgnoreDifferences {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    jqPathExpressions: ").append(toIndentedString(jqPathExpressions)).append("\n");
    sb.append("    jsonPointers: ").append(toIndentedString(jsonPointers)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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


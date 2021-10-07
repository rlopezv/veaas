package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SyncOperationResult represent result of sync operation
 */
@Schema(description = "SyncOperationResult represent result of sync operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class SyncOperationResult   {
  @JsonProperty("resources")
  @Valid
  private List<ResourceResult> resources = null;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("source")
  private WorkSpaceSource source;

  public SyncOperationResult resources(List<ResourceResult> resources) {
    this.resources = resources;
    return this;
  }

  public SyncOperationResult addResourcesItem(ResourceResult resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Resources contains a list of sync result items for each individual resource in a sync operation
   * @return resources
  */
 @Schema(defaultValue = "Resources contains a list of sync result items for each individual resource in a sync operation")

  @Valid

  public List<ResourceResult> getResources() {
    return resources;
  }

  public void setResources(List<ResourceResult> resources) {
    this.resources = resources;
  }

  public SyncOperationResult revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision holds the revision this sync operation was performed to
   * @return revision
  */
 @Schema(defaultValue = "Revision holds the revision this sync operation was performed to")


  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public SyncOperationResult source(WorkSpaceSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSource getSource() {
    return source;
  }

  public void setSource(WorkSpaceSource source) {
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
    SyncOperationResult SyncOperationResult = (SyncOperationResult) o;
    return Objects.equals(this.resources, SyncOperationResult.resources) &&
        Objects.equals(this.revision, SyncOperationResult.revision) &&
        Objects.equals(this.source, SyncOperationResult.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, revision, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncOperationResult {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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


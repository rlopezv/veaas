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
public class V1SyncOperationResultDto   {
  @JsonProperty("resources")
  @Valid
  private List<V1ResourceResultDto> resources = null;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  public V1SyncOperationResultDto resources(List<V1ResourceResultDto> resources) {
    this.resources = resources;
    return this;
  }

  public V1SyncOperationResultDto addResourcesItem(V1ResourceResultDto resourcesItem) {
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

  public List<V1ResourceResultDto> getResources() {
    return resources;
  }

  public void setResources(List<V1ResourceResultDto> resources) {
    this.resources = resources;
  }

  public V1SyncOperationResultDto revision(String revision) {
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

  public V1SyncOperationResultDto source(V1WorkSpaceSourceDto source) {
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
    V1SyncOperationResultDto v1SyncOperationResult = (V1SyncOperationResultDto) o;
    return Objects.equals(this.resources, v1SyncOperationResult.resources) &&
        Objects.equals(this.revision, v1SyncOperationResult.revision) &&
        Objects.equals(this.source, v1SyncOperationResult.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, revision, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncOperationResultDto {\n");
    
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


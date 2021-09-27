package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1SyncOperationResourceDto;
import com.github.rlopezv.veaas.api.model.V1SyncStrategyDto;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceSourceDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncOperation contains details about a sync operation.
 */
@Schema(description = "SyncOperation contains details about a sync operation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1SyncOperationDto   {
  @JsonProperty("dryRun")
  private Boolean dryRun;

  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  @JsonProperty("prune")
  private Boolean prune;

  @JsonProperty("resources")
  @Valid
  private List<V1SyncOperationResourceDto> resources = null;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  @JsonProperty("syncOptions")
  @Valid
  private List<String> syncOptions = null;

  @JsonProperty("syncStrategy")
  private V1SyncStrategyDto syncStrategy;

  public V1SyncOperationDto dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * DryRun specifies to perform an apply without actually performing the sync
   * @return dryRun
  */
 @Schema(defaultValue = "DryRun specifies to perform an apply without actually performing the sync")


  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public V1SyncOperationDto manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public V1SyncOperationDto addManifestsItem(String manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Manifests is an optional field that overrides sync source with a local directory for development
   * @return manifests
  */
 @Schema(defaultValue = "Manifests is an optional field that overrides sync source with a local directory for development")


  public List<String> getManifests() {
    return manifests;
  }

  public void setManifests(List<String> manifests) {
    this.manifests = manifests;
  }

  public V1SyncOperationDto prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Prune specifies to delete resources from the provider that are no longer tracked in git
   * @return prune
  */
 @Schema(defaultValue = "Prune specifies to delete resources from the provider that are no longer tracked in git")


  public Boolean getPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }

  public V1SyncOperationDto resources(List<V1SyncOperationResourceDto> resources) {
    this.resources = resources;
    return this;
  }

  public V1SyncOperationDto addResourcesItem(V1SyncOperationResourceDto resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Resources describes which resources shall be part of the sync
   * @return resources
  */
 @Schema(defaultValue = "Resources describes which resources shall be part of the sync")

  @Valid

  public List<V1SyncOperationResourceDto> getResources() {
    return resources;
  }

  public void setResources(List<V1SyncOperationResourceDto> resources) {
    this.resources = resources;
  }

  public V1SyncOperationDto revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision is the revision (Git) or chart version (Helm) which to sync the workSpace to If omitted, will use the revision specified in app spec.
   * @return revision
  */
 @Schema(defaultValue = "Revision is the revision (Git) or chart version (Helm) which to sync the workSpace to If omitted, will use the revision specified in app spec.")


  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public V1SyncOperationDto source(V1WorkSpaceSourceDto source) {
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

  public V1SyncOperationDto syncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  public V1SyncOperationDto addSyncOptionsItem(String syncOptionsItem) {
    if (this.syncOptions == null) {
      this.syncOptions = new ArrayList<>();
    }
    this.syncOptions.add(syncOptionsItem);
    return this;
  }

  /**
   * SyncOptions provide per-sync sync-options, e.g. Validate=false
   * @return syncOptions
  */
 @Schema(defaultValue = "SyncOptions provide per-sync sync-options, e.g. Validate=false")


  public List<String> getSyncOptions() {
    return syncOptions;
  }

  public void setSyncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
  }

  public V1SyncOperationDto syncStrategy(V1SyncStrategyDto syncStrategy) {
    this.syncStrategy = syncStrategy;
    return this;
  }

  /**
   * Get syncStrategy
   * @return syncStrategy
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncStrategyDto getSyncStrategy() {
    return syncStrategy;
  }

  public void setSyncStrategy(V1SyncStrategyDto syncStrategy) {
    this.syncStrategy = syncStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyncOperationDto v1SyncOperation = (V1SyncOperationDto) o;
    return Objects.equals(this.dryRun, v1SyncOperation.dryRun) &&
        Objects.equals(this.manifests, v1SyncOperation.manifests) &&
        Objects.equals(this.prune, v1SyncOperation.prune) &&
        Objects.equals(this.resources, v1SyncOperation.resources) &&
        Objects.equals(this.revision, v1SyncOperation.revision) &&
        Objects.equals(this.source, v1SyncOperation.source) &&
        Objects.equals(this.syncOptions, v1SyncOperation.syncOptions) &&
        Objects.equals(this.syncStrategy, v1SyncOperation.syncStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, manifests, prune, resources, revision, source, syncOptions, syncStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncOperationDto {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    syncOptions: ").append(toIndentedString(syncOptions)).append("\n");
    sb.append("    syncStrategy: ").append(toIndentedString(syncStrategy)).append("\n");
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


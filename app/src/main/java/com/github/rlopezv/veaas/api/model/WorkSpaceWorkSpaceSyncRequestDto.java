package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1InfoDto;
import com.github.rlopezv.veaas.api.model.V1RetryStrategyDto;
import com.github.rlopezv.veaas.api.model.V1SyncOperationResourceDto;
import com.github.rlopezv.veaas.api.model.V1SyncStrategyDto;
import com.github.rlopezv.veaas.api.model.WorkSpaceSyncOptionsDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceSyncRequest is a request to apply the config state to live state
 */
@Schema(description = "WorkSpaceSyncRequest is a request to apply the config state to live state")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpaceSyncRequestDto   {
  @JsonProperty("dryRun")
  private Boolean dryRun;

  @JsonProperty("infos")
  @Valid
  private List<V1InfoDto> infos = null;

  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("prune")
  private Boolean prune;

  @JsonProperty("resources")
  @Valid
  private List<V1SyncOperationResourceDto> resources = null;

  @JsonProperty("retryStrategy")
  private V1RetryStrategyDto retryStrategy;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("strategy")
  private V1SyncStrategyDto strategy;

  @JsonProperty("syncOptions")
  private WorkSpaceSyncOptionsDto syncOptions;

  public WorkSpaceWorkSpaceSyncRequestDto dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
  */
 @Schema(defaultValue = "")


  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public WorkSpaceWorkSpaceSyncRequestDto infos(List<V1InfoDto> infos) {
    this.infos = infos;
    return this;
  }

  public WorkSpaceWorkSpaceSyncRequestDto addInfosItem(V1InfoDto infosItem) {
    if (this.infos == null) {
      this.infos = new ArrayList<>();
    }
    this.infos.add(infosItem);
    return this;
  }

  /**
   * Get infos
   * @return infos
  */
 @Schema(defaultValue = "")

  @Valid

  public List<V1InfoDto> getInfos() {
    return infos;
  }

  public void setInfos(List<V1InfoDto> infos) {
    this.infos = infos;
  }

  public WorkSpaceWorkSpaceSyncRequestDto manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public WorkSpaceWorkSpaceSyncRequestDto addManifestsItem(String manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Get manifests
   * @return manifests
  */
 @Schema(defaultValue = "")


  public List<String> getManifests() {
    return manifests;
  }

  public void setManifests(List<String> manifests) {
    this.manifests = manifests;
  }

  public WorkSpaceWorkSpaceSyncRequestDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkSpaceWorkSpaceSyncRequestDto prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Get prune
   * @return prune
  */
 @Schema(defaultValue = "")


  public Boolean getPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }

  public WorkSpaceWorkSpaceSyncRequestDto resources(List<V1SyncOperationResourceDto> resources) {
    this.resources = resources;
    return this;
  }

  public WorkSpaceWorkSpaceSyncRequestDto addResourcesItem(V1SyncOperationResourceDto resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
 @Schema(defaultValue = "")

  @Valid

  public List<V1SyncOperationResourceDto> getResources() {
    return resources;
  }

  public void setResources(List<V1SyncOperationResourceDto> resources) {
    this.resources = resources;
  }

  public WorkSpaceWorkSpaceSyncRequestDto retryStrategy(V1RetryStrategyDto retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

  /**
   * Get retryStrategy
   * @return retryStrategy
  */
 @Schema(defaultValue = "")

  @Valid

  public V1RetryStrategyDto getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(V1RetryStrategyDto retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public WorkSpaceWorkSpaceSyncRequestDto revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   * @return revision
  */
 @Schema(defaultValue = "")


  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public WorkSpaceWorkSpaceSyncRequestDto strategy(V1SyncStrategyDto strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncStrategyDto getStrategy() {
    return strategy;
  }

  public void setStrategy(V1SyncStrategyDto strategy) {
    this.strategy = strategy;
  }

  public WorkSpaceWorkSpaceSyncRequestDto syncOptions(WorkSpaceSyncOptionsDto syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  /**
   * Get syncOptions
   * @return syncOptions
  */
 @Schema(defaultValue = "")

  @Valid

  public WorkSpaceSyncOptionsDto getSyncOptions() {
    return syncOptions;
  }

  public void setSyncOptions(WorkSpaceSyncOptionsDto syncOptions) {
    this.syncOptions = syncOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpaceSyncRequestDto workSpaceWorkSpaceSyncRequest = (WorkSpaceWorkSpaceSyncRequestDto) o;
    return Objects.equals(this.dryRun, workSpaceWorkSpaceSyncRequest.dryRun) &&
        Objects.equals(this.infos, workSpaceWorkSpaceSyncRequest.infos) &&
        Objects.equals(this.manifests, workSpaceWorkSpaceSyncRequest.manifests) &&
        Objects.equals(this.name, workSpaceWorkSpaceSyncRequest.name) &&
        Objects.equals(this.prune, workSpaceWorkSpaceSyncRequest.prune) &&
        Objects.equals(this.resources, workSpaceWorkSpaceSyncRequest.resources) &&
        Objects.equals(this.retryStrategy, workSpaceWorkSpaceSyncRequest.retryStrategy) &&
        Objects.equals(this.revision, workSpaceWorkSpaceSyncRequest.revision) &&
        Objects.equals(this.strategy, workSpaceWorkSpaceSyncRequest.strategy) &&
        Objects.equals(this.syncOptions, workSpaceWorkSpaceSyncRequest.syncOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, infos, manifests, name, prune, resources, retryStrategy, revision, strategy, syncOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpaceSyncRequestDto {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    syncOptions: ").append(toIndentedString(syncOptions)).append("\n");
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


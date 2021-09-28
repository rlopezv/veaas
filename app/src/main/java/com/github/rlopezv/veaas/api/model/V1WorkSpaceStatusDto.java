package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceStatus contains status information for the workSpace
 */
@Schema(description = "WorkSpaceStatus contains status information for the workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceStatusDto   {
  @JsonProperty("conditions")
  @Valid
  private List<V1WorkSpaceConditionDto> conditions = null;

  @JsonProperty("health")
  private V1HealthStatusDto health;

  @JsonProperty("history")
  @Valid
  private List<V1RevisionHistoryDto> history = null;

  @JsonProperty("observedAt")
  private V1TimeDto observedAt;

  @JsonProperty("operationState")
  private V1OperationStateDto operationState;

  @JsonProperty("reconciledAt")
  private V1TimeDto reconciledAt;

  @JsonProperty("resources")
  @Valid
  private List<V1ResourceStatusDto> resources = null;

  @JsonProperty("sourceType")
  private String sourceType;

  @JsonProperty("summary")
  private V1WorkSpaceSummaryDto summary;

  @JsonProperty("sync")
  private V1SyncStatusDto sync;

  public V1WorkSpaceStatusDto conditions(List<V1WorkSpaceConditionDto> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1WorkSpaceStatusDto addConditionsItem(V1WorkSpaceConditionDto conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions is a list of currently observed workSpace conditions
   * @return conditions
  */
 @Schema(defaultValue = "Conditions is a list of currently observed workSpace conditions")

  @Valid

  public List<V1WorkSpaceConditionDto> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1WorkSpaceConditionDto> conditions) {
    this.conditions = conditions;
  }

  public V1WorkSpaceStatusDto health(V1HealthStatusDto health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
  */
 @Schema(defaultValue = "")
  @Valid

  public V1HealthStatusDto getHealth() {
    return health;
  }

  public void setHealth(V1HealthStatusDto health) {
    this.health = health;
  }

  public V1WorkSpaceStatusDto history(List<V1RevisionHistoryDto> history) {
    this.history = history;
    return this;
  }

  public V1WorkSpaceStatusDto addHistoryItem(V1RevisionHistoryDto historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * History contains information about the workSpace's sync history
   * @return history
  */
 @Schema(defaultValue = "History contains information about the workSpace's sync history")

  @Valid

  public List<V1RevisionHistoryDto> getHistory() {
    return history;
  }

  public void setHistory(List<V1RevisionHistoryDto> history) {
    this.history = history;
  }

  public V1WorkSpaceStatusDto observedAt(V1TimeDto observedAt) {
    this.observedAt = observedAt;
    return this;
  }

  /**
   * Get observedAt
   * @return observedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getObservedAt() {
    return observedAt;
  }

  public void setObservedAt(V1TimeDto observedAt) {
    this.observedAt = observedAt;
  }

  public V1WorkSpaceStatusDto operationState(V1OperationStateDto operationState) {
    this.operationState = operationState;
    return this;
  }

  /**
   * Get operationState
   * @return operationState
  */
 @Schema(defaultValue = "")
  @Valid

  public V1OperationStateDto getOperationState() {
    return operationState;
  }

  public void setOperationState(V1OperationStateDto operationState) {
    this.operationState = operationState;
  }

  public V1WorkSpaceStatusDto reconciledAt(V1TimeDto reconciledAt) {
    this.reconciledAt = reconciledAt;
    return this;
  }

  /**
   * Get reconciledAt
   * @return reconciledAt
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getReconciledAt() {
    return reconciledAt;
  }

  public void setReconciledAt(V1TimeDto reconciledAt) {
    this.reconciledAt = reconciledAt;
  }

  public V1WorkSpaceStatusDto resources(List<V1ResourceStatusDto> resources) {
    this.resources = resources;
    return this;
  }

  public V1WorkSpaceStatusDto addResourcesItem(V1ResourceStatusDto resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Resources is a list of Kubernetes resources managed by this workSpace
   * @return resources
  */
 @Schema(defaultValue = "Resources is a list of Kubernetes resources managed by this workSpace")

  @Valid

  public List<V1ResourceStatusDto> getResources() {
    return resources;
  }

  public void setResources(List<V1ResourceStatusDto> resources) {
    this.resources = resources;
  }

  public V1WorkSpaceStatusDto sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * SourceType specifies the type of this workSpace
   * @return sourceType
  */
 @Schema(defaultValue = "SourceType specifies the type of this workSpace")


  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public V1WorkSpaceStatusDto summary(V1WorkSpaceSummaryDto summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
 @Schema(defaultValue = "")
  @Valid

  public V1WorkSpaceSummaryDto getSummary() {
    return summary;
  }

  public void setSummary(V1WorkSpaceSummaryDto summary) {
    this.summary = summary;
  }

  public V1WorkSpaceStatusDto sync(V1SyncStatusDto sync) {
    this.sync = sync;
    return this;
  }

  /**
   * Get sync
   * @return sync
  */
 @Schema(defaultValue = "")
  @Valid

  public V1SyncStatusDto getSync() {
    return sync;
  }

  public void setSync(V1SyncStatusDto sync) {
    this.sync = sync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkSpaceStatusDto v1WorkSpaceStatus = (V1WorkSpaceStatusDto) o;
    return Objects.equals(this.conditions, v1WorkSpaceStatus.conditions) &&
        Objects.equals(this.health, v1WorkSpaceStatus.health) &&
        Objects.equals(this.history, v1WorkSpaceStatus.history) &&
        Objects.equals(this.observedAt, v1WorkSpaceStatus.observedAt) &&
        Objects.equals(this.operationState, v1WorkSpaceStatus.operationState) &&
        Objects.equals(this.reconciledAt, v1WorkSpaceStatus.reconciledAt) &&
        Objects.equals(this.resources, v1WorkSpaceStatus.resources) &&
        Objects.equals(this.sourceType, v1WorkSpaceStatus.sourceType) &&
        Objects.equals(this.summary, v1WorkSpaceStatus.summary) &&
        Objects.equals(this.sync, v1WorkSpaceStatus.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, health, history, observedAt, operationState, reconciledAt, resources, sourceType, summary, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceStatusDto {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    observedAt: ").append(toIndentedString(observedAt)).append("\n");
    sb.append("    operationState: ").append(toIndentedString(operationState)).append("\n");
    sb.append("    reconciledAt: ").append(toIndentedString(reconciledAt)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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


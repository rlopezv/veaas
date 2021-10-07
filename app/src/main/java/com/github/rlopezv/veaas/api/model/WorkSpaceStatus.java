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
public class WorkSpaceStatus   {
  @JsonProperty("conditions")
  @Valid
  private List<WorkSpaceCondition> conditions = null;

  @JsonProperty("health")
  private HealthStatus health;

  @JsonProperty("history")
  @Valid
  private List<RevisionHistory> history = null;

  @JsonProperty("observedAt")
  private Time observedAt;

  @JsonProperty("operationState")
  private OperationState operationState;

  @JsonProperty("reconciledAt")
  private Time reconciledAt;

  @JsonProperty("resources")
  @Valid
  private List<ResourceStatus> resources = null;

  @JsonProperty("sourceType")
  private String sourceType;

  @JsonProperty("summary")
  private WorkSpaceSummary summary;

  @JsonProperty("sync")
  private SyncStatus sync;

  public WorkSpaceStatus conditions(List<WorkSpaceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public WorkSpaceStatus addConditionsItem(WorkSpaceCondition conditionsItem) {
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

  public List<WorkSpaceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<WorkSpaceCondition> conditions) {
    this.conditions = conditions;
  }

  public WorkSpaceStatus health(HealthStatus health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
  */
 @Schema(defaultValue = "")
  @Valid

  public HealthStatus getHealth() {
    return health;
  }

  public void setHealth(HealthStatus health) {
    this.health = health;
  }

  public WorkSpaceStatus history(List<RevisionHistory> history) {
    this.history = history;
    return this;
  }

  public WorkSpaceStatus addHistoryItem(RevisionHistory historyItem) {
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

  public List<RevisionHistory> getHistory() {
    return history;
  }

  public void setHistory(List<RevisionHistory> history) {
    this.history = history;
  }

  public WorkSpaceStatus observedAt(Time observedAt) {
    this.observedAt = observedAt;
    return this;
  }

  /**
   * Get observedAt
   * @return observedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getObservedAt() {
    return observedAt;
  }

  public void setObservedAt(Time observedAt) {
    this.observedAt = observedAt;
  }

  public WorkSpaceStatus operationState(OperationState operationState) {
    this.operationState = operationState;
    return this;
  }

  /**
   * Get operationState
   * @return operationState
  */
 @Schema(defaultValue = "")
  @Valid

  public OperationState getOperationState() {
    return operationState;
  }

  public void setOperationState(OperationState operationState) {
    this.operationState = operationState;
  }

  public WorkSpaceStatus reconciledAt(Time reconciledAt) {
    this.reconciledAt = reconciledAt;
    return this;
  }

  /**
   * Get reconciledAt
   * @return reconciledAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getReconciledAt() {
    return reconciledAt;
  }

  public void setReconciledAt(Time reconciledAt) {
    this.reconciledAt = reconciledAt;
  }

  public WorkSpaceStatus resources(List<ResourceStatus> resources) {
    this.resources = resources;
    return this;
  }

  public WorkSpaceStatus addResourcesItem(ResourceStatus resourcesItem) {
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

  public List<ResourceStatus> getResources() {
    return resources;
  }

  public void setResources(List<ResourceStatus> resources) {
    this.resources = resources;
  }

  public WorkSpaceStatus sourceType(String sourceType) {
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

  public WorkSpaceStatus summary(WorkSpaceSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSummary getSummary() {
    return summary;
  }

  public void setSummary(WorkSpaceSummary summary) {
    this.summary = summary;
  }

  public WorkSpaceStatus sync(SyncStatus sync) {
    this.sync = sync;
    return this;
  }

  /**
   * Get sync
   * @return sync
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncStatus getSync() {
    return sync;
  }

  public void setSync(SyncStatus sync) {
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
    WorkSpaceStatus WorkSpaceStatus = (WorkSpaceStatus) o;
    return Objects.equals(this.conditions, WorkSpaceStatus.conditions) &&
        Objects.equals(this.health, WorkSpaceStatus.health) &&
        Objects.equals(this.history, WorkSpaceStatus.history) &&
        Objects.equals(this.observedAt, WorkSpaceStatus.observedAt) &&
        Objects.equals(this.operationState, WorkSpaceStatus.operationState) &&
        Objects.equals(this.reconciledAt, WorkSpaceStatus.reconciledAt) &&
        Objects.equals(this.resources, WorkSpaceStatus.resources) &&
        Objects.equals(this.sourceType, WorkSpaceStatus.sourceType) &&
        Objects.equals(this.summary, WorkSpaceStatus.summary) &&
        Objects.equals(this.sync, WorkSpaceStatus.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, health, history, observedAt, operationState, reconciledAt, resources, sourceType, summary, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceStatus {\n");
    
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


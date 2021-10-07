package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OperationState contains information about state of a running operation
 */
@Schema(description = "OperationState contains information about state of a running operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class OperationState   {
  @JsonProperty("finishedAt")
  private Time finishedAt;

  @JsonProperty("message")
  private String message;

  @JsonProperty("operation")
  private Operation operation;

  @JsonProperty("phase")
  private String phase;

  @JsonProperty("retryCount")
  private String retryCount;

  @JsonProperty("startedAt")
  private Time startedAt;

  @JsonProperty("syncResult")
  private SyncOperationResult syncResult;

  public OperationState finishedAt(Time finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Get finishedAt
   * @return finishedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Time finishedAt) {
    this.finishedAt = finishedAt;
  }

  public OperationState message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message holds any pertinent messages when attempting to perform operation (typically errors).
   * @return message
  */
 @Schema(defaultValue = "Message holds any pertinent messages when attempting to perform operation (typically errors).")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OperationState operation(Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
 @Schema(defaultValue = "")
  @Valid

  public Operation getOperation() {
    return operation;
  }

  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  public OperationState phase(String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * Phase is the current phase of the operation
   * @return phase
  */
 @Schema(defaultValue = "Phase is the current phase of the operation")


  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public OperationState retryCount(String retryCount) {
    this.retryCount = retryCount;
    return this;
  }

  /**
   * RetryCount contains time of operation retries
   * @return retryCount
  */
 @Schema(defaultValue = "RetryCount contains time of operation retries")


  public String getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(String retryCount) {
    this.retryCount = retryCount;
  }

  public OperationState startedAt(Time startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Time startedAt) {
    this.startedAt = startedAt;
  }

  public OperationState syncResult(SyncOperationResult syncResult) {
    this.syncResult = syncResult;
    return this;
  }

  /**
   * Get syncResult
   * @return syncResult
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncOperationResult getSyncResult() {
    return syncResult;
  }

  public void setSyncResult(SyncOperationResult syncResult) {
    this.syncResult = syncResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationState OperationState = (OperationState) o;
    return Objects.equals(this.finishedAt, OperationState.finishedAt) &&
        Objects.equals(this.message, OperationState.message) &&
        Objects.equals(this.operation, OperationState.operation) &&
        Objects.equals(this.phase, OperationState.phase) &&
        Objects.equals(this.retryCount, OperationState.retryCount) &&
        Objects.equals(this.startedAt, OperationState.startedAt) &&
        Objects.equals(this.syncResult, OperationState.syncResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishedAt, message, operation, phase, retryCount, startedAt, syncResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationState {\n");
    
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    syncResult: ").append(toIndentedString(syncResult)).append("\n");
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


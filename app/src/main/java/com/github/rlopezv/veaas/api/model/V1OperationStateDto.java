package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1OperationDto;
import com.github.rlopezv.veaas.api.model.V1SyncOperationResultDto;
import com.github.rlopezv.veaas.api.model.V1TimeDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationState contains information about state of a running operation
 */
@Schema(description = "OperationState contains information about state of a running operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1OperationStateDto   {
  @JsonProperty("finishedAt")
  private V1TimeDto finishedAt;

  @JsonProperty("message")
  private String message;

  @JsonProperty("operation")
  private V1OperationDto operation;

  @JsonProperty("phase")
  private String phase;

  @JsonProperty("retryCount")
  private String retryCount;

  @JsonProperty("startedAt")
  private V1TimeDto startedAt;

  @JsonProperty("syncResult")
  private V1SyncOperationResultDto syncResult;

  public V1OperationStateDto finishedAt(V1TimeDto finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Get finishedAt
   * @return finishedAt
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(V1TimeDto finishedAt) {
    this.finishedAt = finishedAt;
  }

  public V1OperationStateDto message(String message) {
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

  public V1OperationStateDto operation(V1OperationDto operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
 @Schema(defaultValue = "")

  @Valid

  public V1OperationDto getOperation() {
    return operation;
  }

  public void setOperation(V1OperationDto operation) {
    this.operation = operation;
  }

  public V1OperationStateDto phase(String phase) {
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

  public V1OperationStateDto retryCount(String retryCount) {
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

  public V1OperationStateDto startedAt(V1TimeDto startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(V1TimeDto startedAt) {
    this.startedAt = startedAt;
  }

  public V1OperationStateDto syncResult(V1SyncOperationResultDto syncResult) {
    this.syncResult = syncResult;
    return this;
  }

  /**
   * Get syncResult
   * @return syncResult
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncOperationResultDto getSyncResult() {
    return syncResult;
  }

  public void setSyncResult(V1SyncOperationResultDto syncResult) {
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
    V1OperationStateDto v1OperationState = (V1OperationStateDto) o;
    return Objects.equals(this.finishedAt, v1OperationState.finishedAt) &&
        Objects.equals(this.message, v1OperationState.message) &&
        Objects.equals(this.operation, v1OperationState.operation) &&
        Objects.equals(this.phase, v1OperationState.phase) &&
        Objects.equals(this.retryCount, v1OperationState.retryCount) &&
        Objects.equals(this.startedAt, v1OperationState.startedAt) &&
        Objects.equals(this.syncResult, v1OperationState.syncResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishedAt, message, operation, phase, retryCount, startedAt, syncResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OperationStateDto {\n");
    
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


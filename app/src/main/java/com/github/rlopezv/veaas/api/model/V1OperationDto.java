package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1InfoDto;
import com.github.rlopezv.veaas.api.model.V1OperationInitiatorDto;
import com.github.rlopezv.veaas.api.model.V1RetryStrategyDto;
import com.github.rlopezv.veaas.api.model.V1SyncOperationDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operation contains information about a requested or running operation
 */
@Schema(description = "Operation contains information about a requested or running operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1OperationDto   {
  @JsonProperty("info")
  @Valid
  private List<V1InfoDto> info = null;

  @JsonProperty("initiatedBy")
  private V1OperationInitiatorDto initiatedBy;

  @JsonProperty("retry")
  private V1RetryStrategyDto retry;

  @JsonProperty("sync")
  private V1SyncOperationDto sync;

  public V1OperationDto info(List<V1InfoDto> info) {
    this.info = info;
    return this;
  }

  public V1OperationDto addInfoItem(V1InfoDto infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<>();
    }
    this.info.add(infoItem);
    return this;
  }

  /**
   * Info is a list of informational items for this operation
   * @return info
  */
 @Schema(defaultValue = "Info is a list of informational items for this operation")

  @Valid

  public List<V1InfoDto> getInfo() {
    return info;
  }

  public void setInfo(List<V1InfoDto> info) {
    this.info = info;
  }

  public V1OperationDto initiatedBy(V1OperationInitiatorDto initiatedBy) {
    this.initiatedBy = initiatedBy;
    return this;
  }

  /**
   * Get initiatedBy
   * @return initiatedBy
  */
 @Schema(defaultValue = "")

  @Valid

  public V1OperationInitiatorDto getInitiatedBy() {
    return initiatedBy;
  }

  public void setInitiatedBy(V1OperationInitiatorDto initiatedBy) {
    this.initiatedBy = initiatedBy;
  }

  public V1OperationDto retry(V1RetryStrategyDto retry) {
    this.retry = retry;
    return this;
  }

  /**
   * Get retry
   * @return retry
  */
 @Schema(defaultValue = "")

  @Valid

  public V1RetryStrategyDto getRetry() {
    return retry;
  }

  public void setRetry(V1RetryStrategyDto retry) {
    this.retry = retry;
  }

  public V1OperationDto sync(V1SyncOperationDto sync) {
    this.sync = sync;
    return this;
  }

  /**
   * Get sync
   * @return sync
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncOperationDto getSync() {
    return sync;
  }

  public void setSync(V1SyncOperationDto sync) {
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
    V1OperationDto v1Operation = (V1OperationDto) o;
    return Objects.equals(this.info, v1Operation.info) &&
        Objects.equals(this.initiatedBy, v1Operation.initiatedBy) &&
        Objects.equals(this.retry, v1Operation.retry) &&
        Objects.equals(this.sync, v1Operation.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, initiatedBy, retry, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OperationDto {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    initiatedBy: ").append(toIndentedString(initiatedBy)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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


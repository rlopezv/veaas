package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Operation contains information about a requested or running operation
 */
@Schema(description = "Operation contains information about a requested or running operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class Operation   {
  @JsonProperty("info")
  @Valid
  private List<Info> info = null;

  @JsonProperty("initiatedBy")
  private OperationInitiator initiatedBy;

  @JsonProperty("retry")
  private RetryStrategy retry;

  @JsonProperty("sync")
  private SyncOperation sync;

  public Operation info(List<Info> info) {
    this.info = info;
    return this;
  }

  public Operation addInfoItem(Info infoItem) {
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

  public List<Info> getInfo() {
    return info;
  }

  public void setInfo(List<Info> info) {
    this.info = info;
  }

  public Operation initiatedBy(OperationInitiator initiatedBy) {
    this.initiatedBy = initiatedBy;
    return this;
  }

  /**
   * Get initiatedBy
   * @return initiatedBy
  */
 @Schema(defaultValue = "")
  @Valid

  public OperationInitiator getInitiatedBy() {
    return initiatedBy;
  }

  public void setInitiatedBy(OperationInitiator initiatedBy) {
    this.initiatedBy = initiatedBy;
  }

  public Operation retry(RetryStrategy retry) {
    this.retry = retry;
    return this;
  }

  /**
   * Get retry
   * @return retry
  */
 @Schema(defaultValue = "")
  @Valid

  public RetryStrategy getRetry() {
    return retry;
  }

  public void setRetry(RetryStrategy retry) {
    this.retry = retry;
  }

  public Operation sync(SyncOperation sync) {
    this.sync = sync;
    return this;
  }

  /**
   * Get sync
   * @return sync
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncOperation getSync() {
    return sync;
  }

  public void setSync(SyncOperation sync) {
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
    Operation Operation = (Operation) o;
    return Objects.equals(this.info, Operation.info) &&
        Objects.equals(this.initiatedBy, Operation.initiatedBy) &&
        Objects.equals(this.retry, Operation.retry) &&
        Objects.equals(this.sync, Operation.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, initiatedBy, retry, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
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


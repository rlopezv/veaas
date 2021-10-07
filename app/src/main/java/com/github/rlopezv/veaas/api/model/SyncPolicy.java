package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SyncPolicy controls when a sync will be performed in response to updates in git
 */
@Schema(description = "SyncPolicy controls when a sync will be performed in response to updates in git")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class SyncPolicy   {
  @JsonProperty("automated")
  private SyncPolicyAutomated automated;

  @JsonProperty("retry")
  private RetryStrategy retry;

  @JsonProperty("syncOptions")
  @Valid
  private List<String> syncOptions = null;

  public SyncPolicy automated(SyncPolicyAutomated automated) {
    this.automated = automated;
    return this;
  }

  /**
   * Get automated
   * @return automated
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncPolicyAutomated getAutomated() {
    return automated;
  }

  public void setAutomated(SyncPolicyAutomated automated) {
    this.automated = automated;
  }

  public SyncPolicy retry(RetryStrategy retry) {
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

  public SyncPolicy syncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  public SyncPolicy addSyncOptionsItem(String syncOptionsItem) {
    if (this.syncOptions == null) {
      this.syncOptions = new ArrayList<>();
    }
    this.syncOptions.add(syncOptionsItem);
    return this;
  }

  /**
   * Options allow you to specify whole app sync-options
   * @return syncOptions
  */
 @Schema(defaultValue = "Options allow you to specify whole app sync-options")


  public List<String> getSyncOptions() {
    return syncOptions;
  }

  public void setSyncOptions(List<String> syncOptions) {
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
    SyncPolicy SyncPolicy = (SyncPolicy) o;
    return Objects.equals(this.automated, SyncPolicy.automated) &&
        Objects.equals(this.retry, SyncPolicy.retry) &&
        Objects.equals(this.syncOptions, SyncPolicy.syncOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, retry, syncOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncPolicy {\n");
    
    sb.append("    automated: ").append(toIndentedString(automated)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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


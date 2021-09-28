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
public class V1SyncPolicyDto   {
  @JsonProperty("automated")
  private V1SyncPolicyAutomatedDto automated;

  @JsonProperty("retry")
  private V1RetryStrategyDto retry;

  @JsonProperty("syncOptions")
  @Valid
  private List<String> syncOptions = null;

  public V1SyncPolicyDto automated(V1SyncPolicyAutomatedDto automated) {
    this.automated = automated;
    return this;
  }

  /**
   * Get automated
   * @return automated
  */
 @Schema(defaultValue = "")
  @Valid

  public V1SyncPolicyAutomatedDto getAutomated() {
    return automated;
  }

  public void setAutomated(V1SyncPolicyAutomatedDto automated) {
    this.automated = automated;
  }

  public V1SyncPolicyDto retry(V1RetryStrategyDto retry) {
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

  public V1SyncPolicyDto syncOptions(List<String> syncOptions) {
    this.syncOptions = syncOptions;
    return this;
  }

  public V1SyncPolicyDto addSyncOptionsItem(String syncOptionsItem) {
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
    V1SyncPolicyDto v1SyncPolicy = (V1SyncPolicyDto) o;
    return Objects.equals(this.automated, v1SyncPolicy.automated) &&
        Objects.equals(this.retry, v1SyncPolicy.retry) &&
        Objects.equals(this.syncOptions, v1SyncPolicy.syncOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, retry, syncOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncPolicyDto {\n");
    
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


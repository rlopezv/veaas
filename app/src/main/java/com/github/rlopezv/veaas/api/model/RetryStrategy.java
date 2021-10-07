package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RetryStrategy contains information about the strategy to apply when a sync failed
 */
@Schema(description = "RetryStrategy contains information about the strategy to apply when a sync failed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RetryStrategy   {
  @JsonProperty("backoff")
  private Backoff backoff;

  @JsonProperty("limit")
  private String limit;

  public RetryStrategy backoff(Backoff backoff) {
    this.backoff = backoff;
    return this;
  }

  /**
   * Get backoff
   * @return backoff
  */
 @Schema(defaultValue = "")
  @Valid

  public Backoff getBackoff() {
    return backoff;
  }

  public void setBackoff(Backoff backoff) {
    this.backoff = backoff;
  }

  public RetryStrategy limit(String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
   * @return limit
  */
 @Schema(defaultValue = "Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.")


  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryStrategy RetryStrategy = (RetryStrategy) o;
    return Objects.equals(this.backoff, RetryStrategy.backoff) &&
        Objects.equals(this.limit, RetryStrategy.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryStrategy {\n");
    
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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


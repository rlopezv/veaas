package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1BackoffDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetryStrategy contains information about the strategy to apply when a sync failed
 */
@Schema(description = "RetryStrategy contains information about the strategy to apply when a sync failed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1RetryStrategyDto   {
  @JsonProperty("backoff")
  private V1BackoffDto backoff;

  @JsonProperty("limit")
  private String limit;

  public V1RetryStrategyDto backoff(V1BackoffDto backoff) {
    this.backoff = backoff;
    return this;
  }

  /**
   * Get backoff
   * @return backoff
  */
 @Schema(defaultValue = "")

  @Valid

  public V1BackoffDto getBackoff() {
    return backoff;
  }

  public void setBackoff(V1BackoffDto backoff) {
    this.backoff = backoff;
  }

  public V1RetryStrategyDto limit(String limit) {
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
    V1RetryStrategyDto v1RetryStrategy = (V1RetryStrategyDto) o;
    return Objects.equals(this.backoff, v1RetryStrategy.backoff) &&
        Objects.equals(this.limit, v1RetryStrategy.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RetryStrategyDto {\n");
    
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


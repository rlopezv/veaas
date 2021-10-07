package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Backoff is the backoff strategy to use on subsequent retries for failing syncs
 */
@Schema(description = "Backoff is the backoff strategy to use on subsequent retries for failing syncs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class Backoff   {
  @JsonProperty("duration")
  private String duration;

  @JsonProperty("factor")
  private String factor;

  @JsonProperty("maxDuration")
  private String maxDuration;

  public Backoff duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \"2m\", \"1h\")
   * @return duration
  */
 @Schema(defaultValue = "Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \"2m\", \"1h\")")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Backoff factor(String factor) {
    this.factor = factor;
    return this;
  }

  /**
   * Factor is a factor to multiply the base duration after each failed retry
   * @return factor
  */
 @Schema(defaultValue = "Factor is a factor to multiply the base duration after each failed retry")


  public String getFactor() {
    return factor;
  }

  public void setFactor(String factor) {
    this.factor = factor;
  }

  public Backoff maxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

  /**
   * MaxDuration is the maximum amount of time allowed for the backoff strategy
   * @return maxDuration
  */
 @Schema(defaultValue = "MaxDuration is the maximum amount of time allowed for the backoff strategy")


  public String getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backoff Backoff = (Backoff) o;
    return Objects.equals(this.duration, Backoff.duration) &&
        Objects.equals(this.factor, Backoff.factor) &&
        Objects.equals(this.maxDuration, Backoff.maxDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, factor, maxDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backoff {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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


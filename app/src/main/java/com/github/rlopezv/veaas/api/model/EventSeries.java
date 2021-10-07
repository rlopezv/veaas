package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@Schema(description = "EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class EventSeries   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("lastObservedTime")
  private MicroTime lastObservedTime;

  public EventSeries count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of occurrences in this series up to the last heartbeat time
   * @return count
  */
 @Schema(defaultValue = "Number of occurrences in this series up to the last heartbeat time")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public EventSeries lastObservedTime(MicroTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return this;
  }

  /**
   * Get lastObservedTime
   * @return lastObservedTime
  */
 @Schema(defaultValue = "")
  @Valid

  public MicroTime getLastObservedTime() {
    return lastObservedTime;
  }

  public void setLastObservedTime(MicroTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSeries EventSeries = (EventSeries) o;
    return Objects.equals(this.count, EventSeries.count) &&
        Objects.equals(this.lastObservedTime, EventSeries.lastObservedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, lastObservedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSeries {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
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


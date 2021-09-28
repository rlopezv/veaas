package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Event is a report of an event somewhere in the provider.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
@Schema(description = "Event is a report of an event somewhere in the provider.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1EventDto   {
  @JsonProperty("action")
  private String action;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("eventTime")
  private V1MicroTimeDto eventTime;

  @JsonProperty("firstTimestamp")
  private V1TimeDto firstTimestamp;

  @JsonProperty("involvedObject")
  private V1ObjectReferenceDto involvedObject;

  @JsonProperty("lastTimestamp")
  private V1TimeDto lastTimestamp;

  @JsonProperty("message")
  private String message;

  @JsonProperty("metadata")
  private V1ObjectMetaDto metadata;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("related")
  private V1ObjectReferenceDto related;

  @JsonProperty("reportingComponent")
  private String reportingComponent;

  @JsonProperty("reportingInstance")
  private String reportingInstance;

  @JsonProperty("series")
  private V1EventSeriesDto series;

  @JsonProperty("source")
  private V1EventSourceDto source;

  @JsonProperty("type")
  private String type;

  public V1EventDto action(String action) {
    this.action = action;
    return this;
  }

  /**
   * What action was taken/failed regarding to the Regarding object. +optional
   * @return action
  */
 @Schema(defaultValue = "What action was taken/failed regarding to the Regarding object. +optional")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public V1EventDto count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of times this event has occurred. +optional
   * @return count
  */
 @Schema(defaultValue = "The number of times this event has occurred. +optional")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public V1EventDto eventTime(V1MicroTimeDto eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Get eventTime
   * @return eventTime
  */
 @Schema(defaultValue = "")
  @Valid

  public V1MicroTimeDto getEventTime() {
    return eventTime;
  }

  public void setEventTime(V1MicroTimeDto eventTime) {
    this.eventTime = eventTime;
  }

  public V1EventDto firstTimestamp(V1TimeDto firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

  /**
   * Get firstTimestamp
   * @return firstTimestamp
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(V1TimeDto firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }

  public V1EventDto involvedObject(V1ObjectReferenceDto involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

  /**
   * Get involvedObject
   * @return involvedObject
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ObjectReferenceDto getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(V1ObjectReferenceDto involvedObject) {
    this.involvedObject = involvedObject;
  }

  public V1EventDto lastTimestamp(V1TimeDto lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

  /**
   * Get lastTimestamp
   * @return lastTimestamp
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(V1TimeDto lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public V1EventDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the status of this operation. TODO: decide on maximum length. +optional
   * @return message
  */
 @Schema(defaultValue = "A human-readable description of the status of this operation. TODO: decide on maximum length. +optional")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1EventDto metadata(V1ObjectMetaDto metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ObjectMetaDto getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMetaDto metadata) {
    this.metadata = metadata;
  }

  public V1EventDto reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object's current status. TODO: provide exact specification for format. +optional
   * @return reason
  */
 @Schema(defaultValue = "This should be a short, machine understandable string that gives the reason for the transition into the object's current status. TODO: provide exact specification for format. +optional")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1EventDto related(V1ObjectReferenceDto related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ObjectReferenceDto getRelated() {
    return related;
  }

  public void setRelated(V1ObjectReferenceDto related) {
    this.related = related;
  }

  public V1EventDto reportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

  /**
   * Name of the controller that emitted the Event. +optional
   * @return reportingComponent
  */
 @Schema(defaultValue = "Name of the controller that emitted the Event. +optional")


  public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }

  public V1EventDto reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

  /**
   * ID of the controller instance. +optional
   * @return reportingInstance
  */
 @Schema(defaultValue = "ID of the controller instance. +optional")


  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public V1EventDto series(V1EventSeriesDto series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
  */
 @Schema(defaultValue = "")
  @Valid

  public V1EventSeriesDto getSeries() {
    return series;
  }

  public void setSeries(V1EventSeriesDto series) {
    this.series = series;
  }

  public V1EventDto source(V1EventSourceDto source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public V1EventSourceDto getSource() {
    return source;
  }

  public void setSource(V1EventSourceDto source) {
    this.source = source;
  }

  public V1EventDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of this event (Normal, Warning), new types could be added in the future +optional
   * @return type
  */
 @Schema(defaultValue = "Type of this event (Normal, Warning), new types could be added in the future +optional")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventDto v1Event = (V1EventDto) o;
    return Objects.equals(this.action, v1Event.action) &&
        Objects.equals(this.count, v1Event.count) &&
        Objects.equals(this.eventTime, v1Event.eventTime) &&
        Objects.equals(this.firstTimestamp, v1Event.firstTimestamp) &&
        Objects.equals(this.involvedObject, v1Event.involvedObject) &&
        Objects.equals(this.lastTimestamp, v1Event.lastTimestamp) &&
        Objects.equals(this.message, v1Event.message) &&
        Objects.equals(this.metadata, v1Event.metadata) &&
        Objects.equals(this.reason, v1Event.reason) &&
        Objects.equals(this.related, v1Event.related) &&
        Objects.equals(this.reportingComponent, v1Event.reportingComponent) &&
        Objects.equals(this.reportingInstance, v1Event.reportingInstance) &&
        Objects.equals(this.series, v1Event.series) &&
        Objects.equals(this.source, v1Event.source) &&
        Objects.equals(this.type, v1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, count, eventTime, firstTimestamp, involvedObject, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventDto {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


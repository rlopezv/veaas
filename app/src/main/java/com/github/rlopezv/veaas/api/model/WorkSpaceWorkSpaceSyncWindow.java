package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceWorkSpaceSyncWindow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpaceSyncWindow   {
  @JsonProperty("duration")
  private String duration;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("manualSync")
  private Boolean manualSync;

  @JsonProperty("schedule")
  private String schedule;

  public WorkSpaceWorkSpaceSyncWindow duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
 @Schema(defaultValue =  "")
 public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public WorkSpaceWorkSpaceSyncWindow kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
 @Schema(defaultValue =  "")
 public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public WorkSpaceWorkSpaceSyncWindow manualSync(Boolean manualSync) {
    this.manualSync = manualSync;
    return this;
  }

  /**
   * Get manualSync
   * @return manualSync
  */
 @Schema(defaultValue =  "")
 public Boolean getManualSync() {
    return manualSync;
  }

  public void setManualSync(Boolean manualSync) {
    this.manualSync = manualSync;
  }

  public WorkSpaceWorkSpaceSyncWindow schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
 @Schema(defaultValue =  "")
 public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpaceSyncWindow workSpaceWorkSpaceSyncWindow = (WorkSpaceWorkSpaceSyncWindow) o;
    return Objects.equals(this.duration, workSpaceWorkSpaceSyncWindow.duration) &&
        Objects.equals(this.kind, workSpaceWorkSpaceSyncWindow.kind) &&
        Objects.equals(this.manualSync, workSpaceWorkSpaceSyncWindow.manualSync) &&
        Objects.equals(this.schedule, workSpaceWorkSpaceSyncWindow.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, kind, manualSync, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpaceSyncWindow {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    manualSync: ").append(toIndentedString(manualSync)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceWorkSpaceSyncWindowsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpaceSyncWindowsResponseDto   {
  @JsonProperty("activeWindows")
  @Valid
  private List<WorkSpaceWorkSpaceSyncWindowDto> activeWindows = null;

  @JsonProperty("assignedWindows")
  @Valid
  private List<WorkSpaceWorkSpaceSyncWindowDto> assignedWindows = null;

  @JsonProperty("canSync")
  private Boolean canSync;

  public WorkSpaceWorkSpaceSyncWindowsResponseDto activeWindows(List<WorkSpaceWorkSpaceSyncWindowDto> activeWindows) {
    this.activeWindows = activeWindows;
    return this;
  }

  public WorkSpaceWorkSpaceSyncWindowsResponseDto addActiveWindowsItem(WorkSpaceWorkSpaceSyncWindowDto activeWindowsItem) {
    if (this.activeWindows == null) {
      this.activeWindows = new ArrayList<>();
    }
    this.activeWindows.add(activeWindowsItem);
    return this;
  }

  /**
   * Get activeWindows
   * @return activeWindows
  */
 @Schema(defaultValue = "")
  @Valid

  public List<WorkSpaceWorkSpaceSyncWindowDto> getActiveWindows() {
    return activeWindows;
  }

  public void setActiveWindows(List<WorkSpaceWorkSpaceSyncWindowDto> activeWindows) {
    this.activeWindows = activeWindows;
  }

  public WorkSpaceWorkSpaceSyncWindowsResponseDto assignedWindows(List<WorkSpaceWorkSpaceSyncWindowDto> assignedWindows) {
    this.assignedWindows = assignedWindows;
    return this;
  }

  public WorkSpaceWorkSpaceSyncWindowsResponseDto addAssignedWindowsItem(WorkSpaceWorkSpaceSyncWindowDto assignedWindowsItem) {
    if (this.assignedWindows == null) {
      this.assignedWindows = new ArrayList<>();
    }
    this.assignedWindows.add(assignedWindowsItem);
    return this;
  }

  /**
   * Get assignedWindows
   * @return assignedWindows
  */
 @Schema(defaultValue = "")
  @Valid

  public List<WorkSpaceWorkSpaceSyncWindowDto> getAssignedWindows() {
    return assignedWindows;
  }

  public void setAssignedWindows(List<WorkSpaceWorkSpaceSyncWindowDto> assignedWindows) {
    this.assignedWindows = assignedWindows;
  }

  public WorkSpaceWorkSpaceSyncWindowsResponseDto canSync(Boolean canSync) {
    this.canSync = canSync;
    return this;
  }

  /**
   * Get canSync
   * @return canSync
  */
 @Schema(defaultValue =  "")
 public Boolean getCanSync() {
    return canSync;
  }

  public void setCanSync(Boolean canSync) {
    this.canSync = canSync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpaceSyncWindowsResponseDto workSpaceWorkSpaceSyncWindowsResponse = (WorkSpaceWorkSpaceSyncWindowsResponseDto) o;
    return Objects.equals(this.activeWindows, workSpaceWorkSpaceSyncWindowsResponse.activeWindows) &&
        Objects.equals(this.assignedWindows, workSpaceWorkSpaceSyncWindowsResponse.assignedWindows) &&
        Objects.equals(this.canSync, workSpaceWorkSpaceSyncWindowsResponse.canSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeWindows, assignedWindows, canSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpaceSyncWindowsResponseDto {\n");
    
    sb.append("    activeWindows: ").append(toIndentedString(activeWindows)).append("\n");
    sb.append("    assignedWindows: ").append(toIndentedString(assignedWindows)).append("\n");
    sb.append("    canSync: ").append(toIndentedString(canSync)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceWatchEvent contains information about workSpace change.
 */
@Schema(description = "WorkSpaceWatchEvent contains information about workSpace change.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWatchEvent   {
  @JsonProperty("workSpace")
  private WorkSpace workSpace;

  @JsonProperty("type")
  private String type;

  public WorkSpaceWatchEvent workSpace(WorkSpace workSpace) {
    this.workSpace = workSpace;
    return this;
  }

  /**
   * Get workSpace
   * @return workSpace
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpace getWorkSpace() {
    return workSpace;
  }

  public void setWorkSpace(WorkSpace workSpace) {
    this.workSpace = workSpace;
  }

  public WorkSpaceWatchEvent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
 @Schema(defaultValue =  "")
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
    WorkSpaceWatchEvent WorkSpaceWatchEvent = (WorkSpaceWatchEvent) o;
    return Objects.equals(this.workSpace, WorkSpaceWatchEvent.workSpace) &&
        Objects.equals(this.type, WorkSpaceWatchEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workSpace, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWatchEvent {\n");
    
    sb.append("    workSpace: ").append(toIndentedString(workSpace)).append("\n");
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


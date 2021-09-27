package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1TimeDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceLogEntryDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceLogEntryDto   {
  @JsonProperty("content")
  private String content;

  @JsonProperty("last")
  private Boolean last;

  @JsonProperty("deviceName")
  private String deviceName;

  @JsonProperty("timeStamp")
  private V1TimeDto timeStamp;

  @JsonProperty("timeStampStr")
  private String timeStampStr;

  public WorkSpaceLogEntryDto content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
 @Schema(defaultValue = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public WorkSpaceLogEntryDto last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
 @Schema(defaultValue = "")


  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public WorkSpaceLogEntryDto deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Get deviceName
   * @return deviceName
  */
 @Schema(defaultValue = "")


  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public WorkSpaceLogEntryDto timeStamp(V1TimeDto timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(V1TimeDto timeStamp) {
    this.timeStamp = timeStamp;
  }

  public WorkSpaceLogEntryDto timeStampStr(String timeStampStr) {
    this.timeStampStr = timeStampStr;
    return this;
  }

  /**
   * Get timeStampStr
   * @return timeStampStr
  */
 @Schema(defaultValue = "")


  public String getTimeStampStr() {
    return timeStampStr;
  }

  public void setTimeStampStr(String timeStampStr) {
    this.timeStampStr = timeStampStr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceLogEntryDto workSpaceLogEntry = (WorkSpaceLogEntryDto) o;
    return Objects.equals(this.content, workSpaceLogEntry.content) &&
        Objects.equals(this.last, workSpaceLogEntry.last) &&
        Objects.equals(this.deviceName, workSpaceLogEntry.deviceName) &&
        Objects.equals(this.timeStamp, workSpaceLogEntry.timeStamp) &&
        Objects.equals(this.timeStampStr, workSpaceLogEntry.timeStampStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, last, deviceName, timeStamp, timeStampStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceLogEntryDto {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    timeStampStr: ").append(toIndentedString(timeStampStr)).append("\n");
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


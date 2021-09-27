package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1ComparedToDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncStatus contains information about the currently observed live and desired states of an workSpace
 */
@Schema(description = "SyncStatus contains information about the currently observed live and desired states of an workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1SyncStatusDto   {
  @JsonProperty("comparedTo")
  private V1ComparedToDto comparedTo;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("status")
  private String status;

  public V1SyncStatusDto comparedTo(V1ComparedToDto comparedTo) {
    this.comparedTo = comparedTo;
    return this;
  }

  /**
   * Get comparedTo
   * @return comparedTo
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ComparedToDto getComparedTo() {
    return comparedTo;
  }

  public void setComparedTo(V1ComparedToDto comparedTo) {
    this.comparedTo = comparedTo;
  }

  public V1SyncStatusDto revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision contains information about the revision the comparison has been performed to
   * @return revision
  */
 @Schema(defaultValue = "Revision contains information about the revision the comparison has been performed to")


  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public V1SyncStatusDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status is the sync state of the comparison
   * @return status
  */
 @Schema(defaultValue = "Status is the sync state of the comparison")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyncStatusDto v1SyncStatus = (V1SyncStatusDto) o;
    return Objects.equals(this.comparedTo, v1SyncStatus.comparedTo) &&
        Objects.equals(this.revision, v1SyncStatus.revision) &&
        Objects.equals(this.status, v1SyncStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparedTo, revision, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncStatusDto {\n");
    
    sb.append("    comparedTo: ").append(toIndentedString(comparedTo)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


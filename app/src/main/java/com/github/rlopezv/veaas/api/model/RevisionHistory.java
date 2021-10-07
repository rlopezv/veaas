package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RevisionHistory contains history information about a previous sync
 */
@Schema(description = "RevisionHistory contains history information about a previous sync")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RevisionHistory   {
  @JsonProperty("deployStartedAt")
  private Time deployStartedAt;

  @JsonProperty("deployedAt")
  private Time deployedAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("source")
  private WorkSpaceSource source;

  public RevisionHistory deployStartedAt(Time deployStartedAt) {
    this.deployStartedAt = deployStartedAt;
    return this;
  }

  /**
   * Get deployStartedAt
   * @return deployStartedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getDeployStartedAt() {
    return deployStartedAt;
  }

  public void setDeployStartedAt(Time deployStartedAt) {
    this.deployStartedAt = deployStartedAt;
  }

  public RevisionHistory deployedAt(Time deployedAt) {
    this.deployedAt = deployedAt;
    return this;
  }

  /**
   * Get deployedAt
   * @return deployedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public Time getDeployedAt() {
    return deployedAt;
  }

  public void setDeployedAt(Time deployedAt) {
    this.deployedAt = deployedAt;
  }

  public RevisionHistory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID is an auto incrementing identifier of the Revision History
   * @return id
  */
 @Schema(defaultValue = "ID is an auto incrementing identifier of the Revision History")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RevisionHistory revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision holds the revision the sync was performed against
   * @return revision
  */
 @Schema(defaultValue = "Revision holds the revision the sync was performed against")


  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public RevisionHistory source(WorkSpaceSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSource getSource() {
    return source;
  }

  public void setSource(WorkSpaceSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevisionHistory RevisionHistory = (RevisionHistory) o;
    return Objects.equals(this.deployStartedAt, RevisionHistory.deployStartedAt) &&
        Objects.equals(this.deployedAt, RevisionHistory.deployedAt) &&
        Objects.equals(this.id, RevisionHistory.id) &&
        Objects.equals(this.revision, RevisionHistory.revision) &&
        Objects.equals(this.source, RevisionHistory.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployStartedAt, deployedAt, id, revision, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevisionHistory {\n");
    
    sb.append("    deployStartedAt: ").append(toIndentedString(deployStartedAt)).append("\n");
    sb.append("    deployedAt: ").append(toIndentedString(deployedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


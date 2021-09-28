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
public class V1RevisionHistoryDto   {
  @JsonProperty("deployStartedAt")
  private V1TimeDto deployStartedAt;

  @JsonProperty("deployedAt")
  private V1TimeDto deployedAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  public V1RevisionHistoryDto deployStartedAt(V1TimeDto deployStartedAt) {
    this.deployStartedAt = deployStartedAt;
    return this;
  }

  /**
   * Get deployStartedAt
   * @return deployStartedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getDeployStartedAt() {
    return deployStartedAt;
  }

  public void setDeployStartedAt(V1TimeDto deployStartedAt) {
    this.deployStartedAt = deployStartedAt;
  }

  public V1RevisionHistoryDto deployedAt(V1TimeDto deployedAt) {
    this.deployedAt = deployedAt;
    return this;
  }

  /**
   * Get deployedAt
   * @return deployedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getDeployedAt() {
    return deployedAt;
  }

  public void setDeployedAt(V1TimeDto deployedAt) {
    this.deployedAt = deployedAt;
  }

  public V1RevisionHistoryDto id(String id) {
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

  public V1RevisionHistoryDto revision(String revision) {
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

  public V1RevisionHistoryDto source(V1WorkSpaceSourceDto source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public V1WorkSpaceSourceDto getSource() {
    return source;
  }

  public void setSource(V1WorkSpaceSourceDto source) {
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
    V1RevisionHistoryDto v1RevisionHistory = (V1RevisionHistoryDto) o;
    return Objects.equals(this.deployStartedAt, v1RevisionHistory.deployStartedAt) &&
        Objects.equals(this.deployedAt, v1RevisionHistory.deployedAt) &&
        Objects.equals(this.id, v1RevisionHistory.id) &&
        Objects.equals(this.revision, v1RevisionHistory.revision) &&
        Objects.equals(this.source, v1RevisionHistory.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployStartedAt, deployedAt, id, revision, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RevisionHistoryDto {\n");
    
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


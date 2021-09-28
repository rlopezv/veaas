package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ResourceSpec represents desired Resource state. Contains link to repository with workSpace definition and additional parameters link definition revision.
 */
@Schema(description = "ResourceSpec represents desired Resource state. Contains link to repository with workSpace definition and additional parameters link definition revision.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ResourceSpecDto   {
  @JsonProperty("destination")
  private V1HostInfoDto destination;

  @JsonProperty("info")
  @Valid
  private List<V1InfoDto> info = null;

  @JsonProperty("revisionHistoryLimit")
  private String revisionHistoryLimit;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  @JsonProperty("syncPolicy")
  private V1SyncPolicyDto syncPolicy;

  public V1ResourceSpecDto destination(V1HostInfoDto destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
 @Schema(defaultValue = "")
  @Valid

  public V1HostInfoDto getDestination() {
    return destination;
  }

  public void setDestination(V1HostInfoDto destination) {
    this.destination = destination;
  }

  public V1ResourceSpecDto info(List<V1InfoDto> info) {
    this.info = info;
    return this;
  }

  public V1ResourceSpecDto addInfoItem(V1InfoDto infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<>();
    }
    this.info.add(infoItem);
    return this;
  }

  /**
   * Info contains a list of information (URLs, email addresses, and plain text) that relates to the workSpace
   * @return info
  */
 @Schema(defaultValue = "Info contains a list of information (URLs, email addresses, and plain text) that relates to the workSpace")

  @Valid

  public List<V1InfoDto> getInfo() {
    return info;
  }

  public void setInfo(List<V1InfoDto> info) {
    this.info = info;
  }

  public V1ResourceSpecDto revisionHistoryLimit(String revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * RevisionHistoryLimit limits the number of items kept in the workSpace's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.
   * @return revisionHistoryLimit
  */
 @Schema(defaultValue = "RevisionHistoryLimit limits the number of items kept in the workSpace's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.")


  public String getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(String revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1ResourceSpecDto source(V1WorkSpaceSourceDto source) {
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

  public V1ResourceSpecDto syncPolicy(V1SyncPolicyDto syncPolicy) {
    this.syncPolicy = syncPolicy;
    return this;
  }

  /**
   * Get syncPolicy
   * @return syncPolicy
  */
 @Schema(defaultValue = "")
  @Valid

  public V1SyncPolicyDto getSyncPolicy() {
    return syncPolicy;
  }

  public void setSyncPolicy(V1SyncPolicyDto syncPolicy) {
    this.syncPolicy = syncPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceSpecDto v1ResourceSpec = (V1ResourceSpecDto) o;
    return Objects.equals(this.destination, v1ResourceSpec.destination) &&
        Objects.equals(this.info, v1ResourceSpec.info) &&
        Objects.equals(this.revisionHistoryLimit, v1ResourceSpec.revisionHistoryLimit) &&
        Objects.equals(this.source, v1ResourceSpec.source) &&
        Objects.equals(this.syncPolicy, v1ResourceSpec.syncPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, info, revisionHistoryLimit, source, syncPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceSpecDto {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    syncPolicy: ").append(toIndentedString(syncPolicy)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1InfoDto;
import com.github.rlopezv.veaas.api.model.V1ResourceIgnoreDifferencesDto;
import com.github.rlopezv.veaas.api.model.V1SyncPolicyDto;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceDestinationDto;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceSourceDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceSpec represents desired workSpace state. Contains link to repository with workSpace definition and additional parameters link definition revision.
 */
@Schema(description = "WorkSpaceSpec represents desired workSpace state. Contains link to repository with workSpace definition and additional parameters link definition revision.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceSpecDto   {
  @JsonProperty("destination")
  private V1WorkSpaceDestinationDto destination;

  @JsonProperty("ignoreDifferences")
  @Valid
  private List<V1ResourceIgnoreDifferencesDto> ignoreDifferences = null;

  @JsonProperty("info")
  @Valid
  private List<V1InfoDto> info = null;

  @JsonProperty("revisionHistoryLimit")
  private String revisionHistoryLimit;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  @JsonProperty("syncPolicy")
  private V1SyncPolicyDto syncPolicy;

  public V1WorkSpaceSpecDto destination(V1WorkSpaceDestinationDto destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
 @Schema(defaultValue = "")

  @Valid

  public V1WorkSpaceDestinationDto getDestination() {
    return destination;
  }

  public void setDestination(V1WorkSpaceDestinationDto destination) {
    this.destination = destination;
  }

  public V1WorkSpaceSpecDto ignoreDifferences(List<V1ResourceIgnoreDifferencesDto> ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
    return this;
  }

  public V1WorkSpaceSpecDto addIgnoreDifferencesItem(V1ResourceIgnoreDifferencesDto ignoreDifferencesItem) {
    if (this.ignoreDifferences == null) {
      this.ignoreDifferences = new ArrayList<>();
    }
    this.ignoreDifferences.add(ignoreDifferencesItem);
    return this;
  }

  /**
   * IgnoreDifferences is a list of resources and their fields which should be ignored during comparison
   * @return ignoreDifferences
  */
 @Schema(defaultValue = "IgnoreDifferences is a list of resources and their fields which should be ignored during comparison")

  @Valid

  public List<V1ResourceIgnoreDifferencesDto> getIgnoreDifferences() {
    return ignoreDifferences;
  }

  public void setIgnoreDifferences(List<V1ResourceIgnoreDifferencesDto> ignoreDifferences) {
    this.ignoreDifferences = ignoreDifferences;
  }

  public V1WorkSpaceSpecDto info(List<V1InfoDto> info) {
    this.info = info;
    return this;
  }

  public V1WorkSpaceSpecDto addInfoItem(V1InfoDto infoItem) {
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

  public V1WorkSpaceSpecDto revisionHistoryLimit(String revisionHistoryLimit) {
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

  public V1WorkSpaceSpecDto source(V1WorkSpaceSourceDto source) {
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

  public V1WorkSpaceSpecDto syncPolicy(V1SyncPolicyDto syncPolicy) {
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
    V1WorkSpaceSpecDto v1WorkSpaceSpec = (V1WorkSpaceSpecDto) o;
    return Objects.equals(this.destination, v1WorkSpaceSpec.destination) &&
        Objects.equals(this.ignoreDifferences, v1WorkSpaceSpec.ignoreDifferences) &&
        Objects.equals(this.info, v1WorkSpaceSpec.info) &&
        Objects.equals(this.revisionHistoryLimit, v1WorkSpaceSpec.revisionHistoryLimit) &&
        Objects.equals(this.source, v1WorkSpaceSpec.source) &&
        Objects.equals(this.syncPolicy, v1WorkSpaceSpec.syncPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, ignoreDifferences, info, revisionHistoryLimit, source, syncPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceSpecDto {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    ignoreDifferences: ").append(toIndentedString(ignoreDifferences)).append("\n");
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


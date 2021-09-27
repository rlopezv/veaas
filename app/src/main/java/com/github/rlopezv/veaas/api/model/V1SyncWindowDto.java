package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncWindow contains the kind, time, duration and attributes that are used to assign the syncWindows to workSpaces
 */
@Schema(description = "SyncWindow contains the kind, time, duration and attributes that are used to assign the syncWindows to workSpaces")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1SyncWindowDto   {
  @JsonProperty("workSpaces")
  @Valid
  private List<String> workSpaces = null;

  @JsonProperty("providers")
  @Valid
  private List<String> providers = null;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("manualSync")
  private Boolean manualSync;

  @JsonProperty("namespaces")
  @Valid
  private List<String> namespaces = null;

  @JsonProperty("schedule")
  private String schedule;

  public V1SyncWindowDto workSpaces(List<String> workSpaces) {
    this.workSpaces = workSpaces;
    return this;
  }

  public V1SyncWindowDto addWorkSpacesItem(String workSpacesItem) {
    if (this.workSpaces == null) {
      this.workSpaces = new ArrayList<>();
    }
    this.workSpaces.add(workSpacesItem);
    return this;
  }

  /**
   * WorkSpaces contains a list of workSpaces that the window will apply to
   * @return workSpaces
  */
 @Schema(defaultValue = "WorkSpaces contains a list of workSpaces that the window will apply to")


  public List<String> getWorkSpaces() {
    return workSpaces;
  }

  public void setWorkSpaces(List<String> workSpaces) {
    this.workSpaces = workSpaces;
  }

  public V1SyncWindowDto providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public V1SyncWindowDto addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Providers contains a list of providers that the window will apply to
   * @return providers
  */
 @Schema(defaultValue = "Providers contains a list of providers that the window will apply to")


  public List<String> getProviders() {
    return providers;
  }

  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  public V1SyncWindowDto duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration is the amount of time the sync window will be open
   * @return duration
  */
 @Schema(defaultValue = "Duration is the amount of time the sync window will be open")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public V1SyncWindowDto kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind defines if the window allows or blocks syncs
   * @return kind
  */
 @Schema(defaultValue = "Kind defines if the window allows or blocks syncs")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1SyncWindowDto manualSync(Boolean manualSync) {
    this.manualSync = manualSync;
    return this;
  }

  /**
   * ManualSync enables manual syncs when they would otherwise be blocked
   * @return manualSync
  */
 @Schema(defaultValue = "ManualSync enables manual syncs when they would otherwise be blocked")


  public Boolean getManualSync() {
    return manualSync;
  }

  public void setManualSync(Boolean manualSync) {
    this.manualSync = manualSync;
  }

  public V1SyncWindowDto namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1SyncWindowDto addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * Namespaces contains a list of namespaces that the window will apply to
   * @return namespaces
  */
 @Schema(defaultValue = "Namespaces contains a list of namespaces that the window will apply to")


  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public V1SyncWindowDto schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Schedule is the time the window will begin, specified in cron format
   * @return schedule
  */
 @Schema(defaultValue = "Schedule is the time the window will begin, specified in cron format")


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
    V1SyncWindowDto v1SyncWindow = (V1SyncWindowDto) o;
    return Objects.equals(this.workSpaces, v1SyncWindow.workSpaces) &&
        Objects.equals(this.providers, v1SyncWindow.providers) &&
        Objects.equals(this.duration, v1SyncWindow.duration) &&
        Objects.equals(this.kind, v1SyncWindow.kind) &&
        Objects.equals(this.manualSync, v1SyncWindow.manualSync) &&
        Objects.equals(this.namespaces, v1SyncWindow.namespaces) &&
        Objects.equals(this.schedule, v1SyncWindow.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workSpaces, providers, duration, kind, manualSync, namespaces, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncWindowDto {\n");
    
    sb.append("    workSpaces: ").append(toIndentedString(workSpaces)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    manualSync: ").append(toIndentedString(manualSync)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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


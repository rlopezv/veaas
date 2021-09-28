package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceWorkSpaceRollbackRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpaceRollbackRequestDto   {
  @JsonProperty("dryRun")
  private Boolean dryRun;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("prune")
  private Boolean prune;

  public WorkSpaceWorkSpaceRollbackRequestDto dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
  */
 @Schema(defaultValue =  "")
 public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public WorkSpaceWorkSpaceRollbackRequestDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
 @Schema(defaultValue =  "")
 public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkSpaceWorkSpaceRollbackRequestDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue =  "")
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkSpaceWorkSpaceRollbackRequestDto prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Get prune
   * @return prune
  */
 @Schema(defaultValue =  "")
 public Boolean getPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpaceRollbackRequestDto workSpaceWorkSpaceRollbackRequest = (WorkSpaceWorkSpaceRollbackRequestDto) o;
    return Objects.equals(this.dryRun, workSpaceWorkSpaceRollbackRequest.dryRun) &&
        Objects.equals(this.id, workSpaceWorkSpaceRollbackRequest.id) &&
        Objects.equals(this.name, workSpaceWorkSpaceRollbackRequest.name) &&
        Objects.equals(this.prune, workSpaceWorkSpaceRollbackRequest.prune);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, id, name, prune);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpaceRollbackRequestDto {\n");
    
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
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


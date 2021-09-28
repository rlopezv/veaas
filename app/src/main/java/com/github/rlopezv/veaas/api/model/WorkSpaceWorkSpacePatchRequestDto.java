package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpacePatchRequest is a request to patch an workSpace
 */
@Schema(description = "WorkSpacePatchRequest is a request to patch an workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpacePatchRequestDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("patch")
  private String patch;

  @JsonProperty("patchType")
  private String patchType;

  public WorkSpaceWorkSpacePatchRequestDto name(String name) {
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

  public WorkSpaceWorkSpacePatchRequestDto patch(String patch) {
    this.patch = patch;
    return this;
  }

  /**
   * Get patch
   * @return patch
  */
 @Schema(defaultValue =  "")
 public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }

  public WorkSpaceWorkSpacePatchRequestDto patchType(String patchType) {
    this.patchType = patchType;
    return this;
  }

  /**
   * Get patchType
   * @return patchType
  */
 @Schema(defaultValue =  "")
 public String getPatchType() {
    return patchType;
  }

  public void setPatchType(String patchType) {
    this.patchType = patchType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpacePatchRequestDto workSpaceWorkSpacePatchRequest = (WorkSpaceWorkSpacePatchRequestDto) o;
    return Objects.equals(this.name, workSpaceWorkSpacePatchRequest.name) &&
        Objects.equals(this.patch, workSpaceWorkSpacePatchRequest.patch) &&
        Objects.equals(this.patchType, workSpaceWorkSpacePatchRequest.patchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, patch, patchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpacePatchRequestDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    patchType: ").append(toIndentedString(patchType)).append("\n");
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


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
 * WorkSpaceWorkSpaceResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpaceResponseDto   {
  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  public WorkSpaceWorkSpaceResponseDto manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public WorkSpaceWorkSpaceResponseDto addManifestsItem(String manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Get manifests
   * @return manifests
  */
 @Schema(defaultValue = "")


  public List<String> getManifests() {
    return manifests;
  }

  public void setManifests(List<String> manifests) {
    this.manifests = manifests;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpaceResponseDto workSpaceWorkSpaceResponse = (WorkSpaceWorkSpaceResponseDto) o;
    return Objects.equals(this.manifests, workSpaceWorkSpaceResponse.manifests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpaceResponseDto {\n");
    
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
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


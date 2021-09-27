package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceWorkSpaceResourceResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceWorkSpaceResourceResponseDto   {
  @JsonProperty("manifest")
  private String manifest;

  public WorkSpaceWorkSpaceResourceResponseDto manifest(String manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * Get manifest
   * @return manifest
  */
 @Schema(defaultValue = "")


  public String getManifest() {
    return manifest;
  }

  public void setManifest(String manifest) {
    this.manifest = manifest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceWorkSpaceResourceResponseDto workSpaceWorkSpaceResourceResponse = (WorkSpaceWorkSpaceResourceResponseDto) o;
    return Objects.equals(this.manifest, workSpaceWorkSpaceResourceResponse.manifest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceWorkSpaceResourceResponseDto {\n");
    
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
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


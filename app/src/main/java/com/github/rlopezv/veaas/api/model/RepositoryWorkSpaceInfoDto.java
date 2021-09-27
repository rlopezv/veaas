package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceInfo contains workSpace type and app file path
 */
@Schema(description = "WorkSpaceInfo contains workSpace type and app file path")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RepositoryWorkSpaceInfoDto   {
  @JsonProperty("path")
  private String path;

  @JsonProperty("type")
  private String type;

  public RepositoryWorkSpaceInfoDto path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
 @Schema(defaultValue = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RepositoryWorkSpaceInfoDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
 @Schema(defaultValue = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryWorkSpaceInfoDto repositoryWorkSpaceInfo = (RepositoryWorkSpaceInfoDto) o;
    return Objects.equals(this.path, repositoryWorkSpaceInfo.path) &&
        Objects.equals(this.type, repositoryWorkSpaceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryWorkSpaceInfoDto {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


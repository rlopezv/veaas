package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceSourceDirectory holds options for workSpaces of type plain YAML
 */
@Schema(description = "WorkSpaceSourceDirectory holds options for workSpaces of type plain YAML")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceSourceDirectoryDto   {
  @JsonProperty("exclude")
  private String exclude;

  @JsonProperty("include")
  private String include;

  @JsonProperty("recurse")
  private Boolean recurse;

  public V1WorkSpaceSourceDirectoryDto exclude(String exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * Exclude contains a glob pattern to match paths against that should be explicitly excluded from being used during manifest generation
   * @return exclude
  */
 @Schema(defaultValue = "Exclude contains a glob pattern to match paths against that should be explicitly excluded from being used during manifest generation")


  public String getExclude() {
    return exclude;
  }

  public void setExclude(String exclude) {
    this.exclude = exclude;
  }

  public V1WorkSpaceSourceDirectoryDto include(String include) {
    this.include = include;
    return this;
  }

  /**
   * Include contains a glob pattern to match paths against that should be explicitly included during manifest generation
   * @return include
  */
 @Schema(defaultValue = "Include contains a glob pattern to match paths against that should be explicitly included during manifest generation")


  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public V1WorkSpaceSourceDirectoryDto recurse(Boolean recurse) {
    this.recurse = recurse;
    return this;
  }

  /**
   * Recurse specifies whether to scan a directory recursively for manifests
   * @return recurse
  */
 @Schema(defaultValue = "Recurse specifies whether to scan a directory recursively for manifests")


  public Boolean getRecurse() {
    return recurse;
  }

  public void setRecurse(Boolean recurse) {
    this.recurse = recurse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkSpaceSourceDirectoryDto v1WorkSpaceSourceDirectory = (V1WorkSpaceSourceDirectoryDto) o;
    return Objects.equals(this.exclude, v1WorkSpaceSourceDirectory.exclude) &&
        Objects.equals(this.include, v1WorkSpaceSourceDirectory.include) &&
        Objects.equals(this.recurse, v1WorkSpaceSourceDirectory.recurse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, include, recurse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceSourceDirectoryDto {\n");
    
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    recurse: ").append(toIndentedString(recurse)).append("\n");
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


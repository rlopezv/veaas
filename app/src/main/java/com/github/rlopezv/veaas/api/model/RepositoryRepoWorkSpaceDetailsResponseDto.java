package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepoWorkSpaceDetailsResponse workSpace details
 */
@Schema(description = "RepoWorkSpaceDetailsResponse workSpace details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RepositoryRepoWorkSpaceDetailsResponseDto   {
  @JsonProperty("directory")
  private Object directory;

  @JsonProperty("type")
  private String type;

  public RepositoryRepoWorkSpaceDetailsResponseDto directory(Object directory) {
    this.directory = directory;
    return this;
  }

  /**
   * DirectoryWorkSpaceSpec contains directory
   * @return directory
  */
 @Schema(defaultValue = "DirectoryWorkSpaceSpec contains directory")


  public Object getDirectory() {
    return directory;
  }

  public void setDirectory(Object directory) {
    this.directory = directory;
  }

  public RepositoryRepoWorkSpaceDetailsResponseDto type(String type) {
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
    RepositoryRepoWorkSpaceDetailsResponseDto repositoryRepoWorkSpaceDetailsResponse = (RepositoryRepoWorkSpaceDetailsResponseDto) o;
    return Objects.equals(this.directory, repositoryRepoWorkSpaceDetailsResponse.directory) &&
        Objects.equals(this.type, repositoryRepoWorkSpaceDetailsResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRepoWorkSpaceDetailsResponseDto {\n");
    
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
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


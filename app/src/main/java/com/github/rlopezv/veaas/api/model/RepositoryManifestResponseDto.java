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
 * RepositoryManifestResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RepositoryManifestResponseDto   {
  @JsonProperty("manifests")
  @Valid
  private List<String> manifests = null;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("server")
  private String server;

  @JsonProperty("sourceType")
  private String sourceType;

  public RepositoryManifestResponseDto manifests(List<String> manifests) {
    this.manifests = manifests;
    return this;
  }

  public RepositoryManifestResponseDto addManifestsItem(String manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Enviroment descriptor. TODO define descriptor
   * @return manifests
  */
 @Schema(defaultValue = "Enviroment descriptor. TODO define descriptor")


  public List<String> getManifests() {
    return manifests;
  }

  public void setManifests(List<String> manifests) {
    this.manifests = manifests;
  }

  public RepositoryManifestResponseDto namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
 @Schema(defaultValue = "")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public RepositoryManifestResponseDto revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * resolved revision
   * @return revision
  */
 @Schema(defaultValue = "resolved revision")


  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public RepositoryManifestResponseDto server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Get server
   * @return server
  */
 @Schema(defaultValue = "")


  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public RepositoryManifestResponseDto sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
  */
 @Schema(defaultValue = "")


  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryManifestResponseDto repositoryManifestResponse = (RepositoryManifestResponseDto) o;
    return Objects.equals(this.manifests, repositoryManifestResponse.manifests) &&
        Objects.equals(this.namespace, repositoryManifestResponse.namespace) &&
        Objects.equals(this.revision, repositoryManifestResponse.revision) &&
        Objects.equals(this.server, repositoryManifestResponse.server) &&
        Objects.equals(this.sourceType, repositoryManifestResponse.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifests, namespace, revision, server, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryManifestResponseDto {\n");
    
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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


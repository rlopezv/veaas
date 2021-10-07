package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceDestination holds information about the workSpace&#39;s destination
 */
@Schema(description = "WorkSpaceDestination holds information about the workSpace's destination")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceDestination   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("server")
  private String server;

  public WorkSpaceDestination name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is an alternate way of specifying the target provider by its symbolic name
   * @return name
  */
 @Schema(defaultValue = "Name is an alternate way of specifying the target provider by its symbolic name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkSpaceDestination namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace specifies the target namespace for the workSpace's resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace
   * @return namespace
  */
 @Schema(defaultValue = "Namespace specifies the target namespace for the workSpace's resources. The namespace will only be set for namespace-scoped resources that have not set a value for .metadata.namespace")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public WorkSpaceDestination server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Server specifies the URL of the target provider and must be set to the Kubernetes control plane API
   * @return server
  */
 @Schema(defaultValue = "Server specifies the URL of the target provider and must be set to the Kubernetes control plane API")


  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceDestination WorkSpaceDestination = (WorkSpaceDestination) o;
    return Objects.equals(this.name, WorkSpaceDestination.name) &&
        Objects.equals(this.namespace, WorkSpaceDestination.namespace) &&
        Objects.equals(this.server, WorkSpaceDestination.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceDestination {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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


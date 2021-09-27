package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceDestination holds information about the workSpace&#39;s destination
 */
@Schema(description = "WorkSpaceDestination holds information about the workSpace's destination")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceDestinationDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("server")
  private String server;

  public V1WorkSpaceDestinationDto name(String name) {
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

  public V1WorkSpaceDestinationDto namespace(String namespace) {
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

  public V1WorkSpaceDestinationDto server(String server) {
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
    V1WorkSpaceDestinationDto v1WorkSpaceDestination = (V1WorkSpaceDestinationDto) o;
    return Objects.equals(this.name, v1WorkSpaceDestination.name) &&
        Objects.equals(this.namespace, v1WorkSpaceDestination.namespace) &&
        Objects.equals(this.server, v1WorkSpaceDestination.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceDestinationDto {\n");
    
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


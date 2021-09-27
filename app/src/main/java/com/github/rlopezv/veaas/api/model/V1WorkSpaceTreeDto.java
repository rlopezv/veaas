package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1HostInfoDto;
import com.github.rlopezv.veaas.api.model.V1ResourceDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpaceTree holds nodes which belongs to the workSpace
 */
@Schema(description = "WorkSpaceTree holds nodes which belongs to the workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceTreeDto   {
  @JsonProperty("hosts")
  @Valid
  private List<V1HostInfoDto> hosts = null;

  @JsonProperty("nodes")
  @Valid
  private List<V1ResourceDto> nodes = null;

  public V1WorkSpaceTreeDto hosts(List<V1HostInfoDto> hosts) {
    this.hosts = hosts;
    return this;
  }

  public V1WorkSpaceTreeDto addHostsItem(V1HostInfoDto hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

  /**
   * Hosts holds list of Kubernetes nodes that run workSpace related pods
   * @return hosts
  */
 @Schema(defaultValue = "Hosts holds list of Kubernetes nodes that run workSpace related pods")

  @Valid

  public List<V1HostInfoDto> getHosts() {
    return hosts;
  }

  public void setHosts(List<V1HostInfoDto> hosts) {
    this.hosts = hosts;
  }

  public V1WorkSpaceTreeDto nodes(List<V1ResourceDto> nodes) {
    this.nodes = nodes;
    return this;
  }

  public V1WorkSpaceTreeDto addNodesItem(V1ResourceDto nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * Nodes contains list of nodes which either directly managed by the workSpace and children of directly managed nodes.
   * @return nodes
  */
 @Schema(defaultValue = "Nodes contains list of nodes which either directly managed by the workSpace and children of directly managed nodes.")

  @Valid

  public List<V1ResourceDto> getNodes() {
    return nodes;
  }

  public void setNodes(List<V1ResourceDto> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkSpaceTreeDto v1WorkSpaceTree = (V1WorkSpaceTreeDto) o;
    return Objects.equals(this.hosts, v1WorkSpaceTree.hosts) &&
        Objects.equals(this.nodes, v1WorkSpaceTree.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceTreeDto {\n");
    
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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


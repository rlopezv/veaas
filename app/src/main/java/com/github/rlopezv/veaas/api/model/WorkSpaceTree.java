package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceTree holds nodes which belongs to the workSpace
 */
@Schema(description = "WorkSpaceTree holds nodes which belongs to the workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceTree   {
  @JsonProperty("hosts")
  @Valid
  private List<HostInfo> hosts = null;

  @JsonProperty("nodes")
  @Valid
  private List<Resource> nodes = null;

  public WorkSpaceTree hosts(List<HostInfo> hosts) {
    this.hosts = hosts;
    return this;
  }

  public WorkSpaceTree addHostsItem(HostInfo hostsItem) {
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

  public List<HostInfo> getHosts() {
    return hosts;
  }

  public void setHosts(List<HostInfo> hosts) {
    this.hosts = hosts;
  }

  public WorkSpaceTree nodes(List<Resource> nodes) {
    this.nodes = nodes;
    return this;
  }

  public WorkSpaceTree addNodesItem(Resource nodesItem) {
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

  public List<Resource> getNodes() {
    return nodes;
  }

  public void setNodes(List<Resource> nodes) {
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
    WorkSpaceTree WorkSpaceTree = (WorkSpaceTree) o;
    return Objects.equals(this.hosts, WorkSpaceTree.hosts) &&
        Objects.equals(this.nodes, WorkSpaceTree.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceTree {\n");
    
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


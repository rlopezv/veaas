package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import io.swagger.v3.oas.annotations.media.*;
import javax.validation.Valid;


/**
 * NetworkIngress represents the status of an ingress point: traffic intended for the service should be sent to an ingress point.
 */
@Schema(description = "NetworkIngress represents the status of an ingress point: traffic intended for the service should be sent to an ingress point.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1NetworkIngressDto   {
  @JsonProperty("hostname")
  private String hostname;

  @JsonProperty("ip")
  private String ip;

  @JsonProperty("ports")
  @Valid
  private List<V1PortStatusDto> ports = null;

  public V1NetworkIngressDto hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Hostname is set for ingress points +optional
   * @return hostname
  */
  @Schema(description = "Hostname is set for ingress points +optional")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1NetworkIngressDto ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * IP is set for ingress points that are IP based
   * @return ip
  */
  @Schema(description = "IP is set for ingress points that are IP based")


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public V1NetworkIngressDto ports(List<V1PortStatusDto> ports) {
    this.ports = ports;
    return this;
  }

  public V1NetworkIngressDto addPortsItem(V1PortStatusDto portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Ports is a list of records of service ports If used, every port defined in the service should have an entry in it
   * @return ports
  */
  @Schema(description = "Ports is a list of records of service ports If used, every port defined in the service should have an entry in it")

  @Valid

  public List<V1PortStatusDto> getPorts() {
    return ports;
  }

  public void setPorts(List<V1PortStatusDto> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkIngressDto v1NetworkIngress = (V1NetworkIngressDto) o;
    return Objects.equals(this.hostname, v1NetworkIngress.hostname) &&
        Objects.equals(this.ip, v1NetworkIngress.ip) &&
        Objects.equals(this.ports, v1NetworkIngress.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkIngressDto {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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


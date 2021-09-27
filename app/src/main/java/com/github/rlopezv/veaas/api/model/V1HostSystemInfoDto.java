package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node. TODO this should be included in provider
 */
@Schema(description = "NodeSystemInfo is a set of ids/uuids to uniquely identify the node. TODO this should be included in provider")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1HostSystemInfoDto   {
  @JsonProperty("architecture")
  private String architecture;

  @JsonProperty("bootID")
  private String bootID;

  @JsonProperty("containerRuntimeVersion")
  private String containerRuntimeVersion;

  @JsonProperty("kernelVersion")
  private String kernelVersion;

  @JsonProperty("kubeProxyVersion")
  private String kubeProxyVersion;

  @JsonProperty("kubeletVersion")
  private String kubeletVersion;

  @JsonProperty("machineID")
  private String machineID;

  @JsonProperty("operatingSystem")
  private String operatingSystem;

  @JsonProperty("osImage")
  private String osImage;

  @JsonProperty("systemUUID")
  private String systemUUID;

  public V1HostSystemInfoDto architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * The Architecture reported by the node
   * @return architecture
  */
 @Schema(defaultValue = "The Architecture reported by the node")


  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public V1HostSystemInfoDto bootID(String bootID) {
    this.bootID = bootID;
    return this;
  }

  /**
   * Boot ID reported by the node.
   * @return bootID
  */
 @Schema(defaultValue = "Boot ID reported by the node.")


  public String getBootID() {
    return bootID;
  }

  public void setBootID(String bootID) {
    this.bootID = bootID;
  }

  public V1HostSystemInfoDto containerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

  /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
   * @return containerRuntimeVersion
  */
 @Schema(defaultValue = "ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).")


  public String getContainerRuntimeVersion() {
    return containerRuntimeVersion;
  }

  public void setContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
  }

  public V1HostSystemInfoDto kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
   * @return kernelVersion
  */
 @Schema(defaultValue = "Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).")


  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public V1HostSystemInfoDto kubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

  /**
   * KubeProxy Version reported by the node.
   * @return kubeProxyVersion
  */
 @Schema(defaultValue = "KubeProxy Version reported by the node.")


  public String getKubeProxyVersion() {
    return kubeProxyVersion;
  }

  public void setKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
  }

  public V1HostSystemInfoDto kubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return this;
  }

  /**
   * Kubelet Version reported by the node.
   * @return kubeletVersion
  */
 @Schema(defaultValue = "Kubelet Version reported by the node.")


  public String getKubeletVersion() {
    return kubeletVersion;
  }

  public void setKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
  }

  public V1HostSystemInfoDto machineID(String machineID) {
    this.machineID = machineID;
    return this;
  }

  /**
   * MachineID reported by the node. For unique machine identification in the provider this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
   * @return machineID
  */
 @Schema(defaultValue = "MachineID reported by the node. For unique machine identification in the provider this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html")


  public String getMachineID() {
    return machineID;
  }

  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }

  public V1HostSystemInfoDto operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * The Operating System reported by the node
   * @return operatingSystem
  */
 @Schema(defaultValue = "The Operating System reported by the node")


  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public V1HostSystemInfoDto osImage(String osImage) {
    this.osImage = osImage;
    return this;
  }

  /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   * @return osImage
  */
 @Schema(defaultValue = "OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).")


  public String getOsImage() {
    return osImage;
  }

  public void setOsImage(String osImage) {
    this.osImage = osImage;
  }

  public V1HostSystemInfoDto systemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
    return this;
  }

  /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
   * @return systemUUID
  */
 @Schema(defaultValue = "SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid")


  public String getSystemUUID() {
    return systemUUID;
  }

  public void setSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostSystemInfoDto v1HostSystemInfo = (V1HostSystemInfoDto) o;
    return Objects.equals(this.architecture, v1HostSystemInfo.architecture) &&
        Objects.equals(this.bootID, v1HostSystemInfo.bootID) &&
        Objects.equals(this.containerRuntimeVersion, v1HostSystemInfo.containerRuntimeVersion) &&
        Objects.equals(this.kernelVersion, v1HostSystemInfo.kernelVersion) &&
        Objects.equals(this.kubeProxyVersion, v1HostSystemInfo.kubeProxyVersion) &&
        Objects.equals(this.kubeletVersion, v1HostSystemInfo.kubeletVersion) &&
        Objects.equals(this.machineID, v1HostSystemInfo.machineID) &&
        Objects.equals(this.operatingSystem, v1HostSystemInfo.operatingSystem) &&
        Objects.equals(this.osImage, v1HostSystemInfo.osImage) &&
        Objects.equals(this.systemUUID, v1HostSystemInfo.systemUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, systemUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostSystemInfoDto {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    bootID: ").append(toIndentedString(bootID)).append("\n");
    sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    kubeProxyVersion: ").append(toIndentedString(kubeProxyVersion)).append("\n");
    sb.append("    kubeletVersion: ").append(toIndentedString(kubeletVersion)).append("\n");
    sb.append("    machineID: ").append(toIndentedString(machineID)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
    sb.append("    systemUUID: ").append(toIndentedString(systemUUID)).append("\n");
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


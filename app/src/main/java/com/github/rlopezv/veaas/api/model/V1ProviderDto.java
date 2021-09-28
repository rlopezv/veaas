package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Provider is the definition of a resource provider
 */
@Schema(description = "Provider is the definition of a resource provider")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ProviderDto   {
  @JsonProperty("annotations")
  @Valid
  private Map<String, String> annotations = null;

  @JsonProperty("providerResources")
  private Boolean providerResources;

  @JsonProperty("config")
  private V1ProviderConfigDto config;

  @JsonProperty("connectionState")
  private V1ConnectionStateDto connectionState;

  @JsonProperty("info")
  private V1ProviderInfoDto info;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespaces")
  @Valid
  private List<String> namespaces = null;

  @JsonProperty("refreshRequestedAt")
  private V1TimeDto refreshRequestedAt;

  @JsonProperty("server")
  private String server;

  @JsonProperty("shard")
  private String shard;

  public V1ProviderDto annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public V1ProviderDto putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Annotations for provider secret metadata
   * @return annotations
  */
 @Schema(defaultValue = "Annotations for provider secret metadata")


  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1ProviderDto providerResources(Boolean providerResources) {
    this.providerResources = providerResources;
    return this;
  }

  /**
   * Indicates if provider level resources should be managed. This setting is used only if provider is connected in a namespaced mode.
   * @return providerResources
  */
 @Schema(defaultValue = "Indicates if provider level resources should be managed. This setting is used only if provider is connected in a namespaced mode.")


  public Boolean getProviderResources() {
    return providerResources;
  }

  public void setProviderResources(Boolean providerResources) {
    this.providerResources = providerResources;
  }

  public V1ProviderDto config(V1ProviderConfigDto config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ProviderConfigDto getConfig() {
    return config;
  }

  public void setConfig(V1ProviderConfigDto config) {
    this.config = config;
  }

  public V1ProviderDto connectionState(V1ConnectionStateDto connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ConnectionStateDto getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(V1ConnectionStateDto connectionState) {
    this.connectionState = connectionState;
  }

  public V1ProviderDto info(V1ProviderInfoDto info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ProviderInfoDto getInfo() {
    return info;
  }

  public void setInfo(V1ProviderInfoDto info) {
    this.info = info;
  }

  public V1ProviderDto labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ProviderDto putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels for provider secret metadata
   * @return labels
  */
 @Schema(defaultValue = "Labels for provider secret metadata")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1ProviderDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the provider. If omitted, will use the server address
   * @return name
  */
 @Schema(defaultValue = "Name of the provider. If omitted, will use the server address")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ProviderDto namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1ProviderDto addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * Holds list of namespaces which are accessible in that provider. Provider level resources will be ignored if namespace list is not empty.
   * @return namespaces
  */
 @Schema(defaultValue = "Holds list of namespaces which are accessible in that provider. Provider level resources will be ignored if namespace list is not empty.")


  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public V1ProviderDto refreshRequestedAt(V1TimeDto refreshRequestedAt) {
    this.refreshRequestedAt = refreshRequestedAt;
    return this;
  }

  /**
   * Get refreshRequestedAt
   * @return refreshRequestedAt
  */
 @Schema(defaultValue = "")
  @Valid

  public V1TimeDto getRefreshRequestedAt() {
    return refreshRequestedAt;
  }

  public void setRefreshRequestedAt(V1TimeDto refreshRequestedAt) {
    this.refreshRequestedAt = refreshRequestedAt;
  }

  public V1ProviderDto server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Server is the API server URL of the provider
   * @return server
  */
 @Schema(defaultValue = "Server is the API server URL of the provider")


  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public V1ProviderDto shard(String shard) {
    this.shard = shard;
    return this;
  }

  /**
   * Shard contains optional shard number. Calculated on the fly by the workSpace controller if not specified.
   * @return shard
  */
 @Schema(defaultValue = "Shard contains optional shard number. Calculated on the fly by the workSpace controller if not specified.")


  public String getShard() {
    return shard;
  }

  public void setShard(String shard) {
    this.shard = shard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProviderDto v1Provider = (V1ProviderDto) o;
    return Objects.equals(this.annotations, v1Provider.annotations) &&
        Objects.equals(this.providerResources, v1Provider.providerResources) &&
        Objects.equals(this.config, v1Provider.config) &&
        Objects.equals(this.connectionState, v1Provider.connectionState) &&
        Objects.equals(this.info, v1Provider.info) &&
        Objects.equals(this.labels, v1Provider.labels) &&
        Objects.equals(this.name, v1Provider.name) &&
        Objects.equals(this.namespaces, v1Provider.namespaces) &&
        Objects.equals(this.refreshRequestedAt, v1Provider.refreshRequestedAt) &&
        Objects.equals(this.server, v1Provider.server) &&
        Objects.equals(this.shard, v1Provider.shard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, providerResources, config, connectionState, info, labels, name, namespaces, refreshRequestedAt, server, shard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProviderDto {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    providerResources: ").append(toIndentedString(providerResources)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    refreshRequestedAt: ").append(toIndentedString(refreshRequestedAt)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
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


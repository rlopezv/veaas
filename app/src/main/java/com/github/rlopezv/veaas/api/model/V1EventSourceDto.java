package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventSource contains information for an event.
 */
@Schema(description = "EventSource contains information for an event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1EventSourceDto   {
  @JsonProperty("component")
  private String component;

  @JsonProperty("host")
  private String host;

  public V1EventSourceDto component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Component from which the event is generated. +optional
   * @return component
  */
 @Schema(defaultValue = "Component from which the event is generated. +optional")


  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public V1EventSourceDto host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Node name on which the event is generated. +optional
   * @return host
  */
 @Schema(defaultValue = "Node name on which the event is generated. +optional")


  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventSourceDto v1EventSource = (V1EventSourceDto) o;
    return Objects.equals(this.component, v1EventSource.component) &&
        Objects.equals(this.host, v1EventSource.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventSourceDto {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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


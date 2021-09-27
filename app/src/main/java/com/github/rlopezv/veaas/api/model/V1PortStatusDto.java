package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V1PortStatusDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1PortStatusDto   {
  @JsonProperty("error")
  private String error;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("protocol")
  private String protocol;

  public V1PortStatusDto error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use   CamelCase names - cloud provider specific error values must have names that comply with the   format foo.example.com/CamelCase.
   * @return error
  */
 @Schema(defaultValue = "Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use   CamelCase names - cloud provider specific error values must have names that comply with the   format foo.example.com/CamelCase.")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1PortStatusDto port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port is the port number of the service port of which status is recorded here
   * @return port
  */
 @Schema(defaultValue = "Port is the port number of the service port of which status is recorded here")


  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1PortStatusDto protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol is the protocol of the service port of which status is recorded here Candidate values are: \"TCP\", \"UDP\", \"SCTP\"
   * @return protocol
  */
 @Schema(defaultValue = "Protocol is the protocol of the service port of which status is recorded here Candidate values are: \"TCP\", \"UDP\", \"SCTP\"")


  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PortStatusDto v1PortStatus = (V1PortStatusDto) o;
    return Objects.equals(this.error, v1PortStatus.error) &&
        Objects.equals(this.port, v1PortStatus.port) &&
        Objects.equals(this.protocol, v1PortStatus.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PortStatusDto {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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


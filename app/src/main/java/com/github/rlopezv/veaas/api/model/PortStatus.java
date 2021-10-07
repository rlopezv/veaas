package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PortStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class PortStatus   {
  @JsonProperty("error")
  private String error;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("protocol")
  private String protocol;

  public PortStatus error(String error) {
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

  public PortStatus port(Integer port) {
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

  public PortStatus protocol(String protocol) {
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
    PortStatus PortStatus = (PortStatus) o;
    return Objects.equals(this.error, PortStatus.error) &&
        Objects.equals(this.port, PortStatus.port) &&
        Objects.equals(this.protocol, PortStatus.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortStatus {\n");
    
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


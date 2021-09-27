package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TLSClientConfig contains settings to enable transport layer security
 */
@Schema(description = "TLSClientConfig contains settings to enable transport layer security")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1TLSClientConfigDto   {
  @JsonProperty("caData")
  private byte[] caData;

  @JsonProperty("certData")
  private byte[] certData;

  @JsonProperty("insecure")
  private Boolean insecure;

  @JsonProperty("keyData")
  private byte[] keyData;

  @JsonProperty("serverName")
  private String serverName;

  public V1TLSClientConfigDto caData(byte[] caData) {
    this.caData = caData;
    return this;
  }

  /**
   * CAData holds PEM-encoded bytes (typically read from a root certificates bundle). CAData takes precedence over CAFile
   * @return caData
  */
 @Schema(defaultValue = "CAData holds PEM-encoded bytes (typically read from a root certificates bundle). CAData takes precedence over CAFile")


  public byte[] getCaData() {
    return caData;
  }

  public void setCaData(byte[] caData) {
    this.caData = caData;
  }

  public V1TLSClientConfigDto certData(byte[] certData) {
    this.certData = certData;
    return this;
  }

  /**
   * CertData holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile
   * @return certData
  */
 @Schema(defaultValue = "CertData holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile")


  public byte[] getCertData() {
    return certData;
  }

  public void setCertData(byte[] certData) {
    this.certData = certData;
  }

  public V1TLSClientConfigDto insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Insecure specifies that the server should be accessed without verifying the TLS certificate. For testing only.
   * @return insecure
  */
 @Schema(defaultValue = "Insecure specifies that the server should be accessed without verifying the TLS certificate. For testing only.")


  public Boolean getInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public V1TLSClientConfigDto keyData(byte[] keyData) {
    this.keyData = keyData;
    return this;
  }

  /**
   * KeyData holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile
   * @return keyData
  */
 @Schema(defaultValue = "KeyData holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile")


  public byte[] getKeyData() {
    return keyData;
  }

  public void setKeyData(byte[] keyData) {
    this.keyData = keyData;
  }

  public V1TLSClientConfigDto serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

  /**
   * ServerName is passed to the server for SNI and is used in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
   * @return serverName
  */
 @Schema(defaultValue = "ServerName is passed to the server for SNI and is used in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.")


  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TLSClientConfigDto v1TLSClientConfig = (V1TLSClientConfigDto) o;
    return Arrays.equals(this.caData, v1TLSClientConfig.caData) &&
        Arrays.equals(this.certData, v1TLSClientConfig.certData) &&
        Objects.equals(this.insecure, v1TLSClientConfig.insecure) &&
        Arrays.equals(this.keyData, v1TLSClientConfig.keyData) &&
        Objects.equals(this.serverName, v1TLSClientConfig.serverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(caData), Arrays.hashCode(certData), insecure, Arrays.hashCode(keyData), serverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TLSClientConfigDto {\n");
    
    sb.append("    caData: ").append(toIndentedString(caData)).append("\n");
    sb.append("    certData: ").append(toIndentedString(certData)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    keyData: ").append(toIndentedString(keyData)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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


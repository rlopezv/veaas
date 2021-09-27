package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1ExecProviderConfigDto;
import com.github.rlopezv.veaas.api.model.V1TLSClientConfigDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProviderConfig is the configuration attributes. This structure is subset of the go-client rest.Config with annotations added for marshalling.
 */
@Schema(description = "ProviderConfig is the configuration attributes. This structure is subset of the go-client rest.Config with annotations added for marshalling.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ProviderConfigDto   {
  @JsonProperty("bearerToken")
  private String bearerToken;

  @JsonProperty("execProviderConfig")
  private V1ExecProviderConfigDto execProviderConfig;

  @JsonProperty("password")
  private String password;

  @JsonProperty("tlsClientConfig")
  private V1TLSClientConfigDto tlsClientConfig;

  @JsonProperty("username")
  private String username;

  public V1ProviderConfigDto bearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * Server requires Bearer authentication. This client will not attempt to use refresh tokens for an OAuth2 flow.
   * @return bearerToken
  */
 @Schema(defaultValue = "Server requires Bearer authentication. This client will not attempt to use refresh tokens for an OAuth2 flow.")


  public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public V1ProviderConfigDto execProviderConfig(V1ExecProviderConfigDto execProviderConfig) {
    this.execProviderConfig = execProviderConfig;
    return this;
  }

  /**
   * Get execProviderConfig
   * @return execProviderConfig
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ExecProviderConfigDto getExecProviderConfig() {
    return execProviderConfig;
  }

  public void setExecProviderConfig(V1ExecProviderConfigDto execProviderConfig) {
    this.execProviderConfig = execProviderConfig;
  }

  public V1ProviderConfigDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
 @Schema(defaultValue = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public V1ProviderConfigDto tlsClientConfig(V1TLSClientConfigDto tlsClientConfig) {
    this.tlsClientConfig = tlsClientConfig;
    return this;
  }

  /**
   * Get tlsClientConfig
   * @return tlsClientConfig
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TLSClientConfigDto getTlsClientConfig() {
    return tlsClientConfig;
  }

  public void setTlsClientConfig(V1TLSClientConfigDto tlsClientConfig) {
    this.tlsClientConfig = tlsClientConfig;
  }

  public V1ProviderConfigDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Server requires Basic authentication
   * @return username
  */
 @Schema(defaultValue = "Server requires Basic authentication")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProviderConfigDto v1ProviderConfig = (V1ProviderConfigDto) o;
    return Objects.equals(this.bearerToken, v1ProviderConfig.bearerToken) &&
        Objects.equals(this.execProviderConfig, v1ProviderConfig.execProviderConfig) &&
        Objects.equals(this.password, v1ProviderConfig.password) &&
        Objects.equals(this.tlsClientConfig, v1ProviderConfig.tlsClientConfig) &&
        Objects.equals(this.username, v1ProviderConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, execProviderConfig, password, tlsClientConfig, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProviderConfigDto {\n");
    
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    execProviderConfig: ").append(toIndentedString(execProviderConfig)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tlsClientConfig: ").append(toIndentedString(tlsClientConfig)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


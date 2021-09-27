package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepoCreds holds the definition for repository credentials
 */
@Schema(description = "RepoCreds holds the definition for repository credentials")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1RepoCredsDto   {
  @JsonProperty("password")
  private String password;

  @JsonProperty("sshPrivateKey")
  private String sshPrivateKey;

  @JsonProperty("tlsClientCertData")
  private String tlsClientCertData;

  @JsonProperty("tlsClientCertKey")
  private String tlsClientCertKey;

  @JsonProperty("type")
  private String type;

  @JsonProperty("url")
  private String url;

  @JsonProperty("username")
  private String username;

  public V1RepoCredsDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password for authenticating at the repo server
   * @return password
  */
 @Schema(defaultValue = "Password for authenticating at the repo server")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public V1RepoCredsDto sshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
    return this;
  }

  /**
   * SSHPrivateKey contains the private key data for authenticating at the repo server using SSH (only Git repos)
   * @return sshPrivateKey
  */
 @Schema(defaultValue = "SSHPrivateKey contains the private key data for authenticating at the repo server using SSH (only Git repos)")


  public String getSshPrivateKey() {
    return sshPrivateKey;
  }

  public void setSshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
  }

  public V1RepoCredsDto tlsClientCertData(String tlsClientCertData) {
    this.tlsClientCertData = tlsClientCertData;
    return this;
  }

  /**
   * TLSClientCertData specifies the TLS client cert data for authenticating at the repo server
   * @return tlsClientCertData
  */
 @Schema(defaultValue = "TLSClientCertData specifies the TLS client cert data for authenticating at the repo server")


  public String getTlsClientCertData() {
    return tlsClientCertData;
  }

  public void setTlsClientCertData(String tlsClientCertData) {
    this.tlsClientCertData = tlsClientCertData;
  }

  public V1RepoCredsDto tlsClientCertKey(String tlsClientCertKey) {
    this.tlsClientCertKey = tlsClientCertKey;
    return this;
  }

  /**
   * TLSClientCertKey specifies the TLS client cert key for authenticating at the repo server
   * @return tlsClientCertKey
  */
 @Schema(defaultValue = "TLSClientCertKey specifies the TLS client cert key for authenticating at the repo server")


  public String getTlsClientCertKey() {
    return tlsClientCertKey;
  }

  public void setTlsClientCertKey(String tlsClientCertKey) {
    this.tlsClientCertKey = tlsClientCertKey;
  }

  public V1RepoCredsDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type specifies the type of the repoCreds. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.
   * @return type
  */
 @Schema(defaultValue = "Type specifies the type of the repoCreds. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1RepoCredsDto url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL is the URL that this credentials matches to
   * @return url
  */
 @Schema(defaultValue = "URL is the URL that this credentials matches to")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V1RepoCredsDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username for authenticating at the repo server
   * @return username
  */
 @Schema(defaultValue = "Username for authenticating at the repo server")


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
    V1RepoCredsDto v1RepoCreds = (V1RepoCredsDto) o;
    return Objects.equals(this.password, v1RepoCreds.password) &&
        Objects.equals(this.sshPrivateKey, v1RepoCreds.sshPrivateKey) &&
        Objects.equals(this.tlsClientCertData, v1RepoCreds.tlsClientCertData) &&
        Objects.equals(this.tlsClientCertKey, v1RepoCreds.tlsClientCertKey) &&
        Objects.equals(this.type, v1RepoCreds.type) &&
        Objects.equals(this.url, v1RepoCreds.url) &&
        Objects.equals(this.username, v1RepoCreds.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, sshPrivateKey, tlsClientCertData, tlsClientCertKey, type, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RepoCredsDto {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshPrivateKey: ").append(toIndentedString(sshPrivateKey)).append("\n");
    sb.append("    tlsClientCertData: ").append(toIndentedString(tlsClientCertData)).append("\n");
    sb.append("    tlsClientCertKey: ").append(toIndentedString(tlsClientCertKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


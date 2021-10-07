package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Repository is a repository holding workSpace configurations
 */
@Schema(description = "Repository is a repository holding workSpace configurations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class Repository   {
  @JsonProperty("connectionState")
  private ConnectionState connectionState;

  @JsonProperty("enableLfs")
  private Boolean enableLfs;

  @JsonProperty("inheritedCreds")
  private Boolean inheritedCreds;

  @JsonProperty("insecure")
  private Boolean insecure;

  @JsonProperty("insecureIgnoreHostKey")
  private Boolean insecureIgnoreHostKey;

  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("proxy")
  private String proxy;

  @JsonProperty("repo")
  private String repo;

  @JsonProperty("sshPrivateKey")
  private String sshPrivateKey;

  @JsonProperty("tlsClientCertData")
  private String tlsClientCertData;

  @JsonProperty("tlsClientCertKey")
  private String tlsClientCertKey;

  @JsonProperty("type")
  private String type;

  @JsonProperty("username")
  private String username;

  public Repository connectionState(ConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
  */
 @Schema(defaultValue = "")
  @Valid

  public ConnectionState getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(ConnectionState connectionState) {
    this.connectionState = connectionState;
  }

  public Repository enableLfs(Boolean enableLfs) {
    this.enableLfs = enableLfs;
    return this;
  }

  /**
   * EnableLFS specifies whether git-lfs support should be enabled for this repo. Only valid for Git repositories.
   * @return enableLfs
  */
 @Schema(defaultValue = "EnableLFS specifies whether git-lfs support should be enabled for this repo. Only valid for Git repositories.")


  public Boolean getEnableLfs() {
    return enableLfs;
  }

  public void setEnableLfs(Boolean enableLfs) {
    this.enableLfs = enableLfs;
  }

  public Repository inheritedCreds(Boolean inheritedCreds) {
    this.inheritedCreds = inheritedCreds;
    return this;
  }

  /**
   * Whether credentials were inherited from a credential set
   * @return inheritedCreds
  */
 @Schema(defaultValue = "Whether credentials were inherited from a credential set")


  public Boolean getInheritedCreds() {
    return inheritedCreds;
  }

  public void setInheritedCreds(Boolean inheritedCreds) {
    this.inheritedCreds = inheritedCreds;
  }

  public Repository insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Insecure specifies whether the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys
   * @return insecure
  */
 @Schema(defaultValue = "Insecure specifies whether the connection to the repository ignores any errors when verifying TLS certificates or SSH host keys")


  public Boolean getInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public Repository insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
    return this;
  }

  /**
   * InsecureIgnoreHostKey should not be used anymore, Insecure is favoured Used only for Git repos
   * @return insecureIgnoreHostKey
  */
 @Schema(defaultValue = "InsecureIgnoreHostKey should not be used anymore, Insecure is favoured Used only for Git repos")


  public Boolean getInsecureIgnoreHostKey() {
    return insecureIgnoreHostKey;
  }

  public void setInsecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
  }

  public Repository name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name specifies a name to be used for this repo. Only used with Helm repos
   * @return name
  */
 @Schema(defaultValue = "Name specifies a name to be used for this repo. Only used with Helm repos")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Repository password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password contains the password or PAT used for authenticating at the remote repository
   * @return password
  */
 @Schema(defaultValue = "Password contains the password or PAT used for authenticating at the remote repository")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Repository proxy(String proxy) {
    this.proxy = proxy;
    return this;
  }

  /**
   * Proxy specifies the HTTP/HTTPS proxy used to access the repo
   * @return proxy
  */
 @Schema(defaultValue = "Proxy specifies the HTTP/HTTPS proxy used to access the repo")


  public String getProxy() {
    return proxy;
  }

  public void setProxy(String proxy) {
    this.proxy = proxy;
  }

  public Repository repo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Repo contains the URL to the remote repository
   * @return repo
  */
 @Schema(defaultValue = "Repo contains the URL to the remote repository")


  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public Repository sshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
    return this;
  }

  /**
   * SSHPrivateKey contains the PEM data for authenticating at the repo server. Only used with Git repos.
   * @return sshPrivateKey
  */
 @Schema(defaultValue = "SSHPrivateKey contains the PEM data for authenticating at the repo server. Only used with Git repos.")


  public String getSshPrivateKey() {
    return sshPrivateKey;
  }

  public void setSshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
  }

  public Repository tlsClientCertData(String tlsClientCertData) {
    this.tlsClientCertData = tlsClientCertData;
    return this;
  }

  /**
   * TLSClientCertData contains a certificate in PEM format for authenticating at the repo server
   * @return tlsClientCertData
  */
 @Schema(defaultValue = "TLSClientCertData contains a certificate in PEM format for authenticating at the repo server")


  public String getTlsClientCertData() {
    return tlsClientCertData;
  }

  public void setTlsClientCertData(String tlsClientCertData) {
    this.tlsClientCertData = tlsClientCertData;
  }

  public Repository tlsClientCertKey(String tlsClientCertKey) {
    this.tlsClientCertKey = tlsClientCertKey;
    return this;
  }

  /**
   * TLSClientCertKey contains a private key in PEM format for authenticating at the repo server
   * @return tlsClientCertKey
  */
 @Schema(defaultValue = "TLSClientCertKey contains a private key in PEM format for authenticating at the repo server")


  public String getTlsClientCertKey() {
    return tlsClientCertKey;
  }

  public void setTlsClientCertKey(String tlsClientCertKey) {
    this.tlsClientCertKey = tlsClientCertKey;
  }

  public Repository type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type specifies the type of the repo. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.
   * @return type
  */
 @Schema(defaultValue = "Type specifies the type of the repo. Can be either \"git\" or \"helm. \"git\" is assumed if empty or absent.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Repository username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username contains the user name used for authenticating at the remote repository
   * @return username
  */
 @Schema(defaultValue = "Username contains the user name used for authenticating at the remote repository")


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
    Repository Repository = (Repository) o;
    return Objects.equals(this.connectionState, Repository.connectionState) &&
        Objects.equals(this.enableLfs, Repository.enableLfs) &&
        Objects.equals(this.inheritedCreds, Repository.inheritedCreds) &&
        Objects.equals(this.insecure, Repository.insecure) &&
        Objects.equals(this.insecureIgnoreHostKey, Repository.insecureIgnoreHostKey) &&
        Objects.equals(this.name, Repository.name) &&
        Objects.equals(this.password, Repository.password) &&
        Objects.equals(this.proxy, Repository.proxy) &&
        Objects.equals(this.repo, Repository.repo) &&
        Objects.equals(this.sshPrivateKey, Repository.sshPrivateKey) &&
        Objects.equals(this.tlsClientCertData, Repository.tlsClientCertData) &&
        Objects.equals(this.tlsClientCertKey, Repository.tlsClientCertKey) &&
        Objects.equals(this.type, Repository.type) &&
        Objects.equals(this.username, Repository.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionState, enableLfs, inheritedCreds, insecure, insecureIgnoreHostKey, name, password, proxy, repo, sshPrivateKey, tlsClientCertData, tlsClientCertKey, type, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    enableLfs: ").append(toIndentedString(enableLfs)).append("\n");
    sb.append("    inheritedCreds: ").append(toIndentedString(inheritedCreds)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    sshPrivateKey: ").append(toIndentedString(sshPrivateKey)).append("\n");
    sb.append("    tlsClientCertData: ").append(toIndentedString(tlsClientCertData)).append("\n");
    sb.append("    tlsClientCertKey: ").append(toIndentedString(tlsClientCertKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


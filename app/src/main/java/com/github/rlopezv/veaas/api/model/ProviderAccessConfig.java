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
 * ProviderAccessConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ProviderAccessConfig   {
  @JsonProperty("cliClientID")
  private String cliClientID;

  @JsonProperty("clientID")
  private String clientID;

  @JsonProperty("idTokenClaims")
  @Valid
  private Map<String, AccessClaim> idTokenClaims = null;

  @JsonProperty("issuer")
  private String issuer;

  @JsonProperty("name")
  private String name;

  @JsonProperty("scopes")
  @Valid
  private List<String> scopes = null;

  public ProviderAccessConfig cliClientID(String cliClientID) {
    this.cliClientID = cliClientID;
    return this;
  }

  /**
   * Get cliClientID
   * @return cliClientID
  */
 @Schema(defaultValue =  "")
 public String getCliClientID() {
    return cliClientID;
  }

  public void setCliClientID(String cliClientID) {
    this.cliClientID = cliClientID;
  }

  public ProviderAccessConfig clientID(String clientID) {
    this.clientID = clientID;
    return this;
  }

  /**
   * Get clientID
   * @return clientID
  */
 @Schema(defaultValue =  "")
 public String getClientID() {
    return clientID;
  }

  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  public ProviderAccessConfig idTokenClaims(Map<String, AccessClaim> idTokenClaims) {
    this.idTokenClaims = idTokenClaims;
    return this;
  }

  public ProviderAccessConfig putIdTokenClaimsItem(String key, AccessClaim idTokenClaimsItem) {
    if (this.idTokenClaims == null) {
      this.idTokenClaims = new HashMap<>();
    }
    this.idTokenClaims.put(key, idTokenClaimsItem);
    return this;
  }

  /**
   * Get idTokenClaims
   * @return idTokenClaims
  */
 @Schema(defaultValue = "")
  @Valid

  public Map<String, AccessClaim> getIdTokenClaims() {
    return idTokenClaims;
  }

  public void setIdTokenClaims(Map<String, AccessClaim> idTokenClaims) {
    this.idTokenClaims = idTokenClaims;
  }

  public ProviderAccessConfig issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
  */
 @Schema(defaultValue =  "")
 public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public ProviderAccessConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue =  "")
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProviderAccessConfig scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ProviderAccessConfig addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
  */
 @Schema(defaultValue =  "")
 public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderAccessConfig providerAccessConfig = (ProviderAccessConfig) o;
    return Objects.equals(this.cliClientID, providerAccessConfig.cliClientID) &&
        Objects.equals(this.clientID, providerAccessConfig.clientID) &&
        Objects.equals(this.idTokenClaims, providerAccessConfig.idTokenClaims) &&
        Objects.equals(this.issuer, providerAccessConfig.issuer) &&
        Objects.equals(this.name, providerAccessConfig.name) &&
        Objects.equals(this.scopes, providerAccessConfig.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cliClientID, clientID, idTokenClaims, issuer, name, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderAccessConfig {\n");
    
    sb.append("    cliClientID: ").append(toIndentedString(cliClientID)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    idTokenClaims: ").append(toIndentedString(idTokenClaims)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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


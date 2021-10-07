package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * JWTToken holds the issuedAt and expiresAt values of a token
 */
@Schema(description = "JWTToken holds the issuedAt and expiresAt values of a token")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class JWTToken   {
  @JsonProperty("exp")
  private String exp;

  @JsonProperty("iat")
  private String iat;

  @JsonProperty("id")
  private String id;

  public JWTToken exp(String exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Get exp
   * @return exp
  */
 @Schema(defaultValue =  "")
 public String getExp() {
    return exp;
  }

  public void setExp(String exp) {
    this.exp = exp;
  }

  public JWTToken iat(String iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Get iat
   * @return iat
  */
 @Schema(defaultValue =  "")
 public String getIat() {
    return iat;
  }

  public void setIat(String iat) {
    this.iat = iat;
  }

  public JWTToken id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
 @Schema(defaultValue =  "")
 public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTToken JWTToken = (JWTToken) o;
    return Objects.equals(this.exp, JWTToken.exp) &&
        Objects.equals(this.iat, JWTToken.iat) &&
        Objects.equals(this.id, JWTToken.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exp, iat, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTToken {\n");
    
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


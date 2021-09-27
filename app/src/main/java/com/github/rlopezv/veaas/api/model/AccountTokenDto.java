package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountTokenDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class AccountTokenDto   {
  @JsonProperty("expiresAt")
  private String expiresAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("issuedAt")
  private String issuedAt;

  public AccountTokenDto expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  */
 @Schema(defaultValue = "")


  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public AccountTokenDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
 @Schema(defaultValue = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountTokenDto issuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
  */
 @Schema(defaultValue = "")


  public String getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTokenDto accountToken = (AccountTokenDto) o;
    return Objects.equals(this.expiresAt, accountToken.expiresAt) &&
        Objects.equals(this.id, accountToken.id) &&
        Objects.equals(this.issuedAt, accountToken.issuedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, id, issuedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTokenDto {\n");
    
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountCreateTokenRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class AccountCreateTokenRequestDto   {
  @JsonProperty("expiresIn")
  private String expiresIn;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public AccountCreateTokenRequestDto expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * expiresIn represents a duration in seconds
   * @return expiresIn
  */
 @Schema(defaultValue = "expiresIn represents a duration in seconds")


  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  public AccountCreateTokenRequestDto id(String id) {
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

  public AccountCreateTokenRequestDto name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreateTokenRequestDto accountCreateTokenRequest = (AccountCreateTokenRequestDto) o;
    return Objects.equals(this.expiresIn, accountCreateTokenRequest.expiresIn) &&
        Objects.equals(this.id, accountCreateTokenRequest.id) &&
        Objects.equals(this.name, accountCreateTokenRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresIn, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreateTokenRequestDto {\n");
    
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


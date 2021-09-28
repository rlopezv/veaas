package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountAccountDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class AccountAccountDto   {
  @JsonProperty("capabilities")
  @Valid
  private List<String> capabilities = null;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tokens")
  @Valid
  private List<AccountTokenDto> tokens = null;

  public AccountAccountDto capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public AccountAccountDto addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
 @Schema(defaultValue =  "")
 public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public AccountAccountDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
 @Schema(defaultValue =  "")
 public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AccountAccountDto name(String name) {
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

  public AccountAccountDto tokens(List<AccountTokenDto> tokens) {
    this.tokens = tokens;
    return this;
  }

  public AccountAccountDto addTokensItem(AccountTokenDto tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Get tokens
   * @return tokens
  */
 @Schema(defaultValue = "")
  @Valid

  public List<AccountTokenDto> getTokens() {
    return tokens;
  }

  public void setTokens(List<AccountTokenDto> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAccountDto accountAccount = (AccountAccountDto) o;
    return Objects.equals(this.capabilities, accountAccount.capabilities) &&
        Objects.equals(this.enabled, accountAccount.enabled) &&
        Objects.equals(this.name, accountAccount.name) &&
        Objects.equals(this.tokens, accountAccount.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, enabled, name, tokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAccountDto {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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


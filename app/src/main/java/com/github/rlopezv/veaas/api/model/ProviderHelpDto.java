package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Help settings
 */
@Schema(description = "Help settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ProviderHelpDto   {
  @JsonProperty("chatText")
  private String chatText;

  @JsonProperty("chatUrl")
  private String chatUrl;

  public ProviderHelpDto chatText(String chatText) {
    this.chatText = chatText;
    return this;
  }

  /**
   * the text for getting chat help, defaults to \"Chat now!\"
   * @return chatText
  */
 @Schema(defaultValue = "the text for getting chat help, defaults to \"Chat now!\"")


  public String getChatText() {
    return chatText;
  }

  public void setChatText(String chatText) {
    this.chatText = chatText;
  }

  public ProviderHelpDto chatUrl(String chatUrl) {
    this.chatUrl = chatUrl;
    return this;
  }

  /**
   * the URL for getting chat help, this will typically be your Slack channel for support
   * @return chatUrl
  */
 @Schema(defaultValue = "the URL for getting chat help, this will typically be your Slack channel for support")


  public String getChatUrl() {
    return chatUrl;
  }

  public void setChatUrl(String chatUrl) {
    this.chatUrl = chatUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderHelpDto providerHelp = (ProviderHelpDto) o;
    return Objects.equals(this.chatText, providerHelp.chatText) &&
        Objects.equals(this.chatUrl, providerHelp.chatUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatText, chatUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderHelpDto {\n");
    
    sb.append("    chatText: ").append(toIndentedString(chatText)).append("\n");
    sb.append("    chatUrl: ").append(toIndentedString(chatUrl)).append("\n");
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


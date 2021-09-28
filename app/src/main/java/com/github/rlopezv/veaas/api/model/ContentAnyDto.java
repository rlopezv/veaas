package com.github.rlopezv.veaas.api.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ContentAnyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ContentAnyDto   {

  @JsonProperty("type_url")
  private String typeUrl;

  @JsonProperty("value")
  private byte[] value;

  public ContentAnyDto typeUrl(String typeUrl) {
    this.typeUrl = typeUrl;
    return this;
  }

  /**
   * Get typeUrl
   * @return typeUrl
  */
 @Schema(defaultValue = "")
 public String getTypeUrl() {
    return typeUrl;
  }

  public void setTypeUrl(String typeUrl) {
    this.typeUrl = typeUrl;
  }

  public ContentAnyDto value(byte[] value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
 @Schema(defaultValue =  "")
 public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentAnyDto contentAny = (ContentAnyDto) o;
    return Objects.equals(this.typeUrl, contentAny.typeUrl) &&
        Arrays.equals(this.value, contentAny.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeUrl, Arrays.hashCode(value));
  }

   /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ContentAnyDto [typeUrl=").append(typeUrl).append(", value=").append(Arrays.toString(value))
        .append("]");
    return builder.toString();
  }

}


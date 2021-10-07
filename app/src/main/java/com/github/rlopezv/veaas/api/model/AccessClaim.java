package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccessClaim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class AccessClaim  {
  @JsonProperty("essential")
  private Boolean essential;

  @JsonProperty("value")
  private String value;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public AccessClaim essential(Boolean essential) {
    this.essential = essential;
    return this;
  }

  /**
   * Get essential
   * @return essential
  */
 @Schema(defaultValue = "")  public Boolean getEssential() {
    return essential;
  }

  public void setEssential(Boolean essential) {
    this.essential = essential;
  }

  public AccessClaim value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
 @Schema(defaultValue = "")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AccessClaim values(List<String> values) {
    this.values = values;
    return this;
  }

  public AccessClaim addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
 @Schema(defaultValue = "")

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessClaim accessClaim = (AccessClaim) o;
    return Objects.equals(this.essential, accessClaim.essential) &&
        Objects.equals(this.value, accessClaim.value) &&
        Objects.equals(this.values, accessClaim.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(essential, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessClaim {\n");
    
    sb.append("    essential: ").append(toIndentedString(essential)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


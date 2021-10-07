package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ComparedTo contains workSpace source and target which was used for resources comparison
 */
@Schema(description = "ComparedTo contains workSpace source and target which was used for resources comparison")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class ComparedTo   {
  @JsonProperty("destination")
  private WorkSpaceDestination destination;

  @JsonProperty("source")
  private WorkSpaceSource source;

  public ComparedTo destination(WorkSpaceDestination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceDestination getDestination() {
    return destination;
  }

  public void setDestination(WorkSpaceDestination destination) {
    this.destination = destination;
  }

  public ComparedTo source(WorkSpaceSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSource getSource() {
    return source;
  }

  public void setSource(WorkSpaceSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparedTo ComparedTo = (ComparedTo) o;
    return Objects.equals(this.destination, ComparedTo.destination) &&
        Objects.equals(this.source, ComparedTo.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparedTo {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


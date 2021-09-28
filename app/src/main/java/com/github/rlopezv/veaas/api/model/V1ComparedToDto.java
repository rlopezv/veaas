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
public class V1ComparedToDto   {
  @JsonProperty("destination")
  private V1WorkSpaceDestinationDto destination;

  @JsonProperty("source")
  private V1WorkSpaceSourceDto source;

  public V1ComparedToDto destination(V1WorkSpaceDestinationDto destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
 @Schema(defaultValue = "")
  @Valid

  public V1WorkSpaceDestinationDto getDestination() {
    return destination;
  }

  public void setDestination(V1WorkSpaceDestinationDto destination) {
    this.destination = destination;
  }

  public V1ComparedToDto source(V1WorkSpaceSourceDto source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
 @Schema(defaultValue = "")
  @Valid

  public V1WorkSpaceSourceDto getSource() {
    return source;
  }

  public void setSource(V1WorkSpaceSourceDto source) {
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
    V1ComparedToDto v1ComparedTo = (V1ComparedToDto) o;
    return Objects.equals(this.destination, v1ComparedTo.destination) &&
        Objects.equals(this.source, v1ComparedTo.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ComparedToDto {\n");
    
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


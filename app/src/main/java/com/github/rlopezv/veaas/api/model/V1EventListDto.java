package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EventList is a list of events.
 */
@Schema(description = "EventList is a list of events.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1EventListDto   {
  @JsonProperty("items")
  @Valid
  private List<V1EventDto> items = null;

  @JsonProperty("metadata")
  private V1ListMetaDto metadata;

  public V1EventListDto items(List<V1EventDto> items) {
    this.items = items;
    return this;
  }

  public V1EventListDto addItemsItem(V1EventDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of events
   * @return items
  */
 @Schema(defaultValue = "List of events")

  @Valid

  public List<V1EventDto> getItems() {
    return items;
  }

  public void setItems(List<V1EventDto> items) {
    this.items = items;
  }

  public V1EventListDto metadata(V1ListMetaDto metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")
  @Valid

  public V1ListMetaDto getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMetaDto metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventListDto v1EventList = (V1EventListDto) o;
    return Objects.equals(this.items, v1EventList.items) &&
        Objects.equals(this.metadata, v1EventList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventListDto {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


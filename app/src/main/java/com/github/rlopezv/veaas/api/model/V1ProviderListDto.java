package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ProviderList is a collection of Providers.
 */
@Schema(description = "ProviderList is a collection of Providers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ProviderListDto   {
  @JsonProperty("items")
  @Valid
  private List<V1ProviderDto> items = null;

  @JsonProperty("metadata")
  private V1ListMetaDto metadata;

  public V1ProviderListDto items(List<V1ProviderDto> items) {
    this.items = items;
    return this;
  }

  public V1ProviderListDto addItemsItem(V1ProviderDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
 @Schema(defaultValue = "")
  @Valid

  public List<V1ProviderDto> getItems() {
    return items;
  }

  public void setItems(List<V1ProviderDto> items) {
    this.items = items;
  }

  public V1ProviderListDto metadata(V1ListMetaDto metadata) {
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
    V1ProviderListDto v1ProviderList = (V1ProviderListDto) o;
    return Objects.equals(this.items, v1ProviderList.items) &&
        Objects.equals(this.metadata, v1ProviderList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProviderListDto {\n");
    
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


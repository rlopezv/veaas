package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RepositoryList is a collection of Repositories.
 */
@Schema(description = "RepositoryList is a collection of Repositories.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1RepoCredsListDto   {
  @JsonProperty("items")
  @Valid
  private List<V1RepoCredsDto> items = null;

  @JsonProperty("metadata")
  private V1ListMetaDto metadata;

  public V1RepoCredsListDto items(List<V1RepoCredsDto> items) {
    this.items = items;
    return this;
  }

  public V1RepoCredsListDto addItemsItem(V1RepoCredsDto itemsItem) {
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

  public List<V1RepoCredsDto> getItems() {
    return items;
  }

  public void setItems(List<V1RepoCredsDto> items) {
    this.items = items;
  }

  public V1RepoCredsListDto metadata(V1ListMetaDto metadata) {
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
    V1RepoCredsListDto v1RepoCredsList = (V1RepoCredsListDto) o;
    return Objects.equals(this.items, v1RepoCredsList.items) &&
        Objects.equals(this.metadata, v1RepoCredsList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RepoCredsListDto {\n");
    
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


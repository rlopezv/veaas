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
public class RepoCredsList   {
  @JsonProperty("items")
  @Valid
  private List<RepoCreds> items = null;

  @JsonProperty("metadata")
  private ListMeta metadata;

  public RepoCredsList items(List<RepoCreds> items) {
    this.items = items;
    return this;
  }

  public RepoCredsList addItemsItem(RepoCreds itemsItem) {
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

  public List<RepoCreds> getItems() {
    return items;
  }

  public void setItems(List<RepoCreds> items) {
    this.items = items;
  }

  public RepoCredsList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")
  @Valid

  public ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(ListMeta metadata) {
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
    RepoCredsList RepoCredsList = (RepoCredsList) o;
    return Objects.equals(this.items, RepoCredsList.items) &&
        Objects.equals(this.metadata, RepoCredsList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoCredsList {\n");
    
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


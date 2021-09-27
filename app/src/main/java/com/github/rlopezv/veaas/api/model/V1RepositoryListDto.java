package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1ListMetaDto;
import com.github.rlopezv.veaas.api.model.V1RepositoryDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepositoryList is a collection of Repositories
 */
@Schema(description = "RepositoryList is a collection of Repositories")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1RepositoryListDto   {
  @JsonProperty("items")
  @Valid
  private List<V1RepositoryDto> items = null;

  @JsonProperty("metadata")
  private V1ListMetaDto metadata;

  public V1RepositoryListDto items(List<V1RepositoryDto> items) {
    this.items = items;
    return this;
  }

  public V1RepositoryListDto addItemsItem(V1RepositoryDto itemsItem) {
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

  public List<V1RepositoryDto> getItems() {
    return items;
  }

  public void setItems(List<V1RepositoryDto> items) {
    this.items = items;
  }

  public V1RepositoryListDto metadata(V1ListMetaDto metadata) {
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
    V1RepositoryListDto v1RepositoryList = (V1RepositoryListDto) o;
    return Objects.equals(this.items, v1RepositoryList.items) &&
        Objects.equals(this.metadata, v1RepositoryList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RepositoryListDto {\n");
    
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


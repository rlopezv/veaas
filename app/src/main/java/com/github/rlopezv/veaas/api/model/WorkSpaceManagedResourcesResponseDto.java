package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceManagedResourcesResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceManagedResourcesResponseDto   {
  @JsonProperty("items")
  @Valid
  private List<V1ResourceDiffDto> items = null;

  public WorkSpaceManagedResourcesResponseDto items(List<V1ResourceDiffDto> items) {
    this.items = items;
    return this;
  }

  public WorkSpaceManagedResourcesResponseDto addItemsItem(V1ResourceDiffDto itemsItem) {
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

  public List<V1ResourceDiffDto> getItems() {
    return items;
  }

  public void setItems(List<V1ResourceDiffDto> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceManagedResourcesResponseDto workSpaceManagedResourcesResponse = (WorkSpaceManagedResourcesResponseDto) o;
    return Objects.equals(this.items, workSpaceManagedResourcesResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceManagedResourcesResponseDto {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


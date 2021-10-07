package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RepoWorkSpacesResponse contains workSpaces of specified repository
 */
@Schema(description = "RepoWorkSpacesResponse contains workSpaces of specified repository")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RepositoryRepoWorkSpacesResponse   {
  @JsonProperty("items")
  @Valid
  private List<RepositoryWorkSpaceInfo> items = null;

  public RepositoryRepoWorkSpacesResponse items(List<RepositoryWorkSpaceInfo> items) {
    this.items = items;
    return this;
  }

  public RepositoryRepoWorkSpacesResponse addItemsItem(RepositoryWorkSpaceInfo itemsItem) {
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

  public List<RepositoryWorkSpaceInfo> getItems() {
    return items;
  }

  public void setItems(List<RepositoryWorkSpaceInfo> items) {
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
    RepositoryRepoWorkSpacesResponse repositoryRepoWorkSpacesResponse = (RepositoryRepoWorkSpacesResponse) o;
    return Objects.equals(this.items, repositoryRepoWorkSpacesResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRepoWorkSpacesResponse {\n");
    
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


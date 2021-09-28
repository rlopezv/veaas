package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A subset of the repository&#39;s named refs
 */
@Schema(description = "A subset of the repository's named refs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class RepositoryRefsDto   {
  @JsonProperty("branches")
  @Valid
  private List<String> branches = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public RepositoryRefsDto branches(List<String> branches) {
    this.branches = branches;
    return this;
  }

  public RepositoryRefsDto addBranchesItem(String branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * Get branches
   * @return branches
  */
 @Schema(defaultValue =  "")
 public List<String> getBranches() {
    return branches;
  }

  public void setBranches(List<String> branches) {
    this.branches = branches;
  }

  public RepositoryRefsDto tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RepositoryRefsDto addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
 @Schema(defaultValue =  "")
 public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryRefsDto repositoryRefs = (RepositoryRefsDto) o;
    return Objects.equals(this.branches, repositoryRefs.branches) &&
        Objects.equals(this.tags, repositoryRefs.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryRefsDto {\n");
    
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


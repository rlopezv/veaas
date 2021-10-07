package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpaceSummary contains information about URLs and container images used by an workSpace
 */
@Schema(description = "WorkSpaceSummary contains information about URLs and container images used by an workSpace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpaceSummary   {
  @JsonProperty("externalURLs")
  @Valid
  private List<String> externalURLs = null;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  public WorkSpaceSummary externalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
    return this;
  }

  public WorkSpaceSummary addExternalURLsItem(String externalURLsItem) {
    if (this.externalURLs == null) {
      this.externalURLs = new ArrayList<>();
    }
    this.externalURLs.add(externalURLsItem);
    return this;
  }

  /**
   * ExternalURLs holds all external URLs of workSpace child resources.
   * @return externalURLs
  */
 @Schema(defaultValue = "ExternalURLs holds all external URLs of workSpace child resources.")


  public List<String> getExternalURLs() {
    return externalURLs;
  }

  public void setExternalURLs(List<String> externalURLs) {
    this.externalURLs = externalURLs;
  }

  public WorkSpaceSummary images(List<String> images) {
    this.images = images;
    return this;
  }

  public WorkSpaceSummary addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Images holds all images of workSpace child resources.
   * @return images
  */
 @Schema(defaultValue = "Images holds all images of workSpace child resources.")


  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSpaceSummary WorkSpaceSummary = (WorkSpaceSummary) o;
    return Objects.equals(this.externalURLs, WorkSpaceSummary.externalURLs) &&
        Objects.equals(this.images, WorkSpaceSummary.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalURLs, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpaceSummary {\n");
    
    sb.append("    externalURLs: ").append(toIndentedString(externalURLs)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1TimeDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RevisionMetadata contains metadata for a specific revision in a Git repository
 */
@Schema(description = "RevisionMetadata contains metadata for a specific revision in a Git repository")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1RevisionMetadataDto   {
  @JsonProperty("author")
  private String author;

  @JsonProperty("date")
  private V1TimeDto date;

  @JsonProperty("message")
  private String message;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public V1RevisionMetadataDto author(String author) {
    this.author = author;
    return this;
  }

  /**
   * who authored this revision, typically their name and email, e.g. \"John Doe <john_doe@my-company.com>\",
   * @return author
  */
 @Schema(defaultValue = "who authored this revision, typically their name and email, e.g. \"John Doe <john_doe@my-company.com>\",")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public V1RevisionMetadataDto date(V1TimeDto date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getDate() {
    return date;
  }

  public void setDate(V1TimeDto date) {
    this.date = date;
  }

  public V1RevisionMetadataDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message contains the message associated with the revision, most likely the commit message. The message is truncated to the first newline or 64 characters (which ever comes first)
   * @return message
  */
 @Schema(defaultValue = "Message contains the message associated with the revision, most likely the commit message. The message is truncated to the first newline or 64 characters (which ever comes first)")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1RevisionMetadataDto tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public V1RevisionMetadataDto addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags specifies any tags currently attached to the revision Floating tags can move from one revision to another
   * @return tags
  */
 @Schema(defaultValue = "Tags specifies any tags currently attached to the revision Floating tags can move from one revision to another")


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
    V1RevisionMetadataDto v1RevisionMetadata = (V1RevisionMetadataDto) o;
    return Objects.equals(this.author, v1RevisionMetadata.author) &&
        Objects.equals(this.date, v1RevisionMetadata.date) &&
        Objects.equals(this.message, v1RevisionMetadata.message) &&
        Objects.equals(this.tags, v1RevisionMetadata.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, date, message, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RevisionMetadataDto {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


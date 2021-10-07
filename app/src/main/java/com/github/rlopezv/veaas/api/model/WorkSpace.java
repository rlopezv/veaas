package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkSpace description. Includes all information regarding contents
 */
@Schema(description = "WorkSpace description. Includes all information regarding contents")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class WorkSpace   {
  @JsonProperty("metadata")
  private ObjectMeta metadata;

  @JsonProperty("operation")
  private Operation operation;

  @JsonProperty("spec")
  private WorkSpaceSpec spec;

  @JsonProperty("status")
  private WorkSpaceStatus status;

  @JsonProperty("items")
  @Valid
  private List<Resource> items = null;

  public WorkSpace metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")
  @Valid

  public ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public WorkSpace operation(Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
 @Schema(defaultValue = "")
  @Valid

  public Operation getOperation() {
    return operation;
  }

  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  public WorkSpace spec(WorkSpaceSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceSpec getSpec() {
    return spec;
  }

  public void setSpec(WorkSpaceSpec spec) {
    this.spec = spec;
  }

  public WorkSpace status(WorkSpaceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
 @Schema(defaultValue = "")
  @Valid

  public WorkSpaceStatus getStatus() {
    return status;
  }

  public void setStatus(WorkSpaceStatus status) {
    this.status = status;
  }

  public WorkSpace items(List<Resource> items) {
    this.items = items;
    return this;
  }

  public WorkSpace addItemsItem(Resource itemsItem) {
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

  public List<Resource> getItems() {
    return items;
  }

  public void setItems(List<Resource> items) {
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
    WorkSpace WorkSpace = (WorkSpace) o;
    return Objects.equals(this.metadata, WorkSpace.metadata) &&
        Objects.equals(this.operation, WorkSpace.operation) &&
        Objects.equals(this.spec, WorkSpace.spec) &&
        Objects.equals(this.status, WorkSpace.status) &&
        Objects.equals(this.items, WorkSpace.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, operation, spec, status, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSpace {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


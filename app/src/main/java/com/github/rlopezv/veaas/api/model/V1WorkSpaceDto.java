package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1ObjectMetaDto;
import com.github.rlopezv.veaas.api.model.V1OperationDto;
import com.github.rlopezv.veaas.api.model.V1ResourceDto;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceSpecDto;
import com.github.rlopezv.veaas.api.model.V1WorkSpaceStatusDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkSpace description. Includes all information regarding contents
 */
@Schema(description = "WorkSpace description. Includes all information regarding contents")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1WorkSpaceDto   {
  @JsonProperty("metadata")
  private V1ObjectMetaDto metadata;

  @JsonProperty("operation")
  private V1OperationDto operation;

  @JsonProperty("spec")
  private V1WorkSpaceSpecDto spec;

  @JsonProperty("status")
  private V1WorkSpaceStatusDto status;

  @JsonProperty("items")
  @Valid
  private List<V1ResourceDto> items = null;

  public V1WorkSpaceDto metadata(V1ObjectMetaDto metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
 @Schema(defaultValue = "")

  @Valid

  public V1ObjectMetaDto getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMetaDto metadata) {
    this.metadata = metadata;
  }

  public V1WorkSpaceDto operation(V1OperationDto operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
 @Schema(defaultValue = "")

  @Valid

  public V1OperationDto getOperation() {
    return operation;
  }

  public void setOperation(V1OperationDto operation) {
    this.operation = operation;
  }

  public V1WorkSpaceDto spec(V1WorkSpaceSpecDto spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
 @Schema(defaultValue = "")

  @Valid

  public V1WorkSpaceSpecDto getSpec() {
    return spec;
  }

  public void setSpec(V1WorkSpaceSpecDto spec) {
    this.spec = spec;
  }

  public V1WorkSpaceDto status(V1WorkSpaceStatusDto status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
 @Schema(defaultValue = "")

  @Valid

  public V1WorkSpaceStatusDto getStatus() {
    return status;
  }

  public void setStatus(V1WorkSpaceStatusDto status) {
    this.status = status;
  }

  public V1WorkSpaceDto items(List<V1ResourceDto> items) {
    this.items = items;
    return this;
  }

  public V1WorkSpaceDto addItemsItem(V1ResourceDto itemsItem) {
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

  public List<V1ResourceDto> getItems() {
    return items;
  }

  public void setItems(List<V1ResourceDto> items) {
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
    V1WorkSpaceDto v1WorkSpace = (V1WorkSpaceDto) o;
    return Objects.equals(this.metadata, v1WorkSpace.metadata) &&
        Objects.equals(this.operation, v1WorkSpace.operation) &&
        Objects.equals(this.spec, v1WorkSpace.spec) &&
        Objects.equals(this.status, v1WorkSpace.status) &&
        Objects.equals(this.items, v1WorkSpace.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, operation, spec, status, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkSpaceDto {\n");
    
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


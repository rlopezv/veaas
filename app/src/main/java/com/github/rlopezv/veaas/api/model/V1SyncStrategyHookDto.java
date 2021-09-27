package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1SyncStrategyApplyDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncStrategyHook will perform a sync using hooks annotations.
 */
@Schema(description = "SyncStrategyHook will perform a sync using hooks annotations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1SyncStrategyHookDto   {
  @JsonProperty("syncStrategyApply")
  private V1SyncStrategyApplyDto syncStrategyApply;

  public V1SyncStrategyHookDto syncStrategyApply(V1SyncStrategyApplyDto syncStrategyApply) {
    this.syncStrategyApply = syncStrategyApply;
    return this;
  }

  /**
   * Get syncStrategyApply
   * @return syncStrategyApply
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncStrategyApplyDto getSyncStrategyApply() {
    return syncStrategyApply;
  }

  public void setSyncStrategyApply(V1SyncStrategyApplyDto syncStrategyApply) {
    this.syncStrategyApply = syncStrategyApply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyncStrategyHookDto v1SyncStrategyHook = (V1SyncStrategyHookDto) o;
    return Objects.equals(this.syncStrategyApply, v1SyncStrategyHook.syncStrategyApply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncStrategyApply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncStrategyHookDto {\n");
    
    sb.append("    syncStrategyApply: ").append(toIndentedString(syncStrategyApply)).append("\n");
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


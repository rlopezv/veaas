package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SyncStrategyHook will perform a sync using hooks annotations.
 */
@Schema(description = "SyncStrategyHook will perform a sync using hooks annotations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class SyncStrategyHook   {
  @JsonProperty("syncStrategyApply")
  private SyncStrategyApply syncStrategyApply;

  public SyncStrategyHook syncStrategyApply(SyncStrategyApply syncStrategyApply) {
    this.syncStrategyApply = syncStrategyApply;
    return this;
  }

  /**
   * Get syncStrategyApply
   * @return syncStrategyApply
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncStrategyApply getSyncStrategyApply() {
    return syncStrategyApply;
  }

  public void setSyncStrategyApply(SyncStrategyApply syncStrategyApply) {
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
    SyncStrategyHook SyncStrategyHook = (SyncStrategyHook) o;
    return Objects.equals(this.syncStrategyApply, SyncStrategyHook.syncStrategyApply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncStrategyApply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStrategyHook {\n");
    
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SyncStrategy controls the manner in which a sync is performed
 */
@Schema(description = "SyncStrategy controls the manner in which a sync is performed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class SyncStrategy   {
  @JsonProperty("apply")
  private SyncStrategyApply apply;

  @JsonProperty("hook")
  private SyncStrategyHook hook;

  public SyncStrategy apply(SyncStrategyApply apply) {
    this.apply = apply;
    return this;
  }

  /**
   * Get apply
   * @return apply
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncStrategyApply getApply() {
    return apply;
  }

  public void setApply(SyncStrategyApply apply) {
    this.apply = apply;
  }

  public SyncStrategy hook(SyncStrategyHook hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
  */
 @Schema(defaultValue = "")
  @Valid

  public SyncStrategyHook getHook() {
    return hook;
  }

  public void setHook(SyncStrategyHook hook) {
    this.hook = hook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncStrategy SyncStrategy = (SyncStrategy) o;
    return Objects.equals(this.apply, SyncStrategy.apply) &&
        Objects.equals(this.hook, SyncStrategy.hook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apply, hook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStrategy {\n");
    
    sb.append("    apply: ").append(toIndentedString(apply)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
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


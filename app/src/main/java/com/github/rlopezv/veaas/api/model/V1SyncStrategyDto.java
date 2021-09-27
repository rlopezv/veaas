package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1SyncStrategyApplyDto;
import com.github.rlopezv.veaas.api.model.V1SyncStrategyHookDto;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncStrategy controls the manner in which a sync is performed
 */
@Schema(description = "SyncStrategy controls the manner in which a sync is performed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1SyncStrategyDto   {
  @JsonProperty("apply")
  private V1SyncStrategyApplyDto apply;

  @JsonProperty("hook")
  private V1SyncStrategyHookDto hook;

  public V1SyncStrategyDto apply(V1SyncStrategyApplyDto apply) {
    this.apply = apply;
    return this;
  }

  /**
   * Get apply
   * @return apply
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncStrategyApplyDto getApply() {
    return apply;
  }

  public void setApply(V1SyncStrategyApplyDto apply) {
    this.apply = apply;
  }

  public V1SyncStrategyDto hook(V1SyncStrategyHookDto hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
  */
 @Schema(defaultValue = "")

  @Valid

  public V1SyncStrategyHookDto getHook() {
    return hook;
  }

  public void setHook(V1SyncStrategyHookDto hook) {
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
    V1SyncStrategyDto v1SyncStrategy = (V1SyncStrategyDto) o;
    return Objects.equals(this.apply, v1SyncStrategy.apply) &&
        Objects.equals(this.hook, v1SyncStrategy.hook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apply, hook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncStrategyDto {\n");
    
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SyncStrategyApply uses &#x60;kubectl apply&#x60; to perform the apply
 */
@Schema(description = "SyncStrategyApply uses `kubectl apply` to perform the apply")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1SyncStrategyApplyDto   {
  @JsonProperty("force")
  private Boolean force;

  public V1SyncStrategyApplyDto force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * The --force flag deletes and re-create the resource, when PATCH encounters conflict and has retried for 5 times.
   * @return force
  */
 @Schema(defaultValue = "The --force flag deletes and re-create the resource, when PATCH encounters conflict and has retried for 5 times.")


  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyncStrategyApplyDto v1SyncStrategyApply = (V1SyncStrategyApplyDto) o;
    return Objects.equals(this.force, v1SyncStrategyApply.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyncStrategyApplyDto {\n");
    
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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


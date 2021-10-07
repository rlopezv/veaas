package com.github.rlopezv.veaas.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SyncPolicyAutomated controls the behavior of an automated sync
 */
@Schema(description = "SyncPolicyAutomated controls the behavior of an automated sync")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class SyncPolicyAutomated   {
  @JsonProperty("allowEmpty")
  private Boolean allowEmpty;

  @JsonProperty("prune")
  private Boolean prune;

  @JsonProperty("selfHeal")
  private Boolean selfHeal;

  public SyncPolicyAutomated allowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

  /**
   * AllowEmpty allows workSpaces have zero live resources (default: false)
   * @return allowEmpty
  */
 @Schema(defaultValue = "AllowEmpty allows workSpaces have zero live resources (default: false)")


  public Boolean getAllowEmpty() {
    return allowEmpty;
  }

  public void setAllowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public SyncPolicyAutomated prune(Boolean prune) {
    this.prune = prune;
    return this;
  }

  /**
   * Prune specifies whether to delete resources from the provider that are not found in the sources anymore as part of automated sync (default: false)
   * @return prune
  */
 @Schema(defaultValue = "Prune specifies whether to delete resources from the provider that are not found in the sources anymore as part of automated sync (default: false)")


  public Boolean getPrune() {
    return prune;
  }

  public void setPrune(Boolean prune) {
    this.prune = prune;
  }

  public SyncPolicyAutomated selfHeal(Boolean selfHeal) {
    this.selfHeal = selfHeal;
    return this;
  }

  /**
   * SelfHeal specifes whether to revert resources back to their desired state upon modification in the provider (default: false)
   * @return selfHeal
  */
 @Schema(defaultValue = "SelfHeal specifes whether to revert resources back to their desired state upon modification in the provider (default: false)")


  public Boolean getSelfHeal() {
    return selfHeal;
  }

  public void setSelfHeal(Boolean selfHeal) {
    this.selfHeal = selfHeal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncPolicyAutomated SyncPolicyAutomated = (SyncPolicyAutomated) o;
    return Objects.equals(this.allowEmpty, SyncPolicyAutomated.allowEmpty) &&
        Objects.equals(this.prune, SyncPolicyAutomated.prune) &&
        Objects.equals(this.selfHeal, SyncPolicyAutomated.selfHeal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, prune, selfHeal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncPolicyAutomated {\n");
    
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
    sb.append("    selfHeal: ").append(toIndentedString(selfHeal)).append("\n");
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


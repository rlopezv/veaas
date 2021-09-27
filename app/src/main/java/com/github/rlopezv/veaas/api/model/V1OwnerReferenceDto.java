package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be provider-scoped, so there is no namespace field.
 */
@Schema(description = "OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be provider-scoped, so there is no namespace field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1OwnerReferenceDto   {
  @JsonProperty("apiVersion")
  private String apiVersion;

  @JsonProperty("blockOwnerDeletion")
  private Boolean blockOwnerDeletion;

  @JsonProperty("controller")
  private Boolean controller;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("name")
  private String name;

  @JsonProperty("uid")
  private String uid;

  public V1OwnerReferenceDto apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version of the referent.
   * @return apiVersion
  */
 @Schema(defaultValue = "API version of the referent.")


  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1OwnerReferenceDto blockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

  /**
   * If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
   * @return blockOwnerDeletion
  */
 @Schema(defaultValue = "If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional")


  public Boolean getBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }

  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }

  public V1OwnerReferenceDto controller(Boolean controller) {
    this.controller = controller;
    return this;
  }

  /**
   * If true, this reference points to the managing controller. +optional
   * @return controller
  */
 @Schema(defaultValue = "If true, this reference points to the managing controller. +optional")


  public Boolean getController() {
    return controller;
  }

  public void setController(Boolean controller) {
    this.controller = controller;
  }

  public V1OwnerReferenceDto kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  */
 @Schema(defaultValue = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1OwnerReferenceDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  */
 @Schema(defaultValue = "Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1OwnerReferenceDto uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  */
 @Schema(defaultValue = "UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OwnerReferenceDto v1OwnerReference = (V1OwnerReferenceDto) o;
    return Objects.equals(this.apiVersion, v1OwnerReference.apiVersion) &&
        Objects.equals(this.blockOwnerDeletion, v1OwnerReference.blockOwnerDeletion) &&
        Objects.equals(this.controller, v1OwnerReference.controller) &&
        Objects.equals(this.kind, v1OwnerReference.kind) &&
        Objects.equals(this.name, v1OwnerReference.name) &&
        Objects.equals(this.uid, v1OwnerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OwnerReferenceDto {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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


package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ObjectReference contains enough information to let you inspect or modify the referred object.
 */
@Schema(description = "ObjectReference contains enough information to let you inspect or modify the referred object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ObjectReferenceDto   {
  @JsonProperty("apiVersion")
  private String apiVersion;

  @JsonProperty("fieldPath")
  private String fieldPath;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("resourceVersion")
  private String resourceVersion;

  @JsonProperty("uid")
  private String uid;

  public V1ObjectReferenceDto apiVersion(String apiVersion) {
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

  public V1ObjectReferenceDto fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * If referring to a piece of an object instead of an entire object
   * @return fieldPath
  */
 @Schema(defaultValue = "If referring to a piece of an object instead of an entire object")


  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public V1ObjectReferenceDto kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
   * @return kind
  */
 @Schema(defaultValue = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ObjectReferenceDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names +optional
   * @return name
  */
 @Schema(defaultValue = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names +optional")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ObjectReferenceDto namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/ +optional
   * @return namespace
  */
 @Schema(defaultValue = "Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/ +optional")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ObjectReferenceDto resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency +optional
   * @return resourceVersion
  */
 @Schema(defaultValue = "Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency +optional")


  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ObjectReferenceDto uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids +optional
   * @return uid
  */
 @Schema(defaultValue = "UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids +optional")


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
    V1ObjectReferenceDto v1ObjectReference = (V1ObjectReferenceDto) o;
    return Objects.equals(this.apiVersion, v1ObjectReference.apiVersion) &&
        Objects.equals(this.fieldPath, v1ObjectReference.fieldPath) &&
        Objects.equals(this.kind, v1ObjectReference.kind) &&
        Objects.equals(this.name, v1ObjectReference.name) &&
        Objects.equals(this.namespace, v1ObjectReference.namespace) &&
        Objects.equals(this.resourceVersion, v1ObjectReference.resourceVersion) &&
        Objects.equals(this.uid, v1ObjectReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath, kind, name, namespace, resourceVersion, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectReferenceDto {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
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


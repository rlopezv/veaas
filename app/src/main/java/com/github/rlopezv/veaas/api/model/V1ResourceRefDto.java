package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceRef includes fields which uniquely identify a resource
 */
@Schema(description = "ResourceRef includes fields which uniquely identify a resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ResourceRefDto   {
  @JsonProperty("group")
  private String group;

  @JsonProperty("kind")
  private String kind;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("uid")
  private String uid;

  @JsonProperty("version")
  private String version;

  public V1ResourceRefDto group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
 @Schema(defaultValue = "")


  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1ResourceRefDto kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
 @Schema(defaultValue = "")


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ResourceRefDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ResourceRefDto namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
 @Schema(defaultValue = "")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ResourceRefDto uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
  */
 @Schema(defaultValue = "")


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1ResourceRefDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
 @Schema(defaultValue = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRefDto v1ResourceRef = (V1ResourceRefDto) o;
    return Objects.equals(this.group, v1ResourceRef.group) &&
        Objects.equals(this.kind, v1ResourceRef.kind) &&
        Objects.equals(this.name, v1ResourceRef.name) &&
        Objects.equals(this.namespace, v1ResourceRef.namespace) &&
        Objects.equals(this.uid, v1ResourceRef.uid) &&
        Objects.equals(this.version, v1ResourceRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name, namespace, uid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRefDto {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


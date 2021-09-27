package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1OwnerReferenceDto;
import com.github.rlopezv.veaas.api.model.V1TimeDto;import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
@Schema(description = "ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ObjectMetaDto   {
  @JsonProperty("annotations")
  @Valid
  private Map<String, String> annotations = null;

  @JsonProperty("creationTimestamp")
  private V1TimeDto creationTimestamp;

  @JsonProperty("deletionGracePeriodSeconds")
  private String deletionGracePeriodSeconds;

  @JsonProperty("deletionTimestamp")
  private V1TimeDto deletionTimestamp;

  @JsonProperty("finalizers")
  @Valid
  private List<String> finalizers = null;

  @JsonProperty("generateName")
  private String generateName;

  @JsonProperty("generation")
  private String generation;

  @JsonProperty("labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("namespace")
  private String namespace;

  @JsonProperty("ownerReferences")
  @Valid
  private List<V1OwnerReferenceDto> ownerReferences = null;

  @JsonProperty("resourceVersion")
  private String resourceVersion;

  @JsonProperty("uid")
  private String uid;

  public V1ObjectMetaDto annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public V1ObjectMetaDto putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects.
   * @return annotations
  */
 @Schema(defaultValue = "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects.")


  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1ObjectMetaDto creationTimestamp(V1TimeDto creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Get creationTimestamp
   * @return creationTimestamp
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(V1TimeDto creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public V1ObjectMetaDto deletionGracePeriodSeconds(String deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

  /**
   * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only. +optional
   * @return deletionGracePeriodSeconds
  */
 @Schema(defaultValue = "Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only. +optional")


  public String getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }

  public void setDeletionGracePeriodSeconds(String deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
  }

  public V1ObjectMetaDto deletionTimestamp(V1TimeDto deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

  /**
   * Get deletionTimestamp
   * @return deletionTimestamp
  */
 @Schema(defaultValue = "")

  @Valid

  public V1TimeDto getDeletionTimestamp() {
    return deletionTimestamp;
  }

  public void setDeletionTimestamp(V1TimeDto deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
  }

  public V1ObjectMetaDto finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public V1ObjectMetaDto addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

  /**
   * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list. +optional +patchStrategy=merge
   * @return finalizers
  */
 @Schema(defaultValue = "Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list. +optional +patchStrategy=merge")


  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  public V1ObjectMetaDto generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

  /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
   * @return generateName
  */
 @Schema(defaultValue = "GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.")


  public String getGenerateName() {
    return generateName;
  }

  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }

  public V1ObjectMetaDto generation(String generation) {
    this.generation = generation;
    return this;
  }

  /**
   * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only. +optional
   * @return generation
  */
 @Schema(defaultValue = "A sequence number representing a specific generation of the desired state. Populated by the system. Read-only. +optional")


  public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }

  public V1ObjectMetaDto labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ObjectMetaDto putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.
   * @return labels
  */
 @Schema(defaultValue = "Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services.")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1ObjectMetaDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional
   * @return name
  */
 @Schema(defaultValue = "Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ObjectMetaDto namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty. Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces +optional
   * @return namespace
  */
 @Schema(defaultValue = "Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty. Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces +optional")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ObjectMetaDto ownerReferences(List<V1OwnerReferenceDto> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  public V1ObjectMetaDto addOwnerReferencesItem(V1OwnerReferenceDto ownerReferencesItem) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList<>();
    }
    this.ownerReferences.add(ownerReferencesItem);
    return this;
  }

  /**
   * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller. +optional +patchMergeKey=uid +patchStrategy=merge
   * @return ownerReferences
  */
 @Schema(defaultValue = "List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller. +optional +patchMergeKey=uid +patchStrategy=merge")

  @Valid

  public List<V1OwnerReferenceDto> getOwnerReferences() {
    return ownerReferences;
  }

  public void setOwnerReferences(List<V1OwnerReferenceDto> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }

  public V1ObjectMetaDto resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system.
   * @return resourceVersion
  */
 @Schema(defaultValue = "An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system.")


  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ObjectMetaDto uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only.
   * @return uid
  */
 @Schema(defaultValue = "UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only.")


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
    V1ObjectMetaDto v1ObjectMeta = (V1ObjectMetaDto) o;
    return Objects.equals(this.annotations, v1ObjectMeta.annotations) &&
        Objects.equals(this.creationTimestamp, v1ObjectMeta.creationTimestamp) &&
        Objects.equals(this.deletionGracePeriodSeconds, v1ObjectMeta.deletionGracePeriodSeconds) &&
        Objects.equals(this.deletionTimestamp, v1ObjectMeta.deletionTimestamp) &&
        Objects.equals(this.finalizers, v1ObjectMeta.finalizers) &&
        Objects.equals(this.generateName, v1ObjectMeta.generateName) &&
        Objects.equals(this.generation, v1ObjectMeta.generation) &&
        Objects.equals(this.labels, v1ObjectMeta.labels) &&
        Objects.equals(this.name, v1ObjectMeta.name) &&
        Objects.equals(this.namespace, v1ObjectMeta.namespace) &&
        Objects.equals(this.ownerReferences, v1ObjectMeta.ownerReferences) &&
        Objects.equals(this.resourceVersion, v1ObjectMeta.resourceVersion) &&
        Objects.equals(this.uid, v1ObjectMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, name, namespace, ownerReferences, resourceVersion, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectMetaDto {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
    sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
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


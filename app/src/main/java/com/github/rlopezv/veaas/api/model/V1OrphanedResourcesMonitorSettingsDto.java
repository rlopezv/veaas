package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.rlopezv.veaas.api.model.V1OrphanedResourceKeyDto;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrphanedResourcesMonitorSettings holds settings of orphaned resources monitoring
 */
@Schema(description = "OrphanedResourcesMonitorSettings holds settings of orphaned resources monitoring")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1OrphanedResourcesMonitorSettingsDto   {
  @JsonProperty("ignore")
  @Valid
  private List<V1OrphanedResourceKeyDto> ignore = null;

  @JsonProperty("warn")
  private Boolean warn;

  public V1OrphanedResourcesMonitorSettingsDto ignore(List<V1OrphanedResourceKeyDto> ignore) {
    this.ignore = ignore;
    return this;
  }

  public V1OrphanedResourcesMonitorSettingsDto addIgnoreItem(V1OrphanedResourceKeyDto ignoreItem) {
    if (this.ignore == null) {
      this.ignore = new ArrayList<>();
    }
    this.ignore.add(ignoreItem);
    return this;
  }

  /**
   * Ignore contains a list of resources that are to be excluded from orphaned resources monitoring
   * @return ignore
  */
 @Schema(defaultValue = "Ignore contains a list of resources that are to be excluded from orphaned resources monitoring")

  @Valid

  public List<V1OrphanedResourceKeyDto> getIgnore() {
    return ignore;
  }

  public void setIgnore(List<V1OrphanedResourceKeyDto> ignore) {
    this.ignore = ignore;
  }

  public V1OrphanedResourcesMonitorSettingsDto warn(Boolean warn) {
    this.warn = warn;
    return this;
  }

  /**
   * Warn indicates if warning condition should be created for workSpaces which have orphaned resources
   * @return warn
  */
 @Schema(defaultValue = "Warn indicates if warning condition should be created for workSpaces which have orphaned resources")


  public Boolean getWarn() {
    return warn;
  }

  public void setWarn(Boolean warn) {
    this.warn = warn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OrphanedResourcesMonitorSettingsDto v1OrphanedResourcesMonitorSettings = (V1OrphanedResourcesMonitorSettingsDto) o;
    return Objects.equals(this.ignore, v1OrphanedResourcesMonitorSettings.ignore) &&
        Objects.equals(this.warn, v1OrphanedResourcesMonitorSettings.warn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignore, warn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OrphanedResourcesMonitorSettingsDto {\n");
    
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
    sb.append("    warn: ").append(toIndentedString(warn)).append("\n");
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


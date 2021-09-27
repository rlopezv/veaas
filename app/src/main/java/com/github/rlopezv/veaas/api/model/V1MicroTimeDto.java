package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MicroTime is version of Time with microsecond level precision.
 */
@Schema(description = "MicroTime is version of Time with microsecond level precision.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1MicroTimeDto   {
  @JsonProperty("nanos")
  private Integer nanos;

  @JsonProperty("seconds")
  private String seconds;

  public V1MicroTimeDto nanos(Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.
   * @return nanos
  */
 @Schema(defaultValue = "Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.")


  public Integer getNanos() {
    return nanos;
  }

  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }

  public V1MicroTimeDto seconds(String seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.
   * @return seconds
  */
 @Schema(defaultValue = "Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.")


  public String getSeconds() {
    return seconds;
  }

  public void setSeconds(String seconds) {
    this.seconds = seconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MicroTimeDto v1MicroTime = (V1MicroTimeDto) o;
    return Objects.equals(this.nanos, v1MicroTime.nanos) &&
        Objects.equals(this.seconds, v1MicroTime.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanos, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MicroTimeDto {\n");
    
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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


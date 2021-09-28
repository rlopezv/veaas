package com.github.rlopezv.veaas.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Command holds binary path and arguments list
 */
@Schema(description = "Command holds binary path and arguments list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1CommandDto   {
  @JsonProperty("args")
  @Valid
  private List<String> args = null;

  @JsonProperty("command")
  @Valid
  private List<String> command = null;

  public V1CommandDto args(List<String> args) {
    this.args = args;
    return this;
  }

  public V1CommandDto addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
  */
 @Schema(defaultValue =  "")
 public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public V1CommandDto command(List<String> command) {
    this.command = command;
    return this;
  }

  public V1CommandDto addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Get command
   * @return command
  */
 @Schema(defaultValue =  "")
 public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CommandDto v1Command = (V1CommandDto) o;
    return Objects.equals(this.args, v1Command.args) &&
        Objects.equals(this.command, v1Command.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CommandDto {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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


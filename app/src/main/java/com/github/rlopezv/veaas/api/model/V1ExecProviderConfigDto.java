package com.github.rlopezv.veaas.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecProviderConfig is config used to call an external command to perform provider authentication
 */
@Schema(description = "ExecProviderConfig is config used to call an external command to perform provider authentication")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-26T12:04:00.942225+02:00[Europe/Madrid]")
public class V1ExecProviderConfigDto   {
  @JsonProperty("apiVersion")
  private String apiVersion;

  @JsonProperty("args")
  @Valid
  private List<String> args = null;

  @JsonProperty("command")
  private String command;

  @JsonProperty("env")
  @Valid
  private Map<String, String> env = null;

  @JsonProperty("installHint")
  private String installHint;

  public V1ExecProviderConfigDto apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Preferred input version of the ExecInfo
   * @return apiVersion
  */
 @Schema(defaultValue = "Preferred input version of the ExecInfo")


  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ExecProviderConfigDto args(List<String> args) {
    this.args = args;
    return this;
  }

  public V1ExecProviderConfigDto addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Arguments to pass to the command when executing it
   * @return args
  */
 @Schema(defaultValue = "Arguments to pass to the command when executing it")


  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public V1ExecProviderConfigDto command(String command) {
    this.command = command;
    return this;
  }

  /**
   * Command to execute
   * @return command
  */
 @Schema(defaultValue = "Command to execute")


  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public V1ExecProviderConfigDto env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public V1ExecProviderConfigDto putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<>();
    }
    this.env.put(key, envItem);
    return this;
  }

  /**
   * Env defines additional workSpace variables to expose to the process
   * @return env
  */
 @Schema(defaultValue = "Env defines additional workSpace variables to expose to the process")


  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public V1ExecProviderConfigDto installHint(String installHint) {
    this.installHint = installHint;
    return this;
  }

  /**
   * This text is shown to the user when the executable doesn't seem to be present
   * @return installHint
  */
 @Schema(defaultValue = "This text is shown to the user when the executable doesn't seem to be present")


  public String getInstallHint() {
    return installHint;
  }

  public void setInstallHint(String installHint) {
    this.installHint = installHint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ExecProviderConfigDto v1ExecProviderConfig = (V1ExecProviderConfigDto) o;
    return Objects.equals(this.apiVersion, v1ExecProviderConfig.apiVersion) &&
        Objects.equals(this.args, v1ExecProviderConfig.args) &&
        Objects.equals(this.command, v1ExecProviderConfig.command) &&
        Objects.equals(this.env, v1ExecProviderConfig.env) &&
        Objects.equals(this.installHint, v1ExecProviderConfig.installHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, args, command, env, installHint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ExecProviderConfigDto {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    installHint: ").append(toIndentedString(installHint)).append("\n");
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


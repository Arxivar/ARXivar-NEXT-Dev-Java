/*
 * Abletech.Arxivar.Server.WebApi.Services
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Command operation for TaskWork
 */
@ApiModel(description = "Command operation for TaskWork")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TaskWorkCommandDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("processId")
  private Integer processId = null;

  @SerializedName("taskWorkId")
  private Integer taskWorkId = null;

  @SerializedName("command")
  private String command = null;

  @SerializedName("isRequired")
  private Boolean isRequired = null;

  @SerializedName("isAsync")
  private Boolean isAsync = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("side")
  private Integer side = null;

  @SerializedName("isExecuted")
  private Boolean isExecuted = null;

  public TaskWorkCommandDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Command Id.
   * @return id
  **/
  @ApiModelProperty(value = "Command Id.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TaskWorkCommandDTO processId(Integer processId) {
    this.processId = processId;
    return this;
  }

   /**
   * Process Id.
   * @return processId
  **/
  @ApiModelProperty(value = "Process Id.")
  public Integer getProcessId() {
    return processId;
  }

  public void setProcessId(Integer processId) {
    this.processId = processId;
  }

  public TaskWorkCommandDTO taskWorkId(Integer taskWorkId) {
    this.taskWorkId = taskWorkId;
    return this;
  }

   /**
   * TaskWork Id.
   * @return taskWorkId
  **/
  @ApiModelProperty(value = "TaskWork Id.")
  public Integer getTaskWorkId() {
    return taskWorkId;
  }

  public void setTaskWorkId(Integer taskWorkId) {
    this.taskWorkId = taskWorkId;
  }

  public TaskWorkCommandDTO command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Command to execute.
   * @return command
  **/
  @ApiModelProperty(value = "Command to execute.")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public TaskWorkCommandDTO isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Required.
   * @return isRequired
  **/
  @ApiModelProperty(value = "Required.")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public TaskWorkCommandDTO isAsync(Boolean isAsync) {
    this.isAsync = isAsync;
    return this;
  }

   /**
   * Asyncronous execution.
   * @return isAsync
  **/
  @ApiModelProperty(value = "Asyncronous execution.")
  public Boolean isIsAsync() {
    return isAsync;
  }

  public void setIsAsync(Boolean isAsync) {
    this.isAsync = isAsync;
  }

  public TaskWorkCommandDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Command description.
   * @return description
  **/
  @ApiModelProperty(value = "Command description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskWorkCommandDTO side(Integer side) {
    this.side = side;
    return this;
  }

   /**
   * Possible values:  0: Client  1: Server  2: OpenUrl 
   * @return side
  **/
  @ApiModelProperty(value = "Possible values:  0: Client  1: Server  2: OpenUrl ")
  public Integer getSide() {
    return side;
  }

  public void setSide(Integer side) {
    this.side = side;
  }

  public TaskWorkCommandDTO isExecuted(Boolean isExecuted) {
    this.isExecuted = isExecuted;
    return this;
  }

   /**
   * Executed
   * @return isExecuted
  **/
  @ApiModelProperty(value = "Executed")
  public Boolean isIsExecuted() {
    return isExecuted;
  }

  public void setIsExecuted(Boolean isExecuted) {
    this.isExecuted = isExecuted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskWorkCommandDTO taskWorkCommandDTO = (TaskWorkCommandDTO) o;
    return Objects.equals(this.id, taskWorkCommandDTO.id) &&
        Objects.equals(this.processId, taskWorkCommandDTO.processId) &&
        Objects.equals(this.taskWorkId, taskWorkCommandDTO.taskWorkId) &&
        Objects.equals(this.command, taskWorkCommandDTO.command) &&
        Objects.equals(this.isRequired, taskWorkCommandDTO.isRequired) &&
        Objects.equals(this.isAsync, taskWorkCommandDTO.isAsync) &&
        Objects.equals(this.description, taskWorkCommandDTO.description) &&
        Objects.equals(this.side, taskWorkCommandDTO.side) &&
        Objects.equals(this.isExecuted, taskWorkCommandDTO.isExecuted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processId, taskWorkId, command, isRequired, isAsync, description, side, isExecuted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskWorkCommandDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    taskWorkId: ").append(toIndentedString(taskWorkId)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    isExecuted: ").append(toIndentedString(isExecuted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


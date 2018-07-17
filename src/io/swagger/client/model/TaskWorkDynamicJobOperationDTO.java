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
import io.swagger.client.model.UserCompleteDTO;
import java.io.IOException;

/**
 * Dynamic job operation
 */
@ApiModel(description = "Dynamic job operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TaskWorkDynamicJobOperationDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("processId")
  private Integer processId = null;

  @SerializedName("taskWorkId")
  private Integer taskWorkId = null;

  @SerializedName("dynamicJob")
  private UserCompleteDTO dynamicJob = null;

  @SerializedName("outcomeValue")
  private String outcomeValue = null;

  @SerializedName("executeAfter")
  private Boolean executeAfter = null;

  @SerializedName("isRequired")
  private Boolean isRequired = null;

  @SerializedName("isExecuted")
  private Boolean isExecuted = null;

  public TaskWorkDynamicJobOperationDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TaskWorkDynamicJobOperationDTO processId(Integer processId) {
    this.processId = processId;
    return this;
  }

   /**
   * Process Id
   * @return processId
  **/
  @ApiModelProperty(value = "Process Id")
  public Integer getProcessId() {
    return processId;
  }

  public void setProcessId(Integer processId) {
    this.processId = processId;
  }

  public TaskWorkDynamicJobOperationDTO taskWorkId(Integer taskWorkId) {
    this.taskWorkId = taskWorkId;
    return this;
  }

   /**
   * TaskWork Id
   * @return taskWorkId
  **/
  @ApiModelProperty(value = "TaskWork Id")
  public Integer getTaskWorkId() {
    return taskWorkId;
  }

  public void setTaskWorkId(Integer taskWorkId) {
    this.taskWorkId = taskWorkId;
  }

  public TaskWorkDynamicJobOperationDTO dynamicJob(UserCompleteDTO dynamicJob) {
    this.dynamicJob = dynamicJob;
    return this;
  }

   /**
   * Dynamic job
   * @return dynamicJob
  **/
  @ApiModelProperty(value = "Dynamic job")
  public UserCompleteDTO getDynamicJob() {
    return dynamicJob;
  }

  public void setDynamicJob(UserCompleteDTO dynamicJob) {
    this.dynamicJob = dynamicJob;
  }

  public TaskWorkDynamicJobOperationDTO outcomeValue(String outcomeValue) {
    this.outcomeValue = outcomeValue;
    return this;
  }

   /**
   * Value for outcome
   * @return outcomeValue
  **/
  @ApiModelProperty(value = "Value for outcome")
  public String getOutcomeValue() {
    return outcomeValue;
  }

  public void setOutcomeValue(String outcomeValue) {
    this.outcomeValue = outcomeValue;
  }

  public TaskWorkDynamicJobOperationDTO executeAfter(Boolean executeAfter) {
    this.executeAfter = executeAfter;
    return this;
  }

   /**
   * After execution
   * @return executeAfter
  **/
  @ApiModelProperty(value = "After execution")
  public Boolean isExecuteAfter() {
    return executeAfter;
  }

  public void setExecuteAfter(Boolean executeAfter) {
    this.executeAfter = executeAfter;
  }

  public TaskWorkDynamicJobOperationDTO isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Required
   * @return isRequired
  **/
  @ApiModelProperty(value = "Required")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public TaskWorkDynamicJobOperationDTO isExecuted(Boolean isExecuted) {
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
    TaskWorkDynamicJobOperationDTO taskWorkDynamicJobOperationDTO = (TaskWorkDynamicJobOperationDTO) o;
    return Objects.equals(this.id, taskWorkDynamicJobOperationDTO.id) &&
        Objects.equals(this.processId, taskWorkDynamicJobOperationDTO.processId) &&
        Objects.equals(this.taskWorkId, taskWorkDynamicJobOperationDTO.taskWorkId) &&
        Objects.equals(this.dynamicJob, taskWorkDynamicJobOperationDTO.dynamicJob) &&
        Objects.equals(this.outcomeValue, taskWorkDynamicJobOperationDTO.outcomeValue) &&
        Objects.equals(this.executeAfter, taskWorkDynamicJobOperationDTO.executeAfter) &&
        Objects.equals(this.isRequired, taskWorkDynamicJobOperationDTO.isRequired) &&
        Objects.equals(this.isExecuted, taskWorkDynamicJobOperationDTO.isExecuted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processId, taskWorkId, dynamicJob, outcomeValue, executeAfter, isRequired, isExecuted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskWorkDynamicJobOperationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    taskWorkId: ").append(toIndentedString(taskWorkId)).append("\n");
    sb.append("    dynamicJob: ").append(toIndentedString(dynamicJob)).append("\n");
    sb.append("    outcomeValue: ").append(toIndentedString(outcomeValue)).append("\n");
    sb.append("    executeAfter: ").append(toIndentedString(executeAfter)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

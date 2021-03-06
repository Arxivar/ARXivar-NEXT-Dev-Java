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
import io.swagger.client.model.ProfessionalRoleOperationsDTO;
import io.swagger.client.model.TaskWorkCommandDTO;
import io.swagger.client.model.TaskWorkDocumentOperationDTO;
import io.swagger.client.model.TaskWorkDynamicJobOperationsDTO;
import io.swagger.client.model.TaskWorkSignOperationDTO;
import io.swagger.client.model.TaskWorkVariableOperationDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaskWorkOperationsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TaskWorkOperationsDTO {
  @SerializedName("taskWorkCommandsOperations")
  private List<TaskWorkCommandDTO> taskWorkCommandsOperations = null;

  @SerializedName("taskWorkVariablesOperation")
  private TaskWorkVariableOperationDTO taskWorkVariablesOperation = null;

  @SerializedName("taskWorkDocumentOperations")
  private List<TaskWorkDocumentOperationDTO> taskWorkDocumentOperations = null;

  @SerializedName("taskWorkProfessionalRoleOperations")
  private ProfessionalRoleOperationsDTO taskWorkProfessionalRoleOperations = null;

  @SerializedName("taskWorkOperatingInstructions")
  private List<String> taskWorkOperatingInstructions = null;

  @SerializedName("taskWorkDynamicJobOperation")
  private TaskWorkDynamicJobOperationsDTO taskWorkDynamicJobOperation = null;

  @SerializedName("taskWorkSignOperations")
  private List<TaskWorkSignOperationDTO> taskWorkSignOperations = null;

  @SerializedName("canReAssignTask")
  private Boolean canReAssignTask = null;

  public TaskWorkOperationsDTO taskWorkCommandsOperations(List<TaskWorkCommandDTO> taskWorkCommandsOperations) {
    this.taskWorkCommandsOperations = taskWorkCommandsOperations;
    return this;
  }

  public TaskWorkOperationsDTO addTaskWorkCommandsOperationsItem(TaskWorkCommandDTO taskWorkCommandsOperationsItem) {
    if (this.taskWorkCommandsOperations == null) {
      this.taskWorkCommandsOperations = new ArrayList<TaskWorkCommandDTO>();
    }
    this.taskWorkCommandsOperations.add(taskWorkCommandsOperationsItem);
    return this;
  }

   /**
   * TaskWork commands
   * @return taskWorkCommandsOperations
  **/
  @ApiModelProperty(value = "TaskWork commands")
  public List<TaskWorkCommandDTO> getTaskWorkCommandsOperations() {
    return taskWorkCommandsOperations;
  }

  public void setTaskWorkCommandsOperations(List<TaskWorkCommandDTO> taskWorkCommandsOperations) {
    this.taskWorkCommandsOperations = taskWorkCommandsOperations;
  }

  public TaskWorkOperationsDTO taskWorkVariablesOperation(TaskWorkVariableOperationDTO taskWorkVariablesOperation) {
    this.taskWorkVariablesOperation = taskWorkVariablesOperation;
    return this;
  }

   /**
   * Process variables to set
   * @return taskWorkVariablesOperation
  **/
  @ApiModelProperty(value = "Process variables to set")
  public TaskWorkVariableOperationDTO getTaskWorkVariablesOperation() {
    return taskWorkVariablesOperation;
  }

  public void setTaskWorkVariablesOperation(TaskWorkVariableOperationDTO taskWorkVariablesOperation) {
    this.taskWorkVariablesOperation = taskWorkVariablesOperation;
  }

  public TaskWorkOperationsDTO taskWorkDocumentOperations(List<TaskWorkDocumentOperationDTO> taskWorkDocumentOperations) {
    this.taskWorkDocumentOperations = taskWorkDocumentOperations;
    return this;
  }

  public TaskWorkOperationsDTO addTaskWorkDocumentOperationsItem(TaskWorkDocumentOperationDTO taskWorkDocumentOperationsItem) {
    if (this.taskWorkDocumentOperations == null) {
      this.taskWorkDocumentOperations = new ArrayList<TaskWorkDocumentOperationDTO>();
    }
    this.taskWorkDocumentOperations.add(taskWorkDocumentOperationsItem);
    return this;
  }

   /**
   * Document operations
   * @return taskWorkDocumentOperations
  **/
  @ApiModelProperty(value = "Document operations")
  public List<TaskWorkDocumentOperationDTO> getTaskWorkDocumentOperations() {
    return taskWorkDocumentOperations;
  }

  public void setTaskWorkDocumentOperations(List<TaskWorkDocumentOperationDTO> taskWorkDocumentOperations) {
    this.taskWorkDocumentOperations = taskWorkDocumentOperations;
  }

  public TaskWorkOperationsDTO taskWorkProfessionalRoleOperations(ProfessionalRoleOperationsDTO taskWorkProfessionalRoleOperations) {
    this.taskWorkProfessionalRoleOperations = taskWorkProfessionalRoleOperations;
    return this;
  }

   /**
   * Professional roles
   * @return taskWorkProfessionalRoleOperations
  **/
  @ApiModelProperty(value = "Professional roles")
  public ProfessionalRoleOperationsDTO getTaskWorkProfessionalRoleOperations() {
    return taskWorkProfessionalRoleOperations;
  }

  public void setTaskWorkProfessionalRoleOperations(ProfessionalRoleOperationsDTO taskWorkProfessionalRoleOperations) {
    this.taskWorkProfessionalRoleOperations = taskWorkProfessionalRoleOperations;
  }

  public TaskWorkOperationsDTO taskWorkOperatingInstructions(List<String> taskWorkOperatingInstructions) {
    this.taskWorkOperatingInstructions = taskWorkOperatingInstructions;
    return this;
  }

  public TaskWorkOperationsDTO addTaskWorkOperatingInstructionsItem(String taskWorkOperatingInstructionsItem) {
    if (this.taskWorkOperatingInstructions == null) {
      this.taskWorkOperatingInstructions = new ArrayList<String>();
    }
    this.taskWorkOperatingInstructions.add(taskWorkOperatingInstructionsItem);
    return this;
  }

   /**
   * Operating Instruction
   * @return taskWorkOperatingInstructions
  **/
  @ApiModelProperty(value = "Operating Instruction")
  public List<String> getTaskWorkOperatingInstructions() {
    return taskWorkOperatingInstructions;
  }

  public void setTaskWorkOperatingInstructions(List<String> taskWorkOperatingInstructions) {
    this.taskWorkOperatingInstructions = taskWorkOperatingInstructions;
  }

  public TaskWorkOperationsDTO taskWorkDynamicJobOperation(TaskWorkDynamicJobOperationsDTO taskWorkDynamicJobOperation) {
    this.taskWorkDynamicJobOperation = taskWorkDynamicJobOperation;
    return this;
  }

   /**
   * Dynamic jobs
   * @return taskWorkDynamicJobOperation
  **/
  @ApiModelProperty(value = "Dynamic jobs")
  public TaskWorkDynamicJobOperationsDTO getTaskWorkDynamicJobOperation() {
    return taskWorkDynamicJobOperation;
  }

  public void setTaskWorkDynamicJobOperation(TaskWorkDynamicJobOperationsDTO taskWorkDynamicJobOperation) {
    this.taskWorkDynamicJobOperation = taskWorkDynamicJobOperation;
  }

  public TaskWorkOperationsDTO taskWorkSignOperations(List<TaskWorkSignOperationDTO> taskWorkSignOperations) {
    this.taskWorkSignOperations = taskWorkSignOperations;
    return this;
  }

  public TaskWorkOperationsDTO addTaskWorkSignOperationsItem(TaskWorkSignOperationDTO taskWorkSignOperationsItem) {
    if (this.taskWorkSignOperations == null) {
      this.taskWorkSignOperations = new ArrayList<TaskWorkSignOperationDTO>();
    }
    this.taskWorkSignOperations.add(taskWorkSignOperationsItem);
    return this;
  }

   /**
   * Sign operations
   * @return taskWorkSignOperations
  **/
  @ApiModelProperty(value = "Sign operations")
  public List<TaskWorkSignOperationDTO> getTaskWorkSignOperations() {
    return taskWorkSignOperations;
  }

  public void setTaskWorkSignOperations(List<TaskWorkSignOperationDTO> taskWorkSignOperations) {
    this.taskWorkSignOperations = taskWorkSignOperations;
  }

  public TaskWorkOperationsDTO canReAssignTask(Boolean canReAssignTask) {
    this.canReAssignTask = canReAssignTask;
    return this;
  }

   /**
   * Reassign task opertiona
   * @return canReAssignTask
  **/
  @ApiModelProperty(value = "Reassign task opertiona")
  public Boolean isCanReAssignTask() {
    return canReAssignTask;
  }

  public void setCanReAssignTask(Boolean canReAssignTask) {
    this.canReAssignTask = canReAssignTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskWorkOperationsDTO taskWorkOperationsDTO = (TaskWorkOperationsDTO) o;
    return Objects.equals(this.taskWorkCommandsOperations, taskWorkOperationsDTO.taskWorkCommandsOperations) &&
        Objects.equals(this.taskWorkVariablesOperation, taskWorkOperationsDTO.taskWorkVariablesOperation) &&
        Objects.equals(this.taskWorkDocumentOperations, taskWorkOperationsDTO.taskWorkDocumentOperations) &&
        Objects.equals(this.taskWorkProfessionalRoleOperations, taskWorkOperationsDTO.taskWorkProfessionalRoleOperations) &&
        Objects.equals(this.taskWorkOperatingInstructions, taskWorkOperationsDTO.taskWorkOperatingInstructions) &&
        Objects.equals(this.taskWorkDynamicJobOperation, taskWorkOperationsDTO.taskWorkDynamicJobOperation) &&
        Objects.equals(this.taskWorkSignOperations, taskWorkOperationsDTO.taskWorkSignOperations) &&
        Objects.equals(this.canReAssignTask, taskWorkOperationsDTO.canReAssignTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskWorkCommandsOperations, taskWorkVariablesOperation, taskWorkDocumentOperations, taskWorkProfessionalRoleOperations, taskWorkOperatingInstructions, taskWorkDynamicJobOperation, taskWorkSignOperations, canReAssignTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskWorkOperationsDTO {\n");
    
    sb.append("    taskWorkCommandsOperations: ").append(toIndentedString(taskWorkCommandsOperations)).append("\n");
    sb.append("    taskWorkVariablesOperation: ").append(toIndentedString(taskWorkVariablesOperation)).append("\n");
    sb.append("    taskWorkDocumentOperations: ").append(toIndentedString(taskWorkDocumentOperations)).append("\n");
    sb.append("    taskWorkProfessionalRoleOperations: ").append(toIndentedString(taskWorkProfessionalRoleOperations)).append("\n");
    sb.append("    taskWorkOperatingInstructions: ").append(toIndentedString(taskWorkOperatingInstructions)).append("\n");
    sb.append("    taskWorkDynamicJobOperation: ").append(toIndentedString(taskWorkDynamicJobOperation)).append("\n");
    sb.append("    taskWorkSignOperations: ").append(toIndentedString(taskWorkSignOperations)).append("\n");
    sb.append("    canReAssignTask: ").append(toIndentedString(canReAssignTask)).append("\n");
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


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
 * TaskLayoutAssociationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TaskLayoutAssociationDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("taskWorkExternalId")
  private String taskWorkExternalId = null;

  @SerializedName("workflowId")
  private Integer workflowId = null;

  @SerializedName("associationType")
  private Integer associationType = null;

  @SerializedName("taskLayoutId")
  private Integer taskLayoutId = null;

  public TaskLayoutAssociationDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TaskLayoutAssociationDTO taskWorkExternalId(String taskWorkExternalId) {
    this.taskWorkExternalId = taskWorkExternalId;
    return this;
  }

   /**
   * Get taskWorkExternalId
   * @return taskWorkExternalId
  **/
  @ApiModelProperty(value = "")
  public String getTaskWorkExternalId() {
    return taskWorkExternalId;
  }

  public void setTaskWorkExternalId(String taskWorkExternalId) {
    this.taskWorkExternalId = taskWorkExternalId;
  }

  public TaskLayoutAssociationDTO workflowId(Integer workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(Integer workflowId) {
    this.workflowId = workflowId;
  }

  public TaskLayoutAssociationDTO associationType(Integer associationType) {
    this.associationType = associationType;
    return this;
  }

   /**
   * Possible values:  0: WorkflowAssociation  1: TaskWorkAssociation 
   * @return associationType
  **/
  @ApiModelProperty(value = "Possible values:  0: WorkflowAssociation  1: TaskWorkAssociation ")
  public Integer getAssociationType() {
    return associationType;
  }

  public void setAssociationType(Integer associationType) {
    this.associationType = associationType;
  }

  public TaskLayoutAssociationDTO taskLayoutId(Integer taskLayoutId) {
    this.taskLayoutId = taskLayoutId;
    return this;
  }

   /**
   * Get taskLayoutId
   * @return taskLayoutId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskLayoutId() {
    return taskLayoutId;
  }

  public void setTaskLayoutId(Integer taskLayoutId) {
    this.taskLayoutId = taskLayoutId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskLayoutAssociationDTO taskLayoutAssociationDTO = (TaskLayoutAssociationDTO) o;
    return Objects.equals(this.id, taskLayoutAssociationDTO.id) &&
        Objects.equals(this.taskWorkExternalId, taskLayoutAssociationDTO.taskWorkExternalId) &&
        Objects.equals(this.workflowId, taskLayoutAssociationDTO.workflowId) &&
        Objects.equals(this.associationType, taskLayoutAssociationDTO.associationType) &&
        Objects.equals(this.taskLayoutId, taskLayoutAssociationDTO.taskLayoutId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskWorkExternalId, workflowId, associationType, taskLayoutId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskLayoutAssociationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskWorkExternalId: ").append(toIndentedString(taskWorkExternalId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    taskLayoutId: ").append(toIndentedString(taskLayoutId)).append("\n");
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

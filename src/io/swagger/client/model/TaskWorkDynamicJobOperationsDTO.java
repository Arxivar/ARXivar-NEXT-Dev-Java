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
import io.swagger.client.model.TaskWorkDynamicJobOperationDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaskWorkDynamicJobOperationsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TaskWorkDynamicJobOperationsDTO {
  @SerializedName("operations")
  private List<TaskWorkDynamicJobOperationDTO> operations = null;

  @SerializedName("description")
  private String description = null;

  public TaskWorkDynamicJobOperationsDTO operations(List<TaskWorkDynamicJobOperationDTO> operations) {
    this.operations = operations;
    return this;
  }

  public TaskWorkDynamicJobOperationsDTO addOperationsItem(TaskWorkDynamicJobOperationDTO operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<TaskWorkDynamicJobOperationDTO>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")
  public List<TaskWorkDynamicJobOperationDTO> getOperations() {
    return operations;
  }

  public void setOperations(List<TaskWorkDynamicJobOperationDTO> operations) {
    this.operations = operations;
  }

  public TaskWorkDynamicJobOperationsDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskWorkDynamicJobOperationsDTO taskWorkDynamicJobOperationsDTO = (TaskWorkDynamicJobOperationsDTO) o;
    return Objects.equals(this.operations, taskWorkDynamicJobOperationsDTO.operations) &&
        Objects.equals(this.description, taskWorkDynamicJobOperationsDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskWorkDynamicJobOperationsDTO {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


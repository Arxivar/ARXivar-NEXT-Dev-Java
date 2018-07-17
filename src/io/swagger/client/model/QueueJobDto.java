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
 * Class of queue job information
 */
@ApiModel(description = "Class of queue job information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class QueueJobDto {
  @SerializedName("jobName")
  private String jobName = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("queueType")
  private String queueType = null;

  @SerializedName("methodName")
  private String methodName = null;

  public QueueJobDto jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

   /**
   * Name
   * @return jobName
  **/
  @ApiModelProperty(value = "Name")
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public QueueJobDto jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Identifier
   * @return jobId
  **/
  @ApiModelProperty(value = "Identifier")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public QueueJobDto queueType(String queueType) {
    this.queueType = queueType;
    return this;
  }

   /**
   * Type
   * @return queueType
  **/
  @ApiModelProperty(value = "Type")
  public String getQueueType() {
    return queueType;
  }

  public void setQueueType(String queueType) {
    this.queueType = queueType;
  }

  public QueueJobDto methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

   /**
   * Name of method
   * @return methodName
  **/
  @ApiModelProperty(value = "Name of method")
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueJobDto queueJobDto = (QueueJobDto) o;
    return Objects.equals(this.jobName, queueJobDto.jobName) &&
        Objects.equals(this.jobId, queueJobDto.jobId) &&
        Objects.equals(this.queueType, queueJobDto.queueType) &&
        Objects.equals(this.methodName, queueJobDto.methodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, jobId, queueType, methodName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueJobDto {\n");
    
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
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


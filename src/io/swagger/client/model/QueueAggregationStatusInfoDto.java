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
import io.swagger.client.model.QueueStateAggregationInfoDto;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * QueueAggregationStatusInfoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class QueueAggregationStatusInfoDto {
  @SerializedName("workingProgress")
  private Integer workingProgress = null;

  @SerializedName("queueStatus")
  private Integer queueStatus = null;

  @SerializedName("isCompleted")
  private Boolean isCompleted = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("queueName")
  private String queueName = null;

  @SerializedName("queueType")
  private String queueType = null;

  @SerializedName("createdAt")
  private DateTime createdAt = null;

  @SerializedName("expireAt")
  private DateTime expireAt = null;

  @SerializedName("workItemCount")
  private Integer workItemCount = null;

  @SerializedName("stateCount")
  private QueueStateAggregationInfoDto stateCount = null;

  public QueueAggregationStatusInfoDto workingProgress(Integer workingProgress) {
    this.workingProgress = workingProgress;
    return this;
  }

   /**
   * Get workingProgress
   * @return workingProgress
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkingProgress() {
    return workingProgress;
  }

  public void setWorkingProgress(Integer workingProgress) {
    this.workingProgress = workingProgress;
  }

  public QueueAggregationStatusInfoDto queueStatus(Integer queueStatus) {
    this.queueStatus = queueStatus;
    return this;
  }

   /**
   * Possible values:  0: CompletedOk  1: CompletedPartialOk  2: CompletedKo  3: Deleted  4: Processing  5: Enqueued  6: Waiting  7: Failed 
   * @return queueStatus
  **/
  @ApiModelProperty(value = "Possible values:  0: CompletedOk  1: CompletedPartialOk  2: CompletedKo  3: Deleted  4: Processing  5: Enqueued  6: Waiting  7: Failed ")
  public Integer getQueueStatus() {
    return queueStatus;
  }

  public void setQueueStatus(Integer queueStatus) {
    this.queueStatus = queueStatus;
  }

  public QueueAggregationStatusInfoDto isCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
    return this;
  }

   /**
   * Get isCompleted
   * @return isCompleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public QueueAggregationStatusInfoDto queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * Queue Identifier
   * @return queueId
  **/
  @ApiModelProperty(value = "Queue Identifier")
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  public QueueAggregationStatusInfoDto queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * Queue Name
   * @return queueName
  **/
  @ApiModelProperty(value = "Queue Name")
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public QueueAggregationStatusInfoDto queueType(String queueType) {
    this.queueType = queueType;
    return this;
  }

   /**
   * Queue Type
   * @return queueType
  **/
  @ApiModelProperty(value = "Queue Type")
  public String getQueueType() {
    return queueType;
  }

  public void setQueueType(String queueType) {
    this.queueType = queueType;
  }

  public QueueAggregationStatusInfoDto createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation Date
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation Date")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public QueueAggregationStatusInfoDto expireAt(DateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration Date
   * @return expireAt
  **/
  @ApiModelProperty(value = "Expiration Date")
  public DateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(DateTime expireAt) {
    this.expireAt = expireAt;
  }

  public QueueAggregationStatusInfoDto workItemCount(Integer workItemCount) {
    this.workItemCount = workItemCount;
    return this;
  }

   /**
   * Items
   * @return workItemCount
  **/
  @ApiModelProperty(value = "Items")
  public Integer getWorkItemCount() {
    return workItemCount;
  }

  public void setWorkItemCount(Integer workItemCount) {
    this.workItemCount = workItemCount;
  }

  public QueueAggregationStatusInfoDto stateCount(QueueStateAggregationInfoDto stateCount) {
    this.stateCount = stateCount;
    return this;
  }

   /**
   * Status of items
   * @return stateCount
  **/
  @ApiModelProperty(value = "Status of items")
  public QueueStateAggregationInfoDto getStateCount() {
    return stateCount;
  }

  public void setStateCount(QueueStateAggregationInfoDto stateCount) {
    this.stateCount = stateCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueAggregationStatusInfoDto queueAggregationStatusInfoDto = (QueueAggregationStatusInfoDto) o;
    return Objects.equals(this.workingProgress, queueAggregationStatusInfoDto.workingProgress) &&
        Objects.equals(this.queueStatus, queueAggregationStatusInfoDto.queueStatus) &&
        Objects.equals(this.isCompleted, queueAggregationStatusInfoDto.isCompleted) &&
        Objects.equals(this.queueId, queueAggregationStatusInfoDto.queueId) &&
        Objects.equals(this.queueName, queueAggregationStatusInfoDto.queueName) &&
        Objects.equals(this.queueType, queueAggregationStatusInfoDto.queueType) &&
        Objects.equals(this.createdAt, queueAggregationStatusInfoDto.createdAt) &&
        Objects.equals(this.expireAt, queueAggregationStatusInfoDto.expireAt) &&
        Objects.equals(this.workItemCount, queueAggregationStatusInfoDto.workItemCount) &&
        Objects.equals(this.stateCount, queueAggregationStatusInfoDto.stateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workingProgress, queueStatus, isCompleted, queueId, queueName, queueType, createdAt, expireAt, workItemCount, stateCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueAggregationStatusInfoDto {\n");
    
    sb.append("    workingProgress: ").append(toIndentedString(workingProgress)).append("\n");
    sb.append("    queueStatus: ").append(toIndentedString(queueStatus)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    workItemCount: ").append(toIndentedString(workItemCount)).append("\n");
    sb.append("    stateCount: ").append(toIndentedString(stateCount)).append("\n");
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

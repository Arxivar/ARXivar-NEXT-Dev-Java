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
 * GetQueueJobInfoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class GetQueueJobInfoDto {
  @SerializedName("jobStateEnum")
  private Integer jobStateEnum = null;

  @SerializedName("queueMethod")
  private Integer queueMethod = null;

  @SerializedName("startItem")
  private Integer startItem = null;

  @SerializedName("count")
  private Integer count = null;

  public GetQueueJobInfoDto jobStateEnum(Integer jobStateEnum) {
    this.jobStateEnum = jobStateEnum;
    return this;
  }

   /**
   * Possible values:  0: Awaiting  1: Deleted  2: Enqueued  3: Failed  4: Processing  5: Scheduled  6: SucceededKo  7: SucceededOk 
   * @return jobStateEnum
  **/
  @ApiModelProperty(value = "Possible values:  0: Awaiting  1: Deleted  2: Enqueued  3: Failed  4: Processing  5: Scheduled  6: SucceededKo  7: SucceededOk ")
  public Integer getJobStateEnum() {
    return jobStateEnum;
  }

  public void setJobStateEnum(Integer jobStateEnum) {
    this.jobStateEnum = jobStateEnum;
  }

  public GetQueueJobInfoDto queueMethod(Integer queueMethod) {
    this.queueMethod = queueMethod;
    return this;
  }

   /**
   * Possible values:  0: Work  1: WorkItem  2: End 
   * @return queueMethod
  **/
  @ApiModelProperty(value = "Possible values:  0: Work  1: WorkItem  2: End ")
  public Integer getQueueMethod() {
    return queueMethod;
  }

  public void setQueueMethod(Integer queueMethod) {
    this.queueMethod = queueMethod;
  }

  public GetQueueJobInfoDto startItem(Integer startItem) {
    this.startItem = startItem;
    return this;
  }

   /**
   * Get startItem
   * @return startItem
  **/
  @ApiModelProperty(value = "")
  public Integer getStartItem() {
    return startItem;
  }

  public void setStartItem(Integer startItem) {
    this.startItem = startItem;
  }

  public GetQueueJobInfoDto count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQueueJobInfoDto getQueueJobInfoDto = (GetQueueJobInfoDto) o;
    return Objects.equals(this.jobStateEnum, getQueueJobInfoDto.jobStateEnum) &&
        Objects.equals(this.queueMethod, getQueueJobInfoDto.queueMethod) &&
        Objects.equals(this.startItem, getQueueJobInfoDto.startItem) &&
        Objects.equals(this.count, getQueueJobInfoDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobStateEnum, queueMethod, startItem, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQueueJobInfoDto {\n");
    
    sb.append("    jobStateEnum: ").append(toIndentedString(jobStateEnum)).append("\n");
    sb.append("    queueMethod: ").append(toIndentedString(queueMethod)).append("\n");
    sb.append("    startItem: ").append(toIndentedString(startItem)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

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
import org.joda.time.DateTime;

/**
 * Class of queue information
 */
@ApiModel(description = "Class of queue information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class GetQueueInfoDto {
  @SerializedName("dateFrom")
  private DateTime dateFrom = null;

  @SerializedName("typeFullName")
  private String typeFullName = null;

  @SerializedName("startItem")
  private Integer startItem = null;

  @SerializedName("count")
  private Integer count = null;

  public GetQueueInfoDto dateFrom(DateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Start Date
   * @return dateFrom
  **/
  @ApiModelProperty(value = "Start Date")
  public DateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(DateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetQueueInfoDto typeFullName(String typeFullName) {
    this.typeFullName = typeFullName;
    return this;
  }

   /**
   * Type Name
   * @return typeFullName
  **/
  @ApiModelProperty(value = "Type Name")
  public String getTypeFullName() {
    return typeFullName;
  }

  public void setTypeFullName(String typeFullName) {
    this.typeFullName = typeFullName;
  }

  public GetQueueInfoDto startItem(Integer startItem) {
    this.startItem = startItem;
    return this;
  }

   /**
   * Start Item
   * @return startItem
  **/
  @ApiModelProperty(value = "Start Item")
  public Integer getStartItem() {
    return startItem;
  }

  public void setStartItem(Integer startItem) {
    this.startItem = startItem;
  }

  public GetQueueInfoDto count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count
   * @return count
  **/
  @ApiModelProperty(value = "Count")
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
    GetQueueInfoDto getQueueInfoDto = (GetQueueInfoDto) o;
    return Objects.equals(this.dateFrom, getQueueInfoDto.dateFrom) &&
        Objects.equals(this.typeFullName, getQueueInfoDto.typeFullName) &&
        Objects.equals(this.startItem, getQueueInfoDto.startItem) &&
        Objects.equals(this.count, getQueueInfoDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, typeFullName, startItem, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQueueInfoDto {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    typeFullName: ").append(toIndentedString(typeFullName)).append("\n");
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

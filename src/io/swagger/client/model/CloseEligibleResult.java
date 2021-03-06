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
 * Dto for possible conclusion of a taskwork
 */
@ApiModel(description = "Dto for possible conclusion of a taskwork")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class CloseEligibleResult {
  @SerializedName("taskWorkId")
  private Integer taskWorkId = null;

  @SerializedName("eligibleToClose")
  private Boolean eligibleToClose = null;

  @SerializedName("errorMEssage")
  private String errorMEssage = null;

  public CloseEligibleResult taskWorkId(Integer taskWorkId) {
    this.taskWorkId = taskWorkId;
    return this;
  }

   /**
   * TaskWork id
   * @return taskWorkId
  **/
  @ApiModelProperty(value = "TaskWork id")
  public Integer getTaskWorkId() {
    return taskWorkId;
  }

  public void setTaskWorkId(Integer taskWorkId) {
    this.taskWorkId = taskWorkId;
  }

  public CloseEligibleResult eligibleToClose(Boolean eligibleToClose) {
    this.eligibleToClose = eligibleToClose;
    return this;
  }

   /**
   * TaskWork can closed
   * @return eligibleToClose
  **/
  @ApiModelProperty(value = "TaskWork can closed")
  public Boolean isEligibleToClose() {
    return eligibleToClose;
  }

  public void setEligibleToClose(Boolean eligibleToClose) {
    this.eligibleToClose = eligibleToClose;
  }

  public CloseEligibleResult errorMEssage(String errorMEssage) {
    this.errorMEssage = errorMEssage;
    return this;
  }

   /**
   * Optional message if tarsWork is not concludible
   * @return errorMEssage
  **/
  @ApiModelProperty(value = "Optional message if tarsWork is not concludible")
  public String getErrorMEssage() {
    return errorMEssage;
  }

  public void setErrorMEssage(String errorMEssage) {
    this.errorMEssage = errorMEssage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseEligibleResult closeEligibleResult = (CloseEligibleResult) o;
    return Objects.equals(this.taskWorkId, closeEligibleResult.taskWorkId) &&
        Objects.equals(this.eligibleToClose, closeEligibleResult.eligibleToClose) &&
        Objects.equals(this.errorMEssage, closeEligibleResult.errorMEssage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskWorkId, eligibleToClose, errorMEssage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloseEligibleResult {\n");
    
    sb.append("    taskWorkId: ").append(toIndentedString(taskWorkId)).append("\n");
    sb.append("    eligibleToClose: ").append(toIndentedString(eligibleToClose)).append("\n");
    sb.append("    errorMEssage: ").append(toIndentedString(errorMEssage)).append("\n");
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


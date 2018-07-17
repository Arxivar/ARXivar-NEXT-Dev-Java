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
 * Class of exception of profiling
 */
@ApiModel(description = "Class of exception of profiling")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ProfilePostExceptionDTO {
  @SerializedName("userMessage")
  private String userMessage = null;

  @SerializedName("exceptionCode")
  private Integer exceptionCode = null;

  public ProfilePostExceptionDTO userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

   /**
   * Message
   * @return userMessage
  **/
  @ApiModelProperty(value = "Message")
  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  public ProfilePostExceptionDTO exceptionCode(Integer exceptionCode) {
    this.exceptionCode = exceptionCode;
    return this;
  }

   /**
   * Possible values:  0: Generico  1: RegolaDiUnivocità 
   * @return exceptionCode
  **/
  @ApiModelProperty(value = "Possible values:  0: Generico  1: RegolaDiUnivocità ")
  public Integer getExceptionCode() {
    return exceptionCode;
  }

  public void setExceptionCode(Integer exceptionCode) {
    this.exceptionCode = exceptionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilePostExceptionDTO profilePostExceptionDTO = (ProfilePostExceptionDTO) o;
    return Objects.equals(this.userMessage, profilePostExceptionDTO.userMessage) &&
        Objects.equals(this.exceptionCode, profilePostExceptionDTO.exceptionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userMessage, exceptionCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePostExceptionDTO {\n");
    
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    exceptionCode: ").append(toIndentedString(exceptionCode)).append("\n");
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


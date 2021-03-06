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
 * ShareOptionOptionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ShareOptionOptionDTO {
  @SerializedName("option")
  private Integer option = null;

  @SerializedName("optionUserMessage")
  private String optionUserMessage = null;

  public ShareOptionOptionDTO option(Integer option) {
    this.option = option;
    return this;
  }

   /**
   * Possible values:  1: Read  2: ReadAndWrite 
   * @return option
  **/
  @ApiModelProperty(value = "Possible values:  1: Read  2: ReadAndWrite ")
  public Integer getOption() {
    return option;
  }

  public void setOption(Integer option) {
    this.option = option;
  }

  public ShareOptionOptionDTO optionUserMessage(String optionUserMessage) {
    this.optionUserMessage = optionUserMessage;
    return this;
  }

   /**
   * User label for this option
   * @return optionUserMessage
  **/
  @ApiModelProperty(value = "User label for this option")
  public String getOptionUserMessage() {
    return optionUserMessage;
  }

  public void setOptionUserMessage(String optionUserMessage) {
    this.optionUserMessage = optionUserMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareOptionOptionDTO shareOptionOptionDTO = (ShareOptionOptionDTO) o;
    return Objects.equals(this.option, shareOptionOptionDTO.option) &&
        Objects.equals(this.optionUserMessage, shareOptionOptionDTO.optionUserMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, optionUserMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareOptionOptionDTO {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    optionUserMessage: ").append(toIndentedString(optionUserMessage)).append("\n");
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


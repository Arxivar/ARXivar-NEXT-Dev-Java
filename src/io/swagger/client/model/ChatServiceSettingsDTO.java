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
 * ChatServiceSettingsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ChatServiceSettingsDTO {
  @SerializedName("isEnable")
  private Boolean isEnable = null;

  public ChatServiceSettingsDTO isEnable(Boolean isEnable) {
    this.isEnable = isEnable;
    return this;
  }

   /**
   * Get isEnable
   * @return isEnable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsEnable() {
    return isEnable;
  }

  public void setIsEnable(Boolean isEnable) {
    this.isEnable = isEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatServiceSettingsDTO chatServiceSettingsDTO = (ChatServiceSettingsDTO) o;
    return Objects.equals(this.isEnable, chatServiceSettingsDTO.isEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatServiceSettingsDTO {\n");
    
    sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
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


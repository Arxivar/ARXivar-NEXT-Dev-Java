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
 * Dto for user default binders type and state selection
 */
@ApiModel(description = "Dto for user default binders type and state selection")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class BinderUserDefaultTypeAndStateDto {
  @SerializedName("defaultBinderType")
  private Integer defaultBinderType = null;

  @SerializedName("defaultBinderState")
  private Integer defaultBinderState = null;

  public BinderUserDefaultTypeAndStateDto defaultBinderType(Integer defaultBinderType) {
    this.defaultBinderType = defaultBinderType;
    return this;
  }

   /**
   * Default binder type
   * @return defaultBinderType
  **/
  @ApiModelProperty(value = "Default binder type")
  public Integer getDefaultBinderType() {
    return defaultBinderType;
  }

  public void setDefaultBinderType(Integer defaultBinderType) {
    this.defaultBinderType = defaultBinderType;
  }

  public BinderUserDefaultTypeAndStateDto defaultBinderState(Integer defaultBinderState) {
    this.defaultBinderState = defaultBinderState;
    return this;
  }

   /**
   * Default binder state
   * @return defaultBinderState
  **/
  @ApiModelProperty(value = "Default binder state")
  public Integer getDefaultBinderState() {
    return defaultBinderState;
  }

  public void setDefaultBinderState(Integer defaultBinderState) {
    this.defaultBinderState = defaultBinderState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinderUserDefaultTypeAndStateDto binderUserDefaultTypeAndStateDto = (BinderUserDefaultTypeAndStateDto) o;
    return Objects.equals(this.defaultBinderType, binderUserDefaultTypeAndStateDto.defaultBinderType) &&
        Objects.equals(this.defaultBinderState, binderUserDefaultTypeAndStateDto.defaultBinderState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBinderType, defaultBinderState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinderUserDefaultTypeAndStateDto {\n");
    
    sb.append("    defaultBinderType: ").append(toIndentedString(defaultBinderType)).append("\n");
    sb.append("    defaultBinderState: ").append(toIndentedString(defaultBinderState)).append("\n");
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


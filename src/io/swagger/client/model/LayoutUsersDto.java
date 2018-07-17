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
 * Class of users layout
 */
@ApiModel(description = "Class of users layout")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class LayoutUsersDto {
  @SerializedName("layoutId")
  private Integer layoutId = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("completeName")
  private String completeName = null;

  @SerializedName("category")
  private Integer category = null;

  public LayoutUsersDto layoutId(Integer layoutId) {
    this.layoutId = layoutId;
    return this;
  }

   /**
   * Layout Identifier
   * @return layoutId
  **/
  @ApiModelProperty(value = "Layout Identifier")
  public Integer getLayoutId() {
    return layoutId;
  }

  public void setLayoutId(Integer layoutId) {
    this.layoutId = layoutId;
  }

  public LayoutUsersDto userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User Identifier
   * @return userId
  **/
  @ApiModelProperty(value = "User Identifier")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public LayoutUsersDto completeName(String completeName) {
    this.completeName = completeName;
    return this;
  }

   /**
   * User Name
   * @return completeName
  **/
  @ApiModelProperty(value = "User Name")
  public String getCompleteName() {
    return completeName;
  }

  public void setCompleteName(String completeName) {
    this.completeName = completeName;
  }

  public LayoutUsersDto category(Integer category) {
    this.category = category;
    return this;
  }

   /**
   * User Category
   * @return category
  **/
  @ApiModelProperty(value = "User Category")
  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutUsersDto layoutUsersDto = (LayoutUsersDto) o;
    return Objects.equals(this.layoutId, layoutUsersDto.layoutId) &&
        Objects.equals(this.userId, layoutUsersDto.userId) &&
        Objects.equals(this.completeName, layoutUsersDto.completeName) &&
        Objects.equals(this.category, layoutUsersDto.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layoutId, userId, completeName, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayoutUsersDto {\n");
    
    sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    completeName: ").append(toIndentedString(completeName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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


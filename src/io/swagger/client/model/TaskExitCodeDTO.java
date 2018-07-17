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
import java.util.ArrayList;
import java.util.List;

/**
 * Dto for task exit code definition
 */
@ApiModel(description = "Dto for task exit code definition")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TaskExitCodeDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("icon")
  private Integer icon = null;

  @SerializedName("translatedDescription")
  private String translatedDescription = null;

  @SerializedName("taskIds")
  private List<Integer> taskIds = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  public TaskExitCodeDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the exit code
   * @return id
  **/
  @ApiModelProperty(value = "Id of the exit code")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TaskExitCodeDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the exit code
   * @return value
  **/
  @ApiModelProperty(value = "The value of the exit code")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TaskExitCodeDTO icon(Integer icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Icon idex of the exit code
   * @return icon
  **/
  @ApiModelProperty(value = "Icon idex of the exit code")
  public Integer getIcon() {
    return icon;
  }

  public void setIcon(Integer icon) {
    this.icon = icon;
  }

  public TaskExitCodeDTO translatedDescription(String translatedDescription) {
    this.translatedDescription = translatedDescription;
    return this;
  }

   /**
   * Translated description in the user language
   * @return translatedDescription
  **/
  @ApiModelProperty(value = "Translated description in the user language")
  public String getTranslatedDescription() {
    return translatedDescription;
  }

  public void setTranslatedDescription(String translatedDescription) {
    this.translatedDescription = translatedDescription;
  }

  public TaskExitCodeDTO taskIds(List<Integer> taskIds) {
    this.taskIds = taskIds;
    return this;
  }

  public TaskExitCodeDTO addTaskIdsItem(Integer taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<Integer>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * Ids of taskwork eligible for this exitcode
   * @return taskIds
  **/
  @ApiModelProperty(value = "Ids of taskwork eligible for this exitcode")
  public List<Integer> getTaskIds() {
    return taskIds;
  }

  public void setTaskIds(List<Integer> taskIds) {
    this.taskIds = taskIds;
  }

  public TaskExitCodeDTO isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is default exit code
   * @return isDefault
  **/
  @ApiModelProperty(value = "Is default exit code")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskExitCodeDTO taskExitCodeDTO = (TaskExitCodeDTO) o;
    return Objects.equals(this.id, taskExitCodeDTO.id) &&
        Objects.equals(this.value, taskExitCodeDTO.value) &&
        Objects.equals(this.icon, taskExitCodeDTO.icon) &&
        Objects.equals(this.translatedDescription, taskExitCodeDTO.translatedDescription) &&
        Objects.equals(this.taskIds, taskExitCodeDTO.taskIds) &&
        Objects.equals(this.isDefault, taskExitCodeDTO.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, icon, translatedDescription, taskIds, isDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskExitCodeDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    translatedDescription: ").append(toIndentedString(translatedDescription)).append("\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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


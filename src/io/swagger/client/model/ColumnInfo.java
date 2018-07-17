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
 * Class of column information
 */
@ApiModel(description = "Class of column information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ColumnInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("fieldType")
  private Integer fieldType = null;

  public ColumnInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ColumnInfo label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label
   * @return label
  **/
  @ApiModelProperty(value = "Label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ColumnInfo fieldType(Integer fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Possible values:  0: Standard  1: Group  2: Additional 
   * @return fieldType
  **/
  @ApiModelProperty(value = "Possible values:  0: Standard  1: Group  2: Additional ")
  public Integer getFieldType() {
    return fieldType;
  }

  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnInfo columnInfo = (ColumnInfo) o;
    return Objects.equals(this.name, columnInfo.name) &&
        Objects.equals(this.label, columnInfo.label) &&
        Objects.equals(this.fieldType, columnInfo.fieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, fieldType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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


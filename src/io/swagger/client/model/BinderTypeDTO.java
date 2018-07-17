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
import io.swagger.client.model.FieldBaseDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of binder type
 */
@ApiModel(description = "Class of binder type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class BinderTypeDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("binderType")
  private String binderType = null;

  @SerializedName("folderId")
  private Integer folderId = null;

  @SerializedName("dynamicFolder")
  private String dynamicFolder = null;

  @SerializedName("progressive")
  private Integer progressive = null;

  @SerializedName("dynamicNumber")
  private String dynamicNumber = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("fields")
  private List<FieldBaseDTO> fields = null;

  @SerializedName("default")
  private Boolean _default = null;

  public BinderTypeDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier
   * @return id
  **/
  @ApiModelProperty(value = "Identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BinderTypeDTO binderType(String binderType) {
    this.binderType = binderType;
    return this;
  }

   /**
   * Type Identifier
   * @return binderType
  **/
  @ApiModelProperty(value = "Type Identifier")
  public String getBinderType() {
    return binderType;
  }

  public void setBinderType(String binderType) {
    this.binderType = binderType;
  }

  public BinderTypeDTO folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * Folder Identifier
   * @return folderId
  **/
  @ApiModelProperty(value = "Folder Identifier")
  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public BinderTypeDTO dynamicFolder(String dynamicFolder) {
    this.dynamicFolder = dynamicFolder;
    return this;
  }

   /**
   * Dynamic Folder
   * @return dynamicFolder
  **/
  @ApiModelProperty(value = "Dynamic Folder")
  public String getDynamicFolder() {
    return dynamicFolder;
  }

  public void setDynamicFolder(String dynamicFolder) {
    this.dynamicFolder = dynamicFolder;
  }

  public BinderTypeDTO progressive(Integer progressive) {
    this.progressive = progressive;
    return this;
  }

   /**
   * Progressive number
   * @return progressive
  **/
  @ApiModelProperty(value = "Progressive number")
  public Integer getProgressive() {
    return progressive;
  }

  public void setProgressive(Integer progressive) {
    this.progressive = progressive;
  }

  public BinderTypeDTO dynamicNumber(String dynamicNumber) {
    this.dynamicNumber = dynamicNumber;
    return this;
  }

   /**
   * Dynamic Progressive number
   * @return dynamicNumber
  **/
  @ApiModelProperty(value = "Dynamic Progressive number")
  public String getDynamicNumber() {
    return dynamicNumber;
  }

  public void setDynamicNumber(String dynamicNumber) {
    this.dynamicNumber = dynamicNumber;
  }

  public BinderTypeDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External Identifier
   * @return externalId
  **/
  @ApiModelProperty(value = "External Identifier")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public BinderTypeDTO fields(List<FieldBaseDTO> fields) {
    this.fields = fields;
    return this;
  }

  public BinderTypeDTO addFieldsItem(FieldBaseDTO fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldBaseDTO>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Custom Fields
   * @return fields
  **/
  @ApiModelProperty(value = "Custom Fields")
  public List<FieldBaseDTO> getFields() {
    return fields;
  }

  public void setFields(List<FieldBaseDTO> fields) {
    this.fields = fields;
  }

  public BinderTypeDTO _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * As default
   * @return _default
  **/
  @ApiModelProperty(value = "As default")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinderTypeDTO binderTypeDTO = (BinderTypeDTO) o;
    return Objects.equals(this.id, binderTypeDTO.id) &&
        Objects.equals(this.binderType, binderTypeDTO.binderType) &&
        Objects.equals(this.folderId, binderTypeDTO.folderId) &&
        Objects.equals(this.dynamicFolder, binderTypeDTO.dynamicFolder) &&
        Objects.equals(this.progressive, binderTypeDTO.progressive) &&
        Objects.equals(this.dynamicNumber, binderTypeDTO.dynamicNumber) &&
        Objects.equals(this.externalId, binderTypeDTO.externalId) &&
        Objects.equals(this.fields, binderTypeDTO.fields) &&
        Objects.equals(this._default, binderTypeDTO._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, binderType, folderId, dynamicFolder, progressive, dynamicNumber, externalId, fields, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinderTypeDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    binderType: ").append(toIndentedString(binderType)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    dynamicFolder: ").append(toIndentedString(dynamicFolder)).append("\n");
    sb.append("    progressive: ").append(toIndentedString(progressive)).append("\n");
    sb.append("    dynamicNumber: ").append(toIndentedString(dynamicNumber)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

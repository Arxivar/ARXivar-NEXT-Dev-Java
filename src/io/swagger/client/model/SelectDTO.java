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
import io.swagger.client.model.FieldBaseForSelectDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of Select data
 */
@ApiModel(description = "Class of Select data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class SelectDTO {
  @SerializedName("fields")
  private List<FieldBaseForSelectDTO> fields = null;

  @SerializedName("maxItems")
  private Integer maxItems = null;

  public SelectDTO fields(List<FieldBaseForSelectDTO> fields) {
    this.fields = fields;
    return this;
  }

  public SelectDTO addFieldsItem(FieldBaseForSelectDTO fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldBaseForSelectDTO>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields
   * @return fields
  **/
  @ApiModelProperty(value = "Fields")
  public List<FieldBaseForSelectDTO> getFields() {
    return fields;
  }

  public void setFields(List<FieldBaseForSelectDTO> fields) {
    this.fields = fields;
  }

  public SelectDTO maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

   /**
   * Maximum Number of items
   * @return maxItems
  **/
  @ApiModelProperty(value = "Maximum Number of items")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectDTO selectDTO = (SelectDTO) o;
    return Objects.equals(this.fields, selectDTO.fields) &&
        Objects.equals(this.maxItems, selectDTO.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, maxItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectDTO {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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

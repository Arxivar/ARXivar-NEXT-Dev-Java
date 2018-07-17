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
 * Class of request element to apply timestamp
 */
@ApiModel(description = "Class of request element to apply timestamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TimestampElementRequestDTO {
  @SerializedName("tableType")
  private Integer tableType = null;

  @SerializedName("docId")
  private String docId = null;

  @SerializedName("docExtraId")
  private String docExtraId = null;

  public TimestampElementRequestDTO tableType(Integer tableType) {
    this.tableType = tableType;
    return this;
  }

   /**
   * Possible values:  0: Attachment  2: TaskWorkAttachment  14: Profile  74: ProcessDoc 
   * @return tableType
  **/
  @ApiModelProperty(value = "Possible values:  0: Attachment  2: TaskWorkAttachment  14: Profile  74: ProcessDoc ")
  public Integer getTableType() {
    return tableType;
  }

  public void setTableType(Integer tableType) {
    this.tableType = tableType;
  }

  public TimestampElementRequestDTO docId(String docId) {
    this.docId = docId;
    return this;
  }

   /**
   * Document Identifier
   * @return docId
  **/
  @ApiModelProperty(value = "Document Identifier")
  public String getDocId() {
    return docId;
  }

  public void setDocId(String docId) {
    this.docId = docId;
  }

  public TimestampElementRequestDTO docExtraId(String docExtraId) {
    this.docExtraId = docExtraId;
    return this;
  }

   /**
   * Document External Identifier
   * @return docExtraId
  **/
  @ApiModelProperty(value = "Document External Identifier")
  public String getDocExtraId() {
    return docExtraId;
  }

  public void setDocExtraId(String docExtraId) {
    this.docExtraId = docExtraId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimestampElementRequestDTO timestampElementRequestDTO = (TimestampElementRequestDTO) o;
    return Objects.equals(this.tableType, timestampElementRequestDTO.tableType) &&
        Objects.equals(this.docId, timestampElementRequestDTO.docId) &&
        Objects.equals(this.docExtraId, timestampElementRequestDTO.docExtraId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableType, docId, docExtraId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampElementRequestDTO {\n");
    
    sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docExtraId: ").append(toIndentedString(docExtraId)).append("\n");
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

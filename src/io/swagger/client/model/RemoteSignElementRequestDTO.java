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
import io.swagger.client.model.SignPdfPropertiesDTO;
import java.io.IOException;

/**
 * Class of remote signature field
 */
@ApiModel(description = "Class of remote signature field")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class RemoteSignElementRequestDTO {
  @SerializedName("tableType")
  private Integer tableType = null;

  @SerializedName("docId")
  private String docId = null;

  @SerializedName("docExtraId")
  private String docExtraId = null;

  @SerializedName("pdfEmbeddedMode")
  private Boolean pdfEmbeddedMode = null;

  @SerializedName("signPdfProperties")
  private SignPdfPropertiesDTO signPdfProperties = null;

  public RemoteSignElementRequestDTO tableType(Integer tableType) {
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

  public RemoteSignElementRequestDTO docId(String docId) {
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

  public RemoteSignElementRequestDTO docExtraId(String docExtraId) {
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

  public RemoteSignElementRequestDTO pdfEmbeddedMode(Boolean pdfEmbeddedMode) {
    this.pdfEmbeddedMode = pdfEmbeddedMode;
    return this;
  }

   /**
   * Enabled Pdf Embedded Signature
   * @return pdfEmbeddedMode
  **/
  @ApiModelProperty(value = "Enabled Pdf Embedded Signature")
  public Boolean isPdfEmbeddedMode() {
    return pdfEmbeddedMode;
  }

  public void setPdfEmbeddedMode(Boolean pdfEmbeddedMode) {
    this.pdfEmbeddedMode = pdfEmbeddedMode;
  }

  public RemoteSignElementRequestDTO signPdfProperties(SignPdfPropertiesDTO signPdfProperties) {
    this.signPdfProperties = signPdfProperties;
    return this;
  }

   /**
   * Settings of pdf signature
   * @return signPdfProperties
  **/
  @ApiModelProperty(value = "Settings of pdf signature")
  public SignPdfPropertiesDTO getSignPdfProperties() {
    return signPdfProperties;
  }

  public void setSignPdfProperties(SignPdfPropertiesDTO signPdfProperties) {
    this.signPdfProperties = signPdfProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSignElementRequestDTO remoteSignElementRequestDTO = (RemoteSignElementRequestDTO) o;
    return Objects.equals(this.tableType, remoteSignElementRequestDTO.tableType) &&
        Objects.equals(this.docId, remoteSignElementRequestDTO.docId) &&
        Objects.equals(this.docExtraId, remoteSignElementRequestDTO.docExtraId) &&
        Objects.equals(this.pdfEmbeddedMode, remoteSignElementRequestDTO.pdfEmbeddedMode) &&
        Objects.equals(this.signPdfProperties, remoteSignElementRequestDTO.signPdfProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableType, docId, docExtraId, pdfEmbeddedMode, signPdfProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteSignElementRequestDTO {\n");
    
    sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docExtraId: ").append(toIndentedString(docExtraId)).append("\n");
    sb.append("    pdfEmbeddedMode: ").append(toIndentedString(pdfEmbeddedMode)).append("\n");
    sb.append("    signPdfProperties: ").append(toIndentedString(signPdfProperties)).append("\n");
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


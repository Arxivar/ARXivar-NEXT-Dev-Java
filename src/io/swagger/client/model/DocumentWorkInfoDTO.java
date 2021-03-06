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
import org.joda.time.DateTime;

/**
 * Class of document of workflow process
 */
@ApiModel(description = "Class of document of workflow process")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class DocumentWorkInfoDTO {
  @SerializedName("processDocId")
  private Integer processDocId = null;

  @SerializedName("docnumber")
  private Integer docnumber = null;

  @SerializedName("processDocRevision")
  private Integer processDocRevision = null;

  @SerializedName("state")
  private Integer state = null;

  @SerializedName("important")
  private Boolean important = null;

  @SerializedName("processDocDate")
  private DateTime processDocDate = null;

  @SerializedName("currentRevision")
  private Integer currentRevision = null;

  @SerializedName("userCompleteName")
  private String userCompleteName = null;

  @SerializedName("internalProtocol")
  private String internalProtocol = null;

  @SerializedName("dataDoc")
  private DateTime dataDoc = null;

  @SerializedName("subject")
  private String subject = null;

  public DocumentWorkInfoDTO processDocId(Integer processDocId) {
    this.processDocId = processDocId;
    return this;
  }

   /**
   * Document Process Identifier
   * @return processDocId
  **/
  @ApiModelProperty(value = "Document Process Identifier")
  public Integer getProcessDocId() {
    return processDocId;
  }

  public void setProcessDocId(Integer processDocId) {
    this.processDocId = processDocId;
  }

  public DocumentWorkInfoDTO docnumber(Integer docnumber) {
    this.docnumber = docnumber;
    return this;
  }

   /**
   * Document Identifier
   * @return docnumber
  **/
  @ApiModelProperty(value = "Document Identifier")
  public Integer getDocnumber() {
    return docnumber;
  }

  public void setDocnumber(Integer docnumber) {
    this.docnumber = docnumber;
  }

  public DocumentWorkInfoDTO processDocRevision(Integer processDocRevision) {
    this.processDocRevision = processDocRevision;
    return this;
  }

   /**
   * Document Process Revision
   * @return processDocRevision
  **/
  @ApiModelProperty(value = "Document Process Revision")
  public Integer getProcessDocRevision() {
    return processDocRevision;
  }

  public void setProcessDocRevision(Integer processDocRevision) {
    this.processDocRevision = processDocRevision;
  }

  public DocumentWorkInfoDTO state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Possible values:  0: Secondario  1: Principale 
   * @return state
  **/
  @ApiModelProperty(value = "Possible values:  0: Secondario  1: Principale ")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public DocumentWorkInfoDTO important(Boolean important) {
    this.important = important;
    return this;
  }

   /**
   * Important
   * @return important
  **/
  @ApiModelProperty(value = "Important")
  public Boolean isImportant() {
    return important;
  }

  public void setImportant(Boolean important) {
    this.important = important;
  }

  public DocumentWorkInfoDTO processDocDate(DateTime processDocDate) {
    this.processDocDate = processDocDate;
    return this;
  }

   /**
   * Creation Date of Document Process
   * @return processDocDate
  **/
  @ApiModelProperty(value = "Creation Date of Document Process")
  public DateTime getProcessDocDate() {
    return processDocDate;
  }

  public void setProcessDocDate(DateTime processDocDate) {
    this.processDocDate = processDocDate;
  }

  public DocumentWorkInfoDTO currentRevision(Integer currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

   /**
   * Document Revision
   * @return currentRevision
  **/
  @ApiModelProperty(value = "Document Revision")
  public Integer getCurrentRevision() {
    return currentRevision;
  }

  public void setCurrentRevision(Integer currentRevision) {
    this.currentRevision = currentRevision;
  }

  public DocumentWorkInfoDTO userCompleteName(String userCompleteName) {
    this.userCompleteName = userCompleteName;
    return this;
  }

   /**
   * User Description
   * @return userCompleteName
  **/
  @ApiModelProperty(value = "User Description")
  public String getUserCompleteName() {
    return userCompleteName;
  }

  public void setUserCompleteName(String userCompleteName) {
    this.userCompleteName = userCompleteName;
  }

  public DocumentWorkInfoDTO internalProtocol(String internalProtocol) {
    this.internalProtocol = internalProtocol;
    return this;
  }

   /**
   * Internal Protocol Number
   * @return internalProtocol
  **/
  @ApiModelProperty(value = "Internal Protocol Number")
  public String getInternalProtocol() {
    return internalProtocol;
  }

  public void setInternalProtocol(String internalProtocol) {
    this.internalProtocol = internalProtocol;
  }

  public DocumentWorkInfoDTO dataDoc(DateTime dataDoc) {
    this.dataDoc = dataDoc;
    return this;
  }

   /**
   * Document Date
   * @return dataDoc
  **/
  @ApiModelProperty(value = "Document Date")
  public DateTime getDataDoc() {
    return dataDoc;
  }

  public void setDataDoc(DateTime dataDoc) {
    this.dataDoc = dataDoc;
  }

  public DocumentWorkInfoDTO subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Document Subject
   * @return subject
  **/
  @ApiModelProperty(value = "Document Subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentWorkInfoDTO documentWorkInfoDTO = (DocumentWorkInfoDTO) o;
    return Objects.equals(this.processDocId, documentWorkInfoDTO.processDocId) &&
        Objects.equals(this.docnumber, documentWorkInfoDTO.docnumber) &&
        Objects.equals(this.processDocRevision, documentWorkInfoDTO.processDocRevision) &&
        Objects.equals(this.state, documentWorkInfoDTO.state) &&
        Objects.equals(this.important, documentWorkInfoDTO.important) &&
        Objects.equals(this.processDocDate, documentWorkInfoDTO.processDocDate) &&
        Objects.equals(this.currentRevision, documentWorkInfoDTO.currentRevision) &&
        Objects.equals(this.userCompleteName, documentWorkInfoDTO.userCompleteName) &&
        Objects.equals(this.internalProtocol, documentWorkInfoDTO.internalProtocol) &&
        Objects.equals(this.dataDoc, documentWorkInfoDTO.dataDoc) &&
        Objects.equals(this.subject, documentWorkInfoDTO.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDocId, docnumber, processDocRevision, state, important, processDocDate, currentRevision, userCompleteName, internalProtocol, dataDoc, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentWorkInfoDTO {\n");
    
    sb.append("    processDocId: ").append(toIndentedString(processDocId)).append("\n");
    sb.append("    docnumber: ").append(toIndentedString(docnumber)).append("\n");
    sb.append("    processDocRevision: ").append(toIndentedString(processDocRevision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
    sb.append("    processDocDate: ").append(toIndentedString(processDocDate)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    userCompleteName: ").append(toIndentedString(userCompleteName)).append("\n");
    sb.append("    internalProtocol: ").append(toIndentedString(internalProtocol)).append("\n");
    sb.append("    dataDoc: ").append(toIndentedString(dataDoc)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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


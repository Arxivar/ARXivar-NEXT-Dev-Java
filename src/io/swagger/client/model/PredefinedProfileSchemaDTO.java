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
import io.swagger.client.model.AuthorityDataDTO;
import io.swagger.client.model.FieldBaseDTO;
import io.swagger.client.model.FileDTO;
import io.swagger.client.model.NoteDTO;
import io.swagger.client.model.PostProfilationActionDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of predefined profile schema
 */
@ApiModel(description = "Class of predefined profile schema")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class PredefinedProfileSchemaDTO {
  @SerializedName("predefinedProfileId")
  private Integer predefinedProfileId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("document")
  private FileDTO document = null;

  @SerializedName("fields")
  private List<FieldBaseDTO> fields = null;

  @SerializedName("postProfilationActions")
  private List<PostProfilationActionDTO> postProfilationActions = null;

  @SerializedName("constrainRoleBehaviour")
  private Integer constrainRoleBehaviour = null;

  @SerializedName("attachments")
  private List<String> attachments = null;

  @SerializedName("notes")
  private List<NoteDTO> notes = null;

  @SerializedName("paNotes")
  private List<String> paNotes = null;

  @SerializedName("authorityData")
  private AuthorityDataDTO authorityData = null;

  @SerializedName("generatePaProtocol")
  private Boolean generatePaProtocol = null;

  public PredefinedProfileSchemaDTO predefinedProfileId(Integer predefinedProfileId) {
    this.predefinedProfileId = predefinedProfileId;
    return this;
  }

   /**
   * Predefined Profile Identifier
   * @return predefinedProfileId
  **/
  @ApiModelProperty(value = "Predefined Profile Identifier")
  public Integer getPredefinedProfileId() {
    return predefinedProfileId;
  }

  public void setPredefinedProfileId(Integer predefinedProfileId) {
    this.predefinedProfileId = predefinedProfileId;
  }

  public PredefinedProfileSchemaDTO id(Integer id) {
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

  public PredefinedProfileSchemaDTO document(FileDTO document) {
    this.document = document;
    return this;
  }

   /**
   * File data
   * @return document
  **/
  @ApiModelProperty(value = "File data")
  public FileDTO getDocument() {
    return document;
  }

  public void setDocument(FileDTO document) {
    this.document = document;
  }

  public PredefinedProfileSchemaDTO fields(List<FieldBaseDTO> fields) {
    this.fields = fields;
    return this;
  }

  public PredefinedProfileSchemaDTO addFieldsItem(FieldBaseDTO fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldBaseDTO>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields
   * @return fields
  **/
  @ApiModelProperty(value = "Fields")
  public List<FieldBaseDTO> getFields() {
    return fields;
  }

  public void setFields(List<FieldBaseDTO> fields) {
    this.fields = fields;
  }

  public PredefinedProfileSchemaDTO postProfilationActions(List<PostProfilationActionDTO> postProfilationActions) {
    this.postProfilationActions = postProfilationActions;
    return this;
  }

  public PredefinedProfileSchemaDTO addPostProfilationActionsItem(PostProfilationActionDTO postProfilationActionsItem) {
    if (this.postProfilationActions == null) {
      this.postProfilationActions = new ArrayList<PostProfilationActionDTO>();
    }
    this.postProfilationActions.add(postProfilationActionsItem);
    return this;
  }

   /**
   * Post Profilation Actions
   * @return postProfilationActions
  **/
  @ApiModelProperty(value = "Post Profilation Actions")
  public List<PostProfilationActionDTO> getPostProfilationActions() {
    return postProfilationActions;
  }

  public void setPostProfilationActions(List<PostProfilationActionDTO> postProfilationActions) {
    this.postProfilationActions = postProfilationActions;
  }

  public PredefinedProfileSchemaDTO constrainRoleBehaviour(Integer constrainRoleBehaviour) {
    this.constrainRoleBehaviour = constrainRoleBehaviour;
    return this;
  }

   /**
   * Possible values:  0: None  1: ForceInsert  2: State 
   * @return constrainRoleBehaviour
  **/
  @ApiModelProperty(value = "Possible values:  0: None  1: ForceInsert  2: State ")
  public Integer getConstrainRoleBehaviour() {
    return constrainRoleBehaviour;
  }

  public void setConstrainRoleBehaviour(Integer constrainRoleBehaviour) {
    this.constrainRoleBehaviour = constrainRoleBehaviour;
  }

  public PredefinedProfileSchemaDTO attachments(List<String> attachments) {
    this.attachments = attachments;
    return this;
  }

  public PredefinedProfileSchemaDTO addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<String>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments")
  public List<String> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }

  public PredefinedProfileSchemaDTO notes(List<NoteDTO> notes) {
    this.notes = notes;
    return this;
  }

  public PredefinedProfileSchemaDTO addNotesItem(NoteDTO notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<NoteDTO>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Notes
   * @return notes
  **/
  @ApiModelProperty(value = "Notes")
  public List<NoteDTO> getNotes() {
    return notes;
  }

  public void setNotes(List<NoteDTO> notes) {
    this.notes = notes;
  }

  public PredefinedProfileSchemaDTO paNotes(List<String> paNotes) {
    this.paNotes = paNotes;
    return this;
  }

  public PredefinedProfileSchemaDTO addPaNotesItem(String paNotesItem) {
    if (this.paNotes == null) {
      this.paNotes = new ArrayList<String>();
    }
    this.paNotes.add(paNotesItem);
    return this;
  }

   /**
   * Public Amministration Notes
   * @return paNotes
  **/
  @ApiModelProperty(value = "Public Amministration Notes")
  public List<String> getPaNotes() {
    return paNotes;
  }

  public void setPaNotes(List<String> paNotes) {
    this.paNotes = paNotes;
  }

  public PredefinedProfileSchemaDTO authorityData(AuthorityDataDTO authorityData) {
    this.authorityData = authorityData;
    return this;
  }

   /**
   * Authority Data
   * @return authorityData
  **/
  @ApiModelProperty(value = "Authority Data")
  public AuthorityDataDTO getAuthorityData() {
    return authorityData;
  }

  public void setAuthorityData(AuthorityDataDTO authorityData) {
    this.authorityData = authorityData;
  }

  public PredefinedProfileSchemaDTO generatePaProtocol(Boolean generatePaProtocol) {
    this.generatePaProtocol = generatePaProtocol;
    return this;
  }

   /**
   * Defines if a protocol has been generated
   * @return generatePaProtocol
  **/
  @ApiModelProperty(value = "Defines if a protocol has been generated")
  public Boolean isGeneratePaProtocol() {
    return generatePaProtocol;
  }

  public void setGeneratePaProtocol(Boolean generatePaProtocol) {
    this.generatePaProtocol = generatePaProtocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredefinedProfileSchemaDTO predefinedProfileSchemaDTO = (PredefinedProfileSchemaDTO) o;
    return Objects.equals(this.predefinedProfileId, predefinedProfileSchemaDTO.predefinedProfileId) &&
        Objects.equals(this.id, predefinedProfileSchemaDTO.id) &&
        Objects.equals(this.document, predefinedProfileSchemaDTO.document) &&
        Objects.equals(this.fields, predefinedProfileSchemaDTO.fields) &&
        Objects.equals(this.postProfilationActions, predefinedProfileSchemaDTO.postProfilationActions) &&
        Objects.equals(this.constrainRoleBehaviour, predefinedProfileSchemaDTO.constrainRoleBehaviour) &&
        Objects.equals(this.attachments, predefinedProfileSchemaDTO.attachments) &&
        Objects.equals(this.notes, predefinedProfileSchemaDTO.notes) &&
        Objects.equals(this.paNotes, predefinedProfileSchemaDTO.paNotes) &&
        Objects.equals(this.authorityData, predefinedProfileSchemaDTO.authorityData) &&
        Objects.equals(this.generatePaProtocol, predefinedProfileSchemaDTO.generatePaProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predefinedProfileId, id, document, fields, postProfilationActions, constrainRoleBehaviour, attachments, notes, paNotes, authorityData, generatePaProtocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredefinedProfileSchemaDTO {\n");
    
    sb.append("    predefinedProfileId: ").append(toIndentedString(predefinedProfileId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    postProfilationActions: ").append(toIndentedString(postProfilationActions)).append("\n");
    sb.append("    constrainRoleBehaviour: ").append(toIndentedString(constrainRoleBehaviour)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    paNotes: ").append(toIndentedString(paNotes)).append("\n");
    sb.append("    authorityData: ").append(toIndentedString(authorityData)).append("\n");
    sb.append("    generatePaProtocol: ").append(toIndentedString(generatePaProtocol)).append("\n");
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


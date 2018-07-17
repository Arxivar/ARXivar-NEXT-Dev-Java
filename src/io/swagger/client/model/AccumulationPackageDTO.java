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
 * AccumulationPackageDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class AccumulationPackageDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ixceAccumulationPackageId")
  private String ixceAccumulationPackageId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("creationDate")
  private DateTime creationDate = null;

  @SerializedName("lastUpdate")
  private DateTime lastUpdate = null;

  @SerializedName("documentTypeSystemId")
  private Integer documentTypeSystemId = null;

  @SerializedName("documentTypeDescription")
  private String documentTypeDescription = null;

  @SerializedName("serviceType")
  private Integer serviceType = null;

  @SerializedName("businessUnitId")
  private String businessUnitId = null;

  @SerializedName("organizationUnitId")
  private String organizationUnitId = null;

  @SerializedName("classId")
  private String classId = null;

  @SerializedName("ixceRuleId")
  private Integer ixceRuleId = null;

  public AccumulationPackageDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AccumulationPackageDTO ixceAccumulationPackageId(String ixceAccumulationPackageId) {
    this.ixceAccumulationPackageId = ixceAccumulationPackageId;
    return this;
  }

   /**
   * Get ixceAccumulationPackageId
   * @return ixceAccumulationPackageId
  **/
  @ApiModelProperty(value = "")
  public String getIxceAccumulationPackageId() {
    return ixceAccumulationPackageId;
  }

  public void setIxceAccumulationPackageId(String ixceAccumulationPackageId) {
    this.ixceAccumulationPackageId = ixceAccumulationPackageId;
  }

  public AccumulationPackageDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccumulationPackageDTO status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values:  0: Inserted  1: Created  2: Open  3: Closed  4: InProcessing  5: Error  6: Preserved  7: Reopened 
   * @return status
  **/
  @ApiModelProperty(value = "Possible values:  0: Inserted  1: Created  2: Open  3: Closed  4: InProcessing  5: Error  6: Preserved  7: Reopened ")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public AccumulationPackageDTO creationDate(DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(DateTime creationDate) {
    this.creationDate = creationDate;
  }

  public AccumulationPackageDTO lastUpdate(DateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(DateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public AccumulationPackageDTO documentTypeSystemId(Integer documentTypeSystemId) {
    this.documentTypeSystemId = documentTypeSystemId;
    return this;
  }

   /**
   * Get documentTypeSystemId
   * @return documentTypeSystemId
  **/
  @ApiModelProperty(value = "")
  public Integer getDocumentTypeSystemId() {
    return documentTypeSystemId;
  }

  public void setDocumentTypeSystemId(Integer documentTypeSystemId) {
    this.documentTypeSystemId = documentTypeSystemId;
  }

  public AccumulationPackageDTO documentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
    return this;
  }

   /**
   * Get documentTypeDescription
   * @return documentTypeDescription
  **/
  @ApiModelProperty(value = "")
  public String getDocumentTypeDescription() {
    return documentTypeDescription;
  }

  public void setDocumentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
  }

  public AccumulationPackageDTO serviceType(Integer serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Possible values:  0: IX  1: IXCE  2: IXCE_V2  3: IX_V2 
   * @return serviceType
  **/
  @ApiModelProperty(value = "Possible values:  0: IX  1: IXCE  2: IXCE_V2  3: IX_V2 ")
  public Integer getServiceType() {
    return serviceType;
  }

  public void setServiceType(Integer serviceType) {
    this.serviceType = serviceType;
  }

  public AccumulationPackageDTO businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }

   /**
   * Get businessUnitId
   * @return businessUnitId
  **/
  @ApiModelProperty(value = "")
  public String getBusinessUnitId() {
    return businessUnitId;
  }

  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }

  public AccumulationPackageDTO organizationUnitId(String organizationUnitId) {
    this.organizationUnitId = organizationUnitId;
    return this;
  }

   /**
   * Get organizationUnitId
   * @return organizationUnitId
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationUnitId() {
    return organizationUnitId;
  }

  public void setOrganizationUnitId(String organizationUnitId) {
    this.organizationUnitId = organizationUnitId;
  }

  public AccumulationPackageDTO classId(String classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @ApiModelProperty(value = "")
  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public AccumulationPackageDTO ixceRuleId(Integer ixceRuleId) {
    this.ixceRuleId = ixceRuleId;
    return this;
  }

   /**
   * Get ixceRuleId
   * @return ixceRuleId
  **/
  @ApiModelProperty(value = "")
  public Integer getIxceRuleId() {
    return ixceRuleId;
  }

  public void setIxceRuleId(Integer ixceRuleId) {
    this.ixceRuleId = ixceRuleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccumulationPackageDTO accumulationPackageDTO = (AccumulationPackageDTO) o;
    return Objects.equals(this.id, accumulationPackageDTO.id) &&
        Objects.equals(this.ixceAccumulationPackageId, accumulationPackageDTO.ixceAccumulationPackageId) &&
        Objects.equals(this.description, accumulationPackageDTO.description) &&
        Objects.equals(this.status, accumulationPackageDTO.status) &&
        Objects.equals(this.creationDate, accumulationPackageDTO.creationDate) &&
        Objects.equals(this.lastUpdate, accumulationPackageDTO.lastUpdate) &&
        Objects.equals(this.documentTypeSystemId, accumulationPackageDTO.documentTypeSystemId) &&
        Objects.equals(this.documentTypeDescription, accumulationPackageDTO.documentTypeDescription) &&
        Objects.equals(this.serviceType, accumulationPackageDTO.serviceType) &&
        Objects.equals(this.businessUnitId, accumulationPackageDTO.businessUnitId) &&
        Objects.equals(this.organizationUnitId, accumulationPackageDTO.organizationUnitId) &&
        Objects.equals(this.classId, accumulationPackageDTO.classId) &&
        Objects.equals(this.ixceRuleId, accumulationPackageDTO.ixceRuleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ixceAccumulationPackageId, description, status, creationDate, lastUpdate, documentTypeSystemId, documentTypeDescription, serviceType, businessUnitId, organizationUnitId, classId, ixceRuleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccumulationPackageDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ixceAccumulationPackageId: ").append(toIndentedString(ixceAccumulationPackageId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    documentTypeSystemId: ").append(toIndentedString(documentTypeSystemId)).append("\n");
    sb.append("    documentTypeDescription: ").append(toIndentedString(documentTypeDescription)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    organizationUnitId: ").append(toIndentedString(organizationUnitId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    ixceRuleId: ").append(toIndentedString(ixceRuleId)).append("\n");
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


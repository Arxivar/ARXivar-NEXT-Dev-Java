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
 * Class of workflow item
 */
@ApiModel(description = "Class of workflow item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class WorkflowDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("state")
  private Integer state = null;

  @SerializedName("organizationChart")
  private Integer organizationChart = null;

  @SerializedName("businessUnit")
  private String businessUnit = null;

  @SerializedName("color")
  private Integer color = null;

  @SerializedName("revision")
  private Integer revision = null;

  @SerializedName("workflowParentId")
  private Integer workflowParentId = null;

  @SerializedName("approvalDate")
  private DateTime approvalDate = null;

  @SerializedName("creationDate")
  private DateTime creationDate = null;

  @SerializedName("editDate")
  private DateTime editDate = null;

  @SerializedName("reason")
  private String reason = null;

  public WorkflowDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Identiifer
   * @return id
  **/
  @ApiModelProperty(value = "Identiifer")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WorkflowDTO detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Detail
   * @return detail
  **/
  @ApiModelProperty(value = "Detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public WorkflowDTO name(String name) {
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

  public WorkflowDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkflowDTO state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Possible values:  0: Deleted  1: Online  2: InEdit  3: Approving 
   * @return state
  **/
  @ApiModelProperty(value = "Possible values:  0: Deleted  1: Online  2: InEdit  3: Approving ")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public WorkflowDTO organizationChart(Integer organizationChart) {
    this.organizationChart = organizationChart;
    return this;
  }

   /**
   * Organization chart Identifier
   * @return organizationChart
  **/
  @ApiModelProperty(value = "Organization chart Identifier")
  public Integer getOrganizationChart() {
    return organizationChart;
  }

  public void setOrganizationChart(Integer organizationChart) {
    this.organizationChart = organizationChart;
  }

  public WorkflowDTO businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

   /**
   * Business unit Code
   * @return businessUnit
  **/
  @ApiModelProperty(value = "Business unit Code")
  public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public WorkflowDTO color(Integer color) {
    this.color = color;
    return this;
  }

   /**
   * Color code
   * @return color
  **/
  @ApiModelProperty(value = "Color code")
  public Integer getColor() {
    return color;
  }

  public void setColor(Integer color) {
    this.color = color;
  }

  public WorkflowDTO revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Revision Number
   * @return revision
  **/
  @ApiModelProperty(value = "Revision Number")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public WorkflowDTO workflowParentId(Integer workflowParentId) {
    this.workflowParentId = workflowParentId;
    return this;
  }

   /**
   * Parent Identifier
   * @return workflowParentId
  **/
  @ApiModelProperty(value = "Parent Identifier")
  public Integer getWorkflowParentId() {
    return workflowParentId;
  }

  public void setWorkflowParentId(Integer workflowParentId) {
    this.workflowParentId = workflowParentId;
  }

  public WorkflowDTO approvalDate(DateTime approvalDate) {
    this.approvalDate = approvalDate;
    return this;
  }

   /**
   * Date of Approval
   * @return approvalDate
  **/
  @ApiModelProperty(value = "Date of Approval")
  public DateTime getApprovalDate() {
    return approvalDate;
  }

  public void setApprovalDate(DateTime approvalDate) {
    this.approvalDate = approvalDate;
  }

  public WorkflowDTO creationDate(DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Creation Date
   * @return creationDate
  **/
  @ApiModelProperty(value = "Creation Date")
  public DateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(DateTime creationDate) {
    this.creationDate = creationDate;
  }

  public WorkflowDTO editDate(DateTime editDate) {
    this.editDate = editDate;
    return this;
  }

   /**
   * Last Edit Date
   * @return editDate
  **/
  @ApiModelProperty(value = "Last Edit Date")
  public DateTime getEditDate() {
    return editDate;
  }

  public void setEditDate(DateTime editDate) {
    this.editDate = editDate;
  }

  public WorkflowDTO reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for the Revision
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the Revision")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowDTO workflowDTO = (WorkflowDTO) o;
    return Objects.equals(this.id, workflowDTO.id) &&
        Objects.equals(this.detail, workflowDTO.detail) &&
        Objects.equals(this.name, workflowDTO.name) &&
        Objects.equals(this.description, workflowDTO.description) &&
        Objects.equals(this.state, workflowDTO.state) &&
        Objects.equals(this.organizationChart, workflowDTO.organizationChart) &&
        Objects.equals(this.businessUnit, workflowDTO.businessUnit) &&
        Objects.equals(this.color, workflowDTO.color) &&
        Objects.equals(this.revision, workflowDTO.revision) &&
        Objects.equals(this.workflowParentId, workflowDTO.workflowParentId) &&
        Objects.equals(this.approvalDate, workflowDTO.approvalDate) &&
        Objects.equals(this.creationDate, workflowDTO.creationDate) &&
        Objects.equals(this.editDate, workflowDTO.editDate) &&
        Objects.equals(this.reason, workflowDTO.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, detail, name, description, state, organizationChart, businessUnit, color, revision, workflowParentId, approvalDate, creationDate, editDate, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    organizationChart: ").append(toIndentedString(organizationChart)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    workflowParentId: ").append(toIndentedString(workflowParentId)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    editDate: ").append(toIndentedString(editDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


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
import io.swagger.client.model.SearchDTO;
import io.swagger.client.model.SelectDTO;
import java.io.IOException;

/**
 * Class of View
 */
@ApiModel(description = "Class of View")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ViewDTO {
  @SerializedName("maxItems")
  private Integer maxItems = null;

  @SerializedName("documentTypeDescription")
  private String documentTypeDescription = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("user")
  private Integer user = null;

  @SerializedName("userCompleteName")
  private String userCompleteName = null;

  @SerializedName("documentType")
  private Integer documentType = null;

  @SerializedName("type2")
  private Integer type2 = null;

  @SerializedName("type3")
  private Integer type3 = null;

  @SerializedName("selectFields")
  private String selectFields = null;

  @SerializedName("editFields")
  private String editFields = null;

  @SerializedName("lockFields")
  private SearchDTO lockFields = null;

  @SerializedName("orderFields")
  private String orderFields = null;

  @SerializedName("showFields")
  private Boolean showFields = null;

  @SerializedName("formOpen")
  private Boolean formOpen = null;

  @SerializedName("allowEmptyFilterMode")
  private Integer allowEmptyFilterMode = null;

  @SerializedName("showGroupsMode")
  private Integer showGroupsMode = null;

  @SerializedName("canExecute")
  private Boolean canExecute = null;

  @SerializedName("canUpdate")
  private Boolean canUpdate = null;

  @SerializedName("canDelete")
  private Boolean canDelete = null;

  @SerializedName("searchFilterDto")
  private SearchDTO searchFilterDto = null;

  @SerializedName("selectFilterDto")
  private SelectDTO selectFilterDto = null;

  public ViewDTO maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

   /**
   * Max items for result
   * @return maxItems
  **/
  @ApiModelProperty(value = "Max items for result")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  public ViewDTO documentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
    return this;
  }

   /**
   * Description of Document Type
   * @return documentTypeDescription
  **/
  @ApiModelProperty(value = "Description of Document Type")
  public String getDocumentTypeDescription() {
    return documentTypeDescription;
  }

  public void setDocumentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
  }

  public ViewDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier
   * @return id
  **/
  @ApiModelProperty(value = "Identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ViewDTO description(String description) {
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

  public ViewDTO user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * Author Identifier
   * @return user
  **/
  @ApiModelProperty(value = "Author Identifier")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public ViewDTO userCompleteName(String userCompleteName) {
    this.userCompleteName = userCompleteName;
    return this;
  }

   /**
   * Author Complete Name
   * @return userCompleteName
  **/
  @ApiModelProperty(value = "Author Complete Name")
  public String getUserCompleteName() {
    return userCompleteName;
  }

  public void setUserCompleteName(String userCompleteName) {
    this.userCompleteName = userCompleteName;
  }

  public ViewDTO documentType(Integer documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Document Type of first level
   * @return documentType
  **/
  @ApiModelProperty(value = "Document Type of first level")
  public Integer getDocumentType() {
    return documentType;
  }

  public void setDocumentType(Integer documentType) {
    this.documentType = documentType;
  }

  public ViewDTO type2(Integer type2) {
    this.type2 = type2;
    return this;
  }

   /**
   * Document Type of second level
   * @return type2
  **/
  @ApiModelProperty(value = "Document Type of second level")
  public Integer getType2() {
    return type2;
  }

  public void setType2(Integer type2) {
    this.type2 = type2;
  }

  public ViewDTO type3(Integer type3) {
    this.type3 = type3;
    return this;
  }

   /**
   * Document Type of third level
   * @return type3
  **/
  @ApiModelProperty(value = "Document Type of third level")
  public Integer getType3() {
    return type3;
  }

  public void setType3(Integer type3) {
    this.type3 = type3;
  }

  public ViewDTO selectFields(String selectFields) {
    this.selectFields = selectFields;
    return this;
  }

   /**
   * Select Fields
   * @return selectFields
  **/
  @ApiModelProperty(value = "Select Fields")
  public String getSelectFields() {
    return selectFields;
  }

  public void setSelectFields(String selectFields) {
    this.selectFields = selectFields;
  }

  public ViewDTO editFields(String editFields) {
    this.editFields = editFields;
    return this;
  }

   /**
   * Edit Fields
   * @return editFields
  **/
  @ApiModelProperty(value = "Edit Fields")
  public String getEditFields() {
    return editFields;
  }

  public void setEditFields(String editFields) {
    this.editFields = editFields;
  }

  public ViewDTO lockFields(SearchDTO lockFields) {
    this.lockFields = lockFields;
    return this;
  }

   /**
   * Uneditable Fields
   * @return lockFields
  **/
  @ApiModelProperty(value = "Uneditable Fields")
  public SearchDTO getLockFields() {
    return lockFields;
  }

  public void setLockFields(SearchDTO lockFields) {
    this.lockFields = lockFields;
  }

  public ViewDTO orderFields(String orderFields) {
    this.orderFields = orderFields;
    return this;
  }

   /**
   * Order Fields
   * @return orderFields
  **/
  @ApiModelProperty(value = "Order Fields")
  public String getOrderFields() {
    return orderFields;
  }

  public void setOrderFields(String orderFields) {
    this.orderFields = orderFields;
  }

  public ViewDTO showFields(Boolean showFields) {
    this.showFields = showFields;
    return this;
  }

   /**
   * Show Fields
   * @return showFields
  **/
  @ApiModelProperty(value = "Show Fields")
  public Boolean isShowFields() {
    return showFields;
  }

  public void setShowFields(Boolean showFields) {
    this.showFields = showFields;
  }

  public ViewDTO formOpen(Boolean formOpen) {
    this.formOpen = formOpen;
    return this;
  }

   /**
   * Opening the search form after running the Arxivar client view.
   * @return formOpen
  **/
  @ApiModelProperty(value = "Opening the search form after running the Arxivar client view.")
  public Boolean isFormOpen() {
    return formOpen;
  }

  public void setFormOpen(Boolean formOpen) {
    this.formOpen = formOpen;
  }

  public ViewDTO allowEmptyFilterMode(Integer allowEmptyFilterMode) {
    this.allowEmptyFilterMode = allowEmptyFilterMode;
    return this;
  }

   /**
   * Possible values:  0: Yes  1: No  2: OnDemand 
   * @return allowEmptyFilterMode
  **/
  @ApiModelProperty(value = "Possible values:  0: Yes  1: No  2: OnDemand ")
  public Integer getAllowEmptyFilterMode() {
    return allowEmptyFilterMode;
  }

  public void setAllowEmptyFilterMode(Integer allowEmptyFilterMode) {
    this.allowEmptyFilterMode = allowEmptyFilterMode;
  }

  public ViewDTO showGroupsMode(Integer showGroupsMode) {
    this.showGroupsMode = showGroupsMode;
    return this;
  }

   /**
   * Possible values:  0: No  1: Yes 
   * @return showGroupsMode
  **/
  @ApiModelProperty(value = "Possible values:  0: No  1: Yes ")
  public Integer getShowGroupsMode() {
    return showGroupsMode;
  }

  public void setShowGroupsMode(Integer showGroupsMode) {
    this.showGroupsMode = showGroupsMode;
  }

  public ViewDTO canExecute(Boolean canExecute) {
    this.canExecute = canExecute;
    return this;
  }

   /**
   * Execute
   * @return canExecute
  **/
  @ApiModelProperty(value = "Execute")
  public Boolean isCanExecute() {
    return canExecute;
  }

  public void setCanExecute(Boolean canExecute) {
    this.canExecute = canExecute;
  }

  public ViewDTO canUpdate(Boolean canUpdate) {
    this.canUpdate = canUpdate;
    return this;
  }

   /**
   * Edit
   * @return canUpdate
  **/
  @ApiModelProperty(value = "Edit")
  public Boolean isCanUpdate() {
    return canUpdate;
  }

  public void setCanUpdate(Boolean canUpdate) {
    this.canUpdate = canUpdate;
  }

  public ViewDTO canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Delete
   * @return canDelete
  **/
  @ApiModelProperty(value = "Delete")
  public Boolean isCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public ViewDTO searchFilterDto(SearchDTO searchFilterDto) {
    this.searchFilterDto = searchFilterDto;
    return this;
  }

   /**
   * Get searchFilterDto
   * @return searchFilterDto
  **/
  @ApiModelProperty(value = "")
  public SearchDTO getSearchFilterDto() {
    return searchFilterDto;
  }

  public void setSearchFilterDto(SearchDTO searchFilterDto) {
    this.searchFilterDto = searchFilterDto;
  }

  public ViewDTO selectFilterDto(SelectDTO selectFilterDto) {
    this.selectFilterDto = selectFilterDto;
    return this;
  }

   /**
   * Get selectFilterDto
   * @return selectFilterDto
  **/
  @ApiModelProperty(value = "")
  public SelectDTO getSelectFilterDto() {
    return selectFilterDto;
  }

  public void setSelectFilterDto(SelectDTO selectFilterDto) {
    this.selectFilterDto = selectFilterDto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewDTO viewDTO = (ViewDTO) o;
    return Objects.equals(this.maxItems, viewDTO.maxItems) &&
        Objects.equals(this.documentTypeDescription, viewDTO.documentTypeDescription) &&
        Objects.equals(this.id, viewDTO.id) &&
        Objects.equals(this.description, viewDTO.description) &&
        Objects.equals(this.user, viewDTO.user) &&
        Objects.equals(this.userCompleteName, viewDTO.userCompleteName) &&
        Objects.equals(this.documentType, viewDTO.documentType) &&
        Objects.equals(this.type2, viewDTO.type2) &&
        Objects.equals(this.type3, viewDTO.type3) &&
        Objects.equals(this.selectFields, viewDTO.selectFields) &&
        Objects.equals(this.editFields, viewDTO.editFields) &&
        Objects.equals(this.lockFields, viewDTO.lockFields) &&
        Objects.equals(this.orderFields, viewDTO.orderFields) &&
        Objects.equals(this.showFields, viewDTO.showFields) &&
        Objects.equals(this.formOpen, viewDTO.formOpen) &&
        Objects.equals(this.allowEmptyFilterMode, viewDTO.allowEmptyFilterMode) &&
        Objects.equals(this.showGroupsMode, viewDTO.showGroupsMode) &&
        Objects.equals(this.canExecute, viewDTO.canExecute) &&
        Objects.equals(this.canUpdate, viewDTO.canUpdate) &&
        Objects.equals(this.canDelete, viewDTO.canDelete) &&
        Objects.equals(this.searchFilterDto, viewDTO.searchFilterDto) &&
        Objects.equals(this.selectFilterDto, viewDTO.selectFilterDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxItems, documentTypeDescription, id, description, user, userCompleteName, documentType, type2, type3, selectFields, editFields, lockFields, orderFields, showFields, formOpen, allowEmptyFilterMode, showGroupsMode, canExecute, canUpdate, canDelete, searchFilterDto, selectFilterDto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewDTO {\n");
    
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    documentTypeDescription: ").append(toIndentedString(documentTypeDescription)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userCompleteName: ").append(toIndentedString(userCompleteName)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    type2: ").append(toIndentedString(type2)).append("\n");
    sb.append("    type3: ").append(toIndentedString(type3)).append("\n");
    sb.append("    selectFields: ").append(toIndentedString(selectFields)).append("\n");
    sb.append("    editFields: ").append(toIndentedString(editFields)).append("\n");
    sb.append("    lockFields: ").append(toIndentedString(lockFields)).append("\n");
    sb.append("    orderFields: ").append(toIndentedString(orderFields)).append("\n");
    sb.append("    showFields: ").append(toIndentedString(showFields)).append("\n");
    sb.append("    formOpen: ").append(toIndentedString(formOpen)).append("\n");
    sb.append("    allowEmptyFilterMode: ").append(toIndentedString(allowEmptyFilterMode)).append("\n");
    sb.append("    showGroupsMode: ").append(toIndentedString(showGroupsMode)).append("\n");
    sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
    sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    searchFilterDto: ").append(toIndentedString(searchFilterDto)).append("\n");
    sb.append("    selectFilterDto: ").append(toIndentedString(selectFilterDto)).append("\n");
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


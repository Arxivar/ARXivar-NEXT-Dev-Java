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
import io.swagger.client.model.AssocitationFieldItem;
import io.swagger.client.model.ColumnInfo;
import io.swagger.client.model.DependencyFieldItem;
import io.swagger.client.model.DocumentTypeBaseDTO;
import io.swagger.client.model.FieldBaseDTO;
import io.swagger.client.model.RowSearchResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of additional field for Matrix type
 */
@ApiModel(description = "Class of additional field for Matrix type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class AdditionalFieldClasseDTO extends FieldBaseDTO {
  @SerializedName("value")
  private List<Integer> value = null;

  @SerializedName("composedValues")
  private List<RowSearchResult> composedValues = null;

  @SerializedName("documentType")
  private DocumentTypeBaseDTO documentType = null;

  @SerializedName("insertMaskId")
  private String insertMaskId = null;

  @SerializedName("showExpanded")
  private Boolean showExpanded = null;

  @SerializedName("singleElement")
  private Boolean singleElement = null;

  @SerializedName("columns")
  private List<ColumnInfo> columns = null;

  @SerializedName("additionalFieldType")
  private Integer additionalFieldType = null;

  @SerializedName("groupId")
  private Integer groupId = null;

  @SerializedName("binderFieldId")
  private Integer binderFieldId = null;

  @SerializedName("taskWorkVariableId")
  private Integer taskWorkVariableId = null;

  public AdditionalFieldClasseDTO value(List<Integer> value) {
    this.value = value;
    return this;
  }

  public AdditionalFieldClasseDTO addValueItem(Integer valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<Integer>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")
  public List<Integer> getValue() {
    return value;
  }

  public void setValue(List<Integer> value) {
    this.value = value;
  }

  public AdditionalFieldClasseDTO composedValues(List<RowSearchResult> composedValues) {
    this.composedValues = composedValues;
    return this;
  }

  public AdditionalFieldClasseDTO addComposedValuesItem(RowSearchResult composedValuesItem) {
    if (this.composedValues == null) {
      this.composedValues = new ArrayList<RowSearchResult>();
    }
    this.composedValues.add(composedValuesItem);
    return this;
  }

   /**
   * List of search items
   * @return composedValues
  **/
  @ApiModelProperty(value = "List of search items")
  public List<RowSearchResult> getComposedValues() {
    return composedValues;
  }

  public void setComposedValues(List<RowSearchResult> composedValues) {
    this.composedValues = composedValues;
  }

  public AdditionalFieldClasseDTO documentType(DocumentTypeBaseDTO documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Document Type for profiling
   * @return documentType
  **/
  @ApiModelProperty(value = "Document Type for profiling")
  public DocumentTypeBaseDTO getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeBaseDTO documentType) {
    this.documentType = documentType;
  }

  public AdditionalFieldClasseDTO insertMaskId(String insertMaskId) {
    this.insertMaskId = insertMaskId;
    return this;
  }

   /**
   * Identifier of the profiling mask
   * @return insertMaskId
  **/
  @ApiModelProperty(value = "Identifier of the profiling mask")
  public String getInsertMaskId() {
    return insertMaskId;
  }

  public void setInsertMaskId(String insertMaskId) {
    this.insertMaskId = insertMaskId;
  }

  public AdditionalFieldClasseDTO showExpanded(Boolean showExpanded) {
    this.showExpanded = showExpanded;
    return this;
  }

   /**
   * Show all expanded items
   * @return showExpanded
  **/
  @ApiModelProperty(value = "Show all expanded items")
  public Boolean isShowExpanded() {
    return showExpanded;
  }

  public void setShowExpanded(Boolean showExpanded) {
    this.showExpanded = showExpanded;
  }

  public AdditionalFieldClasseDTO singleElement(Boolean singleElement) {
    this.singleElement = singleElement;
    return this;
  }

   /**
   * Only one item
   * @return singleElement
  **/
  @ApiModelProperty(value = "Only one item")
  public Boolean isSingleElement() {
    return singleElement;
  }

  public void setSingleElement(Boolean singleElement) {
    this.singleElement = singleElement;
  }

  public AdditionalFieldClasseDTO columns(List<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public AdditionalFieldClasseDTO addColumnsItem(ColumnInfo columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ColumnInfo>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns to show
   * @return columns
  **/
  @ApiModelProperty(value = "Columns to show")
  public List<ColumnInfo> getColumns() {
    return columns;
  }

  public void setColumns(List<ColumnInfo> columns) {
    this.columns = columns;
  }

  public AdditionalFieldClasseDTO additionalFieldType(Integer additionalFieldType) {
    this.additionalFieldType = additionalFieldType;
    return this;
  }

   /**
   * Possible values:  0: Textbox  1: Databox  2: Numeric  3: Combobox  4: TableBox  5: Checkbox  6: MultiValue  7: ClasseBox  8: Group  9: RubricaBox  10: TextArea 
   * @return additionalFieldType
  **/
  @ApiModelProperty(value = "Possible values:  0: Textbox  1: Databox  2: Numeric  3: Combobox  4: TableBox  5: Checkbox  6: MultiValue  7: ClasseBox  8: Group  9: RubricaBox  10: TextArea ")
  public Integer getAdditionalFieldType() {
    return additionalFieldType;
  }

  public void setAdditionalFieldType(Integer additionalFieldType) {
    this.additionalFieldType = additionalFieldType;
  }

  public AdditionalFieldClasseDTO groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group Identifier
   * @return groupId
  **/
  @ApiModelProperty(value = "Group Identifier")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public AdditionalFieldClasseDTO binderFieldId(Integer binderFieldId) {
    this.binderFieldId = binderFieldId;
    return this;
  }

   /**
   * Binder Field Identifier
   * @return binderFieldId
  **/
  @ApiModelProperty(value = "Binder Field Identifier")
  public Integer getBinderFieldId() {
    return binderFieldId;
  }

  public void setBinderFieldId(Integer binderFieldId) {
    this.binderFieldId = binderFieldId;
  }

  public AdditionalFieldClasseDTO taskWorkVariableId(Integer taskWorkVariableId) {
    this.taskWorkVariableId = taskWorkVariableId;
    return this;
  }

   /**
   * Variable Identifier in taskword context
   * @return taskWorkVariableId
  **/
  @ApiModelProperty(value = "Variable Identifier in taskword context")
  public Integer getTaskWorkVariableId() {
    return taskWorkVariableId;
  }

  public void setTaskWorkVariableId(Integer taskWorkVariableId) {
    this.taskWorkVariableId = taskWorkVariableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalFieldClasseDTO additionalFieldClasseDTO = (AdditionalFieldClasseDTO) o;
    return Objects.equals(this.value, additionalFieldClasseDTO.value) &&
        Objects.equals(this.composedValues, additionalFieldClasseDTO.composedValues) &&
        Objects.equals(this.documentType, additionalFieldClasseDTO.documentType) &&
        Objects.equals(this.insertMaskId, additionalFieldClasseDTO.insertMaskId) &&
        Objects.equals(this.showExpanded, additionalFieldClasseDTO.showExpanded) &&
        Objects.equals(this.singleElement, additionalFieldClasseDTO.singleElement) &&
        Objects.equals(this.columns, additionalFieldClasseDTO.columns) &&
        Objects.equals(this.additionalFieldType, additionalFieldClasseDTO.additionalFieldType) &&
        Objects.equals(this.groupId, additionalFieldClasseDTO.groupId) &&
        Objects.equals(this.binderFieldId, additionalFieldClasseDTO.binderFieldId) &&
        Objects.equals(this.taskWorkVariableId, additionalFieldClasseDTO.taskWorkVariableId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, composedValues, documentType, insertMaskId, showExpanded, singleElement, columns, additionalFieldType, groupId, binderFieldId, taskWorkVariableId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalFieldClasseDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    composedValues: ").append(toIndentedString(composedValues)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    insertMaskId: ").append(toIndentedString(insertMaskId)).append("\n");
    sb.append("    showExpanded: ").append(toIndentedString(showExpanded)).append("\n");
    sb.append("    singleElement: ").append(toIndentedString(singleElement)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    additionalFieldType: ").append(toIndentedString(additionalFieldType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    binderFieldId: ").append(toIndentedString(binderFieldId)).append("\n");
    sb.append("    taskWorkVariableId: ").append(toIndentedString(taskWorkVariableId)).append("\n");
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


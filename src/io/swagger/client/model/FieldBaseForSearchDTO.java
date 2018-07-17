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
import io.swagger.client.model.DependencyFieldItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class of the additional field filter properties
 */
@ApiModel(description = "Class of the additional field filter properties")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")

public class FieldBaseForSearchDTO {
  @SerializedName("groupId")
  private Integer groupId = null;

  @SerializedName("fieldType")
  private Integer fieldType = null;

  @SerializedName("additionalFieldType")
  private Integer additionalFieldType = null;

  @SerializedName("defaultOperator")
  private Integer defaultOperator = null;

  @SerializedName("tableName")
  private String tableName = null;

  @SerializedName("binderFieldId")
  private Integer binderFieldId = null;

  @SerializedName("multiple")
  private String multiple = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("dataSource")
  private String dataSource = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("formula")
  private String formula = null;

  @SerializedName("className")
  private String className = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("comboGruppiId")
  private String comboGruppiId = null;

  @SerializedName("dependencyFields")
  private List<DependencyFieldItem> dependencyFields = null;

  @SerializedName("associations")
  private Map<String, String> associations = null;

  @SerializedName("isAdditional")
  private Boolean isAdditional = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("predefinedProfileFormula")
  private String predefinedProfileFormula = null;

  public FieldBaseForSearchDTO groupId(Integer groupId) {
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

  public FieldBaseForSearchDTO fieldType(Integer fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Possible values:  0: Standard  1: Group  2: Additional 
   * @return fieldType
  **/
  @ApiModelProperty(value = "Possible values:  0: Standard  1: Group  2: Additional ")
  public Integer getFieldType() {
    return fieldType;
  }

  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }

  public FieldBaseForSearchDTO additionalFieldType(Integer additionalFieldType) {
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

  public FieldBaseForSearchDTO defaultOperator(Integer defaultOperator) {
    this.defaultOperator = defaultOperator;
    return this;
  }

   /**
   * Default Operator
   * @return defaultOperator
  **/
  @ApiModelProperty(value = "Default Operator")
  public Integer getDefaultOperator() {
    return defaultOperator;
  }

  public void setDefaultOperator(Integer defaultOperator) {
    this.defaultOperator = defaultOperator;
  }

  public FieldBaseForSearchDTO tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Table name
   * @return tableName
  **/
  @ApiModelProperty(value = "Table name")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public FieldBaseForSearchDTO binderFieldId(Integer binderFieldId) {
    this.binderFieldId = binderFieldId;
    return this;
  }

   /**
   * Binder Identifier
   * @return binderFieldId
  **/
  @ApiModelProperty(value = "Binder Identifier")
  public Integer getBinderFieldId() {
    return binderFieldId;
  }

  public void setBinderFieldId(Integer binderFieldId) {
    this.binderFieldId = binderFieldId;
  }

  public FieldBaseForSearchDTO multiple(String multiple) {
    this.multiple = multiple;
    return this;
  }

   /**
   * Multiple values
   * @return multiple
  **/
  @ApiModelProperty(value = "Multiple values")
  public String getMultiple() {
    return multiple;
  }

  public void setMultiple(String multiple) {
    this.multiple = multiple;
  }

  public FieldBaseForSearchDTO name(String name) {
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

  public FieldBaseForSearchDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External identifier
   * @return externalId
  **/
  @ApiModelProperty(value = "External identifier")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FieldBaseForSearchDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Label
   * @return description
  **/
  @ApiModelProperty(value = "Label")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldBaseForSearchDTO order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Order
   * @return order
  **/
  @ApiModelProperty(value = "Order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public FieldBaseForSearchDTO dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * DataSource identifier
   * @return dataSource
  **/
  @ApiModelProperty(value = "DataSource identifier")
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public FieldBaseForSearchDTO required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Required
   * @return required
  **/
  @ApiModelProperty(value = "Required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public FieldBaseForSearchDTO formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * Formula
   * @return formula
  **/
  @ApiModelProperty(value = "Formula")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public FieldBaseForSearchDTO className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Name of class
   * @return className
  **/
  @ApiModelProperty(required = true, value = "Name of class")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public FieldBaseForSearchDTO locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Locked in read-only
   * @return locked
  **/
  @ApiModelProperty(value = "Locked in read-only")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public FieldBaseForSearchDTO comboGruppiId(String comboGruppiId) {
    this.comboGruppiId = comboGruppiId;
    return this;
  }

   /**
   * Data Group Identifier
   * @return comboGruppiId
  **/
  @ApiModelProperty(value = "Data Group Identifier")
  public String getComboGruppiId() {
    return comboGruppiId;
  }

  public void setComboGruppiId(String comboGruppiId) {
    this.comboGruppiId = comboGruppiId;
  }

  public FieldBaseForSearchDTO dependencyFields(List<DependencyFieldItem> dependencyFields) {
    this.dependencyFields = dependencyFields;
    return this;
  }

  public FieldBaseForSearchDTO addDependencyFieldsItem(DependencyFieldItem dependencyFieldsItem) {
    if (this.dependencyFields == null) {
      this.dependencyFields = new ArrayList<DependencyFieldItem>();
    }
    this.dependencyFields.add(dependencyFieldsItem);
    return this;
  }

   /**
   * List of dependent fields
   * @return dependencyFields
  **/
  @ApiModelProperty(value = "List of dependent fields")
  public List<DependencyFieldItem> getDependencyFields() {
    return dependencyFields;
  }

  public void setDependencyFields(List<DependencyFieldItem> dependencyFields) {
    this.dependencyFields = dependencyFields;
  }

  public FieldBaseForSearchDTO associations(Map<String, String> associations) {
    this.associations = associations;
    return this;
  }

  public FieldBaseForSearchDTO putAssociationsItem(String key, String associationsItem) {
    if (this.associations == null) {
      this.associations = new HashMap<String, String>();
    }
    this.associations.put(key, associationsItem);
    return this;
  }

   /**
   * Associated fields
   * @return associations
  **/
  @ApiModelProperty(value = "Associated fields")
  public Map<String, String> getAssociations() {
    return associations;
  }

  public void setAssociations(Map<String, String> associations) {
    this.associations = associations;
  }

  public FieldBaseForSearchDTO isAdditional(Boolean isAdditional) {
    this.isAdditional = isAdditional;
    return this;
  }

   /**
   * Field type additional
   * @return isAdditional
  **/
  @ApiModelProperty(value = "Field type additional")
  public Boolean isIsAdditional() {
    return isAdditional;
  }

  public void setIsAdditional(Boolean isAdditional) {
    this.isAdditional = isAdditional;
  }

  public FieldBaseForSearchDTO visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Visible
   * @return visible
  **/
  @ApiModelProperty(value = "Visible")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public FieldBaseForSearchDTO predefinedProfileFormula(String predefinedProfileFormula) {
    this.predefinedProfileFormula = predefinedProfileFormula;
    return this;
  }

   /**
   * Formula in the context of predefined profile
   * @return predefinedProfileFormula
  **/
  @ApiModelProperty(value = "Formula in the context of predefined profile")
  public String getPredefinedProfileFormula() {
    return predefinedProfileFormula;
  }

  public void setPredefinedProfileFormula(String predefinedProfileFormula) {
    this.predefinedProfileFormula = predefinedProfileFormula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldBaseForSearchDTO fieldBaseForSearchDTO = (FieldBaseForSearchDTO) o;
    return Objects.equals(this.groupId, fieldBaseForSearchDTO.groupId) &&
        Objects.equals(this.fieldType, fieldBaseForSearchDTO.fieldType) &&
        Objects.equals(this.additionalFieldType, fieldBaseForSearchDTO.additionalFieldType) &&
        Objects.equals(this.defaultOperator, fieldBaseForSearchDTO.defaultOperator) &&
        Objects.equals(this.tableName, fieldBaseForSearchDTO.tableName) &&
        Objects.equals(this.binderFieldId, fieldBaseForSearchDTO.binderFieldId) &&
        Objects.equals(this.multiple, fieldBaseForSearchDTO.multiple) &&
        Objects.equals(this.name, fieldBaseForSearchDTO.name) &&
        Objects.equals(this.externalId, fieldBaseForSearchDTO.externalId) &&
        Objects.equals(this.description, fieldBaseForSearchDTO.description) &&
        Objects.equals(this.order, fieldBaseForSearchDTO.order) &&
        Objects.equals(this.dataSource, fieldBaseForSearchDTO.dataSource) &&
        Objects.equals(this.required, fieldBaseForSearchDTO.required) &&
        Objects.equals(this.formula, fieldBaseForSearchDTO.formula) &&
        Objects.equals(this.className, fieldBaseForSearchDTO.className) &&
        Objects.equals(this.locked, fieldBaseForSearchDTO.locked) &&
        Objects.equals(this.comboGruppiId, fieldBaseForSearchDTO.comboGruppiId) &&
        Objects.equals(this.dependencyFields, fieldBaseForSearchDTO.dependencyFields) &&
        Objects.equals(this.associations, fieldBaseForSearchDTO.associations) &&
        Objects.equals(this.isAdditional, fieldBaseForSearchDTO.isAdditional) &&
        Objects.equals(this.visible, fieldBaseForSearchDTO.visible) &&
        Objects.equals(this.predefinedProfileFormula, fieldBaseForSearchDTO.predefinedProfileFormula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, fieldType, additionalFieldType, defaultOperator, tableName, binderFieldId, multiple, name, externalId, description, order, dataSource, required, formula, className, locked, comboGruppiId, dependencyFields, associations, isAdditional, visible, predefinedProfileFormula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldBaseForSearchDTO {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    additionalFieldType: ").append(toIndentedString(additionalFieldType)).append("\n");
    sb.append("    defaultOperator: ").append(toIndentedString(defaultOperator)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    binderFieldId: ").append(toIndentedString(binderFieldId)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    comboGruppiId: ").append(toIndentedString(comboGruppiId)).append("\n");
    sb.append("    dependencyFields: ").append(toIndentedString(dependencyFields)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    isAdditional: ").append(toIndentedString(isAdditional)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    predefinedProfileFormula: ").append(toIndentedString(predefinedProfileFormula)).append("\n");
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

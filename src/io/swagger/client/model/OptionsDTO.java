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
 * Class of arxivar options
 */
@ApiModel(description = "Class of arxivar options")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class OptionsDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("user")
  private Integer user = null;

  @SerializedName("argument")
  private String argument = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("table")
  private String table = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("ldata")
  private DateTime ldata = null;

  @SerializedName("field")
  private String field = null;

  @SerializedName("content")
  private byte[] content = null;

  public OptionsDTO id(Integer id) {
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

  public OptionsDTO user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * User Identifier
   * @return user
  **/
  @ApiModelProperty(value = "User Identifier")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public OptionsDTO argument(String argument) {
    this.argument = argument;
    return this;
  }

   /**
   * Argument
   * @return argument
  **/
  @ApiModelProperty(value = "Argument")
  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  public OptionsDTO visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Visibility
   * @return visible
  **/
  @ApiModelProperty(value = "Visibility")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public OptionsDTO sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequence Number
   * @return sequence
  **/
  @ApiModelProperty(value = "Sequence Number")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public OptionsDTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label
   * @return label
  **/
  @ApiModelProperty(value = "Label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public OptionsDTO size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size
   * @return size
  **/
  @ApiModelProperty(value = "Size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public OptionsDTO order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Possible values:  0: Nessuno  1: Ascendente  2: Descrescente 
   * @return order
  **/
  @ApiModelProperty(value = "Possible values:  0: Nessuno  1: Ascendente  2: Descrescente ")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public OptionsDTO table(String table) {
    this.table = table;
    return this;
  }

   /**
   * Table Name
   * @return table
  **/
  @ApiModelProperty(value = "Table Name")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public OptionsDTO alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias
   * @return alias
  **/
  @ApiModelProperty(value = "Alias")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public OptionsDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OptionsDTO ldata(DateTime ldata) {
    this.ldata = ldata;
    return this;
  }

   /**
   * Value in datetime format
   * @return ldata
  **/
  @ApiModelProperty(value = "Value in datetime format")
  public DateTime getLdata() {
    return ldata;
  }

  public void setLdata(DateTime ldata) {
    this.ldata = ldata;
  }

  public OptionsDTO field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Field Name
   * @return field
  **/
  @ApiModelProperty(value = "Field Name")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public OptionsDTO content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * Value in stream format
   * @return content
  **/
  @ApiModelProperty(value = "Value in stream format")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsDTO optionsDTO = (OptionsDTO) o;
    return Objects.equals(this.id, optionsDTO.id) &&
        Objects.equals(this.user, optionsDTO.user) &&
        Objects.equals(this.argument, optionsDTO.argument) &&
        Objects.equals(this.visible, optionsDTO.visible) &&
        Objects.equals(this.sequence, optionsDTO.sequence) &&
        Objects.equals(this.label, optionsDTO.label) &&
        Objects.equals(this.size, optionsDTO.size) &&
        Objects.equals(this.order, optionsDTO.order) &&
        Objects.equals(this.table, optionsDTO.table) &&
        Objects.equals(this.alias, optionsDTO.alias) &&
        Objects.equals(this.value, optionsDTO.value) &&
        Objects.equals(this.ldata, optionsDTO.ldata) &&
        Objects.equals(this.field, optionsDTO.field) &&
        Objects.equals(this.content, optionsDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, argument, visible, sequence, label, size, order, table, alias, value, ldata, field, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ldata: ").append(toIndentedString(ldata)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

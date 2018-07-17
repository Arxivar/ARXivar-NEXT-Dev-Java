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
 * BufferSimpleElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class BufferSimpleElement {
  @SerializedName("id")
  private String id = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("creationDate")
  private DateTime creationDate = null;

  @SerializedName("monitoredFolderId")
  private String monitoredFolderId = null;

  @SerializedName("monitoredFolderPath")
  private String monitoredFolderPath = null;

  public BufferSimpleElement id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BufferSimpleElement filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public BufferSimpleElement creationDate(DateTime creationDate) {
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

  public BufferSimpleElement monitoredFolderId(String monitoredFolderId) {
    this.monitoredFolderId = monitoredFolderId;
    return this;
  }

   /**
   * Get monitoredFolderId
   * @return monitoredFolderId
  **/
  @ApiModelProperty(value = "")
  public String getMonitoredFolderId() {
    return monitoredFolderId;
  }

  public void setMonitoredFolderId(String monitoredFolderId) {
    this.monitoredFolderId = monitoredFolderId;
  }

  public BufferSimpleElement monitoredFolderPath(String monitoredFolderPath) {
    this.monitoredFolderPath = monitoredFolderPath;
    return this;
  }

   /**
   * Get monitoredFolderPath
   * @return monitoredFolderPath
  **/
  @ApiModelProperty(value = "")
  public String getMonitoredFolderPath() {
    return monitoredFolderPath;
  }

  public void setMonitoredFolderPath(String monitoredFolderPath) {
    this.monitoredFolderPath = monitoredFolderPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BufferSimpleElement bufferSimpleElement = (BufferSimpleElement) o;
    return Objects.equals(this.id, bufferSimpleElement.id) &&
        Objects.equals(this.filename, bufferSimpleElement.filename) &&
        Objects.equals(this.creationDate, bufferSimpleElement.creationDate) &&
        Objects.equals(this.monitoredFolderId, bufferSimpleElement.monitoredFolderId) &&
        Objects.equals(this.monitoredFolderPath, bufferSimpleElement.monitoredFolderPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filename, creationDate, monitoredFolderId, monitoredFolderPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BufferSimpleElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    monitoredFolderId: ").append(toIndentedString(monitoredFolderId)).append("\n");
    sb.append("    monitoredFolderPath: ").append(toIndentedString(monitoredFolderPath)).append("\n");
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


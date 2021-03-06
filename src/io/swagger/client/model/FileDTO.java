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
import java.util.ArrayList;
import java.util.List;

/**
 * FileDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class FileDTO {
  @SerializedName("fileNames")
  private List<String> fileNames = null;

  @SerializedName("bufferIds")
  private List<String> bufferIds = null;

  public FileDTO fileNames(List<String> fileNames) {
    this.fileNames = fileNames;
    return this;
  }

  public FileDTO addFileNamesItem(String fileNamesItem) {
    if (this.fileNames == null) {
      this.fileNames = new ArrayList<String>();
    }
    this.fileNames.add(fileNamesItem);
    return this;
  }

   /**
   * Get fileNames
   * @return fileNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getFileNames() {
    return fileNames;
  }

  public void setFileNames(List<String> fileNames) {
    this.fileNames = fileNames;
  }

  public FileDTO bufferIds(List<String> bufferIds) {
    this.bufferIds = bufferIds;
    return this;
  }

  public FileDTO addBufferIdsItem(String bufferIdsItem) {
    if (this.bufferIds == null) {
      this.bufferIds = new ArrayList<String>();
    }
    this.bufferIds.add(bufferIdsItem);
    return this;
  }

   /**
   * Get bufferIds
   * @return bufferIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getBufferIds() {
    return bufferIds;
  }

  public void setBufferIds(List<String> bufferIds) {
    this.bufferIds = bufferIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDTO fileDTO = (FileDTO) o;
    return Objects.equals(this.fileNames, fileDTO.fileNames) &&
        Objects.equals(this.bufferIds, fileDTO.bufferIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileNames, bufferIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDTO {\n");
    
    sb.append("    fileNames: ").append(toIndentedString(fileNames)).append("\n");
    sb.append("    bufferIds: ").append(toIndentedString(bufferIds)).append("\n");
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


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

/**
 * GetByDocumentTypeRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class GetByDocumentTypeRequestDTO {
  @SerializedName("documentTypeCode")
  private String documentTypeCode = null;

  public GetByDocumentTypeRequestDTO documentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

   /**
   * Get documentTypeCode
   * @return documentTypeCode
  **/
  @ApiModelProperty(value = "")
  public String getDocumentTypeCode() {
    return documentTypeCode;
  }

  public void setDocumentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetByDocumentTypeRequestDTO getByDocumentTypeRequestDTO = (GetByDocumentTypeRequestDTO) o;
    return Objects.equals(this.documentTypeCode, getByDocumentTypeRequestDTO.documentTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetByDocumentTypeRequestDTO {\n");
    
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
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

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
 * SendToIxFeSignRequiredRequestDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class SendToIxFeSignRequiredRequestDto {
  @SerializedName("documentList")
  private List<Integer> documentList = null;

  public SendToIxFeSignRequiredRequestDto documentList(List<Integer> documentList) {
    this.documentList = documentList;
    return this;
  }

  public SendToIxFeSignRequiredRequestDto addDocumentListItem(Integer documentListItem) {
    if (this.documentList == null) {
      this.documentList = new ArrayList<Integer>();
    }
    this.documentList.add(documentListItem);
    return this;
  }

   /**
   * Document list to send
   * @return documentList
  **/
  @ApiModelProperty(value = "Document list to send")
  public List<Integer> getDocumentList() {
    return documentList;
  }

  public void setDocumentList(List<Integer> documentList) {
    this.documentList = documentList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendToIxFeSignRequiredRequestDto sendToIxFeSignRequiredRequestDto = (SendToIxFeSignRequiredRequestDto) o;
    return Objects.equals(this.documentList, sendToIxFeSignRequiredRequestDto.documentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendToIxFeSignRequiredRequestDto {\n");
    
    sb.append("    documentList: ").append(toIndentedString(documentList)).append("\n");
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


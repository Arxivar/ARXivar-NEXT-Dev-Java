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
import io.swagger.client.model.IxFeSignCredential;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class of remote IxFe Send signature request
 */
@ApiModel(description = "Class of remote IxFe Send signature request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class IxFeSendRequestDTO {
  @SerializedName("ixFeSignCredential")
  private IxFeSignCredential ixFeSignCredential = null;

  @SerializedName("documentList")
  private List<Integer> documentList = null;

  public IxFeSendRequestDTO ixFeSignCredential(IxFeSignCredential ixFeSignCredential) {
    this.ixFeSignCredential = ixFeSignCredential;
    return this;
  }

   /**
   * Credential for document signing
   * @return ixFeSignCredential
  **/
  @ApiModelProperty(value = "Credential for document signing")
  public IxFeSignCredential getIxFeSignCredential() {
    return ixFeSignCredential;
  }

  public void setIxFeSignCredential(IxFeSignCredential ixFeSignCredential) {
    this.ixFeSignCredential = ixFeSignCredential;
  }

  public IxFeSendRequestDTO documentList(List<Integer> documentList) {
    this.documentList = documentList;
    return this;
  }

  public IxFeSendRequestDTO addDocumentListItem(Integer documentListItem) {
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
    IxFeSendRequestDTO ixFeSendRequestDTO = (IxFeSendRequestDTO) o;
    return Objects.equals(this.ixFeSignCredential, ixFeSendRequestDTO.ixFeSignCredential) &&
        Objects.equals(this.documentList, ixFeSendRequestDTO.documentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ixFeSignCredential, documentList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IxFeSendRequestDTO {\n");
    
    sb.append("    ixFeSignCredential: ").append(toIndentedString(ixFeSignCredential)).append("\n");
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


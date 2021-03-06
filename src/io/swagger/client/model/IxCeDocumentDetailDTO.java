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
 * IxCeDocumentDetailDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class IxCeDocumentDetailDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ixCeServiceId")
  private Integer ixCeServiceId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("creationDate")
  private DateTime creationDate = null;

  public IxCeDocumentDetailDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public IxCeDocumentDetailDTO ixCeServiceId(Integer ixCeServiceId) {
    this.ixCeServiceId = ixCeServiceId;
    return this;
  }

   /**
   * Get ixCeServiceId
   * @return ixCeServiceId
  **/
  @ApiModelProperty(value = "")
  public Integer getIxCeServiceId() {
    return ixCeServiceId;
  }

  public void setIxCeServiceId(Integer ixCeServiceId) {
    this.ixCeServiceId = ixCeServiceId;
  }

  public IxCeDocumentDetailDTO status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values:  0: Error  1: Inserted  2: ConnectorTakeCharge  3: ConnectorError  4: TakeChargeError  5: IxceTakeCharge  6: ToValidate  7: Validated  8: InError  9: Discarded  10: Preserved 
   * @return status
  **/
  @ApiModelProperty(value = "Possible values:  0: Error  1: Inserted  2: ConnectorTakeCharge  3: ConnectorError  4: TakeChargeError  5: IxceTakeCharge  6: ToValidate  7: Validated  8: InError  9: Discarded  10: Preserved ")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public IxCeDocumentDetailDTO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IxCeDocumentDetailDTO creationDate(DateTime creationDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IxCeDocumentDetailDTO ixCeDocumentDetailDTO = (IxCeDocumentDetailDTO) o;
    return Objects.equals(this.id, ixCeDocumentDetailDTO.id) &&
        Objects.equals(this.ixCeServiceId, ixCeDocumentDetailDTO.ixCeServiceId) &&
        Objects.equals(this.status, ixCeDocumentDetailDTO.status) &&
        Objects.equals(this.message, ixCeDocumentDetailDTO.message) &&
        Objects.equals(this.creationDate, ixCeDocumentDetailDTO.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ixCeServiceId, status, message, creationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IxCeDocumentDetailDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ixCeServiceId: ").append(toIndentedString(ixCeServiceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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


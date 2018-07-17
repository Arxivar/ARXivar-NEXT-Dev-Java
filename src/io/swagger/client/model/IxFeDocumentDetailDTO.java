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
 * IxFeDocumentDetailDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class IxFeDocumentDetailDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("ixServiceId")
  private Integer ixServiceId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("creationDate")
  private DateTime creationDate = null;

  public IxFeDocumentDetailDTO id(Integer id) {
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

  public IxFeDocumentDetailDTO ixServiceId(Integer ixServiceId) {
    this.ixServiceId = ixServiceId;
    return this;
  }

   /**
   * Get ixServiceId
   * @return ixServiceId
  **/
  @ApiModelProperty(value = "")
  public Integer getIxServiceId() {
    return ixServiceId;
  }

  public void setIxServiceId(Integer ixServiceId) {
    this.ixServiceId = ixServiceId;
  }

  public IxFeDocumentDetailDTO status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values:  0: Error  1: Inserted  2: ConnectorTakeCharge  3: ConnectorError  4: IxServiceTakeCharge  5: TemplateCompleted  6: TemplateError  7: ValidationCompleted  8: ValidationError  9: Discarded  10: ConservationCompleted  11: ConservationError  12: historicizingCompleted  13: historicizingError  14: DiscardedNotManaged  15: ResendCompleted  16: ResendError  17: SignCompleted  18: SignError  19: TransmissionCompleted  20: TransmissionError  21: DeliveryReceiptNotification  22: DeliveryMissedNotification  23: DiscardedNotification  24: ResultNotification  25: ExpirationTermsNotification  26: SendAttestationNotification  27: PositiveResultNotification  28: NegativeResultNotification  29: PositiveResultWaiting  30: NegativeResultWaiting 
   * @return status
  **/
  @ApiModelProperty(value = "Possible values:  0: Error  1: Inserted  2: ConnectorTakeCharge  3: ConnectorError  4: IxServiceTakeCharge  5: TemplateCompleted  6: TemplateError  7: ValidationCompleted  8: ValidationError  9: Discarded  10: ConservationCompleted  11: ConservationError  12: historicizingCompleted  13: historicizingError  14: DiscardedNotManaged  15: ResendCompleted  16: ResendError  17: SignCompleted  18: SignError  19: TransmissionCompleted  20: TransmissionError  21: DeliveryReceiptNotification  22: DeliveryMissedNotification  23: DiscardedNotification  24: ResultNotification  25: ExpirationTermsNotification  26: SendAttestationNotification  27: PositiveResultNotification  28: NegativeResultNotification  29: PositiveResultWaiting  30: NegativeResultWaiting ")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public IxFeDocumentDetailDTO message(String message) {
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

  public IxFeDocumentDetailDTO creationDate(DateTime creationDate) {
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
    IxFeDocumentDetailDTO ixFeDocumentDetailDTO = (IxFeDocumentDetailDTO) o;
    return Objects.equals(this.id, ixFeDocumentDetailDTO.id) &&
        Objects.equals(this.ixServiceId, ixFeDocumentDetailDTO.ixServiceId) &&
        Objects.equals(this.status, ixFeDocumentDetailDTO.status) &&
        Objects.equals(this.message, ixFeDocumentDetailDTO.message) &&
        Objects.equals(this.creationDate, ixFeDocumentDetailDTO.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ixServiceId, status, message, creationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IxFeDocumentDetailDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ixServiceId: ").append(toIndentedString(ixServiceId)).append("\n");
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

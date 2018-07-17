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
 * PortalLogoutRequestDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class PortalLogoutRequestDto {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  public PortalLogoutRequestDto clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client id
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Client id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public PortalLogoutRequestDto userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Machine Key
   * @return userId
  **/
  @ApiModelProperty(value = "Machine Key")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public PortalLogoutRequestDto ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Request Ip Address
   * @return ipAddress
  **/
  @ApiModelProperty(value = "Request Ip Address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalLogoutRequestDto portalLogoutRequestDto = (PortalLogoutRequestDto) o;
    return Objects.equals(this.clientId, portalLogoutRequestDto.clientId) &&
        Objects.equals(this.userId, portalLogoutRequestDto.userId) &&
        Objects.equals(this.ipAddress, portalLogoutRequestDto.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, userId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalLogoutRequestDto {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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


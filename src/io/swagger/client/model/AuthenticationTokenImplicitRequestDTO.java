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
 * Authentication token request for implicit authentication
 */
@ApiModel(description = "Authentication token request for implicit authentication")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class AuthenticationTokenImplicitRequestDTO {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("logonProviderId")
  private String logonProviderId = null;

  @SerializedName("impersonateUserId")
  private Integer impersonateUserId = null;

  @SerializedName("impersonateExternalId")
  private String impersonateExternalId = null;

  @SerializedName("clientVersion")
  private String clientVersion = null;

  @SerializedName("machineKey")
  private String machineKey = null;

  @SerializedName("languageCultureName")
  private String languageCultureName = null;

  @SerializedName("successRedirectUri")
  private String successRedirectUri = null;

  @SerializedName("scopeList")
  private List<String> scopeList = null;

  @SerializedName("clientIpAddress")
  private String clientIpAddress = null;

  public AuthenticationTokenImplicitRequestDTO clientId(String clientId) {
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

  public AuthenticationTokenImplicitRequestDTO clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client secret
   * @return clientSecret
  **/
  @ApiModelProperty(required = true, value = "Client secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public AuthenticationTokenImplicitRequestDTO logonProviderId(String logonProviderId) {
    this.logonProviderId = logonProviderId;
    return this;
  }

   /**
   * Logon provider for authentication (existing association required)
   * @return logonProviderId
  **/
  @ApiModelProperty(value = "Logon provider for authentication (existing association required)")
  public String getLogonProviderId() {
    return logonProviderId;
  }

  public void setLogonProviderId(String logonProviderId) {
    this.logonProviderId = logonProviderId;
  }

  public AuthenticationTokenImplicitRequestDTO impersonateUserId(Integer impersonateUserId) {
    this.impersonateUserId = impersonateUserId;
    return this;
  }

   /**
   * Impersonate user id
   * @return impersonateUserId
  **/
  @ApiModelProperty(value = "Impersonate user id")
  public Integer getImpersonateUserId() {
    return impersonateUserId;
  }

  public void setImpersonateUserId(Integer impersonateUserId) {
    this.impersonateUserId = impersonateUserId;
  }

  public AuthenticationTokenImplicitRequestDTO impersonateExternalId(String impersonateExternalId) {
    this.impersonateExternalId = impersonateExternalId;
    return this;
  }

   /**
   * Impersonate user by externalId
   * @return impersonateExternalId
  **/
  @ApiModelProperty(value = "Impersonate user by externalId")
  public String getImpersonateExternalId() {
    return impersonateExternalId;
  }

  public void setImpersonateExternalId(String impersonateExternalId) {
    this.impersonateExternalId = impersonateExternalId;
  }

  public AuthenticationTokenImplicitRequestDTO clientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
    return this;
  }

   /**
   * Client version
   * @return clientVersion
  **/
  @ApiModelProperty(value = "Client version")
  public String getClientVersion() {
    return clientVersion;
  }

  public void setClientVersion(String clientVersion) {
    this.clientVersion = clientVersion;
  }

  public AuthenticationTokenImplicitRequestDTO machineKey(String machineKey) {
    this.machineKey = machineKey;
    return this;
  }

   /**
   * Machine Key
   * @return machineKey
  **/
  @ApiModelProperty(value = "Machine Key")
  public String getMachineKey() {
    return machineKey;
  }

  public void setMachineKey(String machineKey) {
    this.machineKey = machineKey;
  }

  public AuthenticationTokenImplicitRequestDTO languageCultureName(String languageCultureName) {
    this.languageCultureName = languageCultureName;
    return this;
  }

   /**
   * Language
   * @return languageCultureName
  **/
  @ApiModelProperty(value = "Language")
  public String getLanguageCultureName() {
    return languageCultureName;
  }

  public void setLanguageCultureName(String languageCultureName) {
    this.languageCultureName = languageCultureName;
  }

  public AuthenticationTokenImplicitRequestDTO successRedirectUri(String successRedirectUri) {
    this.successRedirectUri = successRedirectUri;
    return this;
  }

   /**
   * Url for success redirect
   * @return successRedirectUri
  **/
  @ApiModelProperty(value = "Url for success redirect")
  public String getSuccessRedirectUri() {
    return successRedirectUri;
  }

  public void setSuccessRedirectUri(String successRedirectUri) {
    this.successRedirectUri = successRedirectUri;
  }

  public AuthenticationTokenImplicitRequestDTO scopeList(List<String> scopeList) {
    this.scopeList = scopeList;
    return this;
  }

  public AuthenticationTokenImplicitRequestDTO addScopeListItem(String scopeListItem) {
    if (this.scopeList == null) {
      this.scopeList = new ArrayList<String>();
    }
    this.scopeList.add(scopeListItem);
    return this;
  }

   /**
   * Request scope list
   * @return scopeList
  **/
  @ApiModelProperty(value = "Request scope list")
  public List<String> getScopeList() {
    return scopeList;
  }

  public void setScopeList(List<String> scopeList) {
    this.scopeList = scopeList;
  }

  public AuthenticationTokenImplicitRequestDTO clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

   /**
   * Request client Ip
   * @return clientIpAddress
  **/
  @ApiModelProperty(value = "Request client Ip")
  public String getClientIpAddress() {
    return clientIpAddress;
  }

  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationTokenImplicitRequestDTO authenticationTokenImplicitRequestDTO = (AuthenticationTokenImplicitRequestDTO) o;
    return Objects.equals(this.clientId, authenticationTokenImplicitRequestDTO.clientId) &&
        Objects.equals(this.clientSecret, authenticationTokenImplicitRequestDTO.clientSecret) &&
        Objects.equals(this.logonProviderId, authenticationTokenImplicitRequestDTO.logonProviderId) &&
        Objects.equals(this.impersonateUserId, authenticationTokenImplicitRequestDTO.impersonateUserId) &&
        Objects.equals(this.impersonateExternalId, authenticationTokenImplicitRequestDTO.impersonateExternalId) &&
        Objects.equals(this.clientVersion, authenticationTokenImplicitRequestDTO.clientVersion) &&
        Objects.equals(this.machineKey, authenticationTokenImplicitRequestDTO.machineKey) &&
        Objects.equals(this.languageCultureName, authenticationTokenImplicitRequestDTO.languageCultureName) &&
        Objects.equals(this.successRedirectUri, authenticationTokenImplicitRequestDTO.successRedirectUri) &&
        Objects.equals(this.scopeList, authenticationTokenImplicitRequestDTO.scopeList) &&
        Objects.equals(this.clientIpAddress, authenticationTokenImplicitRequestDTO.clientIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, logonProviderId, impersonateUserId, impersonateExternalId, clientVersion, machineKey, languageCultureName, successRedirectUri, scopeList, clientIpAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationTokenImplicitRequestDTO {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    logonProviderId: ").append(toIndentedString(logonProviderId)).append("\n");
    sb.append("    impersonateUserId: ").append(toIndentedString(impersonateUserId)).append("\n");
    sb.append("    impersonateExternalId: ").append(toIndentedString(impersonateExternalId)).append("\n");
    sb.append("    clientVersion: ").append(toIndentedString(clientVersion)).append("\n");
    sb.append("    machineKey: ").append(toIndentedString(machineKey)).append("\n");
    sb.append("    languageCultureName: ").append(toIndentedString(languageCultureName)).append("\n");
    sb.append("    successRedirectUri: ").append(toIndentedString(successRedirectUri)).append("\n");
    sb.append("    scopeList: ").append(toIndentedString(scopeList)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
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


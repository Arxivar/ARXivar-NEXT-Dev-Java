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
import io.swagger.client.model.AuthPropertyInfoDTO;
import io.swagger.client.model.ClaimInfoDTO;
import io.swagger.client.model.MessageErrorDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Class of access token
 */
@ApiModel(description = "Class of access token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class AccessTokenInfoDTO {
  @SerializedName("accessToken")
  private String accessToken = null;

  @SerializedName("refreshTokenToken")
  private String refreshTokenToken = null;

  @SerializedName("tokenType")
  private String tokenType = null;

  @SerializedName("authPropertyList")
  private List<AuthPropertyInfoDTO> authPropertyList = null;

  @SerializedName("expiresUtc")
  private DateTime expiresUtc = null;

  @SerializedName("issuedUtc")
  private DateTime issuedUtc = null;

  @SerializedName("isPersistent")
  private Boolean isPersistent = null;

  @SerializedName("claimInfoList")
  private List<ClaimInfoDTO> claimInfoList = null;

  @SerializedName("arxUserMustChangePassword")
  private Boolean arxUserMustChangePassword = null;

  @SerializedName("error")
  private MessageErrorDTO error = null;

  public AccessTokenInfoDTO accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access Token
   * @return accessToken
  **/
  @ApiModelProperty(value = "Access Token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AccessTokenInfoDTO refreshTokenToken(String refreshTokenToken) {
    this.refreshTokenToken = refreshTokenToken;
    return this;
  }

   /**
   * Refresh Token
   * @return refreshTokenToken
  **/
  @ApiModelProperty(value = "Refresh Token")
  public String getRefreshTokenToken() {
    return refreshTokenToken;
  }

  public void setRefreshTokenToken(String refreshTokenToken) {
    this.refreshTokenToken = refreshTokenToken;
  }

  public AccessTokenInfoDTO tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Token Type
   * @return tokenType
  **/
  @ApiModelProperty(value = "Token Type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AccessTokenInfoDTO authPropertyList(List<AuthPropertyInfoDTO> authPropertyList) {
    this.authPropertyList = authPropertyList;
    return this;
  }

  public AccessTokenInfoDTO addAuthPropertyListItem(AuthPropertyInfoDTO authPropertyListItem) {
    if (this.authPropertyList == null) {
      this.authPropertyList = new ArrayList<AuthPropertyInfoDTO>();
    }
    this.authPropertyList.add(authPropertyListItem);
    return this;
  }

   /**
   * Properties
   * @return authPropertyList
  **/
  @ApiModelProperty(value = "Properties")
  public List<AuthPropertyInfoDTO> getAuthPropertyList() {
    return authPropertyList;
  }

  public void setAuthPropertyList(List<AuthPropertyInfoDTO> authPropertyList) {
    this.authPropertyList = authPropertyList;
  }

  public AccessTokenInfoDTO expiresUtc(DateTime expiresUtc) {
    this.expiresUtc = expiresUtc;
    return this;
  }

   /**
   * Expires
   * @return expiresUtc
  **/
  @ApiModelProperty(value = "Expires")
  public DateTime getExpiresUtc() {
    return expiresUtc;
  }

  public void setExpiresUtc(DateTime expiresUtc) {
    this.expiresUtc = expiresUtc;
  }

  public AccessTokenInfoDTO issuedUtc(DateTime issuedUtc) {
    this.issuedUtc = issuedUtc;
    return this;
  }

   /**
   * Issued
   * @return issuedUtc
  **/
  @ApiModelProperty(value = "Issued")
  public DateTime getIssuedUtc() {
    return issuedUtc;
  }

  public void setIssuedUtc(DateTime issuedUtc) {
    this.issuedUtc = issuedUtc;
  }

  public AccessTokenInfoDTO isPersistent(Boolean isPersistent) {
    this.isPersistent = isPersistent;
    return this;
  }

   /**
   * Authentication Persistent
   * @return isPersistent
  **/
  @ApiModelProperty(value = "Authentication Persistent")
  public Boolean isIsPersistent() {
    return isPersistent;
  }

  public void setIsPersistent(Boolean isPersistent) {
    this.isPersistent = isPersistent;
  }

  public AccessTokenInfoDTO claimInfoList(List<ClaimInfoDTO> claimInfoList) {
    this.claimInfoList = claimInfoList;
    return this;
  }

  public AccessTokenInfoDTO addClaimInfoListItem(ClaimInfoDTO claimInfoListItem) {
    if (this.claimInfoList == null) {
      this.claimInfoList = new ArrayList<ClaimInfoDTO>();
    }
    this.claimInfoList.add(claimInfoListItem);
    return this;
  }

   /**
   * Claims
   * @return claimInfoList
  **/
  @ApiModelProperty(value = "Claims")
  public List<ClaimInfoDTO> getClaimInfoList() {
    return claimInfoList;
  }

  public void setClaimInfoList(List<ClaimInfoDTO> claimInfoList) {
    this.claimInfoList = claimInfoList;
  }

  public AccessTokenInfoDTO arxUserMustChangePassword(Boolean arxUserMustChangePassword) {
    this.arxUserMustChangePassword = arxUserMustChangePassword;
    return this;
  }

   /**
   * Passeord Change
   * @return arxUserMustChangePassword
  **/
  @ApiModelProperty(value = "Passeord Change")
  public Boolean isArxUserMustChangePassword() {
    return arxUserMustChangePassword;
  }

  public void setArxUserMustChangePassword(Boolean arxUserMustChangePassword) {
    this.arxUserMustChangePassword = arxUserMustChangePassword;
  }

  public AccessTokenInfoDTO error(MessageErrorDTO error) {
    this.error = error;
    return this;
  }

   /**
   * Error Message
   * @return error
  **/
  @ApiModelProperty(value = "Error Message")
  public MessageErrorDTO getError() {
    return error;
  }

  public void setError(MessageErrorDTO error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenInfoDTO accessTokenInfoDTO = (AccessTokenInfoDTO) o;
    return Objects.equals(this.accessToken, accessTokenInfoDTO.accessToken) &&
        Objects.equals(this.refreshTokenToken, accessTokenInfoDTO.refreshTokenToken) &&
        Objects.equals(this.tokenType, accessTokenInfoDTO.tokenType) &&
        Objects.equals(this.authPropertyList, accessTokenInfoDTO.authPropertyList) &&
        Objects.equals(this.expiresUtc, accessTokenInfoDTO.expiresUtc) &&
        Objects.equals(this.issuedUtc, accessTokenInfoDTO.issuedUtc) &&
        Objects.equals(this.isPersistent, accessTokenInfoDTO.isPersistent) &&
        Objects.equals(this.claimInfoList, accessTokenInfoDTO.claimInfoList) &&
        Objects.equals(this.arxUserMustChangePassword, accessTokenInfoDTO.arxUserMustChangePassword) &&
        Objects.equals(this.error, accessTokenInfoDTO.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshTokenToken, tokenType, authPropertyList, expiresUtc, issuedUtc, isPersistent, claimInfoList, arxUserMustChangePassword, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenInfoDTO {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshTokenToken: ").append(toIndentedString(refreshTokenToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    authPropertyList: ").append(toIndentedString(authPropertyList)).append("\n");
    sb.append("    expiresUtc: ").append(toIndentedString(expiresUtc)).append("\n");
    sb.append("    issuedUtc: ").append(toIndentedString(issuedUtc)).append("\n");
    sb.append("    isPersistent: ").append(toIndentedString(isPersistent)).append("\n");
    sb.append("    claimInfoList: ").append(toIndentedString(claimInfoList)).append("\n");
    sb.append("    arxUserMustChangePassword: ").append(toIndentedString(arxUserMustChangePassword)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

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
 * Class of signature certificate
 */
@ApiModel(description = "Class of signature certificate")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class SignCertTypeDTO {
  @SerializedName("signCertType")
  private Integer signCertType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("remoteProvider")
  private Boolean remoteProvider = null;

  @SerializedName("useRelatedCert")
  private Boolean useRelatedCert = null;

  public SignCertTypeDTO signCertType(Integer signCertType) {
    this.signCertType = signCertType;
    return this;
  }

   /**
   * Possible values:  0: Static  1: CoSign  2: RemoteTelecom  3: RemoteAruba 
   * @return signCertType
  **/
  @ApiModelProperty(value = "Possible values:  0: Static  1: CoSign  2: RemoteTelecom  3: RemoteAruba ")
  public Integer getSignCertType() {
    return signCertType;
  }

  public void setSignCertType(Integer signCertType) {
    this.signCertType = signCertType;
  }

  public SignCertTypeDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SignCertTypeDTO remoteProvider(Boolean remoteProvider) {
    this.remoteProvider = remoteProvider;
    return this;
  }

   /**
   * Is Remote Provider
   * @return remoteProvider
  **/
  @ApiModelProperty(value = "Is Remote Provider")
  public Boolean isRemoteProvider() {
    return remoteProvider;
  }

  public void setRemoteProvider(Boolean remoteProvider) {
    this.remoteProvider = remoteProvider;
  }

  public SignCertTypeDTO useRelatedCert(Boolean useRelatedCert) {
    this.useRelatedCert = useRelatedCert;
    return this;
  }

   /**
   * Use Related Certificate
   * @return useRelatedCert
  **/
  @ApiModelProperty(value = "Use Related Certificate")
  public Boolean isUseRelatedCert() {
    return useRelatedCert;
  }

  public void setUseRelatedCert(Boolean useRelatedCert) {
    this.useRelatedCert = useRelatedCert;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignCertTypeDTO signCertTypeDTO = (SignCertTypeDTO) o;
    return Objects.equals(this.signCertType, signCertTypeDTO.signCertType) &&
        Objects.equals(this.description, signCertTypeDTO.description) &&
        Objects.equals(this.remoteProvider, signCertTypeDTO.remoteProvider) &&
        Objects.equals(this.useRelatedCert, signCertTypeDTO.useRelatedCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signCertType, description, remoteProvider, useRelatedCert);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignCertTypeDTO {\n");
    
    sb.append("    signCertType: ").append(toIndentedString(signCertType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    remoteProvider: ").append(toIndentedString(remoteProvider)).append("\n");
    sb.append("    useRelatedCert: ").append(toIndentedString(useRelatedCert)).append("\n");
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


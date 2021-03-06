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
 * Class of Identity of Certificate
 */
@ApiModel(description = "Class of Identity of Certificate")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class CertifiedIdentityDTO {
  @SerializedName("commonName")
  private String commonName = null;

  @SerializedName("organization")
  private String organization = null;

  @SerializedName("organizationalUnit")
  private String organizationalUnit = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  public CertifiedIdentityDTO commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * Name
   * @return commonName
  **/
  @ApiModelProperty(value = "Name")
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public CertifiedIdentityDTO organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Organization
   * @return organization
  **/
  @ApiModelProperty(value = "Organization")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public CertifiedIdentityDTO organizationalUnit(String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
    return this;
  }

   /**
   * Unit of Organization
   * @return organizationalUnit
  **/
  @ApiModelProperty(value = "Unit of Organization")
  public String getOrganizationalUnit() {
    return organizationalUnit;
  }

  public void setOrganizationalUnit(String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
  }

  public CertifiedIdentityDTO locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Locality
   * @return locality
  **/
  @ApiModelProperty(value = "Locality")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public CertifiedIdentityDTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @ApiModelProperty(value = "State")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CertifiedIdentityDTO country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @ApiModelProperty(value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CertifiedIdentityDTO serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial Number
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Serial Number")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertifiedIdentityDTO certifiedIdentityDTO = (CertifiedIdentityDTO) o;
    return Objects.equals(this.commonName, certifiedIdentityDTO.commonName) &&
        Objects.equals(this.organization, certifiedIdentityDTO.organization) &&
        Objects.equals(this.organizationalUnit, certifiedIdentityDTO.organizationalUnit) &&
        Objects.equals(this.locality, certifiedIdentityDTO.locality) &&
        Objects.equals(this.state, certifiedIdentityDTO.state) &&
        Objects.equals(this.country, certifiedIdentityDTO.country) &&
        Objects.equals(this.serialNumber, certifiedIdentityDTO.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, organization, organizationalUnit, locality, state, country, serialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertifiedIdentityDTO {\n");
    
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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


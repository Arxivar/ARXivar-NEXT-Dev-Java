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
 * Class of protocol filter
 */
@ApiModel(description = "Class of protocol filter")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ProtocolSearchFilterDTO {
  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("year")
  private String year = null;

  public ProtocolSearchFilterDTO protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol Number
   * @return protocol
  **/
  @ApiModelProperty(value = "Protocol Number")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public ProtocolSearchFilterDTO year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Protocol Year
   * @return year
  **/
  @ApiModelProperty(value = "Protocol Year")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtocolSearchFilterDTO protocolSearchFilterDTO = (ProtocolSearchFilterDTO) o;
    return Objects.equals(this.protocol, protocolSearchFilterDTO.protocol) &&
        Objects.equals(this.year, protocolSearchFilterDTO.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolSearchFilterDTO {\n");
    
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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


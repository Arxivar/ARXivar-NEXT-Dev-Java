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
 * Class of timestamp account protocol
 */
@ApiModel(description = "Class of timestamp account protocol")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class TsaProtocolDTO {
  @SerializedName("tsaProtocol")
  private Integer tsaProtocol = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  public TsaProtocolDTO tsaProtocol(Integer tsaProtocol) {
    this.tsaProtocol = tsaProtocol;
    return this;
  }

   /**
   * Possible values:  0: HTTP_HTTPS  1: TCP 
   * @return tsaProtocol
  **/
  @ApiModelProperty(value = "Possible values:  0: HTTP_HTTPS  1: TCP ")
  public Integer getTsaProtocol() {
    return tsaProtocol;
  }

  public void setTsaProtocol(Integer tsaProtocol) {
    this.tsaProtocol = tsaProtocol;
  }

  public TsaProtocolDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TsaProtocolDTO description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsaProtocolDTO tsaProtocolDTO = (TsaProtocolDTO) o;
    return Objects.equals(this.tsaProtocol, tsaProtocolDTO.tsaProtocol) &&
        Objects.equals(this.name, tsaProtocolDTO.name) &&
        Objects.equals(this.description, tsaProtocolDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tsaProtocol, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsaProtocolDTO {\n");
    
    sb.append("    tsaProtocol: ").append(toIndentedString(tsaProtocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

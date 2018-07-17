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
 * Class of Barcode Graphic Template
 */
@ApiModel(description = "Class of Barcode Graphic Template")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class BarcodeGraphicTemplateDto {
  @SerializedName("graphicTemplateB64")
  private String graphicTemplateB64 = null;

  @SerializedName("templateDattableB64")
  private String templateDattableB64 = null;

  public BarcodeGraphicTemplateDto graphicTemplateB64(String graphicTemplateB64) {
    this.graphicTemplateB64 = graphicTemplateB64;
    return this;
  }

   /**
   * Origin Blob
   * @return graphicTemplateB64
  **/
  @ApiModelProperty(value = "Origin Blob")
  public String getGraphicTemplateB64() {
    return graphicTemplateB64;
  }

  public void setGraphicTemplateB64(String graphicTemplateB64) {
    this.graphicTemplateB64 = graphicTemplateB64;
  }

  public BarcodeGraphicTemplateDto templateDattableB64(String templateDattableB64) {
    this.templateDattableB64 = templateDattableB64;
    return this;
  }

   /**
   * Origin Datatable
   * @return templateDattableB64
  **/
  @ApiModelProperty(value = "Origin Datatable")
  public String getTemplateDattableB64() {
    return templateDattableB64;
  }

  public void setTemplateDattableB64(String templateDattableB64) {
    this.templateDattableB64 = templateDattableB64;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeGraphicTemplateDto barcodeGraphicTemplateDto = (BarcodeGraphicTemplateDto) o;
    return Objects.equals(this.graphicTemplateB64, barcodeGraphicTemplateDto.graphicTemplateB64) &&
        Objects.equals(this.templateDattableB64, barcodeGraphicTemplateDto.templateDattableB64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graphicTemplateB64, templateDattableB64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeGraphicTemplateDto {\n");
    
    sb.append("    graphicTemplateB64: ").append(toIndentedString(graphicTemplateB64)).append("\n");
    sb.append("    templateDattableB64: ").append(toIndentedString(templateDattableB64)).append("\n");
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


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
 * Class of default barcode
 */
@ApiModel(description = "Class of default barcode")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class DefaultBarcodeTemplateDto {
  @SerializedName("barcodeTemplate")
  private String barcodeTemplate = null;

  @SerializedName("printerFamily")
  private Integer printerFamily = null;

  public DefaultBarcodeTemplateDto barcodeTemplate(String barcodeTemplate) {
    this.barcodeTemplate = barcodeTemplate;
    return this;
  }

   /**
   * Template Name
   * @return barcodeTemplate
  **/
  @ApiModelProperty(value = "Template Name")
  public String getBarcodeTemplate() {
    return barcodeTemplate;
  }

  public void setBarcodeTemplate(String barcodeTemplate) {
    this.barcodeTemplate = barcodeTemplate;
  }

  public DefaultBarcodeTemplateDto printerFamily(Integer printerFamily) {
    this.printerFamily = printerFamily;
    return this;
  }

   /**
   * Possible values:  0: ZEBRA_EPL2  1: ZEBRA_ZPL2  2: TOSHIBA_BSV4  3: EPSON_ESC_POS  4: GRAPHIC 
   * @return printerFamily
  **/
  @ApiModelProperty(value = "Possible values:  0: ZEBRA_EPL2  1: ZEBRA_ZPL2  2: TOSHIBA_BSV4  3: EPSON_ESC_POS  4: GRAPHIC ")
  public Integer getPrinterFamily() {
    return printerFamily;
  }

  public void setPrinterFamily(Integer printerFamily) {
    this.printerFamily = printerFamily;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultBarcodeTemplateDto defaultBarcodeTemplateDto = (DefaultBarcodeTemplateDto) o;
    return Objects.equals(this.barcodeTemplate, defaultBarcodeTemplateDto.barcodeTemplate) &&
        Objects.equals(this.printerFamily, defaultBarcodeTemplateDto.printerFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeTemplate, printerFamily);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultBarcodeTemplateDto {\n");
    
    sb.append("    barcodeTemplate: ").append(toIndentedString(barcodeTemplate)).append("\n");
    sb.append("    printerFamily: ").append(toIndentedString(printerFamily)).append("\n");
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


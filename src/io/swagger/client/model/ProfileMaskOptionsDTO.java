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
 * Class of options associated with a profiling mask.
 */
@ApiModel(description = "Class of options associated with a profiling mask.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ProfileMaskOptionsDTO {
  @SerializedName("showNotes")
  private Boolean showNotes = null;

  @SerializedName("showAttachments")
  private Boolean showAttachments = null;

  @SerializedName("showFileSelection")
  private Boolean showFileSelection = null;

  @SerializedName("showScannerSelection")
  private Boolean showScannerSelection = null;

  @SerializedName("showBarcodeSelection")
  private Boolean showBarcodeSelection = null;

  public ProfileMaskOptionsDTO showNotes(Boolean showNotes) {
    this.showNotes = showNotes;
    return this;
  }

   /**
   * Show notes
   * @return showNotes
  **/
  @ApiModelProperty(value = "Show notes")
  public Boolean isShowNotes() {
    return showNotes;
  }

  public void setShowNotes(Boolean showNotes) {
    this.showNotes = showNotes;
  }

  public ProfileMaskOptionsDTO showAttachments(Boolean showAttachments) {
    this.showAttachments = showAttachments;
    return this;
  }

   /**
   * Show attachments
   * @return showAttachments
  **/
  @ApiModelProperty(value = "Show attachments")
  public Boolean isShowAttachments() {
    return showAttachments;
  }

  public void setShowAttachments(Boolean showAttachments) {
    this.showAttachments = showAttachments;
  }

  public ProfileMaskOptionsDTO showFileSelection(Boolean showFileSelection) {
    this.showFileSelection = showFileSelection;
    return this;
  }

   /**
   * Show file selection
   * @return showFileSelection
  **/
  @ApiModelProperty(value = "Show file selection")
  public Boolean isShowFileSelection() {
    return showFileSelection;
  }

  public void setShowFileSelection(Boolean showFileSelection) {
    this.showFileSelection = showFileSelection;
  }

  public ProfileMaskOptionsDTO showScannerSelection(Boolean showScannerSelection) {
    this.showScannerSelection = showScannerSelection;
    return this;
  }

   /**
   * Show scanner selection
   * @return showScannerSelection
  **/
  @ApiModelProperty(value = "Show scanner selection")
  public Boolean isShowScannerSelection() {
    return showScannerSelection;
  }

  public void setShowScannerSelection(Boolean showScannerSelection) {
    this.showScannerSelection = showScannerSelection;
  }

  public ProfileMaskOptionsDTO showBarcodeSelection(Boolean showBarcodeSelection) {
    this.showBarcodeSelection = showBarcodeSelection;
    return this;
  }

   /**
   * Show barcode selection
   * @return showBarcodeSelection
  **/
  @ApiModelProperty(value = "Show barcode selection")
  public Boolean isShowBarcodeSelection() {
    return showBarcodeSelection;
  }

  public void setShowBarcodeSelection(Boolean showBarcodeSelection) {
    this.showBarcodeSelection = showBarcodeSelection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileMaskOptionsDTO profileMaskOptionsDTO = (ProfileMaskOptionsDTO) o;
    return Objects.equals(this.showNotes, profileMaskOptionsDTO.showNotes) &&
        Objects.equals(this.showAttachments, profileMaskOptionsDTO.showAttachments) &&
        Objects.equals(this.showFileSelection, profileMaskOptionsDTO.showFileSelection) &&
        Objects.equals(this.showScannerSelection, profileMaskOptionsDTO.showScannerSelection) &&
        Objects.equals(this.showBarcodeSelection, profileMaskOptionsDTO.showBarcodeSelection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showNotes, showAttachments, showFileSelection, showScannerSelection, showBarcodeSelection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileMaskOptionsDTO {\n");
    
    sb.append("    showNotes: ").append(toIndentedString(showNotes)).append("\n");
    sb.append("    showAttachments: ").append(toIndentedString(showAttachments)).append("\n");
    sb.append("    showFileSelection: ").append(toIndentedString(showFileSelection)).append("\n");
    sb.append("    showScannerSelection: ").append(toIndentedString(showScannerSelection)).append("\n");
    sb.append("    showBarcodeSelection: ").append(toIndentedString(showBarcodeSelection)).append("\n");
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


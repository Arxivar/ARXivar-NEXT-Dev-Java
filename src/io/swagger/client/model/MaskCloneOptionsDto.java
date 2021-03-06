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
 * Class of options used to clone a mask
 */
@ApiModel(description = "Class of options used to clone a mask")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class MaskCloneOptionsDto {
  @SerializedName("clonePredefinedProfile")
  private Boolean clonePredefinedProfile = null;

  @SerializedName("predefinedProfileName")
  private String predefinedProfileName = null;

  @SerializedName("maskName")
  private String maskName = null;

  @SerializedName("originalMaskId")
  private String originalMaskId = null;

  public MaskCloneOptionsDto clonePredefinedProfile(Boolean clonePredefinedProfile) {
    this.clonePredefinedProfile = clonePredefinedProfile;
    return this;
  }

   /**
   * Clone the Predefined Profile
   * @return clonePredefinedProfile
  **/
  @ApiModelProperty(value = "Clone the Predefined Profile")
  public Boolean isClonePredefinedProfile() {
    return clonePredefinedProfile;
  }

  public void setClonePredefinedProfile(Boolean clonePredefinedProfile) {
    this.clonePredefinedProfile = clonePredefinedProfile;
  }

  public MaskCloneOptionsDto predefinedProfileName(String predefinedProfileName) {
    this.predefinedProfileName = predefinedProfileName;
    return this;
  }

   /**
   * Predefined Profile Name
   * @return predefinedProfileName
  **/
  @ApiModelProperty(value = "Predefined Profile Name")
  public String getPredefinedProfileName() {
    return predefinedProfileName;
  }

  public void setPredefinedProfileName(String predefinedProfileName) {
    this.predefinedProfileName = predefinedProfileName;
  }

  public MaskCloneOptionsDto maskName(String maskName) {
    this.maskName = maskName;
    return this;
  }

   /**
   * Name
   * @return maskName
  **/
  @ApiModelProperty(value = "Name")
  public String getMaskName() {
    return maskName;
  }

  public void setMaskName(String maskName) {
    this.maskName = maskName;
  }

  public MaskCloneOptionsDto originalMaskId(String originalMaskId) {
    this.originalMaskId = originalMaskId;
    return this;
  }

   /**
   * Parent Identifier
   * @return originalMaskId
  **/
  @ApiModelProperty(value = "Parent Identifier")
  public String getOriginalMaskId() {
    return originalMaskId;
  }

  public void setOriginalMaskId(String originalMaskId) {
    this.originalMaskId = originalMaskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskCloneOptionsDto maskCloneOptionsDto = (MaskCloneOptionsDto) o;
    return Objects.equals(this.clonePredefinedProfile, maskCloneOptionsDto.clonePredefinedProfile) &&
        Objects.equals(this.predefinedProfileName, maskCloneOptionsDto.predefinedProfileName) &&
        Objects.equals(this.maskName, maskCloneOptionsDto.maskName) &&
        Objects.equals(this.originalMaskId, maskCloneOptionsDto.originalMaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clonePredefinedProfile, predefinedProfileName, maskName, originalMaskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskCloneOptionsDto {\n");
    
    sb.append("    clonePredefinedProfile: ").append(toIndentedString(clonePredefinedProfile)).append("\n");
    sb.append("    predefinedProfileName: ").append(toIndentedString(predefinedProfileName)).append("\n");
    sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
    sb.append("    originalMaskId: ").append(toIndentedString(originalMaskId)).append("\n");
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


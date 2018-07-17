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
 * Class of behaviour associated with a profiling mask
 */
@ApiModel(description = "Class of behaviour associated with a profiling mask")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ProfileMaskBehaviourDTO {
  @SerializedName("loadAdditional")
  private Boolean loadAdditional = null;

  @SerializedName("showGroups")
  private Boolean showGroups = null;

  @SerializedName("paMode")
  private Integer paMode = null;

  public ProfileMaskBehaviourDTO loadAdditional(Boolean loadAdditional) {
    this.loadAdditional = loadAdditional;
    return this;
  }

   /**
   * Load the additional fields
   * @return loadAdditional
  **/
  @ApiModelProperty(value = "Load the additional fields")
  public Boolean isLoadAdditional() {
    return loadAdditional;
  }

  public void setLoadAdditional(Boolean loadAdditional) {
    this.loadAdditional = loadAdditional;
  }

  public ProfileMaskBehaviourDTO showGroups(Boolean showGroups) {
    this.showGroups = showGroups;
    return this;
  }

   /**
   * Show groups
   * @return showGroups
  **/
  @ApiModelProperty(value = "Show groups")
  public Boolean isShowGroups() {
    return showGroups;
  }

  public void setShowGroups(Boolean showGroups) {
    this.showGroups = showGroups;
  }

  public ProfileMaskBehaviourDTO paMode(Integer paMode) {
    this.paMode = paMode;
    return this;
  }

   /**
   * Possible values:  0: None  1: OnlyNever  2: OnlyOptionally  3: NeverOrOptionally  4: OnlyAlways  5: AlwaysOrNever  6: AlwaysOrOptionally  7: All 
   * @return paMode
  **/
  @ApiModelProperty(value = "Possible values:  0: None  1: OnlyNever  2: OnlyOptionally  3: NeverOrOptionally  4: OnlyAlways  5: AlwaysOrNever  6: AlwaysOrOptionally  7: All ")
  public Integer getPaMode() {
    return paMode;
  }

  public void setPaMode(Integer paMode) {
    this.paMode = paMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileMaskBehaviourDTO profileMaskBehaviourDTO = (ProfileMaskBehaviourDTO) o;
    return Objects.equals(this.loadAdditional, profileMaskBehaviourDTO.loadAdditional) &&
        Objects.equals(this.showGroups, profileMaskBehaviourDTO.showGroups) &&
        Objects.equals(this.paMode, profileMaskBehaviourDTO.paMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadAdditional, showGroups, paMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileMaskBehaviourDTO {\n");
    
    sb.append("    loadAdditional: ").append(toIndentedString(loadAdditional)).append("\n");
    sb.append("    showGroups: ").append(toIndentedString(showGroups)).append("\n");
    sb.append("    paMode: ").append(toIndentedString(paMode)).append("\n");
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


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
import org.joda.time.DateTime;

/**
 * Class of Chrono information
 */
@ApiModel(description = "Class of Chrono information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class ChronoInfoDTO {
  @SerializedName("chronoId")
  private String chronoId = null;

  @SerializedName("chronoName")
  private String chronoName = null;

  @SerializedName("intermediateIndex")
  private Integer intermediateIndex = null;

  @SerializedName("startDate")
  private DateTime startDate = null;

  @SerializedName("stopDate")
  private DateTime stopDate = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("totalItermediate")
  private Integer totalItermediate = null;

  public ChronoInfoDTO chronoId(String chronoId) {
    this.chronoId = chronoId;
    return this;
  }

   /**
   * Identifier
   * @return chronoId
  **/
  @ApiModelProperty(value = "Identifier")
  public String getChronoId() {
    return chronoId;
  }

  public void setChronoId(String chronoId) {
    this.chronoId = chronoId;
  }

  public ChronoInfoDTO chronoName(String chronoName) {
    this.chronoName = chronoName;
    return this;
  }

   /**
   * Name
   * @return chronoName
  **/
  @ApiModelProperty(value = "Name")
  public String getChronoName() {
    return chronoName;
  }

  public void setChronoName(String chronoName) {
    this.chronoName = chronoName;
  }

  public ChronoInfoDTO intermediateIndex(Integer intermediateIndex) {
    this.intermediateIndex = intermediateIndex;
    return this;
  }

   /**
   * Index
   * @return intermediateIndex
  **/
  @ApiModelProperty(value = "Index")
  public Integer getIntermediateIndex() {
    return intermediateIndex;
  }

  public void setIntermediateIndex(Integer intermediateIndex) {
    this.intermediateIndex = intermediateIndex;
  }

  public ChronoInfoDTO startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public ChronoInfoDTO stopDate(DateTime stopDate) {
    this.stopDate = stopDate;
    return this;
  }

   /**
   * End date
   * @return stopDate
  **/
  @ApiModelProperty(value = "End date")
  public DateTime getStopDate() {
    return stopDate;
  }

  public void setStopDate(DateTime stopDate) {
    this.stopDate = stopDate;
  }

  public ChronoInfoDTO duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration
   * @return duration
  **/
  @ApiModelProperty(value = "Duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ChronoInfoDTO totalItermediate(Integer totalItermediate) {
    this.totalItermediate = totalItermediate;
    return this;
  }

   /**
   * Total Value
   * @return totalItermediate
  **/
  @ApiModelProperty(value = "Total Value")
  public Integer getTotalItermediate() {
    return totalItermediate;
  }

  public void setTotalItermediate(Integer totalItermediate) {
    this.totalItermediate = totalItermediate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChronoInfoDTO chronoInfoDTO = (ChronoInfoDTO) o;
    return Objects.equals(this.chronoId, chronoInfoDTO.chronoId) &&
        Objects.equals(this.chronoName, chronoInfoDTO.chronoName) &&
        Objects.equals(this.intermediateIndex, chronoInfoDTO.intermediateIndex) &&
        Objects.equals(this.startDate, chronoInfoDTO.startDate) &&
        Objects.equals(this.stopDate, chronoInfoDTO.stopDate) &&
        Objects.equals(this.duration, chronoInfoDTO.duration) &&
        Objects.equals(this.totalItermediate, chronoInfoDTO.totalItermediate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chronoId, chronoName, intermediateIndex, startDate, stopDate, duration, totalItermediate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChronoInfoDTO {\n");
    
    sb.append("    chronoId: ").append(toIndentedString(chronoId)).append("\n");
    sb.append("    chronoName: ").append(toIndentedString(chronoName)).append("\n");
    sb.append("    intermediateIndex: ").append(toIndentedString(intermediateIndex)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stopDate: ").append(toIndentedString(stopDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    totalItermediate: ").append(toIndentedString(totalItermediate)).append("\n");
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


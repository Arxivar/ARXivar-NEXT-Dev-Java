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
import io.swagger.client.model.FindDTO;
import io.swagger.client.model.SearchDTO;
import io.swagger.client.model.SelectDTO;
import java.io.IOException;

/**
 * Class of quick search that doesn&#39;t support OR search list
 */
@ApiModel(description = "Class of quick search that doesn't support OR search list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class SimpleQuickSearchDto {
  @SerializedName("find")
  private FindDTO find = null;

  @SerializedName("searchFilterDto")
  private SearchDTO searchFilterDto = null;

  @SerializedName("selectFilterDto")
  private SelectDTO selectFilterDto = null;

  public SimpleQuickSearchDto find(FindDTO find) {
    this.find = find;
    return this;
  }

   /**
   * Find information
   * @return find
  **/
  @ApiModelProperty(value = "Find information")
  public FindDTO getFind() {
    return find;
  }

  public void setFind(FindDTO find) {
    this.find = find;
  }

  public SimpleQuickSearchDto searchFilterDto(SearchDTO searchFilterDto) {
    this.searchFilterDto = searchFilterDto;
    return this;
  }

   /**
   * Get searchFilterDto
   * @return searchFilterDto
  **/
  @ApiModelProperty(value = "")
  public SearchDTO getSearchFilterDto() {
    return searchFilterDto;
  }

  public void setSearchFilterDto(SearchDTO searchFilterDto) {
    this.searchFilterDto = searchFilterDto;
  }

  public SimpleQuickSearchDto selectFilterDto(SelectDTO selectFilterDto) {
    this.selectFilterDto = selectFilterDto;
    return this;
  }

   /**
   * Get selectFilterDto
   * @return selectFilterDto
  **/
  @ApiModelProperty(value = "")
  public SelectDTO getSelectFilterDto() {
    return selectFilterDto;
  }

  public void setSelectFilterDto(SelectDTO selectFilterDto) {
    this.selectFilterDto = selectFilterDto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleQuickSearchDto simpleQuickSearchDto = (SimpleQuickSearchDto) o;
    return Objects.equals(this.find, simpleQuickSearchDto.find) &&
        Objects.equals(this.searchFilterDto, simpleQuickSearchDto.searchFilterDto) &&
        Objects.equals(this.selectFilterDto, simpleQuickSearchDto.selectFilterDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(find, searchFilterDto, selectFilterDto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleQuickSearchDto {\n");
    
    sb.append("    find: ").append(toIndentedString(find)).append("\n");
    sb.append("    searchFilterDto: ").append(toIndentedString(searchFilterDto)).append("\n");
    sb.append("    selectFilterDto: ").append(toIndentedString(selectFilterDto)).append("\n");
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


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
import io.swagger.client.model.AddressBookSearchConcreteDTO;
import io.swagger.client.model.SelectDTO;
import java.io.IOException;

/**
 * This class contain the search and select part for addressbook search functions
 */
@ApiModel(description = "This class contain the search and select part for addressbook search functions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class AddressBookSearchConcreteCriteriaDTO {
  @SerializedName("searchDto")
  private AddressBookSearchConcreteDTO searchDto = null;

  @SerializedName("selectDto")
  private SelectDTO selectDto = null;

  public AddressBookSearchConcreteCriteriaDTO searchDto(AddressBookSearchConcreteDTO searchDto) {
    this.searchDto = searchDto;
    return this;
  }

   /**
   * Addressbook search
   * @return searchDto
  **/
  @ApiModelProperty(value = "Addressbook search")
  public AddressBookSearchConcreteDTO getSearchDto() {
    return searchDto;
  }

  public void setSearchDto(AddressBookSearchConcreteDTO searchDto) {
    this.searchDto = searchDto;
  }

  public AddressBookSearchConcreteCriteriaDTO selectDto(SelectDTO selectDto) {
    this.selectDto = selectDto;
    return this;
  }

   /**
   * Addressbook select
   * @return selectDto
  **/
  @ApiModelProperty(value = "Addressbook select")
  public SelectDTO getSelectDto() {
    return selectDto;
  }

  public void setSelectDto(SelectDTO selectDto) {
    this.selectDto = selectDto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressBookSearchConcreteCriteriaDTO addressBookSearchConcreteCriteriaDTO = (AddressBookSearchConcreteCriteriaDTO) o;
    return Objects.equals(this.searchDto, addressBookSearchConcreteCriteriaDTO.searchDto) &&
        Objects.equals(this.selectDto, addressBookSearchConcreteCriteriaDTO.selectDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchDto, selectDto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressBookSearchConcreteCriteriaDTO {\n");
    
    sb.append("    searchDto: ").append(toIndentedString(searchDto)).append("\n");
    sb.append("    selectDto: ").append(toIndentedString(selectDto)).append("\n");
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


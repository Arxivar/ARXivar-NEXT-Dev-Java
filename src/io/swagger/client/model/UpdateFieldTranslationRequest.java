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
import io.swagger.client.model.FieldTranslation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Dto for update field translation
 */
@ApiModel(description = "Dto for update field translation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class UpdateFieldTranslationRequest {
  @SerializedName("translations")
  private List<FieldTranslation> translations = null;

  public UpdateFieldTranslationRequest translations(List<FieldTranslation> translations) {
    this.translations = translations;
    return this;
  }

  public UpdateFieldTranslationRequest addTranslationsItem(FieldTranslation translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<FieldTranslation>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Teanslation of field
   * @return translations
  **/
  @ApiModelProperty(value = "Teanslation of field")
  public List<FieldTranslation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<FieldTranslation> translations) {
    this.translations = translations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFieldTranslationRequest updateFieldTranslationRequest = (UpdateFieldTranslationRequest) o;
    return Objects.equals(this.translations, updateFieldTranslationRequest.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFieldTranslationRequest {\n");
    
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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


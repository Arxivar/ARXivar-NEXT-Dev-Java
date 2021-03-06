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
 * Class of permission item
 */
@ApiModel(description = "Class of permission item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class PermissionItemDTO {
  @SerializedName("permission")
  private Integer permission = null;

  @SerializedName("allow")
  private Boolean allow = null;

  @SerializedName("deny")
  private Boolean deny = null;

  public PermissionItemDTO permission(Integer permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Identifier
   * @return permission
  **/
  @ApiModelProperty(value = "Identifier")
  public Integer getPermission() {
    return permission;
  }

  public void setPermission(Integer permission) {
    this.permission = permission;
  }

  public PermissionItemDTO allow(Boolean allow) {
    this.allow = allow;
    return this;
  }

   /**
   * Allow
   * @return allow
  **/
  @ApiModelProperty(value = "Allow")
  public Boolean isAllow() {
    return allow;
  }

  public void setAllow(Boolean allow) {
    this.allow = allow;
  }

  public PermissionItemDTO deny(Boolean deny) {
    this.deny = deny;
    return this;
  }

   /**
   * Deny
   * @return deny
  **/
  @ApiModelProperty(value = "Deny")
  public Boolean isDeny() {
    return deny;
  }

  public void setDeny(Boolean deny) {
    this.deny = deny;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionItemDTO permissionItemDTO = (PermissionItemDTO) o;
    return Objects.equals(this.permission, permissionItemDTO.permission) &&
        Objects.equals(this.allow, permissionItemDTO.allow) &&
        Objects.equals(this.deny, permissionItemDTO.deny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, allow, deny);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionItemDTO {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
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


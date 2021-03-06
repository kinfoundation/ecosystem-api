/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
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
 * ExternalOrderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class ExternalOrderRequest {
@SerializedName("jwt")
  private String jwt = null;
  
  public ExternalOrderRequest jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }

  
  /**
  * string serialized JWTBodySpend/ JWTBodyEarn/ JWTBodyPayToUser
  * @return jwt
  **/
  @ApiModelProperty(required = true, value = "string serialized JWTBodySpend/ JWTBodyEarn/ JWTBodyPayToUser")
  public String getJwt() {
    return jwt;
  }
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalOrderRequest externalOrderRequest = (ExternalOrderRequest) o;
    return Objects.equals(this.jwt, externalOrderRequest.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrderRequest {\n");
    
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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




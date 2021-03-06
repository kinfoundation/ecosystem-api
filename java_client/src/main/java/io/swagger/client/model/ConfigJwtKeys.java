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
 * ConfigJwtKeys
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class ConfigJwtKeys {
@SerializedName("algorithm")
  private String algorithm = null;
  @SerializedName("key")
  private String key = null;
  
  public ConfigJwtKeys algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  
  /**
  * Get algorithm
  * @return algorithm
  **/
  @ApiModelProperty(value = "")
  public String getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }
  
  public ConfigJwtKeys key(String key) {
    this.key = key;
    return this;
  }

  
  /**
  * Get key
  * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigJwtKeys configJwtKeys = (ConfigJwtKeys) o;
    return Objects.equals(this.algorithm, configJwtKeys.algorithm) &&
        Objects.equals(this.key, configJwtKeys.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, key);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigJwtKeys {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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




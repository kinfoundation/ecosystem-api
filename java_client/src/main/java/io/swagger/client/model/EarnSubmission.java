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
 * result of earn offer i.e. completed html poll
 */@ApiModel(description = "result of earn offer i.e. completed html poll")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-05-15T14:45:47.586+03:00")
public class EarnSubmission {
@SerializedName("content")
  private String content = null;
  
  public EarnSubmission content(String content) {
    this.content = content;
    return this;
  }

  
  /**
  * json encoded payload related to the earn offer
  * @return content
  **/
  @ApiModelProperty(required = true, value = "json encoded payload related to the earn offer")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarnSubmission earnSubmission = (EarnSubmission) o;
    return Objects.equals(this.content, earnSubmission.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarnSubmission {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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




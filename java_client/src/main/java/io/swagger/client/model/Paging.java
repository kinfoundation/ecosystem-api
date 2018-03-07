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
import io.swagger.client.model.PagingCursors;
import java.io.IOException;

/**
 * object accompanying lists - used to fetch next/previous section
 */@ApiModel(description = "object accompanying lists - used to fetch next/previous section")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-03-07T18:47:45.900+02:00")
public class Paging {
@SerializedName("cursors")
  private PagingCursors cursors = null;
  @SerializedName("previous")
  private String previous = null;
  @SerializedName("next")
  private String next = null;
  
  public Paging cursors(PagingCursors cursors) {
    this.cursors = cursors;
    return this;
  }

  
  /**
  * Get cursors
  * @return cursors
  **/
  @ApiModelProperty(value = "")
  public PagingCursors getCursors() {
    return cursors;
  }
  public void setCursors(PagingCursors cursors) {
    this.cursors = cursors;
  }
  
  public Paging previous(String previous) {
    this.previous = previous;
    return this;
  }

  
  /**
  * Get previous
  * @return previous
  **/
  @ApiModelProperty(example = "https://graph.facebook.com/me/albums?limit=25&before=NDMyNzQyODI3OTQw", value = "")
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }
  
  public Paging next(String next) {
    this.next = next;
    return this;
  }

  
  /**
  * Get next
  * @return next
  **/
  @ApiModelProperty(example = "https://graph.facebook.com/me/albums?limit=25&after=MTAxNTExOTQ1MjAwNzI5NDE=", value = "")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paging paging = (Paging) o;
    return Objects.equals(this.cursors, paging.cursors) &&
        Objects.equals(this.previous, paging.previous) &&
        Objects.equals(this.next, paging.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursors, previous, next);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paging {\n");
    
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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




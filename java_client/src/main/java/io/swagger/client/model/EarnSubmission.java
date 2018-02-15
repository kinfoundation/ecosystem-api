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
 * an order submission of an earn offer - validation request of the poll
 */@ApiModel(description = "an order submission of an earn offer - validation request of the poll")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-02-15T10:30:05.403+02:00")
public class EarnSubmission {

    /**
   * Gets or Sets offerType
   */
  @JsonAdapter(OfferTypeEnum.Adapter.class)
  public enum OfferTypeEnum {
    
    EARNSUBMISSION("EarnSubmission");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static OfferTypeEnum fromValue(String text) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<OfferTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OfferTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("offer_type")
  private OfferTypeEnum offerType = null;
  @SerializedName("completed_form")
  private Object completedForm = null;
  
  public EarnSubmission offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  
  /**
  * Get offerType
  * @return offerType
  **/
  @ApiModelProperty(value = "")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }
  
  public EarnSubmission completedForm(Object completedForm) {
    this.completedForm = completedForm;
    return this;
  }

  
  /**
  * Get completedForm
  * @return completedForm
  **/
  @ApiModelProperty(value = "")
  public Object getCompletedForm() {
    return completedForm;
  }
  public void setCompletedForm(Object completedForm) {
    this.completedForm = completedForm;
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
    return Objects.equals(this.offerType, earnSubmission.offerType) &&
        Objects.equals(this.completedForm, earnSubmission.completedForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerType, completedForm);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarnSubmission {\n");
    
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    completedForm: ").append(toIndentedString(completedForm)).append("\n");
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




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
import java.math.BigDecimal;

/**
 * JWTBodyRegister
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-04-15T20:40:18.015+03:00")
public class JWTBodyRegister {
@SerializedName("iat")
  private BigDecimal iat = null;
  @SerializedName("iss")
  private String iss = null;
  @SerializedName("exp")
  private BigDecimal exp = null;
  
    /**
   * subject
   */
  @JsonAdapter(SubEnum.Adapter.class)
  public enum SubEnum {
    
    REGISTER("register"),
    SPEND("spend"),
    CONFIRM_PAYMENT("confirm_payment");

    private String value;

    SubEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static SubEnum fromValue(String text) {
      for (SubEnum b : SubEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<SubEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("sub")
  private SubEnum sub = null;
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("api_key")
  private String apiKey = null;
  
  public JWTBodyRegister iat(BigDecimal iat) {
    this.iat = iat;
    return this;
  }

  
  /**
  * issued at - seconds from epoc
  * @return iat
  **/
  @ApiModelProperty(required = true, value = "issued at - seconds from epoc")
  public BigDecimal getIat() {
    return iat;
  }
  public void setIat(BigDecimal iat) {
    this.iat = iat;
  }
  
  public JWTBodyRegister iss(String iss) {
    this.iss = iss;
    return this;
  }

  
  /**
  * issuer name, the same as app_id (kik)
  * @return iss
  **/
  @ApiModelProperty(required = true, value = "issuer name, the same as app_id (kik)")
  public String getIss() {
    return iss;
  }
  public void setIss(String iss) {
    this.iss = iss;
  }
  
  public JWTBodyRegister exp(BigDecimal exp) {
    this.exp = exp;
    return this;
  }

  
  /**
  * expiration - seconds from epoc
  * @return exp
  **/
  @ApiModelProperty(required = true, value = "expiration - seconds from epoc")
  public BigDecimal getExp() {
    return exp;
  }
  public void setExp(BigDecimal exp) {
    this.exp = exp;
  }
  
  public JWTBodyRegister sub(SubEnum sub) {
    this.sub = sub;
    return this;
  }

  
  /**
  * subject
  * @return sub
  **/
  @ApiModelProperty(required = true, value = "subject")
  public SubEnum getSub() {
    return sub;
  }
  public void setSub(SubEnum sub) {
    this.sub = sub;
  }
  
  public JWTBodyRegister userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  /**
  * Get userId
  * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  public JWTBodyRegister apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  
  /**
  * api key supplied by kin
  * @return apiKey
  **/
  @ApiModelProperty(required = true, value = "api key supplied by kin")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTBodyRegister jwTBodyRegister = (JWTBodyRegister) o;
    return Objects.equals(this.iat, jwTBodyRegister.iat) &&
        Objects.equals(this.iss, jwTBodyRegister.iss) &&
        Objects.equals(this.exp, jwTBodyRegister.exp) &&
        Objects.equals(this.sub, jwTBodyRegister.sub) &&
        Objects.equals(this.userId, jwTBodyRegister.userId) &&
        Objects.equals(this.apiKey, jwTBodyRegister.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iat, iss, exp, sub, userId, apiKey);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTBodyRegister {\n");
    
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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




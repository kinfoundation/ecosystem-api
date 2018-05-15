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
 * common header for all JWTs
 */@ApiModel(description = "common header for all JWTs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-05-15T14:45:47.586+03:00")
public class JWTHeader {
@SerializedName("kid")
  private String kid = null;
  
    /**
   * Gets or Sets alg
   */
  @JsonAdapter(AlgEnum.Adapter.class)
  public enum AlgEnum {
    
    ES256("ES256");

    private String value;

    AlgEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static AlgEnum fromValue(String text) {
      for (AlgEnum b : AlgEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<AlgEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlgEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("alg")
  private AlgEnum alg = null;
  
    /**
   * Gets or Sets typ
   */
  @JsonAdapter(TypEnum.Adapter.class)
  public enum TypEnum {
    
    JWT("JWT");

    private String value;

    TypEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static TypEnum fromValue(String text) {
      for (TypEnum b : TypEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<TypEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("typ")
  private TypEnum typ = null;
  
  public JWTHeader kid(String kid) {
    this.kid = kid;
    return this;
  }

  
  /**
  * Get kid
  * @return kid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKid() {
    return kid;
  }
  public void setKid(String kid) {
    this.kid = kid;
  }
  
  public JWTHeader alg(AlgEnum alg) {
    this.alg = alg;
    return this;
  }

  
  /**
  * Get alg
  * @return alg
  **/
  @ApiModelProperty(required = true, value = "")
  public AlgEnum getAlg() {
    return alg;
  }
  public void setAlg(AlgEnum alg) {
    this.alg = alg;
  }
  
  public JWTHeader typ(TypEnum typ) {
    this.typ = typ;
    return this;
  }

  
  /**
  * Get typ
  * @return typ
  **/
  @ApiModelProperty(required = true, value = "")
  public TypEnum getTyp() {
    return typ;
  }
  public void setTyp(TypEnum typ) {
    this.typ = typ;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTHeader jwTHeader = (JWTHeader) o;
    return Objects.equals(this.kid, jwTHeader.kid) &&
        Objects.equals(this.alg, jwTHeader.alg) &&
        Objects.equals(this.typ, jwTHeader.typ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, alg, typ);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTHeader {\n");
    
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
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




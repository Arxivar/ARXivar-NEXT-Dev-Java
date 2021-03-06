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
 * MaskDetailDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class MaskDetailDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("maskId")
  private String maskId = null;

  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("detailKind")
  private Integer detailKind = null;

  public MaskDetailDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Detail Identifier
   * @return id
  **/
  @ApiModelProperty(value = "Detail Identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MaskDetailDTO maskId(String maskId) {
    this.maskId = maskId;
    return this;
  }

   /**
   * Mask Identifier
   * @return maskId
  **/
  @ApiModelProperty(value = "Mask Identifier")
  public String getMaskId() {
    return maskId;
  }

  public void setMaskId(String maskId) {
    this.maskId = maskId;
  }

  public MaskDetailDTO fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the field.
   * @return fieldName
  **/
  @ApiModelProperty(value = "Name of the field.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public MaskDetailDTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label
   * @return label
  **/
  @ApiModelProperty(value = "Label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public MaskDetailDTO order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Mask detail order
   * @return order
  **/
  @ApiModelProperty(value = "Mask detail order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public MaskDetailDTO readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Read Only
   * @return readOnly
  **/
  @ApiModelProperty(value = "Read Only")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public MaskDetailDTO required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Required
   * @return required
  **/
  @ApiModelProperty(value = "Required")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public MaskDetailDTO detailKind(Integer detailKind) {
    this.detailKind = detailKind;
    return this;
  }

   /**
   * Possible values:  0: NonImpostato  1: From  2: To  3: Cc  4: Aoo  5: DocumentType  6: DataDoc  7: Numero  8: Oggetto  9: Origine  10: Stato  11: Pratiche  12: Scadenza  13: Importante  14: AbilitaWeb  15: AvviaWorkFlow  16: InviaPerFax  17: InviaPerMail  18: AllegaATaskAttivo  19: InserisciInAssociazione  20: InserisciInFascicolo  21: InserisciInRelazioneManuale  22: GestisciRevisioni  23: Note  24: Allegati  25: Aggiuntivo  26: File  27: Scanner  28: Barcode  29: SicurezzaSingoloDocumento  30: ExternalId  31: AllegaMemo  32: Senders  33: AvviaCollaboration  34: ScansioneImmediata  35: NegaCommuta  36: From_Cap  37: From_Cell  38: From_Codfis  39: From_Codice  40: From_Contatti  41: From_Email  42: From_Fax  43: From_Faxnome  44: From_Indirizzo  45: From_Localita  46: From_Mail  47: From_Mansione  48: From_Nazione  49: From_Partiva  50: From_Provincia  51: From_Reparto  52: From_Riferimento  53: From_Tel  54: From_Telnome  55: From_Ufficio  56: From_Valore  57: From_Abitazione  58: To_Cap  59: To_Cell  60: To_Codfis  61: To_Codice  62: To_Contatti  63: To_Email  64: To_Fax  65: To_Faxnome  66: To_Indirizzo  67: To_Localita  68: To_Mail  69: To_Mansione  70: To_Nazione  71: To_Partiva  72: To_Provincia  73: To_Reparto  74: To_Riferimento  75: To_Tel  76: To_Telnome  77: To_Ufficio  78: To_Valore  79: To_Abitazione  80: Cc_Cap  81: Cc_Cell  82: Cc_Codfis  83: Cc_Codice  84: Cc_Contatti  85: Cc_Email  86: Cc_Fax  87: Cc_Faxnome  88: Cc_Indirizzo  89: Cc_Localita  90: Cc_Mail  91: Cc_Mansione  92: Cc_Nazione  93: Cc_Partiva  94: Cc_Provincia  95: Cc_Reparto  96: Cc_Riferimento  97: Cc_Tel  98: Cc_Telnome  99: Cc_Ufficio  100: Cc_Valore  101: Cc_Abitazione  102: Senders_Cap  103: Senders_Cell  104: Senders_Codfis  105: Senders_Codice  106: Senders_Contatti  107: Senders_Email  108: Senders_Fax  109: Senders_Faxnome  110: Senders_Indirizzo  111: Senders_Localita  112: Senders_Mail  113: Senders_Mansione  114: Senders_Nazione  115: Senders_Partiva  116: Senders_Provincia  117: Senders_Reparto  118: Senders_Riferimento  119: Senders_Tel  120: Senders_Telnome  121: Senders_Ufficio  122: Senders_Valore  123: Senders_Abitazione  124: From_Priorita  125: To_Priorita  126: Cc_Priorita  127: Senders_Priorita 
   * @return detailKind
  **/
  @ApiModelProperty(value = "Possible values:  0: NonImpostato  1: From  2: To  3: Cc  4: Aoo  5: DocumentType  6: DataDoc  7: Numero  8: Oggetto  9: Origine  10: Stato  11: Pratiche  12: Scadenza  13: Importante  14: AbilitaWeb  15: AvviaWorkFlow  16: InviaPerFax  17: InviaPerMail  18: AllegaATaskAttivo  19: InserisciInAssociazione  20: InserisciInFascicolo  21: InserisciInRelazioneManuale  22: GestisciRevisioni  23: Note  24: Allegati  25: Aggiuntivo  26: File  27: Scanner  28: Barcode  29: SicurezzaSingoloDocumento  30: ExternalId  31: AllegaMemo  32: Senders  33: AvviaCollaboration  34: ScansioneImmediata  35: NegaCommuta  36: From_Cap  37: From_Cell  38: From_Codfis  39: From_Codice  40: From_Contatti  41: From_Email  42: From_Fax  43: From_Faxnome  44: From_Indirizzo  45: From_Localita  46: From_Mail  47: From_Mansione  48: From_Nazione  49: From_Partiva  50: From_Provincia  51: From_Reparto  52: From_Riferimento  53: From_Tel  54: From_Telnome  55: From_Ufficio  56: From_Valore  57: From_Abitazione  58: To_Cap  59: To_Cell  60: To_Codfis  61: To_Codice  62: To_Contatti  63: To_Email  64: To_Fax  65: To_Faxnome  66: To_Indirizzo  67: To_Localita  68: To_Mail  69: To_Mansione  70: To_Nazione  71: To_Partiva  72: To_Provincia  73: To_Reparto  74: To_Riferimento  75: To_Tel  76: To_Telnome  77: To_Ufficio  78: To_Valore  79: To_Abitazione  80: Cc_Cap  81: Cc_Cell  82: Cc_Codfis  83: Cc_Codice  84: Cc_Contatti  85: Cc_Email  86: Cc_Fax  87: Cc_Faxnome  88: Cc_Indirizzo  89: Cc_Localita  90: Cc_Mail  91: Cc_Mansione  92: Cc_Nazione  93: Cc_Partiva  94: Cc_Provincia  95: Cc_Reparto  96: Cc_Riferimento  97: Cc_Tel  98: Cc_Telnome  99: Cc_Ufficio  100: Cc_Valore  101: Cc_Abitazione  102: Senders_Cap  103: Senders_Cell  104: Senders_Codfis  105: Senders_Codice  106: Senders_Contatti  107: Senders_Email  108: Senders_Fax  109: Senders_Faxnome  110: Senders_Indirizzo  111: Senders_Localita  112: Senders_Mail  113: Senders_Mansione  114: Senders_Nazione  115: Senders_Partiva  116: Senders_Provincia  117: Senders_Reparto  118: Senders_Riferimento  119: Senders_Tel  120: Senders_Telnome  121: Senders_Ufficio  122: Senders_Valore  123: Senders_Abitazione  124: From_Priorita  125: To_Priorita  126: Cc_Priorita  127: Senders_Priorita ")
  public Integer getDetailKind() {
    return detailKind;
  }

  public void setDetailKind(Integer detailKind) {
    this.detailKind = detailKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskDetailDTO maskDetailDTO = (MaskDetailDTO) o;
    return Objects.equals(this.id, maskDetailDTO.id) &&
        Objects.equals(this.maskId, maskDetailDTO.maskId) &&
        Objects.equals(this.fieldName, maskDetailDTO.fieldName) &&
        Objects.equals(this.label, maskDetailDTO.label) &&
        Objects.equals(this.order, maskDetailDTO.order) &&
        Objects.equals(this.readOnly, maskDetailDTO.readOnly) &&
        Objects.equals(this.required, maskDetailDTO.required) &&
        Objects.equals(this.detailKind, maskDetailDTO.detailKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maskId, fieldName, label, order, readOnly, required, detailKind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskDetailDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maskId: ").append(toIndentedString(maskId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    detailKind: ").append(toIndentedString(detailKind)).append("\n");
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


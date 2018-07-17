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
import io.swagger.client.model.FieldInt;
import io.swagger.client.model.FieldString;
import java.io.IOException;

/**
 * JoinDmDatiProfilo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class JoinDmDatiProfilo {
  @SerializedName("legameTabella")
  private String legameTabella = null;

  @SerializedName("id")
  private FieldInt id = null;

  @SerializedName("docnumber")
  private FieldInt docnumber = null;

  @SerializedName("campo")
  private FieldString campo = null;

  @SerializedName("valore")
  private FieldString valore = null;

  @SerializedName("contatti")
  private FieldString contatti = null;

  @SerializedName("fax")
  private FieldString fax = null;

  @SerializedName("tel")
  private FieldString tel = null;

  @SerializedName("indirizzo")
  private FieldString indirizzo = null;

  @SerializedName("mail")
  private FieldString mail = null;

  @SerializedName("localita")
  private FieldString localita = null;

  @SerializedName("cap")
  private FieldString cap = null;

  @SerializedName("provincia")
  private FieldString provincia = null;

  @SerializedName("nazione")
  private FieldString nazione = null;

  @SerializedName("codice")
  private FieldString codice = null;

  @SerializedName("contatto")
  private FieldString contatto = null;

  @SerializedName("mansione")
  private FieldString mansione = null;

  @SerializedName("telnome")
  private FieldString telnome = null;

  @SerializedName("faxnome")
  private FieldString faxnome = null;

  @SerializedName("cell")
  private FieldString cell = null;

  @SerializedName("abitazione")
  private FieldString abitazione = null;

  @SerializedName("reparto")
  private FieldString reparto = null;

  @SerializedName("ufficio")
  private FieldString ufficio = null;

  @SerializedName("email")
  private FieldString email = null;

  @SerializedName("riferimento")
  private FieldString riferimento = null;

  @SerializedName("codfis")
  private FieldString codfis = null;

  @SerializedName("partiva")
  private FieldString partiva = null;

  @SerializedName("priorita")
  private FieldString priorita = null;

  @SerializedName("idrubrica")
  private FieldInt idrubrica = null;

  @SerializedName("idcontatto")
  private FieldInt idcontatto = null;

  @SerializedName("forceCaseInsensitive")
  private Boolean forceCaseInsensitive = null;

  @SerializedName("joinMode")
  private Integer joinMode = null;

  @SerializedName("nomeTabella")
  private String nomeTabella = null;

  public JoinDmDatiProfilo legameTabella(String legameTabella) {
    this.legameTabella = legameTabella;
    return this;
  }

   /**
   * Get legameTabella
   * @return legameTabella
  **/
  @ApiModelProperty(value = "")
  public String getLegameTabella() {
    return legameTabella;
  }

  public void setLegameTabella(String legameTabella) {
    this.legameTabella = legameTabella;
  }

  public JoinDmDatiProfilo id(FieldInt id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public FieldInt getId() {
    return id;
  }

  public void setId(FieldInt id) {
    this.id = id;
  }

  public JoinDmDatiProfilo docnumber(FieldInt docnumber) {
    this.docnumber = docnumber;
    return this;
  }

   /**
   * Get docnumber
   * @return docnumber
  **/
  @ApiModelProperty(value = "")
  public FieldInt getDocnumber() {
    return docnumber;
  }

  public void setDocnumber(FieldInt docnumber) {
    this.docnumber = docnumber;
  }

  public JoinDmDatiProfilo campo(FieldString campo) {
    this.campo = campo;
    return this;
  }

   /**
   * Get campo
   * @return campo
  **/
  @ApiModelProperty(value = "")
  public FieldString getCampo() {
    return campo;
  }

  public void setCampo(FieldString campo) {
    this.campo = campo;
  }

  public JoinDmDatiProfilo valore(FieldString valore) {
    this.valore = valore;
    return this;
  }

   /**
   * Get valore
   * @return valore
  **/
  @ApiModelProperty(value = "")
  public FieldString getValore() {
    return valore;
  }

  public void setValore(FieldString valore) {
    this.valore = valore;
  }

  public JoinDmDatiProfilo contatti(FieldString contatti) {
    this.contatti = contatti;
    return this;
  }

   /**
   * Get contatti
   * @return contatti
  **/
  @ApiModelProperty(value = "")
  public FieldString getContatti() {
    return contatti;
  }

  public void setContatti(FieldString contatti) {
    this.contatti = contatti;
  }

  public JoinDmDatiProfilo fax(FieldString fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public FieldString getFax() {
    return fax;
  }

  public void setFax(FieldString fax) {
    this.fax = fax;
  }

  public JoinDmDatiProfilo tel(FieldString tel) {
    this.tel = tel;
    return this;
  }

   /**
   * Get tel
   * @return tel
  **/
  @ApiModelProperty(value = "")
  public FieldString getTel() {
    return tel;
  }

  public void setTel(FieldString tel) {
    this.tel = tel;
  }

  public JoinDmDatiProfilo indirizzo(FieldString indirizzo) {
    this.indirizzo = indirizzo;
    return this;
  }

   /**
   * Get indirizzo
   * @return indirizzo
  **/
  @ApiModelProperty(value = "")
  public FieldString getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(FieldString indirizzo) {
    this.indirizzo = indirizzo;
  }

  public JoinDmDatiProfilo mail(FieldString mail) {
    this.mail = mail;
    return this;
  }

   /**
   * Get mail
   * @return mail
  **/
  @ApiModelProperty(value = "")
  public FieldString getMail() {
    return mail;
  }

  public void setMail(FieldString mail) {
    this.mail = mail;
  }

  public JoinDmDatiProfilo localita(FieldString localita) {
    this.localita = localita;
    return this;
  }

   /**
   * Get localita
   * @return localita
  **/
  @ApiModelProperty(value = "")
  public FieldString getLocalita() {
    return localita;
  }

  public void setLocalita(FieldString localita) {
    this.localita = localita;
  }

  public JoinDmDatiProfilo cap(FieldString cap) {
    this.cap = cap;
    return this;
  }

   /**
   * Get cap
   * @return cap
  **/
  @ApiModelProperty(value = "")
  public FieldString getCap() {
    return cap;
  }

  public void setCap(FieldString cap) {
    this.cap = cap;
  }

  public JoinDmDatiProfilo provincia(FieldString provincia) {
    this.provincia = provincia;
    return this;
  }

   /**
   * Get provincia
   * @return provincia
  **/
  @ApiModelProperty(value = "")
  public FieldString getProvincia() {
    return provincia;
  }

  public void setProvincia(FieldString provincia) {
    this.provincia = provincia;
  }

  public JoinDmDatiProfilo nazione(FieldString nazione) {
    this.nazione = nazione;
    return this;
  }

   /**
   * Get nazione
   * @return nazione
  **/
  @ApiModelProperty(value = "")
  public FieldString getNazione() {
    return nazione;
  }

  public void setNazione(FieldString nazione) {
    this.nazione = nazione;
  }

  public JoinDmDatiProfilo codice(FieldString codice) {
    this.codice = codice;
    return this;
  }

   /**
   * Get codice
   * @return codice
  **/
  @ApiModelProperty(value = "")
  public FieldString getCodice() {
    return codice;
  }

  public void setCodice(FieldString codice) {
    this.codice = codice;
  }

  public JoinDmDatiProfilo contatto(FieldString contatto) {
    this.contatto = contatto;
    return this;
  }

   /**
   * Get contatto
   * @return contatto
  **/
  @ApiModelProperty(value = "")
  public FieldString getContatto() {
    return contatto;
  }

  public void setContatto(FieldString contatto) {
    this.contatto = contatto;
  }

  public JoinDmDatiProfilo mansione(FieldString mansione) {
    this.mansione = mansione;
    return this;
  }

   /**
   * Get mansione
   * @return mansione
  **/
  @ApiModelProperty(value = "")
  public FieldString getMansione() {
    return mansione;
  }

  public void setMansione(FieldString mansione) {
    this.mansione = mansione;
  }

  public JoinDmDatiProfilo telnome(FieldString telnome) {
    this.telnome = telnome;
    return this;
  }

   /**
   * Get telnome
   * @return telnome
  **/
  @ApiModelProperty(value = "")
  public FieldString getTelnome() {
    return telnome;
  }

  public void setTelnome(FieldString telnome) {
    this.telnome = telnome;
  }

  public JoinDmDatiProfilo faxnome(FieldString faxnome) {
    this.faxnome = faxnome;
    return this;
  }

   /**
   * Get faxnome
   * @return faxnome
  **/
  @ApiModelProperty(value = "")
  public FieldString getFaxnome() {
    return faxnome;
  }

  public void setFaxnome(FieldString faxnome) {
    this.faxnome = faxnome;
  }

  public JoinDmDatiProfilo cell(FieldString cell) {
    this.cell = cell;
    return this;
  }

   /**
   * Get cell
   * @return cell
  **/
  @ApiModelProperty(value = "")
  public FieldString getCell() {
    return cell;
  }

  public void setCell(FieldString cell) {
    this.cell = cell;
  }

  public JoinDmDatiProfilo abitazione(FieldString abitazione) {
    this.abitazione = abitazione;
    return this;
  }

   /**
   * Get abitazione
   * @return abitazione
  **/
  @ApiModelProperty(value = "")
  public FieldString getAbitazione() {
    return abitazione;
  }

  public void setAbitazione(FieldString abitazione) {
    this.abitazione = abitazione;
  }

  public JoinDmDatiProfilo reparto(FieldString reparto) {
    this.reparto = reparto;
    return this;
  }

   /**
   * Get reparto
   * @return reparto
  **/
  @ApiModelProperty(value = "")
  public FieldString getReparto() {
    return reparto;
  }

  public void setReparto(FieldString reparto) {
    this.reparto = reparto;
  }

  public JoinDmDatiProfilo ufficio(FieldString ufficio) {
    this.ufficio = ufficio;
    return this;
  }

   /**
   * Get ufficio
   * @return ufficio
  **/
  @ApiModelProperty(value = "")
  public FieldString getUfficio() {
    return ufficio;
  }

  public void setUfficio(FieldString ufficio) {
    this.ufficio = ufficio;
  }

  public JoinDmDatiProfilo email(FieldString email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public FieldString getEmail() {
    return email;
  }

  public void setEmail(FieldString email) {
    this.email = email;
  }

  public JoinDmDatiProfilo riferimento(FieldString riferimento) {
    this.riferimento = riferimento;
    return this;
  }

   /**
   * Get riferimento
   * @return riferimento
  **/
  @ApiModelProperty(value = "")
  public FieldString getRiferimento() {
    return riferimento;
  }

  public void setRiferimento(FieldString riferimento) {
    this.riferimento = riferimento;
  }

  public JoinDmDatiProfilo codfis(FieldString codfis) {
    this.codfis = codfis;
    return this;
  }

   /**
   * Get codfis
   * @return codfis
  **/
  @ApiModelProperty(value = "")
  public FieldString getCodfis() {
    return codfis;
  }

  public void setCodfis(FieldString codfis) {
    this.codfis = codfis;
  }

  public JoinDmDatiProfilo partiva(FieldString partiva) {
    this.partiva = partiva;
    return this;
  }

   /**
   * Get partiva
   * @return partiva
  **/
  @ApiModelProperty(value = "")
  public FieldString getPartiva() {
    return partiva;
  }

  public void setPartiva(FieldString partiva) {
    this.partiva = partiva;
  }

  public JoinDmDatiProfilo priorita(FieldString priorita) {
    this.priorita = priorita;
    return this;
  }

   /**
   * Get priorita
   * @return priorita
  **/
  @ApiModelProperty(value = "")
  public FieldString getPriorita() {
    return priorita;
  }

  public void setPriorita(FieldString priorita) {
    this.priorita = priorita;
  }

  public JoinDmDatiProfilo idrubrica(FieldInt idrubrica) {
    this.idrubrica = idrubrica;
    return this;
  }

   /**
   * Get idrubrica
   * @return idrubrica
  **/
  @ApiModelProperty(value = "")
  public FieldInt getIdrubrica() {
    return idrubrica;
  }

  public void setIdrubrica(FieldInt idrubrica) {
    this.idrubrica = idrubrica;
  }

  public JoinDmDatiProfilo idcontatto(FieldInt idcontatto) {
    this.idcontatto = idcontatto;
    return this;
  }

   /**
   * Get idcontatto
   * @return idcontatto
  **/
  @ApiModelProperty(value = "")
  public FieldInt getIdcontatto() {
    return idcontatto;
  }

  public void setIdcontatto(FieldInt idcontatto) {
    this.idcontatto = idcontatto;
  }

  public JoinDmDatiProfilo forceCaseInsensitive(Boolean forceCaseInsensitive) {
    this.forceCaseInsensitive = forceCaseInsensitive;
    return this;
  }

   /**
   * Get forceCaseInsensitive
   * @return forceCaseInsensitive
  **/
  @ApiModelProperty(value = "")
  public Boolean isForceCaseInsensitive() {
    return forceCaseInsensitive;
  }

  public void setForceCaseInsensitive(Boolean forceCaseInsensitive) {
    this.forceCaseInsensitive = forceCaseInsensitive;
  }

  public JoinDmDatiProfilo joinMode(Integer joinMode) {
    this.joinMode = joinMode;
    return this;
  }

   /**
   * Possible values:  0: INNER  1: LEFT  2: RIGHT 
   * @return joinMode
  **/
  @ApiModelProperty(value = "Possible values:  0: INNER  1: LEFT  2: RIGHT ")
  public Integer getJoinMode() {
    return joinMode;
  }

  public void setJoinMode(Integer joinMode) {
    this.joinMode = joinMode;
  }

  public JoinDmDatiProfilo nomeTabella(String nomeTabella) {
    this.nomeTabella = nomeTabella;
    return this;
  }

   /**
   * Get nomeTabella
   * @return nomeTabella
  **/
  @ApiModelProperty(value = "")
  public String getNomeTabella() {
    return nomeTabella;
  }

  public void setNomeTabella(String nomeTabella) {
    this.nomeTabella = nomeTabella;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinDmDatiProfilo joinDmDatiProfilo = (JoinDmDatiProfilo) o;
    return Objects.equals(this.legameTabella, joinDmDatiProfilo.legameTabella) &&
        Objects.equals(this.id, joinDmDatiProfilo.id) &&
        Objects.equals(this.docnumber, joinDmDatiProfilo.docnumber) &&
        Objects.equals(this.campo, joinDmDatiProfilo.campo) &&
        Objects.equals(this.valore, joinDmDatiProfilo.valore) &&
        Objects.equals(this.contatti, joinDmDatiProfilo.contatti) &&
        Objects.equals(this.fax, joinDmDatiProfilo.fax) &&
        Objects.equals(this.tel, joinDmDatiProfilo.tel) &&
        Objects.equals(this.indirizzo, joinDmDatiProfilo.indirizzo) &&
        Objects.equals(this.mail, joinDmDatiProfilo.mail) &&
        Objects.equals(this.localita, joinDmDatiProfilo.localita) &&
        Objects.equals(this.cap, joinDmDatiProfilo.cap) &&
        Objects.equals(this.provincia, joinDmDatiProfilo.provincia) &&
        Objects.equals(this.nazione, joinDmDatiProfilo.nazione) &&
        Objects.equals(this.codice, joinDmDatiProfilo.codice) &&
        Objects.equals(this.contatto, joinDmDatiProfilo.contatto) &&
        Objects.equals(this.mansione, joinDmDatiProfilo.mansione) &&
        Objects.equals(this.telnome, joinDmDatiProfilo.telnome) &&
        Objects.equals(this.faxnome, joinDmDatiProfilo.faxnome) &&
        Objects.equals(this.cell, joinDmDatiProfilo.cell) &&
        Objects.equals(this.abitazione, joinDmDatiProfilo.abitazione) &&
        Objects.equals(this.reparto, joinDmDatiProfilo.reparto) &&
        Objects.equals(this.ufficio, joinDmDatiProfilo.ufficio) &&
        Objects.equals(this.email, joinDmDatiProfilo.email) &&
        Objects.equals(this.riferimento, joinDmDatiProfilo.riferimento) &&
        Objects.equals(this.codfis, joinDmDatiProfilo.codfis) &&
        Objects.equals(this.partiva, joinDmDatiProfilo.partiva) &&
        Objects.equals(this.priorita, joinDmDatiProfilo.priorita) &&
        Objects.equals(this.idrubrica, joinDmDatiProfilo.idrubrica) &&
        Objects.equals(this.idcontatto, joinDmDatiProfilo.idcontatto) &&
        Objects.equals(this.forceCaseInsensitive, joinDmDatiProfilo.forceCaseInsensitive) &&
        Objects.equals(this.joinMode, joinDmDatiProfilo.joinMode) &&
        Objects.equals(this.nomeTabella, joinDmDatiProfilo.nomeTabella);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legameTabella, id, docnumber, campo, valore, contatti, fax, tel, indirizzo, mail, localita, cap, provincia, nazione, codice, contatto, mansione, telnome, faxnome, cell, abitazione, reparto, ufficio, email, riferimento, codfis, partiva, priorita, idrubrica, idcontatto, forceCaseInsensitive, joinMode, nomeTabella);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinDmDatiProfilo {\n");
    
    sb.append("    legameTabella: ").append(toIndentedString(legameTabella)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    docnumber: ").append(toIndentedString(docnumber)).append("\n");
    sb.append("    campo: ").append(toIndentedString(campo)).append("\n");
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
    sb.append("    contatti: ").append(toIndentedString(contatti)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    localita: ").append(toIndentedString(localita)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    nazione: ").append(toIndentedString(nazione)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    contatto: ").append(toIndentedString(contatto)).append("\n");
    sb.append("    mansione: ").append(toIndentedString(mansione)).append("\n");
    sb.append("    telnome: ").append(toIndentedString(telnome)).append("\n");
    sb.append("    faxnome: ").append(toIndentedString(faxnome)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
    sb.append("    abitazione: ").append(toIndentedString(abitazione)).append("\n");
    sb.append("    reparto: ").append(toIndentedString(reparto)).append("\n");
    sb.append("    ufficio: ").append(toIndentedString(ufficio)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    codfis: ").append(toIndentedString(codfis)).append("\n");
    sb.append("    partiva: ").append(toIndentedString(partiva)).append("\n");
    sb.append("    priorita: ").append(toIndentedString(priorita)).append("\n");
    sb.append("    idrubrica: ").append(toIndentedString(idrubrica)).append("\n");
    sb.append("    idcontatto: ").append(toIndentedString(idcontatto)).append("\n");
    sb.append("    forceCaseInsensitive: ").append(toIndentedString(forceCaseInsensitive)).append("\n");
    sb.append("    joinMode: ").append(toIndentedString(joinMode)).append("\n");
    sb.append("    nomeTabella: ").append(toIndentedString(nomeTabella)).append("\n");
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


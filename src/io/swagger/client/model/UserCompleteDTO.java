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
import org.joda.time.DateTime;

/**
 * Class of user
 */
@ApiModel(description = "Class of user")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-11T12:02:47.866+02:00")
public class UserCompleteDTO {
  @SerializedName("user")
  private Integer user = null;

  @SerializedName("group")
  private Integer group = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("businessUnit")
  private String businessUnit = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("passwordNew")
  private String passwordNew = null;

  @SerializedName("defaultType")
  private Integer defaultType = null;

  @SerializedName("type2")
  private Integer type2 = null;

  @SerializedName("type3")
  private Integer type3 = null;

  @SerializedName("internalFax")
  private String internalFax = null;

  @SerializedName("lastMail")
  private DateTime lastMail = null;

  @SerializedName("category")
  private Integer category = null;

  @SerializedName("workflow")
  private Boolean workflow = null;

  @SerializedName("defaultState")
  private String defaultState = null;

  @SerializedName("addressBook")
  private Boolean addressBook = null;

  @SerializedName("userState")
  private Integer userState = null;

  @SerializedName("mailServer")
  private String mailServer = null;

  @SerializedName("webAccess")
  private Boolean webAccess = null;

  @SerializedName("upload")
  private Boolean upload = null;

  @SerializedName("folders")
  private Boolean folders = null;

  @SerializedName("flow")
  private Boolean flow = null;

  @SerializedName("sign")
  private Boolean sign = null;

  @SerializedName("viewer")
  private Integer viewer = null;

  @SerializedName("protocol")
  private Boolean protocol = null;

  @SerializedName("models")
  private Boolean models = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("outState")
  private String outState = null;

  @SerializedName("mailBody")
  private String mailBody = null;

  @SerializedName("notify")
  private Boolean notify = null;

  @SerializedName("mailClient")
  private String mailClient = null;

  @SerializedName("htmlBody")
  private Integer htmlBody = null;

  @SerializedName("respAos")
  private Boolean respAos = null;

  @SerializedName("assAos")
  private Boolean assAos = null;

  @SerializedName("codFis")
  private String codFis = null;

  @SerializedName("pin")
  private String pin = null;

  @SerializedName("guest")
  private Boolean guest = null;

  @SerializedName("passwordChange")
  private Boolean passwordChange = null;

  @SerializedName("marking")
  private byte[] marking = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("mailOutDefault")
  private Boolean mailOutDefault = null;

  @SerializedName("barcodeAccess")
  private Boolean barcodeAccess = null;

  @SerializedName("mustChangePassword")
  private Integer mustChangePassword = null;

  @SerializedName("lang")
  private String lang = null;

  @SerializedName("profileDefault_Id")
  private Integer profileDefaultId = null;

  @SerializedName("ws")
  private Boolean ws = null;

  @SerializedName("pswFailCount")
  private Integer pswFailCount = null;

  @SerializedName("pswLastFailDate")
  private DateTime pswLastFailDate = null;

  @SerializedName("pswFailIpCaller")
  private String pswFailIpCaller = null;

  @SerializedName("disablePswExpired")
  private Boolean disablePswExpired = null;

  @SerializedName("lockOutDateTimeUtc")
  private DateTime lockOutDateTimeUtc = null;

  @SerializedName("completeName")
  private String completeName = null;

  public UserCompleteDTO user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * Identifier
   * @return user
  **/
  @ApiModelProperty(value = "Identifier")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public UserCompleteDTO group(Integer group) {
    this.group = group;
    return this;
  }

   /**
   * Possible values:  0: Non_Impostato  1: Admin  2: User  3: Profiler 
   * @return group
  **/
  @ApiModelProperty(value = "Possible values:  0: Non_Impostato  1: Admin  2: User  3: Profiler ")
  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public UserCompleteDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserCompleteDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @ApiModelProperty(value = "Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserCompleteDTO businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

   /**
   * Business Unit
   * @return businessUnit
  **/
  @ApiModelProperty(value = "Business Unit")
  public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public UserCompleteDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserCompleteDTO passwordNew(String passwordNew) {
    this.passwordNew = passwordNew;
    return this;
  }

   /**
   * New Password
   * @return passwordNew
  **/
  @ApiModelProperty(value = "New Password")
  public String getPasswordNew() {
    return passwordNew;
  }

  public void setPasswordNew(String passwordNew) {
    this.passwordNew = passwordNew;
  }

  public UserCompleteDTO defaultType(Integer defaultType) {
    this.defaultType = defaultType;
    return this;
  }

   /**
   * Default Document Type of First Level
   * @return defaultType
  **/
  @ApiModelProperty(value = "Default Document Type of First Level")
  public Integer getDefaultType() {
    return defaultType;
  }

  public void setDefaultType(Integer defaultType) {
    this.defaultType = defaultType;
  }

  public UserCompleteDTO type2(Integer type2) {
    this.type2 = type2;
    return this;
  }

   /**
   * Default Document Type of Second Level
   * @return type2
  **/
  @ApiModelProperty(value = "Default Document Type of Second Level")
  public Integer getType2() {
    return type2;
  }

  public void setType2(Integer type2) {
    this.type2 = type2;
  }

  public UserCompleteDTO type3(Integer type3) {
    this.type3 = type3;
    return this;
  }

   /**
   * Default Document Type of Third Level
   * @return type3
  **/
  @ApiModelProperty(value = "Default Document Type of Third Level")
  public Integer getType3() {
    return type3;
  }

  public void setType3(Integer type3) {
    this.type3 = type3;
  }

  public UserCompleteDTO internalFax(String internalFax) {
    this.internalFax = internalFax;
    return this;
  }

   /**
   * Personal Fax
   * @return internalFax
  **/
  @ApiModelProperty(value = "Personal Fax")
  public String getInternalFax() {
    return internalFax;
  }

  public void setInternalFax(String internalFax) {
    this.internalFax = internalFax;
  }

  public UserCompleteDTO lastMail(DateTime lastMail) {
    this.lastMail = lastMail;
    return this;
  }

   /**
   * Date of last reading email
   * @return lastMail
  **/
  @ApiModelProperty(value = "Date of last reading email")
  public DateTime getLastMail() {
    return lastMail;
  }

  public void setLastMail(DateTime lastMail) {
    this.lastMail = lastMail;
  }

  public UserCompleteDTO category(Integer category) {
    this.category = category;
    return this;
  }

   /**
   * Possible values:  0: U  1: S  2: M  3: F  4: G  5: I  6: D 
   * @return category
  **/
  @ApiModelProperty(value = "Possible values:  0: U  1: S  2: M  3: F  4: G  5: I  6: D ")
  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public UserCompleteDTO workflow(Boolean workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * Enabling Workflow Management
   * @return workflow
  **/
  @ApiModelProperty(value = "Enabling Workflow Management")
  public Boolean isWorkflow() {
    return workflow;
  }

  public void setWorkflow(Boolean workflow) {
    this.workflow = workflow;
  }

  public UserCompleteDTO defaultState(String defaultState) {
    this.defaultState = defaultState;
    return this;
  }

   /**
   * Default Document Status
   * @return defaultState
  **/
  @ApiModelProperty(value = "Default Document Status")
  public String getDefaultState() {
    return defaultState;
  }

  public void setDefaultState(String defaultState) {
    this.defaultState = defaultState;
  }

  public UserCompleteDTO addressBook(Boolean addressBook) {
    this.addressBook = addressBook;
    return this;
  }

   /**
   * Enabling to insert new address book items into profiling
   * @return addressBook
  **/
  @ApiModelProperty(value = "Enabling to insert new address book items into profiling")
  public Boolean isAddressBook() {
    return addressBook;
  }

  public void setAddressBook(Boolean addressBook) {
    this.addressBook = addressBook;
  }

  public UserCompleteDTO userState(Integer userState) {
    this.userState = userState;
    return this;
  }

   /**
   * Possible values:  0: NonAttivo  1: Attivo  2: Nascosto 
   * @return userState
  **/
  @ApiModelProperty(value = "Possible values:  0: NonAttivo  1: Attivo  2: Nascosto ")
  public Integer getUserState() {
    return userState;
  }

  public void setUserState(Integer userState) {
    this.userState = userState;
  }

  public UserCompleteDTO mailServer(String mailServer) {
    this.mailServer = mailServer;
    return this;
  }

   /**
   * Email Server
   * @return mailServer
  **/
  @ApiModelProperty(value = "Email Server")
  public String getMailServer() {
    return mailServer;
  }

  public void setMailServer(String mailServer) {
    this.mailServer = mailServer;
  }

  public UserCompleteDTO webAccess(Boolean webAccess) {
    this.webAccess = webAccess;
    return this;
  }

   /**
   * Access via Web
   * @return webAccess
  **/
  @ApiModelProperty(value = "Access via Web")
  public Boolean isWebAccess() {
    return webAccess;
  }

  public void setWebAccess(Boolean webAccess) {
    this.webAccess = webAccess;
  }

  public UserCompleteDTO upload(Boolean upload) {
    this.upload = upload;
    return this;
  }

   /**
   * Enabled to Import
   * @return upload
  **/
  @ApiModelProperty(value = "Enabled to Import")
  public Boolean isUpload() {
    return upload;
  }

  public void setUpload(Boolean upload) {
    this.upload = upload;
  }

  public UserCompleteDTO folders(Boolean folders) {
    this.folders = folders;
    return this;
  }

   /**
   * Enabled to OCR
   * @return folders
  **/
  @ApiModelProperty(value = "Enabled to OCR")
  public Boolean isFolders() {
    return folders;
  }

  public void setFolders(Boolean folders) {
    this.folders = folders;
  }

  public UserCompleteDTO flow(Boolean flow) {
    this.flow = flow;
    return this;
  }

   /**
   * Enabled to Workflow
   * @return flow
  **/
  @ApiModelProperty(value = "Enabled to Workflow")
  public Boolean isFlow() {
    return flow;
  }

  public void setFlow(Boolean flow) {
    this.flow = flow;
  }

  public UserCompleteDTO sign(Boolean sign) {
    this.sign = sign;
    return this;
  }

   /**
   * Enabled to Sign
   * @return sign
  **/
  @ApiModelProperty(value = "Enabled to Sign")
  public Boolean isSign() {
    return sign;
  }

  public void setSign(Boolean sign) {
    this.sign = sign;
  }

  public UserCompleteDTO viewer(Integer viewer) {
    this.viewer = viewer;
    return this;
  }

   /**
   * Possible values:  0: Standard  1: Lite  2: Comunicazioni  3: Portal 
   * @return viewer
  **/
  @ApiModelProperty(value = "Possible values:  0: Standard  1: Lite  2: Comunicazioni  3: Portal ")
  public Integer getViewer() {
    return viewer;
  }

  public void setViewer(Integer viewer) {
    this.viewer = viewer;
  }

  public UserCompleteDTO protocol(Boolean protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Enabled to Public Amministration (PA) Protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "Enabled to Public Amministration (PA) Protocol")
  public Boolean isProtocol() {
    return protocol;
  }

  public void setProtocol(Boolean protocol) {
    this.protocol = protocol;
  }

  public UserCompleteDTO models(Boolean models) {
    this.models = models;
    return this;
  }

   /**
   * Enabled to Templates
   * @return models
  **/
  @ApiModelProperty(value = "Enabled to Templates")
  public Boolean isModels() {
    return models;
  }

  public void setModels(Boolean models) {
    this.models = models;
  }

  public UserCompleteDTO domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain
   * @return domain
  **/
  @ApiModelProperty(value = "Domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public UserCompleteDTO outState(String outState) {
    this.outState = outState;
    return this;
  }

   /**
   * Out Status
   * @return outState
  **/
  @ApiModelProperty(value = "Out Status")
  public String getOutState() {
    return outState;
  }

  public void setOutState(String outState) {
    this.outState = outState;
  }

  public UserCompleteDTO mailBody(String mailBody) {
    this.mailBody = mailBody;
    return this;
  }

   /**
   * Email Body
   * @return mailBody
  **/
  @ApiModelProperty(value = "Email Body")
  public String getMailBody() {
    return mailBody;
  }

  public void setMailBody(String mailBody) {
    this.mailBody = mailBody;
  }

  public UserCompleteDTO notify(Boolean notify) {
    this.notify = notify;
    return this;
  }

   /**
   * Enabled to Notify
   * @return notify
  **/
  @ApiModelProperty(value = "Enabled to Notify")
  public Boolean isNotify() {
    return notify;
  }

  public void setNotify(Boolean notify) {
    this.notify = notify;
  }

  public UserCompleteDTO mailClient(String mailClient) {
    this.mailClient = mailClient;
    return this;
  }

   /**
   * Mailer client
   * @return mailClient
  **/
  @ApiModelProperty(value = "Mailer client")
  public String getMailClient() {
    return mailClient;
  }

  public void setMailClient(String mailClient) {
    this.mailClient = mailClient;
  }

  public UserCompleteDTO htmlBody(Integer htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * Possible values:  0: Disabilitato  1: SoloSpedizione  2: SoloRicezione  3: SpedizioneRicezione 
   * @return htmlBody
  **/
  @ApiModelProperty(value = "Possible values:  0: Disabilitato  1: SoloSpedizione  2: SoloRicezione  3: SpedizioneRicezione ")
  public Integer getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(Integer htmlBody) {
    this.htmlBody = htmlBody;
  }

  public UserCompleteDTO respAos(Boolean respAos) {
    this.respAos = respAos;
    return this;
  }

   /**
   * Person in Charge of AOS
   * @return respAos
  **/
  @ApiModelProperty(value = "Person in Charge of AOS")
  public Boolean isRespAos() {
    return respAos;
  }

  public void setRespAos(Boolean respAos) {
    this.respAos = respAos;
  }

  public UserCompleteDTO assAos(Boolean assAos) {
    this.assAos = assAos;
    return this;
  }

   /**
   * Enabled to Profile Manual Emails
   * @return assAos
  **/
  @ApiModelProperty(value = "Enabled to Profile Manual Emails")
  public Boolean isAssAos() {
    return assAos;
  }

  public void setAssAos(Boolean assAos) {
    this.assAos = assAos;
  }

  public UserCompleteDTO codFis(String codFis) {
    this.codFis = codFis;
    return this;
  }

   /**
   * Fiscal Code
   * @return codFis
  **/
  @ApiModelProperty(value = "Fiscal Code")
  public String getCodFis() {
    return codFis;
  }

  public void setCodFis(String codFis) {
    this.codFis = codFis;
  }

  public UserCompleteDTO pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Pin
   * @return pin
  **/
  @ApiModelProperty(value = "Pin")
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public UserCompleteDTO guest(Boolean guest) {
    this.guest = guest;
    return this;
  }

   /**
   * Guest
   * @return guest
  **/
  @ApiModelProperty(value = "Guest")
  public Boolean isGuest() {
    return guest;
  }

  public void setGuest(Boolean guest) {
    this.guest = guest;
  }

  public UserCompleteDTO passwordChange(Boolean passwordChange) {
    this.passwordChange = passwordChange;
    return this;
  }

   /**
   * Change Password
   * @return passwordChange
  **/
  @ApiModelProperty(value = "Change Password")
  public Boolean isPasswordChange() {
    return passwordChange;
  }

  public void setPasswordChange(Boolean passwordChange) {
    this.passwordChange = passwordChange;
  }

  public UserCompleteDTO marking(byte[] marking) {
    this.marking = marking;
    return this;
  }

   /**
   * Imagine for the Digital Signature
   * @return marking
  **/
  @ApiModelProperty(value = "Imagine for the Digital Signature")
  public byte[] getMarking() {
    return marking;
  }

  public void setMarking(byte[] marking) {
    this.marking = marking;
  }

  public UserCompleteDTO type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(value = "Type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public UserCompleteDTO mailOutDefault(Boolean mailOutDefault) {
    this.mailOutDefault = mailOutDefault;
    return this;
  }

   /**
   * Enabled to Profile Manual Outgoing Emails
   * @return mailOutDefault
  **/
  @ApiModelProperty(value = "Enabled to Profile Manual Outgoing Emails")
  public Boolean isMailOutDefault() {
    return mailOutDefault;
  }

  public void setMailOutDefault(Boolean mailOutDefault) {
    this.mailOutDefault = mailOutDefault;
  }

  public UserCompleteDTO barcodeAccess(Boolean barcodeAccess) {
    this.barcodeAccess = barcodeAccess;
    return this;
  }

   /**
   * Enabled to Barcode
   * @return barcodeAccess
  **/
  @ApiModelProperty(value = "Enabled to Barcode")
  public Boolean isBarcodeAccess() {
    return barcodeAccess;
  }

  public void setBarcodeAccess(Boolean barcodeAccess) {
    this.barcodeAccess = barcodeAccess;
  }

  public UserCompleteDTO mustChangePassword(Integer mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
    return this;
  }

   /**
   * Possible values:  0: No  1: Yes  2: YesForChangePasswordNew 
   * @return mustChangePassword
  **/
  @ApiModelProperty(value = "Possible values:  0: No  1: Yes  2: YesForChangePasswordNew ")
  public Integer getMustChangePassword() {
    return mustChangePassword;
  }

  public void setMustChangePassword(Integer mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
  }

  public UserCompleteDTO lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Language
   * @return lang
  **/
  @ApiModelProperty(value = "Language")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public UserCompleteDTO profileDefaultId(Integer profileDefaultId) {
    this.profileDefaultId = profileDefaultId;
    return this;
  }

   /**
   * Predefined Profile Identifier
   * @return profileDefaultId
  **/
  @ApiModelProperty(value = "Predefined Profile Identifier")
  public Integer getProfileDefaultId() {
    return profileDefaultId;
  }

  public void setProfileDefaultId(Integer profileDefaultId) {
    this.profileDefaultId = profileDefaultId;
  }

  public UserCompleteDTO ws(Boolean ws) {
    this.ws = ws;
    return this;
  }

   /**
   * Enabled to IX service.
   * @return ws
  **/
  @ApiModelProperty(value = "Enabled to IX service.")
  public Boolean isWs() {
    return ws;
  }

  public void setWs(Boolean ws) {
    this.ws = ws;
  }

  public UserCompleteDTO pswFailCount(Integer pswFailCount) {
    this.pswFailCount = pswFailCount;
    return this;
  }

   /**
   * Count of the failed attempts to change password
   * @return pswFailCount
  **/
  @ApiModelProperty(value = "Count of the failed attempts to change password")
  public Integer getPswFailCount() {
    return pswFailCount;
  }

  public void setPswFailCount(Integer pswFailCount) {
    this.pswFailCount = pswFailCount;
  }

  public UserCompleteDTO pswLastFailDate(DateTime pswLastFailDate) {
    this.pswLastFailDate = pswLastFailDate;
    return this;
  }

   /**
   * Last failed Attempt to change password
   * @return pswLastFailDate
  **/
  @ApiModelProperty(value = "Last failed Attempt to change password")
  public DateTime getPswLastFailDate() {
    return pswLastFailDate;
  }

  public void setPswLastFailDate(DateTime pswLastFailDate) {
    this.pswLastFailDate = pswLastFailDate;
  }

  public UserCompleteDTO pswFailIpCaller(String pswFailIpCaller) {
    this.pswFailIpCaller = pswFailIpCaller;
    return this;
  }

   /**
   * Ip Address used by failed change password
   * @return pswFailIpCaller
  **/
  @ApiModelProperty(value = "Ip Address used by failed change password")
  public String getPswFailIpCaller() {
    return pswFailIpCaller;
  }

  public void setPswFailIpCaller(String pswFailIpCaller) {
    this.pswFailIpCaller = pswFailIpCaller;
  }

  public UserCompleteDTO disablePswExpired(Boolean disablePswExpired) {
    this.disablePswExpired = disablePswExpired;
    return this;
  }

   /**
   * Disabled Expired Password
   * @return disablePswExpired
  **/
  @ApiModelProperty(value = "Disabled Expired Password")
  public Boolean isDisablePswExpired() {
    return disablePswExpired;
  }

  public void setDisablePswExpired(Boolean disablePswExpired) {
    this.disablePswExpired = disablePswExpired;
  }

  public UserCompleteDTO lockOutDateTimeUtc(DateTime lockOutDateTimeUtc) {
    this.lockOutDateTimeUtc = lockOutDateTimeUtc;
    return this;
  }

   /**
   * User Date Blocked
   * @return lockOutDateTimeUtc
  **/
  @ApiModelProperty(value = "User Date Blocked")
  public DateTime getLockOutDateTimeUtc() {
    return lockOutDateTimeUtc;
  }

  public void setLockOutDateTimeUtc(DateTime lockOutDateTimeUtc) {
    this.lockOutDateTimeUtc = lockOutDateTimeUtc;
  }

  public UserCompleteDTO completeName(String completeName) {
    this.completeName = completeName;
    return this;
  }

   /**
   * Full Name
   * @return completeName
  **/
  @ApiModelProperty(value = "Full Name")
  public String getCompleteName() {
    return completeName;
  }

  public void setCompleteName(String completeName) {
    this.completeName = completeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCompleteDTO userCompleteDTO = (UserCompleteDTO) o;
    return Objects.equals(this.user, userCompleteDTO.user) &&
        Objects.equals(this.group, userCompleteDTO.group) &&
        Objects.equals(this.description, userCompleteDTO.description) &&
        Objects.equals(this.email, userCompleteDTO.email) &&
        Objects.equals(this.businessUnit, userCompleteDTO.businessUnit) &&
        Objects.equals(this.password, userCompleteDTO.password) &&
        Objects.equals(this.passwordNew, userCompleteDTO.passwordNew) &&
        Objects.equals(this.defaultType, userCompleteDTO.defaultType) &&
        Objects.equals(this.type2, userCompleteDTO.type2) &&
        Objects.equals(this.type3, userCompleteDTO.type3) &&
        Objects.equals(this.internalFax, userCompleteDTO.internalFax) &&
        Objects.equals(this.lastMail, userCompleteDTO.lastMail) &&
        Objects.equals(this.category, userCompleteDTO.category) &&
        Objects.equals(this.workflow, userCompleteDTO.workflow) &&
        Objects.equals(this.defaultState, userCompleteDTO.defaultState) &&
        Objects.equals(this.addressBook, userCompleteDTO.addressBook) &&
        Objects.equals(this.userState, userCompleteDTO.userState) &&
        Objects.equals(this.mailServer, userCompleteDTO.mailServer) &&
        Objects.equals(this.webAccess, userCompleteDTO.webAccess) &&
        Objects.equals(this.upload, userCompleteDTO.upload) &&
        Objects.equals(this.folders, userCompleteDTO.folders) &&
        Objects.equals(this.flow, userCompleteDTO.flow) &&
        Objects.equals(this.sign, userCompleteDTO.sign) &&
        Objects.equals(this.viewer, userCompleteDTO.viewer) &&
        Objects.equals(this.protocol, userCompleteDTO.protocol) &&
        Objects.equals(this.models, userCompleteDTO.models) &&
        Objects.equals(this.domain, userCompleteDTO.domain) &&
        Objects.equals(this.outState, userCompleteDTO.outState) &&
        Objects.equals(this.mailBody, userCompleteDTO.mailBody) &&
        Objects.equals(this.notify, userCompleteDTO.notify) &&
        Objects.equals(this.mailClient, userCompleteDTO.mailClient) &&
        Objects.equals(this.htmlBody, userCompleteDTO.htmlBody) &&
        Objects.equals(this.respAos, userCompleteDTO.respAos) &&
        Objects.equals(this.assAos, userCompleteDTO.assAos) &&
        Objects.equals(this.codFis, userCompleteDTO.codFis) &&
        Objects.equals(this.pin, userCompleteDTO.pin) &&
        Objects.equals(this.guest, userCompleteDTO.guest) &&
        Objects.equals(this.passwordChange, userCompleteDTO.passwordChange) &&
        Objects.equals(this.marking, userCompleteDTO.marking) &&
        Objects.equals(this.type, userCompleteDTO.type) &&
        Objects.equals(this.mailOutDefault, userCompleteDTO.mailOutDefault) &&
        Objects.equals(this.barcodeAccess, userCompleteDTO.barcodeAccess) &&
        Objects.equals(this.mustChangePassword, userCompleteDTO.mustChangePassword) &&
        Objects.equals(this.lang, userCompleteDTO.lang) &&
        Objects.equals(this.profileDefaultId, userCompleteDTO.profileDefaultId) &&
        Objects.equals(this.ws, userCompleteDTO.ws) &&
        Objects.equals(this.pswFailCount, userCompleteDTO.pswFailCount) &&
        Objects.equals(this.pswLastFailDate, userCompleteDTO.pswLastFailDate) &&
        Objects.equals(this.pswFailIpCaller, userCompleteDTO.pswFailIpCaller) &&
        Objects.equals(this.disablePswExpired, userCompleteDTO.disablePswExpired) &&
        Objects.equals(this.lockOutDateTimeUtc, userCompleteDTO.lockOutDateTimeUtc) &&
        Objects.equals(this.completeName, userCompleteDTO.completeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group, description, email, businessUnit, password, passwordNew, defaultType, type2, type3, internalFax, lastMail, category, workflow, defaultState, addressBook, userState, mailServer, webAccess, upload, folders, flow, sign, viewer, protocol, models, domain, outState, mailBody, notify, mailClient, htmlBody, respAos, assAos, codFis, pin, guest, passwordChange, marking, type, mailOutDefault, barcodeAccess, mustChangePassword, lang, profileDefaultId, ws, pswFailCount, pswLastFailDate, pswFailIpCaller, disablePswExpired, lockOutDateTimeUtc, completeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompleteDTO {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordNew: ").append(toIndentedString(passwordNew)).append("\n");
    sb.append("    defaultType: ").append(toIndentedString(defaultType)).append("\n");
    sb.append("    type2: ").append(toIndentedString(type2)).append("\n");
    sb.append("    type3: ").append(toIndentedString(type3)).append("\n");
    sb.append("    internalFax: ").append(toIndentedString(internalFax)).append("\n");
    sb.append("    lastMail: ").append(toIndentedString(lastMail)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    defaultState: ").append(toIndentedString(defaultState)).append("\n");
    sb.append("    addressBook: ").append(toIndentedString(addressBook)).append("\n");
    sb.append("    userState: ").append(toIndentedString(userState)).append("\n");
    sb.append("    mailServer: ").append(toIndentedString(mailServer)).append("\n");
    sb.append("    webAccess: ").append(toIndentedString(webAccess)).append("\n");
    sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    viewer: ").append(toIndentedString(viewer)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    outState: ").append(toIndentedString(outState)).append("\n");
    sb.append("    mailBody: ").append(toIndentedString(mailBody)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    mailClient: ").append(toIndentedString(mailClient)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    respAos: ").append(toIndentedString(respAos)).append("\n");
    sb.append("    assAos: ").append(toIndentedString(assAos)).append("\n");
    sb.append("    codFis: ").append(toIndentedString(codFis)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    guest: ").append(toIndentedString(guest)).append("\n");
    sb.append("    passwordChange: ").append(toIndentedString(passwordChange)).append("\n");
    sb.append("    marking: ").append(toIndentedString(marking)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mailOutDefault: ").append(toIndentedString(mailOutDefault)).append("\n");
    sb.append("    barcodeAccess: ").append(toIndentedString(barcodeAccess)).append("\n");
    sb.append("    mustChangePassword: ").append(toIndentedString(mustChangePassword)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    profileDefaultId: ").append(toIndentedString(profileDefaultId)).append("\n");
    sb.append("    ws: ").append(toIndentedString(ws)).append("\n");
    sb.append("    pswFailCount: ").append(toIndentedString(pswFailCount)).append("\n");
    sb.append("    pswLastFailDate: ").append(toIndentedString(pswLastFailDate)).append("\n");
    sb.append("    pswFailIpCaller: ").append(toIndentedString(pswFailIpCaller)).append("\n");
    sb.append("    disablePswExpired: ").append(toIndentedString(disablePswExpired)).append("\n");
    sb.append("    lockOutDateTimeUtc: ").append(toIndentedString(lockOutDateTimeUtc)).append("\n");
    sb.append("    completeName: ").append(toIndentedString(completeName)).append("\n");
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

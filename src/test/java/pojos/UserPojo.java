package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPojo {
 private String createdBy;
 private String createdDate;
 private Integer id;
 private String login;
 private String firstName;
 private String lastName;
 private String email;
 private Boolean activated;
 private String langKey;
 private String imageUrl;
 private String resetDate;
 private String ssn;

 public UserPojo() {


 }

 public UserPojo(String createdBy, String createdDate, Integer id, String login, String firstName, String lastName, String email, Boolean activated, String langKey, String imageUrl, String resetDate, String ssn) {
  this.createdBy = createdBy;
  this.createdDate = createdDate;
  this.id = id;
  this.login = login;
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
  this.activated = activated;
  this.langKey = langKey;
  this.imageUrl = imageUrl;
  this.resetDate = resetDate;
  this.ssn = ssn;
 }

 public String getCreatedBy() {
  return createdBy;
 }

 public void setCreatedBy(String createdBy) {
  this.createdBy = createdBy;
 }

 public String getCreatedDate() {
  return createdDate;
 }

 public void setCreatedDate(String createdDate) {
  this.createdDate = createdDate;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getLogin() {
  return login;
 }

 public void setLogin(String login) {
  this.login = login;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public Boolean getActivated() {
  return activated;
 }

 public void setActivated(Boolean activated) {
  this.activated = activated;
 }

 public String getLangKey() {
  return langKey;
 }

 public void setLangKey(String langKey) {
  this.langKey = langKey;
 }

 public String getImageUrl() {
  return imageUrl;
 }

 public void setImageUrl(String imageUrl) {
  this.imageUrl = imageUrl;
 }

 public String getResetDate() {
  return resetDate;
 }

 public void setResetDate(String resetDate) {
  this.resetDate = resetDate;
 }

 public String getSsn() {
  return ssn;
 }

 public void setSsn(String ssn) {
  this.ssn = ssn;
 }

 @Override
 public String toString() {
  return "UserPojo{" +
          "createdBy='" + createdBy + '\'' +
          ", createdDate='" + createdDate + '\'' +
          ", id=" + id +
          ", login='" + login + '\'' +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", email='" + email + '\'' +
          ", activated=" + activated +
          ", langKey='" + langKey + '\'' +
          ", imageUrl='" + imageUrl + '\'' +
          ", resetDate='" + resetDate + '\'' +
          ", ssn='" + ssn + '\'' +
          '}';
 }

 /*
    {
            "createdBy": "anonymousUser",
            "createdDate": "2021-12-31T15:45:10.851372Z",
            "id": 4651,
            "startDate": "2022-01-01T00:00:00Z",
            "endDate": "2022-01-01T01:00:00Z",
            "status": "UNAPPROVED",
            "anamnesis": null,
            "treatment": null,
            "diagnosis": null,
            "prescription": null,
            "description": null,
            "physician": {
                "createdBy": "admin79",
                "createdDate": "2022-03-02T17:47:35.045823Z",
                "id": 10512,
                "firstName": "doctor79",
                "lastName": "su",
                "birthDate": "1980-06-14T04:00:00Z",
                "phone": "789 8579087",
                "gender": "MALE",
                "bloodGroup": "Apositive",
                "adress": "45922 Hansen Shores, Sharleenland, CT 56190-9652",
                "description": "Investor Operations Coordinator",
                "user": {
                    "createdBy": "anonymousUser",
                    "createdDate": "2022-03-02T17:43:00.172414Z",
                    "id": 11750,
                    "login": "doctor79",
                    "firstName": "doctor79",
                    "lastName": "su",
                    "email": "doctor_079@gmail.com",
                    "activated": true,
                    "langKey": "en",
                    "imageUrl": null,
                    "resetDate": null,
                    "ssn": "456-67-8769"
        }

        */
}

package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhysicianPojo {

    private String adress;
    private String [] appointments;
    private String birthDate;
    private String bloodGroup;
    private Country country;
    private String createdBy;
    private String createdDate;
    private State cstate;
    private String description;

    @JsonProperty("examFee")
    private Number examFee;
    private String firstName;
    private String gender;
    private int id;
    @JsonProperty("image")
    private String image;

    @JsonProperty("imageContentType")
    private String imageContentType;
    private String lastName;
    private String phone;
    private String speciality;
    private String ssn;
    private UserPojo user;



    public PhysicianPojo() {
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String[] getAppointments() {
        return appointments;
    }

    public void setAppointments(String[] appointments) {
        this.appointments = appointments;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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

    public State getCstate() {
        return cstate;
    }

    public void setCstate(State cstate) {
        this.cstate = cstate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public UserPojo getUser() {
        return user;
    }

    public void setUser(UserPojo user) {
        this.user = user;
    }

    public PhysicianPojo(String createdBy, String createdDate, Integer id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String description, UserPojo user) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.description = description;
        this.user = user;


    }

    public PhysicianPojo(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "PhysicianPojo{" +
                "adress='" + adress + '\'' +
                ", appointments=" + Arrays.toString(appointments) +
                ", birthDate='" + birthDate + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", country=" + country +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", cstate=" + cstate +
                ", description='" + description + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", speciality='" + speciality + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }

 /*
  	Physician{
adress	[...]
appointments	[...]
birthDate	[...]
bloodGroup	[...]
country	Country{
id	[...]
name	[...]

}
createdBy	[...]
createdDate	[...]
cstate	CState{
country*	Country{...}
id	[...]
name	[...]

}
description	[...]
examFee*	[...]
firstName*	[...]
gender	[...]
id	[...]
image	[...]
imageContentType	[...]
lastName*	string
phone*	[...]
speciality	[...]
ssn*	[...]
use
   */

}

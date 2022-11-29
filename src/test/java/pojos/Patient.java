package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
    /*
     {
      "adress": "string",
      "appointments": [
        "string"
      ],
      "birthDate": "2022-08-19T09:18:22.702Z",
      "bloodGroup": "Apositive",
      "country": {

      },
      "createdBy": "string",
      "createdDate": "2022-08-19T09:18:22.702Z",
      "cstate": {

      },
      "description": "string",
      "email": "string",
      "firstName": "string",
      "gender": "MALE",
      "id": 0,
      "inPatients": [
        string
      ],
      "lastName": "string",
      "phone": "string",
      "ssn": "463-78-4923",
      "user": {

      }
    }
     */

    private String adress;
    private String [] appointments;
    private String birthDate;
    private String bloodGroup;
    private Country country;
    private String createdBy;
    private String createdDate;
    private State cstate;
    private String description;
    private String email;
    private String firstName;
    private String gender;
    private int id;
    private Inpatient [] inPatients;
    private String lastName;
    private String phone;
    private String ssn;
    private UserPojo user;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Inpatient[] getInPatients() {
        return inPatients;
    }

    public void setInPatients(Inpatient[] inPatients) {
        this.inPatients = inPatients;
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

    @Override
    public String toString() {
        return "Patient{" +
                "adress='" + adress + '\'' +
                ", appointments=" + Arrays.toString(appointments) +
                ", birthDate='" + birthDate + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", country=" + country +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", cstate=" + cstate +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", inPatients=" + Arrays.toString(inPatients) +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }
}

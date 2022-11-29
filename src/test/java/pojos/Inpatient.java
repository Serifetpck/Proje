package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inpatient {
    /*
     [
        {
          "appointment": "string",
          "createdBy": "string",
          "createdDate": "2022-08-19T09:18:22.702Z",
          "description": "string",
          "endDate": "2022-08-19T09:18:22.702Z",
          "id": 0,
          "patient": "string",
          "room": {

          },
          "startDate": "2022-08-19T09:18:22.702Z",
          "status": "UNAPPROVED"
        }
      ]
     */

    private String appointment;
    private String createdBy;
    private String createdDate;
    private String description;
    private String endDate;
    private int id;
    private String patient;
    private Room room;
    private String startDate;
    private String status;

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Inpatient{" +
                "appointment='" + appointment + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", description='" + description + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", patient='" + patient + '\'' +
                ", room=" + room +
                ", startDate='" + startDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

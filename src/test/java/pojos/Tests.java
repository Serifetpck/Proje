package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tests {
    /*
     [
      {
        "appointment": "string",
        "createdBy": "string",
        "createdDate": "2022-08-19T09:18:22.702Z",
        "ctestResults": [

        ],
        "date": "2022-08-19T09:18:22.702Z",
        "description": "string",
        "id": 0,
        "name": "string"
      }
    ]
     */
    private String appointment;
    private String createdBy;
    private String createdDate;
    private TestResult [] ctestResults;
    private String date;
    private String description;
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Tests{" +
                "appointment='" + appointment + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", ctestResults=" + Arrays.toString(ctestResults) +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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

    public TestResult[] getCtestResults() {
        return ctestResults;
    }

    public void setCtestResults(TestResult[] ctestResults) {
        this.ctestResults = ctestResults;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

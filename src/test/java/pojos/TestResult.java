package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResult {
    /*
    [
          {
            "createdBy": "string",
            "createdDate": "2022-08-19T09:18:22.702Z",
            "ctest": "string",
            "ctestItem": {

            },
            "date": "2022-08-19T09:18:22.702Z",
            "description": "string",
            "id": 0,
            "result": "string"
          }
        ]
     */
    private String createdBy;
    private String createdDate;
    private String ctest;
    private TestItem ctestItem;
    private String date;
    private String description;
    private int id;
    private String result;

    @Override
    public String toString() {
        return "TestResult{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", ctest='" + ctest + '\'' +
                ", ctestItem=" + ctestItem +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", result='" + result + '\'' +
                '}';
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

    public String getCtest() {
        return ctest;
    }

    public void setCtest(String ctest) {
        this.ctest = ctest;
    }

    public TestItem getCtestItem() {
        return ctestItem;
    }

    public void setCtestItem(TestItem ctestItem) {
        this.ctestItem = ctestItem;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

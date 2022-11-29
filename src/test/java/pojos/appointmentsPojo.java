package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class appointmentsPojo {

    private String anamnesis;
    private String createdBy;
    private String createdDate;
    private Tests[] ctests;
    private String description;
    private String diagnosis;
    private String endDate;
    private int id;
    private Patient patient;
    private PhysicianPojo physician;
    private String prescription;
    private String startDate;
    private String status;
    private String treatment;

    public appointmentsPojo() {
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
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

    public Tests[] getCtests() {
        return ctests;
    }

    public void setCtests(Tests[] ctests) {
        this.ctests = ctests;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public PhysicianPojo getPhysician() {
        return physician;
    }

    public void setPhysician(PhysicianPojo physician) {
        this.physician = physician;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
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

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public appointmentsPojo( String endDate, int id, PhysicianPojo physician, String startDate, String status) {

        this.endDate = endDate;
        this.id = id;
        this.physician = physician;
        this.startDate = startDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "appointmentsPojo{" +
                "anamnesis='" + anamnesis + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", ctests=" + Arrays.toString(ctests) +
                ", description='" + description + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", patient=" + patient +
                ", physician=" + physician +
                ", prescription='" + prescription + '\'' +
                ", startDate='" + startDate + '\'' +
                ", status='" + status + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }
}
/*
anamnesis	[...]
createdBy	[...]
createdDate	[...]
ctests	[...]
description	[...]
diagnosis	[...]
endDate*	[...]
id	[...]
patient	Patient{...}
physician	Physician{...}
prescription	[...]
startDate*	[...]
status*	[...]
treatment	[...]
 */
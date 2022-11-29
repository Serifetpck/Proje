package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import pojos.PhysicianPojo;
import pojos.appointmentsPojo;
import utilities.Authentication;

import java.sql.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Api_StepDef  extends Authentication{

    Response response;
    @Given("I am an authorized user")
    public void i_am_an_authorized_user() {
        String url="https://medunna.com/api/appointments/306280";

        response=given().headers("Authorization","Bearer "+(generateToken())).when().get(url);
       response.prettyPrint();

    }


    @When("Physician send GET Request to the URL")
    public void physicianSendGETRequestToTheURL() {

    }

    @Then("HTTP Status Code should be {int}")
    public void httpStatusCodeShouldBe(int statuscode) {

        PhysicianPojo physicianPojo=new PhysicianPojo("Sifa","Acil");
        appointmentsPojo expectedappointments=new appointmentsPojo("2022-11-19T01:00:00Z",306280,physicianPojo,"2022-11-19T00:00:00Z", "UNAPPROVED");

        appointmentsPojo actualData = response.as(appointmentsPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(200,response.getStatusCode());
        assertEquals("Acil",actualData.getPhysician().getFirstName());
        assertEquals(expectedappointments.getPhysician().getLastName(),actualData.getPhysician().getLastName());
        assertEquals(expectedappointments.getStatus(), actualData.getStatus());
        assertEquals(expectedappointments.getStartDate(), actualData.getStartDate());
        assertEquals(expectedappointments.getEndDate(), actualData.getEndDate());
        assertEquals(expectedappointments.getId(), actualData.getId());




    }




}

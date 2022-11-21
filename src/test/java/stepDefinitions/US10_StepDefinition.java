package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US10_StepDefinition {
    DoctorPage doctorPage=new DoctorPage();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js;
    @Given("Doktor url gider")
    public void doktorUrlGider(){

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Doktor Kisi ikonuna  tiklar")
    public void doktorKisiIkonunaTiklar() {
        ReusableMethods.waitFor(3);
        doctorPage.kisiIconu.click();
    }

    @And("Doktor sigin buttonuna tiklar")
    public void doktorSiginButtonunaTiklar() {
        ReusableMethods.waitFor(3);
        doctorPage.signIn.click();
    }

    @When("Doktor rolu ile gecerli username {string} girer")
    public void doktorRoluIleGecerliUsernameGirer(String userName) {
        ReusableMethods.waitFor(3);
        doctorPage.userName.sendKeys(userName);
    }

    @And("Doktor rolu ile gecerli password {string} girer")
    public void doktorRoluIleGecerliPasswordGirer(String password) {
        ReusableMethods.waitFor(3);
        doctorPage.password.sendKeys(password);
    }

    @And("Doktor Sign 'i tiklar")
    public void doktorSignITiklar() {
        ReusableMethods.waitFor(3);
        doctorPage.signInButton.click();
    }

    @And("My Pages buttonuna tiklar")
    public void myPagesButtonunaTiklar() {
        ReusableMethods.waitFor(3);
       doctorPage.PhysicianMyPages.click();
    }

    @And("My Appointment buttonuna tiklar")
    public void myAppointmentButtonunaTiklar() {
        ReusableMethods.waitFor(3);
        doctorPage.PhysicianMyAppointments.click();

    }


    @Then("Zaman araligini gorur.")
    public void zaman_araligini_gorur() {
        ReusableMethods.waitFor(3);

       Assert.assertTrue(doctorPage.PhysicianMyAppointmentsStartDateTime.isDisplayed());
       Assert.assertTrue(doctorPage.PhysicianMyAppointmentsEndDateTime.isDisplayed());


    }
    @And("Randevu  tarih araligini  belirler")
    public void randevuTarihAraliginiBelirler() {



     ReusableMethods.waitFor(3);
     WebElement fromDte =Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));

     String fromdate1 = "13.";
     String fromdate2 = "11.";
     String fromdate3 = "2022";
     fromDte.sendKeys(fromdate1);
     fromDte.sendKeys(fromdate2);
     fromDte.sendKeys(fromdate3);
      ReusableMethods.waitFor(3);
        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 = "21";
        String todate2 = "/11";
        String todate3 = "/2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);



    }
    @Then("Randevu listesini gorur")
    public void randevuListesiniGorur() {
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentsId.getText().contains("ID"));
    }

    @And("Tarih araligini max onbes gun secer")
    public void tarihAraliginiMaxOnbesGunSecer() {
        ReusableMethods.waitFor(3);
        WebElement fromDte =Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));

        String fromdate1 = "13.";
        String fromdate2 = "11.";
        String fromdate3 = "2022";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 = "28.";
        String todate2 = "11.";
        String todate3 = "2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);


    }
    @Then("{string} randevu  bilgilerini gorur")
    public void randevuBilgileriniGorur(String randevuBilgileri) {
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentsId.getText().contains(randevuBilgileri));
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentsStartDateTime.getText().contains(randevuBilgileri));
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentsEndDateTime.getText().contains(randevuBilgileri));
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentStatus.getText().contains(randevuBilgileri));


    }





    @And("Randevu olmayan bir aralik girer")
    public void Randevuolmayanbiraralikgirer() {
        ReusableMethods.waitFor(3);
        WebElement fromDte =Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));

        String fromdate1 = "13.";
        String fromdate2 = "01.";
        String fromdate3 = "2023";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 = "5.";
        String todate2 = "01.";
        String todate3 = "2023";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);

    }

    @Then("{string} randevu bilgileri gorulemez")
    public void randevuBilgileriGorulemez(String randevuBilgileri) {
        Assert.assertFalse(doctorPage.PhysicianMyAppointmentsId.getText().contains(randevuBilgileri));
        Assert.assertFalse(doctorPage.PhysicianMyAppointmentsStartDateTime.getText().contains(randevuBilgileri));
        Assert.assertFalse(doctorPage.PhysicianMyAppointmentsEndDateTime.getText().contains(randevuBilgileri));
        Assert.assertFalse(doctorPage.PhysicianMyAppointmentStatus.getText().contains(randevuBilgileri));



    }


    @Then("Secilen aralikta randevu yoksa {string} uyarisini gorur")
    public void secilenAraliktaRandevuYoksaUyarisiniGorur(String mesaj) {
        Assert.assertTrue(doctorPage.appointmentsMesaji.getText().contains(mesaj));

    }

    @And("Zaman araligini onbes gunden fazla secer")
    public void zamanAraliginiOnbesGundenFazlaSecer() {
        ReusableMethods.waitFor(3);
        WebElement fromDte =Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));

        String fromdate1 = "13.";
        String fromdate2 = "11.";
        String fromdate3 = "2023";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 = "29.";
        String todate2 = "12.";
        String todate3 = "2023";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);

    }

    @Then("Uyari mesajini alir")
    public void uyariMesajiniAlir() {
        ReusableMethods.waitForVisibility(doctorPage.appointmentsHataMesaji,5);
        String expected="Days between begin date and end date must be max 15 day";


        Assert.assertTrue(doctorPage.appointmentsHataMesaji.getText().contains("Days between begin date and end date must be max 15 day"));


    }
}

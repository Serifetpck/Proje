package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DocPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US10_StepDef {
    DocPage docPage=new DocPage();
    @Given("Doktor url gider")
    public void doktorUrlGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @Given("Doktor Kisi ikonuna  tiklar")
    public void doktorKisiIkonunaTiklar() {
        ReusableMethods.waitFor(3);
        docPage.kisiIconu.click();
    }

    @And("Doktor sigin buttonuna tiklar")
    public void doktorSiginButtonunaTiklar() {
        ReusableMethods.waitFor(3);
        docPage.signIn.click();
    }

    @When("Doktor rolu ile gecerli username {string} girer")
    public void doktorRoluIleGecerliUsernameGirer(String userName) {
        ReusableMethods.waitFor(3);
        docPage.userName.sendKeys(userName);
    }

    @And("Doktor rolu ile gecerli password {string} girer")
    public void doktorRoluIleGecerliPasswordGirer(String password) {
        ReusableMethods.waitFor(3);
        docPage.password.sendKeys(password);
    }

    @And("Doktor Sign 'i tiklar")
    public void doktorSignITiklar() {
        ReusableMethods.waitFor(3);
        docPage.signInButton.click();
    }

    @And("My Pages buttonuna tiklar")
    public void myPagesButtonunaTiklar() {
        ReusableMethods.waitFor(3);
        docPage.PhysicianMyPages.click();
    }

    @And("My Appointment buttonuna tiklar")
    public void myAppointmentButtonunaTiklar() {
        ReusableMethods.waitFor(3);
        docPage.PhysicianMyAppointments.click();
    }

    @Then("Zaman araligini gorur.")
    public void zamanAraliginiGorur() {
        ReusableMethods.waitFor(3);

        Assert.assertTrue(docPage.PhysicianMyAppointmentsFrom.isDisplayed());
        Assert.assertTrue(docPage.PhysicianMyAppointmentsTo.isDisplayed());


    }

    @And("Randevu  tarih araligini  belirler")
    public void randevuTarihAraliginiBelirler() {
        ReusableMethods.waitFor(3);
        WebElement fromDte = docPage.PhysicianMyAppointmentsFrom;

        String fromdate1 = "13.";
        String fromdate2 = "11.";
        String fromdate3 = "2022";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = docPage.PhysicianMyAppointmentsTo;
        String todate1 = "21";
        String todate2 = "/11";
        String todate3 = "/2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);


    }

    @Then("Randevu listesini gorur")
    public void randevuListesiniGorur() {
        Assert.assertTrue(docPage.PhysicianMyAppointmentsId.getText().contains("ID"));

    }

    @And("Tarih araligini max onbes gun secer")
    public void tarihAraliginiMaxOnbesGunSecer() {
        ReusableMethods.waitFor(3);
        WebElement fromDte =docPage.PhysicianMyAppointmentsFrom;

        String fromdate1 = "13.";
        String fromdate2 = "11.";
        String fromdate3 = "2022";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = docPage.PhysicianMyAppointmentsTo;
        String todate1 = "27.";
        String todate2 = "11.";
        String todate3 = "2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);

    }
    @Then("ID , Start DateTime , End DateTime , Status  randevu  bilgilerini gorur")
    public void ıdStartDateTimeEndDateTimeStatusRandevuBilgileriniGorur() {
        ReusableMethods.waitFor(3);
        String expectedId="ID";
        String expectedStartDate="Start DateTime";
        String expectedEndDate="End DateTime";
        String expectedStatus="Status";
        Assert.assertEquals(docPage.PhysicianMyAppointmentsId.getText(),expectedId);
        Assert.assertEquals(docPage.PhysicianMyAppointmentsStartDateTime.getText(),expectedStartDate);
        ReusableMethods.waitFor(3);
        Assert.assertEquals(docPage.PhysicianMyAppointmentsEndDateTime.getText(),expectedEndDate);
        Assert.assertEquals(docPage.PhysicianMyAppointmentStatus.getText(),expectedStatus);

    }



    @And("Randevu olmayan bir aralik girer")
    public void randevuOlmayanBirAralikGirer() {
        ReusableMethods.waitFor(3);
        WebElement fromDte =docPage.PhysicianMyAppointmentsFrom;

        String fromdate1 = "13.";
        String fromdate2 = "12.";
        String fromdate3 = "2022";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = docPage.PhysicianMyAppointmentsTo;
        String todate1 = "27.";
        String todate2 = "12.";
        String todate3 = "2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);

    }

    @Then("Secilen aralikta randevu yoksa {string} uyarisini gorur")
    public void secilenAraliktaRandevuYoksaUyarisiniGorur(String mesaj) {
        Assert.assertTrue(docPage.appointmentsMesaji.getText().contains(mesaj));
    }

    @And("Zaman araligini onbes gunden fazla secer")
    public void zamanAraliginiOnbesGundenFazlaSecer() {
        ReusableMethods.waitFor(3);
        WebElement fromDte =docPage.PhysicianMyAppointmentsFrom;

        String fromdate1 = "13.";
        String fromdate2 = "11.";
        String fromdate3 = "2023";
        fromDte.sendKeys(fromdate1);
        fromDte.sendKeys(fromdate2);
        fromDte.sendKeys(fromdate3);
        ReusableMethods.waitFor(3);
        WebElement todate = docPage.PhysicianMyAppointmentsTo;
        String todate1 = "29.";
        String todate2 = "12.";
        String todate3 = "2023";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);
    }

    @Then("Uyari mesajini alir")
    public void uyariMesajiniAlir() {


        ReusableMethods.waitForVisibility(docPage.appointmentsHataMesaji,5);
        Assert.assertTrue(docPage.appointmentsHataMesaji.isDisplayed());

    }




    @And("Sayfa kapanir")
    public void sayfaKapanir() {
        Driver.closeDriver();
    }
}

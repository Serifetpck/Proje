package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DocPage {

    public DocPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@data-prefix='fas']")
    public WebElement kisiIconu;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "(//span[.='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement PhysicianMyPages;

    @FindBy(xpath = " (//*[text()='My Appointments'])[1]")
    public WebElement PhysicianMyAppointments;

    @FindBy(xpath = "//*[@id = 'fromDate']")
    public WebElement PhysicianMyAppointmentsFrom;

    @FindBy(xpath = "//*[@id = 'toDate']")
    public WebElement PhysicianMyAppointmentsTo;

    @FindBy(xpath = "//span[.='ID']")
    public WebElement PhysicianMyAppointmentsId;

    @FindBy(xpath = "//span[.='Start DateTime']")
    public WebElement PhysicianMyAppointmentsStartDateTime;

    @FindBy(xpath = "//span[.='End DateTime']")
    public WebElement PhysicianMyAppointmentsEndDateTime;

    @FindBy(xpath = "//span[.='Status']")
    public WebElement PhysicianMyAppointmentStatus;

    @FindBy(xpath = "//*[@class='alert alert-warning']")
    public WebElement appointmentsMesaji;

    @FindBy(xpath = "//div[contains(text(),'Days between begin date and end date must be max 15 days')]")
    public WebElement appointmentsHataMesaji;




}

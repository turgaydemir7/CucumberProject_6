package Pages;

import Utilities.GrWD;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GrWD.getDriver(), this);
    }

        @FindBy(xpath ="//a[text()='Register']" )
        public WebElement registerBtn;

        @FindBy(css = "[id='customer.firstName']")
        public   WebElement FirstName;

        @FindBy(css = "[id='customer.lastName']")
        public WebElement LastName;

        @FindBy(css = "[id='customer.address.street']")
        public WebElement Address;

        @FindBy(css = "[id='customer.address.city']")
        public WebElement City;

        @FindBy(id = "customer.address.state")
        public WebElement State;

        @FindBy(css = "[id='customer.address.zipCode']")
        public WebElement ZipCode;

        @FindBy(css = "[id='customer.phoneNumber']")
        public WebElement Phone;

        @FindBy(css = "[id='customer.ssn']")
        public WebElement SSN;

        @FindBy(css = "[id='customer.username']")
        public WebElement Username;

        @FindBy(css = "[id='customer.password']")
        public WebElement Password;

        @FindBy(css = "[id='repeatedPassword']")
        public WebElement repeatPassword;

        @FindBy(xpath = "(//input[@class='button'])[2]")
        public WebElement Confirm;

        @FindBy(xpath = "//p[contains(text(), 'successfully')]")
        public  WebElement successMessage;

        @FindBy(xpath = "(//*[@type='text'])[1]")
        public WebElement UserLogin;

        @FindBy(xpath = "//*[@type='password']")
        public WebElement UserPassword;

        @FindBy(xpath = "//input[@type='submit']")
        public WebElement logInBttn;

        @FindBy(css = "[class='smallText']>b")
        public WebElement logInsuccesMessge;

        @FindBy(xpath = "//a[@href='/parabank/logout.htm']")
        public WebElement logOutBttn;

        @FindBy(css = "[class='error']")
        public WebElement AlertMessage;



        public void findAndSend(WebElement element,String text){

            inputKeys(element, text);
        }
        public void findAndClick(WebElement element){

            clickFunction(element);
        }



    }


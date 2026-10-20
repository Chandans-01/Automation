package genericutilities.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public WebDriver driver;


    // Constructor to initialize the WebDriver instance and initialize all web elements using PageFactory

    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);

        this.driver = driver;

    }


    //Locaters of the Login Page to perform action on it.

    @FindBy(xpath = "//span[text()='Login']")
    WebElement logicTextLoginPage;

    @FindBy(xpath = "//input[@class='jwCbxy']")
    WebElement mobileNumberField;

     
    @FindBy(xpath = "//button[text()='Request OTP']")
    WebElement requestOtpButton;

    @FindBy(xpath = "//a[text()='Terms of Use']")
    WebElement termsOfUseLink;

    @FindBy(xpath = "//a[text()='Privacy Policy']")
    WebElement privacyPolicy;

    // @FindBy(xpath = "//a[text()='New to Flipkart? Create an account']")
    // WebElement newToFlipkartButton;

    // @FindBy(xpath = "//span[@class='llBOFA']")
    // WebElement fieldErrorMessage;


    
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;


    // @FindBy(xpath = "//span[text()='Existing User? Log in']")
    // WebElement existingUserButtonSignUP;

    @FindBy(xpath = "//button[text()='✕']")
    WebElement crossIconLoginPage;

    
    
    // @FindBy(xpath = "//span[contains(text(),'Sign up')]")
    // WebElement signUpText;

    
    // @FindBy(xpath = "//span[text()='Login']")
    // WebElement loginButton;

    @FindBy(xpath = "//span[text()='Use Email-ID']")
    WebElement useEmailIdOption;

    @FindBy(css  = "input[type='email']")
    WebElement mailField;

    

    

    

    

    //Get methods for the locaters to access in project


    public WebElement getLogicTextLoginPage() {
        return logicTextLoginPage;
    }

    public WebElement getMobileNumberField() {
        return mobileNumberField;
    }

    public WebElement getRequestOtpButton() {
        return requestOtpButton;
    }

    public WebElement getTermsOfUseLink() {
        return termsOfUseLink;
    }

    public WebElement getPrivacyPolicy() {
        return privacyPolicy;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getCrossIconLoginPage() {
        return crossIconLoginPage;
    }


    // Methods to perform action on the LoginPage elements.

    public void clickOnTermsLink(){

        getTermsOfUseLink().click();
    }

    public void clickOnPrivacyPolicyLink(){

        getPrivacyPolicy().click();
    }

    public void clickOnRequestOTPButton(){

        getRequestOtpButton().click();
    }
    
    public void sendvalueInMobileNumField(String number){

    mobileNumberField.click();
    mobileNumberField.clear();
    mobileNumberField.sendKeys(number);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }
    
    public void clickOnCrossButton(){

        getCrossIconLoginPage().click();
    }

    

    


}

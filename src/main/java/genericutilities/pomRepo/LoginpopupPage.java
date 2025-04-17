package genericutilities.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpopupPage {

    public WebDriver driver;

    public LoginpopupPage(WebDriver driver){

        PageFactory.initElements(driver, this);

        this.driver = driver;

    }


    @FindBy(xpath = "//span[text()='Login']")
    WebElement logicTextLoginPopup;

    @FindBy(xpath = "//input[@class='r4vIwl BV+Dqf']")
    WebElement emailAndMobileNumberField;

     
    @FindBy(xpath = "//button[text()='Request OTP']")
    WebElement requestOtpButton;

    @FindBy(xpath = "//a[text()='Terms of Use']")
    WebElement termsOfUseLink;

    @FindBy(xpath = "//a[text()='Privacy Policy']")
    WebElement privacyPolicy;

    @FindBy(xpath = "//a[text()='New to Flipkart? Create an account']")
    WebElement newToFlipkartButton;

    @FindBy(xpath = "//span[@class='llBOFA']")
    WebElement fieldErrorMessage;


    
    @FindBy(xpath = "//span[text()='CONTINUE']")
    WebElement continueButtonSignUp;


    @FindBy(xpath = "//span[text()='Existing User? Log in']")
    WebElement existingUserButtonSignUP;

    @FindBy(xpath = "//button[text()='✕']")
    WebElement crossIconLoginPopup;

    public WebElement getLogicTextLoginPopup() {
        return logicTextLoginPopup;
    }

    public WebElement getEmailAndMobileNumberField() {
        return emailAndMobileNumberField;
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

    public WebElement getNewToFlipkartButton() {
        return newToFlipkartButton;
    }

    public WebElement getFieldErrorMessage() {
        return fieldErrorMessage;
    }

    public WebElement getContinueButtonSignUp() {
        return continueButtonSignUp;
    }

    public WebElement getExistingUserButtonSignUP() {
        return existingUserButtonSignUP;
    }

    public WebElement getCrossIconLoginPopup() {
        return crossIconLoginPopup;
    }






    
    
    
    
    
    

    


}

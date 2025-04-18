package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericutilities.driverFactory.DriverFactory;
import genericutilities.pomRepo.HomePage;
import genericutilities.pomRepo.LoginpopupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpopupTest {


    LoginpopupPage loginpopupPage = new LoginpopupPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    WebDriverWait wait = new WebDriverWait(loginpopupPage.driver,Duration.ofSeconds(15));

   

     @Given("user is on Login popup")
    public void user_is_on_login_popup() {
        
        loginpopupPage.driver.get("https://www.flipkart.com");
        loginpopupPage.clickOnLoginButton();


    }
  

 

@Then("Login popup should open")
public void login_popup_should_open() {

    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getLogicTextLoginPopup()));
    Assert.assertTrue(loginpopupPage.getLogicTextLoginPopup().isDisplayed(), "Login popup not opened");
}

@Then("Email or Mobile number field should present on the Login popup")
public void email_or_mobile_number_field_should_present_on_the_login_popup() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getLogicTextLoginPopup()));
    Assert.assertTrue(loginpopupPage.getEmailAndMobileNumberField().isDisplayed(), "Field not displayed");
}




@Then("Request OTP button should be enabled")
public void request_otp_button_should_be_enabled() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getLogicTextLoginPopup()));
    Assert.assertTrue(loginpopupPage.getRequestOtpButton().isEnabled(), "Request OTP button is not enabled");

}



@Then("Terms of Use and Privacy Policy links should present on the Login popup")
public void terms_of_use_and_privacy_policy_links_should_present_on_the_login_popup() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getLogicTextLoginPopup()));
    Assert.assertTrue(loginpopupPage.getTermsOfUseLink().isDisplayed(), "Terms link isn't present");
}



@When("user click on Terms of Use link")
public void user_click_on_terms_of_use_link() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getLogicTextLoginPopup()));
    loginpopupPage.clickOnTermsLink();
}

@Then("Terms page should open")
public void terms_page_should_open() {
    
    wait.until(ExpectedConditions.urlContains("terms"));
    Assert.assertTrue(loginpopupPage.driver.getCurrentUrl().contains("terms"));

}


@When("user click on Privacy Policy link")
public void user_click_on_privacy_policy_link() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getPrivacyPolicy()));
    loginpopupPage.clickOnPrivacyPolicyLink();
}
@Then("Privacy Policy page should open")
public void privacy_policy_page_should_open() {
   
    wait.until(ExpectedConditions.urlContains("privacypolicy"));
    Assert.assertTrue(loginpopupPage.driver.getCurrentUrl().contains("privacypolicy"));

}


@Given("enters {string} digit mobile number")
public void enters_digit_mobile_number(String s) {
    
    loginpopupPage.enterValueInEmailField(s);
}


@Given("click on Request OTP button")
public void click_on_request_otp_button() {
    
    loginpopupPage.clickOnRequestOTPButton();
}
@Then("error should display")
public void error_should_display() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getFieldErrorMessage()));
    Assert.assertTrue(loginpopupPage.getFieldErrorMessage().isDisplayed(), "Error message isn't displayed");

}



@When("user clicks on New to Flipkart button")
public void user_clicks_on_new_to_flipkart_button() {
    
    loginpopupPage.clickOnNewToFlipkartButton();
}
@Then("Sign Up interface should open")
public void sign_up_interface_should_open() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getSignUpText()));
    Assert.assertTrue(loginpopupPage.getSignUpText().isDisplayed(), "sign up interface isn't displayed");
}

@Then("Continue button should displayed")
public void continue_button_should_displayed() {

    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getSignUpText()));
    Assert.assertTrue(loginpopupPage.getContinueButtonSignUp().isDisplayed(), "Continue button isn't displayed");
}
@Then("Existing User Log in button should displayed")
public void existing_user_log_in_button_should_displayed() {
    
    wait.until(ExpectedConditions.visibilityOf(loginpopupPage.getExistingUserButtonSignUP()));
    Assert.assertTrue(loginpopupPage.getExistingUserButtonSignUP().isDisplayed(), "Existing user button isn't displayed");
}




}

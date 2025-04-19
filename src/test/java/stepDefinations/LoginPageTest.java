package stepDefinations;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericutilities.driverFactory.DriverFactory;
import genericutilities.pomRepo.HomePage;
import genericutilities.pomRepo.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {


    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    WebDriverWait wait = new WebDriverWait(loginPage.driver,Duration.ofSeconds(15));

   

     @Given("user is on Login page")
    public void user_is_on_login_page() {
        
        loginPage.driver.get("https://www.flipkart.com");
        loginPage.clickOnLoginButton();


    }
  

 

@Then("Login page should open")
public void login_page_should_open() {

    wait.until(ExpectedConditions.visibilityOf(loginPage.getLogicTextLoginPage()));
    Assert.assertTrue(loginPage.getLogicTextLoginPage().isDisplayed(), "Login page not opened");
}

@Then("Email or Mobile number field should present on the Login page")
public void email_or_mobile_number_field_should_present_on_the_login_page() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getLogicTextLoginPage()));
    Assert.assertTrue(loginPage.getEmailAndMobileNumberField().isDisplayed(), "Field not displayed");
}




@Then("Request OTP button should be enabled")
public void request_otp_button_should_be_enabled() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getLogicTextLoginPage()));
    Assert.assertTrue(loginPage.getRequestOtpButton().isEnabled(), "Request OTP button is not enabled");

}



@Then("Terms of Use and Privacy Policy links should present on the Login page")
public void terms_of_use_and_privacy_policy_links_should_present_on_the_login_page() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getLogicTextLoginPage()));
    Assert.assertTrue(loginPage.getTermsOfUseLink().isDisplayed(), "Terms link isn't present");
}



@When("user click on Terms of Use link")
public void user_click_on_terms_of_use_link() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getLogicTextLoginPage()));
    loginPage.clickOnTermsLink();
}

@Then("Terms page should open")
public void terms_page_should_open() {
    
    Set<String> handles = loginPage.driver.getWindowHandles();

    
    for( String handle :  handles){

        if(!handle.equals(loginPage.driver.getWindowHandle())){

             loginPage.driver.switchTo().window(handle);
            
            
        }
    
}
        wait.until(ExpectedConditions.urlContains("terms"));
        Assert.assertTrue(loginPage.driver.getCurrentUrl().contains("terms"),"Terms page not opened");


}


@When("user click on Privacy Policy link")
public void user_click_on_privacy_policy_link() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getPrivacyPolicy()));
    loginPage.clickOnPrivacyPolicyLink();
}

@Then("Privacy Policy page should open")
public void privacy_policy_page_should_open() {
   
    
    Set<String> handles = loginPage.driver.getWindowHandles();

    for( String handle :  handles){

        if(!handle.equals(loginPage.driver.getWindowHandle())){

            loginPage.driver.switchTo().window(handle);
        }

    }

    wait.until(ExpectedConditions.urlContains("privacypolicy"));
    Assert.assertTrue(loginPage.driver.getCurrentUrl().contains("privacypolicy"));

}


@Given("enters {string} digit mobile number")
public void enters_digit_mobile_number(String s) {
    
    loginPage.enterValueInEmailField(s);
}


@Given("click on Request OTP button")
public void click_on_request_otp_button() {
    
    loginPage.clickOnRequestOTPButton();
}
@Then("error should display")
public void error_should_display() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getFieldErrorMessage()));
    Assert.assertTrue(loginPage.getFieldErrorMessage().isDisplayed(), "Error message isn't displayed");

}



@When("user clicks on New to Flipkart button")
public void user_clicks_on_new_to_flipkart_button() {
    
    loginPage.clickOnNewToFlipkartButton();
}
@Then("Sign Up interface should open")
public void sign_up_interface_should_open() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getSignUpText()));
    Assert.assertTrue(loginPage.getSignUpText().isDisplayed(), "sign up interface isn't displayed");
}

@Then("Continue button should displayed")
public void continue_button_should_displayed() {

    wait.until(ExpectedConditions.visibilityOf(loginPage.getSignUpText()));
    Assert.assertTrue(loginPage.getContinueButtonSignUp().isDisplayed(), "Continue button isn't displayed");
}
@Then("Existing User Log in button should displayed")
public void existing_user_log_in_button_should_displayed() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getExistingUserButtonSignUP()));
    Assert.assertTrue(loginPage.getExistingUserButtonSignUP().isDisplayed(), "Existing user button isn't displayed");
}




}

package stepDefinations;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import config.ConfigReader;
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
    ConfigReader configReader = new ConfigReader();
   

     @Given("user is on Login page")
    public void user_is_on_login_page() {
        
        loginPage.driver.get(configReader.getLoginPageUrl());
      //  loginPage.clickOnLoginButton();


    }

    @When("user enters {string} mobile number")
public void user_enters_mobile_number(String string) {
    
    wait.until(ExpectedConditions.elementToBeClickable(loginPage.getMobileNumberField()));
    loginPage.sendvalueInMobileNumField(string);
}
  

 

@Then("Login page should open")
public void login_page_should_open() {

    wait.until(ExpectedConditions.visibilityOf(loginPage.getLogicTextLoginPage()));
    Assert.assertTrue(loginPage.getLogicTextLoginPage().isDisplayed(), "Login page not opened");
}

@Then("Mobile number field should present on the Login page")
public void mobile_number_field_should_present_on_the_login_page() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getMobileNumberField()));
    Assert.assertTrue(loginPage.getMobileNumberField().isDisplayed(), "Field not displayed");
}






@Then("Continue button should be enabled")
public void continue_button_should_be_enabled() {
    
    wait.until(ExpectedConditions.elementToBeClickable(loginPage.getContinueButton()));
    Assert.assertTrue(loginPage.getContinueButton().isEnabled(), "Continue button is not enabled");

}



@Then("Terms of Use and Privacy Policy links should present on the Login page")
public void terms_of_use_and_privacy_policy_links_should_present_on_the_login_page() {
    
    wait.until(ExpectedConditions.visibilityOf(loginPage.getTermsOfUseLink()));
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
    
     wait.until(ExpectedConditions.elementToBeClickable(loginPage.getMobileNumberField()));
    loginPage.sendvalueInMobileNumField(s);
}


@Given("click on Request OTP button")
public void click_on_continue_button() {
    
    loginPage.clickOnContinueButton();
}

@Then("Continue button should disable")
public void continue_button_should_disable() {
    
    //wait.until(ExpectedConditions.invisibilityOf(loginPage.getContinueButton()));
    Assert.assertFalse(loginPage.getContinueButton().isEnabled(), "Continue button isn't disabled");

}

@Then("Continue button should displayed")
public void continue_button_should_displayed() {

    wait.until(ExpectedConditions.visibilityOf(loginPage.getContinueButton()));
    Assert.assertTrue(loginPage.getContinueButton().isDisplayed(), "Continue button isn't displayed");
}




}

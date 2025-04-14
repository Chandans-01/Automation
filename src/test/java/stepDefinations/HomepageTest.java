package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericutilities.DriverFactory;
import genericutilities.HomePage;
import hooks.AppHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTest {
	

	HomePage homePage = new HomePage(DriverFactory.getDriver());
    WebDriverWait wait = new WebDriverWait(homePage.driver, Duration.ofSeconds(10));


	@Given("user is on homepage of flipkart")
    public void user_is_on_homepage_of_flipkart() {



        homePage.driver.get("https://www.flipkart.com");

        
    }

    @Then("more help list dropdown should be present on the page")
    public void more_help_list_dropdown_should_be_present_on_the_page() {
        
        
    }

    @Then("Become a seller button should be present on the page")
    public void Become_a_seller_button_should_be_present_on_the_page() {
        
        wait.until(ExpectedConditions.visibilityOf(homePage.getBecomeASellerButton()));
        
        Assert.assertEquals(homePage.getBecomeASellerButton().isDisplayed(), true);
    }

    @Then("Cart button should be present on the page")
    public void Cart_button_should_be_present_on_the_page() {
        

        wait.until(ExpectedConditions.visibilityOf(homePage.getCartButton()));
        Assert.assertTrue(homePage.getCartButton().isDisplayed(), "Cart Button no displayed");
    }

    @Then("login dropdown should be present on the page")
    public void login_dropdown_should_be_present_on_the_page() {
        
        Assert.assertTrue(homePage.getLoginDropdown().isDisplayed(), "Login Dropdown not present");
    }

    @Then("search field should be present on the page")
    public void search_field_should_be_present_on_the_page() {
        
        Assert.assertTrue(homePage.getSearchField().isDisplayed(), "search field is not present");
    }

    @Then("Flipkart Explore plus should be present on the page")
    public void Flipkart_Explore_plus_should_be_present_on_the_page() {
        
        Assert.assertTrue(homePage.getFlipkartExplorePlusButton().isDisplayed(),"Flipkart Explore Plus not visible");


    } 

    

}

package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericutilities.driverFactory.DriverFactory;
import genericutilities.pomRepo.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTest {
	

	HomePage homePage = new HomePage(DriverFactory.getDriver());
    WebDriverWait wait = new WebDriverWait(homePage.driver, Duration.ofSeconds(10));

    Actions action = new Actions(DriverFactory.getDriver());


	@Given("user is on homepage of flipkart")
    public void user_is_on_homepage_of_flipkart() throws InterruptedException {



        homePage.driver.get("https://www.flipkart.com");

        //Handling of hiddenDivision LoginPopup, closing by clicking outside of the dailog

        wait.until(ExpectedConditions.visibilityOf(homePage.getLoginDialogText()));
        
        homePage.clickLoginDialogCrossIcon();
        

        
    }

    @Then("Become a seller link should be present on the page")
    public void Become_a_seller_link_should_be_present_on_the_page() {
        
        wait.until(ExpectedConditions.visibilityOf(homePage.getBecomeASellerLink()));
        
        Assert.assertEquals(homePage.getBecomeASellerLink().isDisplayed(), true);
    }

    @Then("Cart button should be present on the page")
    public void Cart_button_should_be_present_on_the_page() {
        

        wait.until(ExpectedConditions.visibilityOf(homePage.getCartButtonText()));
        Assert.assertTrue(homePage.getCartButtonText().isDisplayed(), "Cart Button no displayed");
    }

    @Then("login dropdown should be present on the page")
    public void login_dropdown_should_be_present_on_the_page() {
        
        Assert.assertTrue(homePage.getLoginDropdown().isDisplayed(), "Login Dropdown not present");
    }

    @Then("search field should be present on the page")
    public void search_field_should_be_present_on_the_page() {
        
        Assert.assertTrue(homePage.getSearchField().isDisplayed(), "search field is not present");
    }

    @Then("mobiles should displays in search results")
    public void mobiles_should_displays_in_search_results() {
        
        
    }

    @When("user search mobile in the search box")
    public void user_search_mobile_in_the_search_box() {
        
        homePage.enterValueInSearchField("Mobile");
        action.sendKeys(Keys.ENTER).perform();

    }

    @Then("Gift Cards should be display")
    public void Gift_Cards_should_be_display() {
       
        wait.until(ExpectedConditions.visibilityOf(homePage.getGiftCardsOptionLoginDropdown()));
        Assert.assertTrue(homePage.getGiftCardsOptionLoginDropdown().isDisplayed(), "Gift card option is not displayed in Login dropdown");
    }

    @Then("Rewards should be display")
    public void Rewards_should_be_display() {
       
        wait.until(ExpectedConditions.visibilityOf(homePage.getRewardsOptionLoginDropdown()));
        Assert.assertTrue(homePage.getRewardsOptionLoginDropdown().isDisplayed(), "Rewards option is not displayed in Login dropdown");

    }

    @Then("Wishlist should be display")
    public void Wishlist_should_be_display() {

        wait.until(ExpectedConditions.visibilityOf(homePage.getWishlistOptionLoginDropdown()));
        Assert.assertTrue(homePage.getWishlistOptionLoginDropdown().isDisplayed(), "Wishlist option is not displayed in Login dropdown");
    }

    @Then("Orders should be display")
    public void Orders_should_be_display() {
        
        wait.until(ExpectedConditions.visibilityOf(homePage.getOrdersOptionLoginDropdown()));
        Assert.assertTrue(homePage.getOrdersOptionLoginDropdown().isDisplayed(), "Orders option is not displayed in Login dropdown"); 
    }

    @Then("Flipkart Plus Zone option should be display")
    public void Flipkart_Plus_Zone_option_should_be_display() {
       
        wait.until(ExpectedConditions.visibilityOf(homePage.getFlipkartPlusZoneOptionLoginDropdown()));
        Assert.assertTrue(homePage.getFlipkartPlusZoneOptionLoginDropdown().isDisplayed(), "Flipkart plus zone option is not displayed in Login dropdown");
    }

    @Then("My Profile option should be display")
    public void My_Profile_option_should_be_display() {
       
        wait.until(ExpectedConditions.visibilityOf(homePage.getMyProfileOptionLoginDropdown()));
        Assert.assertTrue(homePage.getMyProfileOptionLoginDropdown().isDisplayed(), "My profile option is not displayed in Login dropdown");
    }

    @When("user hover on the Login option")
    public void user_hover_on_the_Login_option() {
       
        action.moveToElement(homePage.getLoginDropdown()).perform();
    }

   
    @Then("Advertise option should be display")
    public void Advertise_option_should_be_display() {

        wait.until(ExpectedConditions.visibilityOf(homePage.getAdvertiseOnFlipkartOptionMoreDropdown()));
        Assert.assertTrue(homePage.getAdvertiseOnFlipkartOptionMoreDropdown().isDisplayed(), "Advertise option is not displayed in Login dropdown");
    }

    @Then("Customer Care option should be display")
    public void Customer_Care_option_should_be_display() {

        wait.until(ExpectedConditions.visibilityOf(homePage.getCustomerCareOptionMoreDropdown()));
        Assert.assertTrue(homePage.getCustomerCareOptionMoreDropdown().isDisplayed(), "24 x 7 customer care option is not displayed in Login dropdown");
    }

    @Then("Notification Preferences option should be display")
    public void Notification_Preferences_option_should_be_display() {
       
        wait.until(ExpectedConditions.visibilityOf(homePage.getNotificationSettingsMoreDropdown()));
        Assert.assertTrue(homePage.getNotificationSettingsMoreDropdown().isDisplayed(), "Notification Preferences option is not displayed in Login dropdown");
    }

    @When("user hover on the More Help List Dropdown option")
    public void user_hover_on_the_More_Help_List_Dropdown_option() {
       
        
        action.moveToElement(homePage.getMoreDropdown()).perform();

    }

    @Then("Seller page should open")
    public void Seller_page_should_open() {

       wait.until(ExpectedConditions.urlContains("seller"));
        String sellerPageUrl = homePage.driver.getCurrentUrl();
        Assert.assertTrue(sellerPageUrl.contains("seller"), "Seller page not opened");
    }

    @When("user clicks on the Become a Seller link")
    public void user_clicks_on_the_Become_a_Seller_link() {
        
        homePage.clickBecomeASellerLink();
    }

    @Then("Cart page should open")
    public void Cart_page_should_open() {
        
        wait.until(ExpectedConditions.urlContains("viewcart"));
        String cartPageUrl = homePage.driver.getCurrentUrl();
        Assert.assertTrue(cartPageUrl.contains("viewcart"), "Cart page not opened");

    }

    @When("user clicks on the Cart button")
    public void user_clicks_on_the_Cart_button() {
        
        homePage.clickCartButtonText();
    }

   

    

    

}

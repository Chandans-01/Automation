package genericutilities.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    //Constructor is used to initlize the WebDriver.

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    // Finding the elements of the HomePage by using loca
    @FindBy(xpath="(//input[contains(@placeholder, 'Search for Products')])[1]")
    WebElement searchField;

    @FindBy(xpath ="//span[text()='✕']")
    WebElement loginDialogCrossIcon;


    @FindBy(xpath="//span[text()='Login']")
    WebElement loginDropdown;


    @FindBy(xpath="//span[text()='Cart']")
    WebElement cartButtonText;
//

    @FindBy(xpath="//span[text()='Become a Seller']")
    WebElement becomeASellerLink;


    @FindBy(xpath="//a[@title='More' and .//span[normalize-space()='More']]")
    WebElement moreDropdown;


     @FindBy(xpath="//div[text()='Notification Settings']")
     WebElement notificationSettingsMoreDropdown;

    public WebElement getNotificationSettingsMoreDropdown() {
        return notificationSettingsMoreDropdown;
    }


    @FindBy(xpath="//div[text()='Advertise on Flipkart']")
    WebElement advertiseOnFlipkartOptionMoreDropdown;
    

    public WebElement getAdvertiseOnFlipkartOptionMoreDropdown() {
        return advertiseOnFlipkartOptionMoreDropdown;
    }

    @FindBy(xpath="(//img[@class='egDnY0']/..//div[text()='24x7 Customer Care'])[2]")
    WebElement customerCareOptionMoreDropdown;
    
    
    @FindBy(xpath="//div[text()='My Profile']")
    WebElement myProfileOptionLoginDropdown;


    @FindBy(xpath="//div[text()='Flipkart Plus Zone']")
    WebElement flipkartPlusZoneOptionLoginDropdown;

    @FindBy(xpath="//div[text()='Orders']")
    WebElement ordersOptionLoginDropdown;

    @FindBy(xpath="//div[text()='Wishlist']")
    WebElement wishlistOptionLoginDropdown;

    @FindBy(xpath="//div[text()='Rewards']")
    WebElement rewardsOptionLoginDropdown;

    @FindBy(xpath="//div[text()='Gift Cards']")
    WebElement giftCardsOptionLoginDropdown;

    @FindBy(css = ".bUyoc9")
    WebElement loginDialogText;

    
    // Get method is used to get the elements of the HomePage


    public WebElement getLoginDialogCrossIcon(){

        return loginDialogCrossIcon;
    }
    public WebElement getMoreDropdown() {
        return moreDropdown;
    }

    public WebElement getCustomerCareOptionMoreDropdown() {
        return customerCareOptionMoreDropdown;
    }


    public WebElement getMyProfileOptionLoginDropdown() {
        return myProfileOptionLoginDropdown;
    }


    public WebElement getFlipkartPlusZoneOptionLoginDropdown() {
        return flipkartPlusZoneOptionLoginDropdown;
    }


    public WebElement getOrdersOptionLoginDropdown() {
        return ordersOptionLoginDropdown;
    }


    public WebElement getWishlistOptionLoginDropdown() {
        return wishlistOptionLoginDropdown;
    }


    public WebElement getRewardsOptionLoginDropdown() {
        return rewardsOptionLoginDropdown;
    }


    public WebElement getGiftCardsOptionLoginDropdown() {
        return giftCardsOptionLoginDropdown;
    }


    public WebElement getSearchField() {
        return searchField;
    }


    public WebElement getLoginDropdown() {
        return loginDropdown;
    }


    public WebElement getCartButtonText() {
        return cartButtonText;
    }


    public WebElement getBecomeASellerLink() {
        return becomeASellerLink;
    }

    public WebElement getLoginDialogText(){
        return this.loginDialogText;
    }

    // Methods is used to perfom the action on the elements of the HomePage

    public void enterValueInSearchField(String value){
        getSearchField().sendKeys(value);

    }

    public void clickLoginDropdown(){
        getLoginDropdown().click();


    }

    public void clickLoginDialogCrossIcon(){
        loginDialogCrossIcon.click();
    }

    public void clickCartButtonText(){
        getCartButtonText().click();


    }

    public void clickBecomeASellerLink(){
        getBecomeASellerLink().click();


    }



    
   
   

}

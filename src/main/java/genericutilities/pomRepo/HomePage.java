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


    // Finding the elements of the HomePage by using locaters.

    @FindBy(xpath="//div[@class='_16ZfEv']")
    WebElement flipkartExplorePlusButton;

    @FindBy(xpath="//input[@class='Pke_EE']")
    WebElement searchField;

    @FindBy(xpath="//span[text()='Login']")
    WebElement loginDropdown;

    @FindBy(xpath="//a[text()='Cart']")
    WebElement cartButton;


    @FindBy(xpath="//a[@title='Become a Seller']")
    WebElement becomeASellerButton;


    @FindBy(xpath="//a[contains(@title,'more help')]")
    WebElement moreDropdown;


    @FindBy(xpath="//a[@title='Notification Preferences']")
    WebElement notificationPreferencesOptionMoreDropdown;


    @FindBy(xpath="//a[@title='Advertise']")
    WebElement advertiseOptionMoreDropdown;

    @FindBy(xpath="//a[@title='Download App']")
    WebElement downloadAppOptionMoreDropdown;

    @FindBy(xpath="//a[contains(@title,'Customer')]")
    WebElement customerCareOptionMoreDropdown;
    
    
    @FindBy(xpath="//a[@title='My Profile']")
    WebElement myProfileOptionLoginDropdown;


    @FindBy(xpath="//a[@title='Flipkart Plus Zone']")
    WebElement flipkartPlusZoneOptionLoginDropdown;

    @FindBy(xpath="//a[@title='Orders']")
    WebElement ordersOptionLoginDropdown;

    @FindBy(xpath="//a[@title='Wishlist']")
    WebElement wishlistOptionLoginDropdown;

    @FindBy(xpath="//a[@title='Rewards']")
    WebElement rewardsOptionLoginDropdown;

    @FindBy(xpath="//a[@title='Gift Cards']")
    WebElement giftCardsOptionLoginDropdown;

    
    // Get method is used to get the elements of the HomePage


    public WebElement getMoreDropdown() {
        return moreDropdown;
    }


    public WebElement getNotificationPreferencesOptionMoreDropdown() {
        return notificationPreferencesOptionMoreDropdown;
    }


    public WebElement getAdvertiseOptionMoreDropdown() {
        return advertiseOptionMoreDropdown;
    }


    public WebElement getDownloadAppOptionMoreDropdown() {
        return downloadAppOptionMoreDropdown;
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


    public WebElement getFlipkartExplorePlusButton() {
        return flipkartExplorePlusButton;
    }


    public WebElement getSearchField() {
        return searchField;
    }


    public WebElement getLoginDropdown() {
        return loginDropdown;
    }


    public WebElement getCartButton() {
        return cartButton;
    }


    public WebElement getBecomeASellerButton() {
        return becomeASellerButton;
    }

    // Methods is used to perfom the action on the elements of the HomePage

    public void clickFlipkartExplorePlusButton(){

        getFlipkartExplorePlusButton().click();
    }

    public void enterValueInSearchField(String value){
        getSearchField().sendKeys(value);

    }

    public void clickLoginDropdown(){
        getLoginDropdown().click();


    }

    public void clickCartButton(){
        getCartButton().click();


    }

    public void clickBecomeASellerButton(){
        getBecomeASellerButton().click();


    }



    
   
   

}

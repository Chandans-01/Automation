package genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


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

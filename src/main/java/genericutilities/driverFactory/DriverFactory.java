package genericutilities.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

    public WebDriver setDriver(){

        
		
        WebDriverManager.chromedriver().setup();
        tlDriver.set(new ChromeDriver());
        return getDriver();
        

		}

        public static WebDriver getDriver(){
            return tlDriver.get();
        }

   

}

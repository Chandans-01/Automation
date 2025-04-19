package genericutilities.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    // Instance of WebDriver (not used directly when using ThreadLocal)
    public WebDriver driver;

    // ThreadLocal to handle WebDriver instances separately for each thread
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

    // Method to set up and initialize the WebDriver (Chrome in this case)
    public WebDriver setDriver() {

        
        WebDriverManager.chromedriver().setup();

        // Initializes a new ChromeDriver instance and sets it in the ThreadLocal
        tlDriver.set(new ChromeDriver());

        // Returns the driver instance for the current thread
        return getDriver();
    }

    // Returns the WebDriver instance associated with the current thread
    public static WebDriver getDriver() {
        return tlDriver.get();
    }

}

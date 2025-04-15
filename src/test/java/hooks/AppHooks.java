package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericutilities.driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppHooks {
	
	public WebDriver driver;

	@Before(order = 0)
	public void startBrowser() {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.setDriver();
		driver.manage().window().maximize();
		
		
		
		
	}
	
	
	
	@After(order = 0)
	public void tearDown() {
		
		driver.quit();
	}

}

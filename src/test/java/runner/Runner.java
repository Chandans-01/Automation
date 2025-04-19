package runner;

// Importing Cucumber TestNG support

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// CucumberOptions is used to configure test execution settings

	@CucumberOptions(
			dryRun = false, 
			monochrome = true,
			publish =  true,
			features="src/test/resources/features/loginPage.feature",
			//"src/test/resources/features/homepage.feature",
			glue= {"stepDefinations", "hooks"},
			plugin={"pretty"},
			tags= ""
			)


public class Runner extends AbstractTestNGCucumberTests{

}

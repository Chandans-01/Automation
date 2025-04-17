package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			dryRun = true, 
			monochrome = true,
			publish =  true,
			features="src/test/resources/features/loginPopup.feature",
			//"src/test/resources/features/homepage.feature",
			glue= {"stepDefinations", "hooks"},
			plugin={"pretty"},
			tags= ""
			)


public class Runner extends AbstractTestNGCucumberTests{

}

 package runner;

 import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@RunWith(Cucumber.class)
	@CucumberOptions(

	
	monochrome=true,

	features={"/Users/12016/git/ds_algo/ds_algo/src/test/resources/features/tree.feature"},//location of feature files
	dryRun=false,
	glue= {"StepDefinitions1"},//location of all step definition files
		plugin={"pretty",//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"json:target/target/Cucumber.json",
				"html:target/treereport.html"})
		
	public class testrunner_dsalgo extends AbstractTestNGCucumberTests{
		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
			return super.scenarios();
		}
	}
	

	



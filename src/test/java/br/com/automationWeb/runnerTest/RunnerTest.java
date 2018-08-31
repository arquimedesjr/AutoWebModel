package br.com.automationWeb.runnerTest;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import br.com.automationWeb.stepBusiness.StepBusiness;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/cucumber.json", 
		retryCount = 3, detailedReport = true, 
		detailedAggregatedReport = true, 
		overviewReport = true,
		coverageReport = true,
		jsonUsageReport = "target/cucumber-usage.json", 
		usageReport = true, 
		toPDF = true, 
		excludeCoverageTags = {"@flaky"}, 
		includeCoverageTags = { "@passed" }, 
		outputFolder = "target")
@CucumberOptions(
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
		"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml" }, 
		features = "src\\test\\resources\\features\\run\\", 
		glue = "br.com.automationWeb.Santander.stepDefinition", 
		dryRun = false)
public class RunnerTest {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {

		StepBusiness.getInstance().setUp();
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}
	@DataProvider
	public Object[][] features() {
	    return testNGCucumberRunner.provideFeatures();
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void testMain(CucumberFeatureWrapper cucumberFeature) {

		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());

	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {

		StepBusiness.getInstance().close();
		testNGCucumberRunner.finish();

	}
	

}

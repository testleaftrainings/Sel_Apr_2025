package testcases;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src/main/java/feature"},
glue="pages",
publish=true)
public class RunnerCucumber extends base.BaseClass {
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
		
	}

}

package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"AllFeatureFile\\Demo99guru.feature"},
		glue= {"StepDefination\\RegisterPageStepDef"},
		dryRun=false
		//monochrome=true
			
		)
public class TestRunnerB {

}

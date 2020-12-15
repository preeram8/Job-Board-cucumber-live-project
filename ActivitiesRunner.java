package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"StepDefinitions"},
		tags="@Activity4",
		strict=true,
		monochrome=true		
		)

public class ActivitiesRunner {

}

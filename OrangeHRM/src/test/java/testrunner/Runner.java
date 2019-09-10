package testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mindq\\Desktop\\cucumber\\OrangeHRM\\features\\orangeHRM.feature",
				glue = "stepdefinations",
				plugin = {"pretty","html:target/cucumber-html-report","json:target/test.json"},
				monochrome = true,
				tags = {"@maintanance"})


public class Runner {

	
	
	
}

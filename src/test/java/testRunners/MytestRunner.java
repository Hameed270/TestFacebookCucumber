package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\TestFacebookCucumber\\src\\test\\resorces\\com\\features",
glue= {"stepDefinations","appHooks"},
plugin= {"pretty"}
)
public class MytestRunner {

}

package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = {"stepDefinitions"},
        tags = "@Activity4"
)
public class ActivitiesRunner {
    //empty
}
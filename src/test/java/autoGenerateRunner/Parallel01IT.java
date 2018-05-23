import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Eclipse_selenium/AutoRunner_Cucumber/src/test/resources/features/AddNumber.feature"},
        plugin = {"json:E:/Eclipse_selenium/AutoRunner_Cucumber/target/cucumber-parallel/json/1.json"},
        monochrome = true,
        tags = {"@MultiplyNumbers,@AddNumbers"},
        glue = {"stepDefinition"})
public class Parallel01IT {
}

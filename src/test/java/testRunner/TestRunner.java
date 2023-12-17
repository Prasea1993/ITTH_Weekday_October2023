package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src//test//resources//feature"},
        glue = {"stepDefinition"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
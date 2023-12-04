package testRunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/"

        },

        monochrome = true,

        glue = { "stepDefinitions","CommonActions" },

        features = { "src/test/resources/features" },

        tags = "@Login"

)



public class LoginTestNgRunner extends AbstractTestNGCucumberTests {

    @Override

    @DataProvider()

    public Object[][] scenarios() {

        return super.scenarios();

    }

}
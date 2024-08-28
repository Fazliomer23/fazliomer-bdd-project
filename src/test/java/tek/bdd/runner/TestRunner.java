package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        tags = "@Accounts_Scenario_1",
        dryRun = false
)
public class TestRunner {
}

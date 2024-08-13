package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/HomePage.feature",
        glue = "tek.bdd.steps",
        tags = " @Smoke",
        dryRun = false
)
public class TestRunner {
}

package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features", //
        glue = "tek.bdd.steps",
        tags = "",
        dryRun = false,
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE, //omer
        plugin = {
                "html:target/cucumber-report/report.html",
                "pretty",
        }
)
public class TestRunner {
}

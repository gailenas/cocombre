package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        plugin = {"pretty", "html:report.html"}
//        dryRun = true,
//        tags - "and" = ir, "or" = arba
//        tags = "@P3 or @P7"
//        name = {"Logo"}
)
public class TestRunner {
}

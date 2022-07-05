package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        tags = "@wip",
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        dryRun = false

)

public class CukesRunner {
}

package com.demoblaze.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html"},
        features = "src/test/resources/features",
        glue = "com/demoblaze/step_definitions",
        dryRun = false,
        tags = "@t_e2e"

)

public class CukesRunner {
}

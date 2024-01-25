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
        tags = "@regression and not @t_e2e_1" // this will run all regression tests that are not wip
        // tags = "@regression and @wip" // this will run all regression tests that are wip
        // tags = "@regression or @wip" // this will run all regression tests that are wip or regression
        // tags = "@regression and not @wip" // this will run all regression tests that are not wip
        // tags = "@regression and @wip and not @smoke" // this will run all regression tests that are wip and not smoke
        // tags = "@regression and @wip and @smoke" // this will run all regression tests that are wip and smoke
        // tags = "@regression and @wip or @smoke" // this will run all regression tests that are wip or smoke
        // tags = "@regression and (@wip or @smoke)" // this will run all regression tests that are wip or smoke
        // tags = "@regression and (@wip or @smoke) and not @smoke" // this will run all regression tests that are wip or smoke and not smoke
        // tags = "@regression and (@wip or @smoke) and not @smoke and not @wip" // this will run all regression tests that are wip or smoke and not smoke and not wip
        // tags = "@regression and (@wip or @smoke) and not @smoke or @wip" // this will run all regression tests that are wip or smoke and not smoke or wip
        // tags = "@regression and (@wip or @smoke) and not @smoke or @wip or @smoke" // this will run all regression tests that are wip or smoke and not smoke or wip or smoke
        // tags = "@regression and (@wip or @smoke) and not @smoke or @wip or @smoke or @regression" // this will run all regression tests that are wip or smoke and not smoke or wip or smoke or regression
        // tags = "@regression and (@wip or @smoke) and not @smoke or @wip or @smoke or @regression or @smoke" // this will run all regression tests that are wip or smoke and not smoke or wip or smoke or regression or smoke
        // tags = "@regression and (@wip or @smoke) and not @smoke or @wip or @smoke or @regression or @smoke or @wip" // this will run all regression tests that are wip or smoke and not smoke or wip or smoke or regression or smoke or wip


)

public class CukesRunner {
}

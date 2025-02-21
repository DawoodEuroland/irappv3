package org.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import java.nio.file.Paths;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "org.StepDefinition", dryRun = false
        , plugin = "json:target\\Reports\\irapp.json" , tags = "@applaunch or @Googlelogin")


public class TestRunner {
    @AfterClass
    public static void generateReport() {
        String basePath = System.getProperty("user.dir");
        String reportPath = Paths.get(basePath, "target", "Reports", "irapp.json").toString();

        JvmReport.generateJvmReport(reportPath);

    }

}

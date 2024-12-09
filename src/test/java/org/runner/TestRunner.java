package org.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "org.StepDefinition", dryRun = false
        , plugin = "json:target\\Reports\\irapp.json")


public class TestRunner {
    @AfterClass
    public static void generateReport() {
        JvmReport.generateJvmReport("C:\\Users\\Dawood.Ibrahim.EUROLAND\\IdeaProjects\\IRAPPV3_Automation\\target\\Reports\\irapp.json");

    }

}

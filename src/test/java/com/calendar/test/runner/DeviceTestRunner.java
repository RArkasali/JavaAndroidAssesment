package com.calendar.test.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featureFiles"},glue= {"com.calendar.test.steps","com.calendar.utils"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, tags= {"@regression"})

public class DeviceTestRunner {
	
	@AfterClass
    public static void writeExtentReport() {
		System.out.println("started running after class annotation in TestRunner");
        Reporter.loadXMLConfig(new File("config/report.xml"));
    }
}

package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"classpath:features/Nationality.feature","classpath:features/Skills.feature","classpath:features/jobs.feature"}
,glue= {"seleniumgluecode1"},
//plugin = {"pretty", "html:target/cucumber-html-report"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
tags = {}
)
public class testrunner {

}
package com.learn.java.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com.learn.java.cucumber",monochrome = true,tags = {"@dd"},plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json","junit:target/cucumber.xml","rerun:target/rerun.txt"})
public class TestRunner_GoogleHomepage {

}

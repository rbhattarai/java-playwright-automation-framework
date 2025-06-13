package com.example;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "com.example.steps",
  tags = "@SmokeTest",
  plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class RunCucumberTest {
}

package com.example.steps;

import com.example.PlaywrightDriverManager;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginSteps {

  private Page page;

  @Before
  public void setup() {
    // Read env and role from system properties or env variables
    String role = System.getProperty("cert.role", "admin");
    String appUrl = System.getProperty("app.url", "https://your-app-url.com");

    PlaywrightDriverManager.start(role, appUrl);
    page = PlaywrightDriverManager.newPage();
  }

  @Given("I open the application")
  public void openApplication() {
    String appUrl = System.getProperty("app.url", "https://your-app-url.com");
    page.navigate(appUrl);
  }

  @When("I login as a user")
  public void login() {
    // Your login steps here, e.g. fill username/password and submit
  }

  @Then("I should see the homepage")
  public void verifyHomePage() {
    // Your verification code here
  }

  @After
  public void tearDown() {
    PlaywrightDriverManager.close();
  }
}


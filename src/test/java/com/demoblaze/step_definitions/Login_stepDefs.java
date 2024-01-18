package com.demoblaze.step_definitions;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Login_stepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("The user navigates to website")
    public void the_user_navigates_to_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user clicks on login button and enters valid credentials")
    public void the_user_clicks_on_login_button_and_enters_valid_credentials() {
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("The user verifies welcome message")
    public void the_user_verifies_welcome_message() {
        homePage.verifyWelcomeMessage();
    }
    @When("The user clicks on login button and enters {string} and {string}")
    public void the_user_clicks_on_login_button_and_enters_and(String username, String password) {
        loginPage.login(username, password);

    }
    @Then("The user verifies welcome {string} message")
    public void the_user_verifies_welcome_message(String string) {
        homePage.verifyWelcomeMessage(string);
    }

    @When("The user clicks on login button and enters following credentials")
    public void theUserClicksOnLoginButtonAndEntersFollowingCredentials(Map<String, String> credentials) {
        loginPage.login(credentials.get("username"), credentials.get("password"));
    }
    @Then("The user verifies {string} message")
    public void the_user_verifies_message(String errorMessage) {
        BrowserUtils.waitFor(1);
        loginPage.verifyErrorMessage(errorMessage);
    }
}

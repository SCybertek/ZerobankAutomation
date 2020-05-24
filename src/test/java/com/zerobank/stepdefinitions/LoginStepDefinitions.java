package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        String URL = ConfigurationReader.getProperty("url");
        System.out.println("URL = " + URL);
        Driver.get().get(URL);
    }


    @Then("User should verify that {string} should display")
    public void user_should_verify_that_should_display(String pageTitle) {
        System.out.println("Verify that Account summary page is displayed");
        BrowserUtils.wait(2);
        Assert.assertEquals(pageTitle, Driver.get().getTitle());
    }

    @And("User enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.login(username,password);
    }


    @Given("User enters with valid credentials")
    public void user_enters_with_valid_credentials() {
        loginPage.login();
    }



    @Then("User should verify that {string} error message should display")
    public void user_should_verify_that_error_message_should_display(String message) {
        Assert.assertEquals(message,loginPage.getErrorMessage() );
    }

    @Given("User enters username username and password password")
    public void user_enters_username_username_and_password_password() {
        System.out.println("Login with username and password from example table");
        loginPage.login();
    }

    @Then("User should verify that Account summary page should display")
    public void user_should_verify_that_Account_summary_page_should_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("User enters user username and pass password")
    public void user_enters_user_username_and_pass_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User should verify that Login and\\/or password are wrong should display")
    public void user_should_verify_that_Login_and_or_password_are_wrong_should_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("User enters  username and  password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}

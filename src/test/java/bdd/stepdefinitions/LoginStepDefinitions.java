package bdd.stepdefinitions;

import bdd.steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

    LoginSteps loginSteps;

    @Given("^User on the login page$")
    public void userOnTheLoginPage() {

        loginSteps.openLoginPage();
    }

    @When("^s?he submit login form with credentials username as \"(.*)\" and password as \"(.*)\"$")
    public void submitLoginFormWithCredentials(String username, String password) {

        loginSteps.fillLoginForm(username, password)
                  .submit();
    }
}

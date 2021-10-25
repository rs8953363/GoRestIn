package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiSteps {
    @Given("User given api url {string}")
    public void userGivenApiUrl(String url) {
        System.out.println("given api url" + url);
    }

    @Given("set api endpoint {string}")
    public void setApiEndpoint(String endpoint) {
        System.out.println("set api endpoint" + endpoint);
    }

    @And("User creates new user with request body {string}, {string}, {string}, {string}")
    public void userCreatesNewUserWithRequestBody(String name, String gender, String email, String status) {
        System.out.println("User creates new user with request body" + name + " " + gender + " " + email + " " + status);
    }

    @Then("validate the status code {int}")
    public void validateTheStatusCode(int statusCode) {
        System.out.println("validate the status code"+statusCode);
    }

    @And("validate userId is not null")
    public void validateUserIdIsNotNull() {
        System.out.println("validate userId is not null");
    }

    @And("validate user name is {string}")
    public void validateUserNameIs(String name) {
        System.out.println("validate user name is"+name);
    }

    @And("validate user gender is {string}")
    public void validateUserGenderIs(String gender) {
        System.out.println("validate user gender is"+gender);
    }

    @And("validate user email is {string}")
    public void validateUserEmailIs(String email) {
        System.out.println("validate user email is"+email);
    }

    @And("validate user status is {string}")
    public void validateUserStatusIs(String status) {
        System.out.println("validate user status is"+status);
    }
}

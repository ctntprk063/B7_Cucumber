package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        // System.out.println("I open the browser and navigate to DevEx web page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        // System.out.println("I enter teacher username and password then click login button");
        loginPage.login();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that the url change to dashboard");
        //Assert.assertTrue(100<99);
        String actualText = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualText.contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
        // System.out.println("I enter student username and password then click login button");
        loginPage.loginAsStudent();
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {
        //System.out.println("I enter developer username and password then click login button");
        loginPage.loginAsDeveloper();
    }
//    @When("The user enters SDET credentials")
//    public void the_user_enters_sdet_credentials() {
//        System.out.println("I enter SDET username and password then click login button");
//    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String userEmail, String password) {
//        System.out.println("userEmail = " + userEmail);
//        System.out.println("password = " + password);
        loginPage.login(userEmail, password);
    }

    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String expectedUsername) {
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        System.out.println("expectedUsername = " + expectedUsername);
        Assert.assertTrue(actualMessage.contains(expectedUsername));
    }


    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {
//        String actualMessage = Driver.get().findElement(By.id("loginpage-input-email")).getAttribute("validationMessage");
//        Assert.assertEquals(expectedMessage, actualMessage);
//        System.out.println(actualMessage);
        BrowserUtils.waitFor(2);
        loginPage.getDisapperingWarningMessage(expectedMessage);
    }
}

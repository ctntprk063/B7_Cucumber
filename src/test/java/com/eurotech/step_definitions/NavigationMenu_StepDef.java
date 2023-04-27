package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenu_StepDef {

    DashboardPage dashboardPage=new DashboardPage();


    /**
        Scenario 1:
        Login as Developer
        At first get the text of welcome
        Then go to Developers menu and get the text of Developers

        Scenario 2:
        Login as Student
        Get the text of welcome
        Then go to All Posts menu and get the text of Posts

        Scenario 3:
        Login as Teacher
        Get the text of welcome
        Then go to My Account menu and get the text of Dashboard

        -Write scenarios
        -Create step definitions
        -No need to use any JAVA code.
        -Just implement the step definitions by adding print statement.
        -Create new class NavigationMenuStepDefs
 */
    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("I verify that welcome message text is here");
    }
    @When("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("I navigate to Developers menu");
    }
    @Then("The user should be able to see Developer text")
    public void the_user_should_be_able_to_see_developer_text() {
        System.out.println("I verify that developer text is here");
    }
    @When("The user navigates to All Posts menu")
    public void the_user_navigates_to_all_posts_menu() {
        System.out.println("I navigate to All Posts menu");
    }
    @Then("The user should be able to see Posts text")
    public void the_user_should_be_able_to_see_posts_text() {
        System.out.println("I verify that posts text is here");
    }

    @When("The user navigates to My Account menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("I navigate to My Account menu");
    }
    @Then("The user should be able to see Dashboard text")
    public void the_user_should_be_able_to_see_dashboard_text() {
        System.out.println("I verify that dashboard text is here");
    }
    @Then("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menu) {
        dashboardPage.navigateToMenu(menu);
    }
    @Then("The user should be able to see header as {string}")
    public void the_user_should_be_able_to_see_header_as(String headerName) {
        BrowserUtils.waitFor(1);
        String actualHeader= dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("Verify that header name is displayed",headerName,actualHeader);
    }

}

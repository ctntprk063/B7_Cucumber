package com.eurotech.step_definitions;

import com.eurotech.pages.ProfilePage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EditProfile_StepDefs {

    ProfilePage profilePage=new ProfilePage();

    @When("The user select {string} as a career")
    public void the_user_select_as_a_career(String value) {
        profilePage.selectStatus(value);
    }
    @When("The user chose {int} years of work experience")
    public void the_user_chose_years_of_work_experience(Integer experienceYear) {
        profilePage.slader(experienceYear);
    }
    @When("The user add {string} {string}")
    public void the_user_add(String inputBox, String info) {
        profilePage.addInfo(inputBox, info);
    }

    @And("The user clicks submit button")
    public void theUserClicksSubmitButton() {
        profilePage.editSubmitBtn.click();
        BrowserUtils.waitFor(1);
    }
}

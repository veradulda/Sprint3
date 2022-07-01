package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class logout_steps {


    @Given("User should be on dashboard page as login")
    public void user_should_be_on_dashboard_page_as_login() {
        Driver.getDrv().get();

    }
    @When("User click logout button")
    public void user_click_logout_button() {

    }
    @Then("user should be login page")
    public void user_should_be_login_page() {

    }

    @When("User click step back button")
    public void user_click_step_back_button() {

    }
    @Then("User should not be able to return dashboard page")
    public void user_should_not_be_able_to_return_dashboard_page() {

    }

}

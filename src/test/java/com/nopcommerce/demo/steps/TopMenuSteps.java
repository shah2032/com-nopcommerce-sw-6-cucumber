package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopMenuSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on any menu from \"([^\"]*)\"$")
    public void iClickOnAnyMenuFrom(String TopMenuTab)  {
        new HomePage().selectMenu(TopMenuTab);


    }

    @Then("^I navigate to selected menu page \"([^\"]*)\"$")
    public void iNavigateToSelectedMenuPage(String verifyMenu )  {
        String expectedMessage = verifyMenu;
        String actualMessage = new ComputerPage().verifyPageTitleText();

    }
}

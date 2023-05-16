package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerMenuSteps {
    @When("^I click on Computer Tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @And("^I click on Desktop menu$")
    public void iClickOnDesktopMenu() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I select Sort By position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().sortByPositionByNameZtoA();
    }

    @Then("^I should verify the Products are arrange in Descending order\\.$")
    public void iShouldVerifyTheProductsAreArrangeInDescendingOrder() {
        String expectedMessage = "Build your own computer";
        String actualMessage = new AddToCartPage().verifyBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not displayed");
    }

    @And("^I select Sort By position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new AddToCartPage().selectProcessor();
    }


    @And("^I click on Add to Cart of Product Build your own computer$")
    public void iClickOnAddToCartOfProductBuildYourOwnComputer() {
        new DesktopPage().clickOnAddToCart();
    }

    @Then("^I should see Build your own computer$")
    public void iShouldSeeBuildYourOwnComputer() {
        String expectedMessage = "Build your own computer";
        String actualMessage = new AddToCartPage().verifyBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not displayed");
    }

    @And("^I select processor (\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+)$")
    public void iSelectProcessorGHzIntelPentiumDualCoreE(int arg0, int arg1, int arg2) {
        new AddToCartPage().selectProcessor();
    }

    @And("^I select ram (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectRamGB$(int arg0, int arg1, int arg2) {
        new AddToCartPage().selectRam();
    }

    @And("^I select HDD (\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectHDDGB$(int arg0, int arg1, int arg2) {
        new AddToCartPage().selectHDD();
    }

    @And("^I select OS Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectOSVistaPremium$(int arg0, int arg1) {
        new AddToCartPage().selectOS();
    }

    @And("^I click on Microsoft Office \\[\\+\\$(\\d+)\\.(\\d+)\\]\"([^\"]*)\"Total Commander \\[\\+\\$(\\d+)\\.(\\d+)\\] checkbox$")
    public void iClickOnMicrosoftOffice$TotalCommander$Checkbox(int arg0, int arg1, String arg2, int arg3, int arg4) {
        new AddToCartPage().selectSoftware();
    }

    @And("^I should see Price \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iShouldSeePrice$(int arg0, int arg1, int arg2) throws InterruptedException{
        Thread.sleep(2000);
        String expectedPrice = "$1,475.00";
        String actalPrice = new AddToCartPage().verifyThePrice();
        Assert.assertEquals(expectedPrice, actalPrice, "Not displayed");
    }

    @And("^I click on ADD TO CART Button$")
    public void iClickOnADDTOCARTButton() {
        new AddToCartPage().clickOnAddToCart();
    }

    @Then("^I should see The product has been added to your shopping cart$")
    public void iShouldSeeTheProductHasBeenAddedToYourShoppingCart() {
        String expectedMessage = "The product has been added to your shopping cart";
        String actalMessage = new AddToCartPage().verifyAddToCartSuccessfully();
        Assert.assertEquals(expectedMessage, actalMessage, "Not displayed");

    }

    @And("^I click on cross button$")
    public void iClickOnCrossButton() {
        new AddToCartPage().clickOnCrossButton();
    }

    @And("^I mouse hover on shopping cart$")
    public void iMouseHoverOnShoppingCart() {

        new AddToCartPage().mouceHoverToShopingCart();
    }

    @And("^I click on GO TO CART$")
    public void iClickOnGOTOCART() {
        new AddToCartPage().clickOnGoToCart();
    }

    @Then("^I should see Shopping cart$")
    public void iShouldSeeShoppingCart() {
        String expectedMessage = "Shopping cart";
        String actualMessage = new ShoppingCartPage().verifyShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not displayed");
    }

    @And("^I change Qty of product and update shopping cart$")
    public void iChangeQtyOfProductAndUpdateShoppingCart() {
        new ShoppingCartPage().changeTheQuantity();
    }

    @Then("^I should see total price is \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iShouldSeeTotalPriceIs$(int arg0, int arg1, int arg2) {
        String expected = "$2,950.00";
        String actual = new ShoppingCartPage().verifyPriceText();
        Assert.assertEquals(expected, actual, "Not displayed");
    }

    @And("^I click on check box of terms and condition$")
    public void iClickOnCheckBoxOfTermsAndCondition() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOut();

    }

    @Then("^I should see Welcome, Please Sign In!$")
    public void iShouldSeeWelcomePleaseSignIn() {
        String expected = "Welcome, Please Sign In!";
        String actual = new CheckOutPage().verifyWelcomeText();
        Assert.assertEquals(expected, actual, "Not displayed");

    }

    @And("^I click on CHECKOUT AS GUEST$")
    public void iClickOnCHECKOUTASGUEST() {
        new CheckOutPage().clickOnCheckOutAsGuest();
    }

    @And("^I fill all the mandatory details$")
    public void iFillAllTheMandatoryDetails() {
        new GuestCheckOutPage().enterDetails();
    }

    @And("^I click to Continue$")
    public void iClickToContinue() {
        new GuestCheckOutPage().clickOnContinueButton();

    }

    @And("^I select radio button of Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)$")
    public void iSelectRadioButtonOfNextDayAir$(int arg0, int arg1) {
        new GuestCheckOutPage().clickOnNextDayAir();
    }

    @And("^I click on Continue Button$")
    public void iClickOnContinueButton() {
        new GuestCheckOutPage().clickOnContinue();
    }

    @And("^I click on radio button Credit Card$")
    public void iClickOnRadioButtonCreditCard() {
        new GuestCheckOutPage().clickOnCreditCard();
        new GuestCheckOutPage().clickOnContinues();


    }

    @And("^I click on Continues$")
    public void iClickOnContinues() {
        new GuestCheckOutPage().clickOnContinue();
    }

    @And("^I Select Master card From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() throws InterruptedException{
        Thread.sleep(2000);
        new GuestCheckOutPage().selectMasterCard();
    }

    @Then("^I fill all the card details$")
    public void iFillAllTheCardDetails() {
        new GuestCheckOutPage().enterDetailsOfCard();
    }


    @Then("^I should see Payment method is Credit card$")
    public void iShouldSeePaymentMethodIsCreditCard() {
        String expected = "Payment Method: Credit Card";
        String actual = new GuestCheckOutPage().verifyCreditCardPaymentMethod();
        Assert.assertEquals(expected, actual, "Not Displayed");

    }

    @And("^I should seeShipping method is Next Day Air$")
    public void iShouldSeeShippingMethodIsNextDayAir() {
        String expected = "Shipping Method: Next Day Air";
        String actual = new GuestCheckOutPage().verifyShippingMethod();
        Assert.assertEquals(expected, actual, "Not Displayed");

    }

    @And("^I should see total price \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iShouldSeeTotalPrice$(int arg0, int arg1, int arg2) {
        String expected = "$2,950.00";
        String actual = new GuestCheckOutPage().verifyTotalPrice();
        Assert.assertEquals(expected, actual, "Not displayed");
    }

    @And("^I click on Confirm$")
    public void iClickOnConfirm() {
        new GuestCheckOutPage().clickOnConfirm();
    }

    @Then("^I should see text Thank You$")
    public void iShouldSeeTextThankYou() {
    }

    @And("^I should see Your order has been successfully processed!$")
    public void iShouldSeeYourOrderHasBeenSuccessfullyProcessed() {
        String expected = "Your order has been successfully processed!";
        String actual = new GuestCheckOutPage().verifyOrderPlacedSuccessfullyText();
        Assert.assertEquals(expected, actual, "Not displayed");
    }

    @And("^I click on Continues button$")
    public void iClickOnContinuesButton() {
        new GuestCheckOutPage().clickOnContinueButton4();
    }

    @Then("^I should see Welcome to our store$")
    public void iShouldSeeWelcomeToOurStore() {
        String expected = "Welcome to our store";
        String actual = new HomePage().verifyWelcomeText();
        Assert.assertEquals(expected, actual, "Not displayed");
    }
}

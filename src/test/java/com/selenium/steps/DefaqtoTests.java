package com.selenium.steps;

import com.selenium.pages.SearchPage.DefaqtoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaqtoTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaqtoTests.class);
    private final DefaqtoPage defaqtoPage;

    public DefaqtoTests() {
        this.defaqtoPage = new DefaqtoPage();

    }

    @Given("I am on the Defaqto website homepage")
    public void iAmOnTheDefaqtoWebsiteHomepage() {
        LOGGER.info("Opening the home page");
        defaqtoPage.goToHomePage();
    }

    @When("I click on car insurance product")
    public void iClickCarInsuranceOption() {
        LOGGER.info("click the car insurance icon");
        defaqtoPage.navigateToCarInsuranceRatingsPage();

    }

    @Then("verify the number of companies under {int} star rating for {string}")
    public void iVerifyICanSeeTheStarRatingCompanies(int ratingNumber, String productType) {

        switch (productType) {
            case "car-insurance":
                defaqtoPage.verifyCarInsuranceRatingPage(ratingNumber);
                break;
            case "home-insurance":
                defaqtoPage.verifyHomeInsuranceRatingPage(ratingNumber);
                break;
            case "travel-insurance":
                defaqtoPage.verifyTravelInsuranceRatingPage(ratingNumber);
                break;
            case "credit-card":
                defaqtoPage.verifyCreditCardRatingPage(ratingNumber);
                break;
            case "current-account":
                defaqtoPage.verifyCurrentAccountRatingPage(ratingNumber);
                break;
        }

    }

    @When("I click home insurance product")
    public void iClickHomeInsuranceIcon() {
        defaqtoPage.clickHomeInsuranceIcon();

    }

    @When("I click travel insurance product")
    public void iClickTravelInsuranceIcon() {
        defaqtoPage.clickTravelInsuranceIcon();

    }

    @When("I click credit card product")
    public void iClickCreditCardIcon() {
        defaqtoPage.clickCreditCardIcon();

    }

    @When("I click current account product")
    public void iClickCurrentAccount() {
        defaqtoPage.clickCurrentAccount();

    }

    @When("I hover over all start rating icon")
    public void iHoverOverAllStartRatingIcon() {

    }

    @Then("I  can see all star rating companies")
    public void iCanSeeAllStarRatingCompanies() {

    }

    @Then("I verify the number of companies under <RATING> star rating")
    public void iVerifyTheNumberOfCompaniesUnderRATINGStarRating() {
    }
}
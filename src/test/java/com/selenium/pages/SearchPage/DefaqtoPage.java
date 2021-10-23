package com.selenium.pages.SearchPage;

import com.selenium.pages.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaqtoPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchPage.class);

    private static final String HOME_PAGE_URL = "https://defaqto.com/";

    @FindBy(linkText = "Car insurance")
    private WebElement carInsurance;

    @FindBy(xpath = "//h2[contains(text(),'Car Insurance')]")
    private WebElement carInsuranceText;

    @FindBy(xpath = "//*[@id=\"list-container-5\"]/div/h3")
    private WebElement verifyFiveStar;

    @FindBy(xpath = "//h2[contains(text(),'Home insurance (contents)')]")
    private WebElement homeInsuranceText;

    @FindBy(linkText = "Home insurance")
    private WebElement homeInsurance;

    @FindBy(xpath = "//h2[contains(text(),'Travel insurance (annual)')]")
    private WebElement travelInsuranceText;

    @FindBy(linkText = "Travel insurance")
    private WebElement travelInsurance;

    @FindBy(xpath = "//h2[contains(text(),'Credit card (purchase)')]")
    private WebElement creditCardText;

    @FindBy(linkText = "Credit card")
    private WebElement creditCard;

    @FindBy(xpath = "//h2[contains(text(),'Current account (standard)')]")
    private WebElement currentAccountText;

    @FindBy(linkText = "Current account")
    private WebElement currentAccount;

    @FindBy(linkText = "All Star Ratings")
    private WebElement allStarRatings;

    @FindBy(xpath = "//*[@id=\"list-container-5\"]/ul")
    private WebElement fiveStarRatingList;

    @FindBy(xpath = "//*[@id=\"list-container-4\"]/ul")
    private WebElement fourStarRatingList;



    public DefaqtoPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(3);
    }

    public void clickCarInsuranceIcon() {
        wait.forElementToBeDisplayed(3, carInsurance, "car insurance icon");
        carInsurance.click();
    }

    public void navigateToCarInsuranceRatingsPage() {
        wait.forElementToBeDisplayed(3, carInsurance, "car insurance icon");
        carInsurance.click();

    }

    public void clickHomeInsuranceIcon() {
        wait.forElementToBeDisplayed(2, homeInsurance, "home insurance icon");
        homeInsurance.click();

    }

    public void clickTravelInsuranceIcon() {
        wait.forElementToBeDisplayed(2, travelInsurance, "travel insurance icon");
        travelInsurance.click();
    }

    public void clickCreditCardIcon() {
        wait.forElementToBeDisplayed(2, creditCard, "credit card icon");
        creditCard.click();

    }

    public void clickCurrentAccount() {
        wait.forElementToBeDisplayed(2, currentAccount, "current account icon");
        currentAccount.click();


    }

    public void hoverOverAllStarRatings() {
        wait.forElementToBeDisplayed(2, allStarRatings, "all star ratings");


    }

    public void verifyCarInsuranceRatingPage(int ratingNumber) {
        wait.forElementToBeDisplayed(2, carInsuranceText, "Car insurance text");
        LOGGER.info("Verifying the car insurance text");
        String actualCarInsuranceText = carInsuranceText.getText();
        Assert.assertEquals("CAR INSURANCE", actualCarInsuranceText);

        switch (ratingNumber) {
            case 5:
                LOGGER.info("Getting the 5 star rating companies size "
                        + fiveStarRatingList.findElements(By.xpath("li")).size());
                int actualFiveStarRatedCompaniesSize = fiveStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(150, actualFiveStarRatedCompaniesSize);
                break;

            case 4:
                LOGGER.info("Getting the 4 star rating companies size "
                        + fourStarRatingList.findElements(By.xpath("li")).size());
                int actualFourStarRatedCompaniesSize = fourStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(25, actualFourStarRatedCompaniesSize);
                break;

        }

    }

    public void verifyHomeInsuranceRatingPage(int ratingNumber) {
        wait.forElementToBeDisplayed(2, homeInsuranceText, "Home insurance text");
        LOGGER.info("Verifying the home insurance text");
        String actualHomeInsuranceText = homeInsuranceText.getText();
        Assert.assertEquals("HOME INSURANCE (CONTENTS)", actualHomeInsuranceText);

        switch (ratingNumber) {
            case 5:
                LOGGER.info("Getting the 5 star rating companies size "
                        + fiveStarRatingList.findElements(By.xpath("li")).size());
                int actualFiveStarRatedCompaniesSize = fiveStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(151, actualFiveStarRatedCompaniesSize);
                break;

            case 4:
                LOGGER.info("Getting the 4 star rating companies size "
                        + fourStarRatingList.findElements(By.xpath("li")).size());
                int actualFourStarRatedCompaniesSize = fourStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(49, actualFourStarRatedCompaniesSize);
                break;

        }

    }

    public void verifyTravelInsuranceRatingPage(int ratingNumber) {
        wait.forElementToBeDisplayed(2, travelInsuranceText, "Travel insurance text");
        LOGGER.info("Verifying the travel insurance text");
        String actualTravelInsuranceText = travelInsuranceText.getText();
        Assert.assertEquals("TRAVEL INSURANCE (ANNUAL)", actualTravelInsuranceText);

        switch (ratingNumber) {
            case 5:
                LOGGER.info("Getting the 5 star rating companies size "
                        + fiveStarRatingList.findElements(By.xpath("li")).size());
                int actualFiveStarRatedCompaniesSize = fiveStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(223, actualFiveStarRatedCompaniesSize);
                break;

            case 4:
                LOGGER.info("Getting the 4 star rating companies size "
                        + fourStarRatingList.findElements(By.xpath("li")).size());
                int actualFourStarRatedCompaniesSize = fourStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(111, actualFourStarRatedCompaniesSize);
                break;

        }

    }

    public void verifyCreditCardRatingPage(int ratingNumber) {
        wait.forElementToBeDisplayed(2, creditCardText, "Credit Card text");
        LOGGER.info("Verifying the credit card text");
        String actualCreditCardText = creditCardText.getText();
        Assert.assertEquals("CREDIT CARD (PURCHASE)", actualCreditCardText);

        switch (ratingNumber) {
            case 5:
                LOGGER.info("Getting the 5 star rating companies size "
                        + fiveStarRatingList.findElements(By.xpath("li")).size());
                int actualFiveStarRatedCompaniesSize = fiveStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(9, actualFiveStarRatedCompaniesSize);
                break;

            case 4:
                LOGGER.info("Getting the 4 star rating companies size "
                        + fourStarRatingList.findElements(By.xpath("li")).size());
                int actualFourStarRatedCompaniesSize = fourStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(9, actualFourStarRatedCompaniesSize);
                break;

        }

    }

    public void verifyCurrentAccountRatingPage(int ratingNumber) {
        wait.forElementToBeDisplayed(2, currentAccountText, "Current Account text");
        LOGGER.info("Verifying the current account text");
        String actualCurrentAccountText = currentAccountText.getText();
        Assert.assertEquals("CURRENT ACCOUNT (STANDARD)", actualCurrentAccountText);

        switch (ratingNumber) {
            case 5:
                LOGGER.info("Getting the 5 star rating companies size "
                        + fiveStarRatingList.findElements(By.xpath("li")).size());
                int actualFiveStarRatedCompaniesSize = fiveStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(18, actualFiveStarRatedCompaniesSize);
                break;

            case 4:
                LOGGER.info("Getting the 4 star rating companies size "
                        + fourStarRatingList.findElements(By.xpath("li")).size());
                int actualFourStarRatedCompaniesSize = fourStarRatingList.findElements(By.xpath("li")).size();
                LOGGER.info("Verifying the 5 star rating companies size");
                Assert.assertEquals(10, actualFourStarRatedCompaniesSize);
                break;

        }

    }






}

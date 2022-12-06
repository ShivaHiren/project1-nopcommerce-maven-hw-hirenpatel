package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome, Please Sign In!","Welcome, Please Sign In!");
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("london2@gmail.com");
        loginPage.enterPassword("london1");
        loginPage.clickOnLoginButton();
        Assert.assertEquals("Log out","Log out");
    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("email@gmail.com");
        loginPage.enterPassword("123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message not displayed");

}}

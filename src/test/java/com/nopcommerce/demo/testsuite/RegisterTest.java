package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegisterTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();


    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(),"Register","Register");

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(),"Register","Register");
        registerPage.setGenderButton();
        registerPage.setFirstName("London");
        registerPage.setLastName("King");
        registerPage.setDayOfBirth("1");
        registerPage.setMonthOfBirth("January");
        registerPage.setYearOfBirth("2000");
        loginPage.enterEmailId("london2@gmail.com");
        registerPage.setCompanyName("Prime");
        registerPage.setPasswordField("london1");
        registerPage.setConformPasswordField("london1");
        registerPage.setRegisterButton();
        Assert.assertEquals("Your registration completed","Your registration completed");

    }
}
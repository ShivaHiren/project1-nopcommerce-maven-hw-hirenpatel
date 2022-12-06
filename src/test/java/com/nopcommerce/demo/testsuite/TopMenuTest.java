package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerTab();
        Assert.assertEquals("Computers", "Computers");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePage.clickOnElectronicTab();
        Assert.assertEquals("Electronics", "Electronics");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {
        homePage.clickOnApparalTab();
        Assert.assertEquals("Apparel", "Apparel");

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        homePage.clickOnDigitalDownloadTab();
        Assert.assertEquals("Digital downloads","Digital downloads");

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePage.clickOnBooksTab();
        Assert.assertEquals("Books","Books");

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        homePage.clickOnJeweleryTab();
        Assert.assertEquals("Jewelry","Jewelry");

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        homePage.clickOnGiftCardsTab();
        Assert.assertEquals("Gift Cards","Gift Cards");

    }
}
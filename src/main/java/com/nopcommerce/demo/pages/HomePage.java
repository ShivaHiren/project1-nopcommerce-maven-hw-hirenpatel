package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By searchField = By.id("small=-searchterms");
    By computerTab = By.xpath("//a[text()='Computers ']");
    By electronicTab = By.xpath("//a[text()='Electronics ']");
    By apparalTab = By.xpath("//a[text()='Apparel ']");
    By digitalDownloadTab = By.xpath("//a[text()='Digital downloads ']");
    By booksTab = By.xpath("//a[text()='Books ']");
    By jeweleryTab = By.xpath("//a[text()='Jewelry ']");
    By giftCardsTab = By.xpath("//a[text()='Gift Cards ']");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void enterTextToSearchField(String text) {
        sendTextToElement(searchField, text);
    }
    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }
    public void clickOnElectronicTab(){
        clickOnElement(electronicTab);
    }
    public void clickOnApparalTab(){
        clickOnElement(apparalTab);
    }
    public void clickOnDigitalDownloadTab(){
        clickOnElement(digitalDownloadTab);
    }
    public void clickOnBooksTab(){
        clickOnElement(booksTab);
    }
    public void clickOnJeweleryTab(){
        clickOnElement(jeweleryTab);
    }
    public void clickOnGiftCardsTab(){
        clickOnElement(giftCardsTab);
    }



}

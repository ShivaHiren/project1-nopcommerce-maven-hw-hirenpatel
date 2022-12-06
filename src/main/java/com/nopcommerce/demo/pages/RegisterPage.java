package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerLink = By.linkText("Register");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By genderButton = By.id("gender-male");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dayOfBirthField = By.name("DateOfBirthDay");
    By monthOfBirthField = By.name("DateOfBirthMonth");
    By yearOfBirthField = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By passwordField1 = By.xpath("//input[@id='Password']");
    By conformPasswordField = By.name("ConfirmPassword");
    By registerButton = By.id("register-button");


    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void setGenderButton(){
        clickOnElement(genderButton);
    }
    public void setFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);
    }
    public void setLastName(String lastName){
        sendTextToElement(lastNameField, lastName);
    }
    public void setDayOfBirth(String dayOfBirth){
        sendTextToElement(dayOfBirthField, dayOfBirth);
    }
    public void setMonthOfBirth(String monthOfBirth){
        sendTextToElement(monthOfBirthField, monthOfBirth);
    }
    public void setYearOfBirth(String yearOfBirth){
        sendTextToElement(yearOfBirthField, yearOfBirth);
    }
    public void setCompanyName(String companyName){
        sendTextToElement(companyNameField , companyName);
    }
    public void setPasswordField(String passwordField){
        sendTextToElement(passwordField1 , passwordField);
    }
    public void setConformPasswordField(String conformPassword){
        sendTextToElement(conformPasswordField , conformPassword);
    }
    public void setRegisterButton(){
        clickOnElement(registerButton);
    }

}
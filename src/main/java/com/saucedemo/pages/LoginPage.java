package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = (By.id("user-name"));

    By passwordField =(By.id("password"));

    By loginButton = (By.xpath("//input[@id='login-button']"));

    By Message = By.xpath("//span[text()='Products']");
    By SixProductsAreDisplayed = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMassege(){
        return getTextFromElement(Message);

    }
    public String verifyMassege() {
        return getTextFromElement(SixProductsAreDisplayed);
    }


}

package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterEmailId("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedErrorMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getErrorMassege(), expectedErrorMessage, "Verify the text");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterEmailId("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedMessage = "ADD TO CART";
        Assert.assertEquals(loginPage.verifyMassege(), expectedMessage, "Verify that six products are displayed on page");

    }

}

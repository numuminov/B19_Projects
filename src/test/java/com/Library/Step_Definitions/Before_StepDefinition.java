package com.Library.Step_Definitions;

import com.Library.POM_Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Before_StepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("I have logged into Library Application")
    public void i_have_logged_into_library_application() {
        loginPage.getDriver();
        loginPage.login();
        loginPage.waitMethod(4);
        Assert.assertTrue(loginPage.getCheckDash().isDisplayed());
    }



    @When("I navigate to Books tab")
    public void i_navigate_to_books_tab() {
        WebElement BookBut =  loginPage.BookButton;
        BookBut.click();
        loginPage.waitMethod(4);
    }

}

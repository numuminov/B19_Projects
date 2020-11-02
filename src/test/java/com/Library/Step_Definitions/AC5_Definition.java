package com.Library.Step_Definitions;

import com.Library.POM_Pages.LoginPage;
import com.Utilities.driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AC5_Definition {
    LoginPage loginPage = new LoginPage();



    @When( "I click on 'Edit Book'")
    public void Edit_Book_but(){
        loginPage.searchBox.sendKeys("Hobbit"+ Keys.ENTER);
        loginPage.waitMethod(3);
    }
    @Then("I should be able to edit and save the book information")
    public void editBookInfo(){
        loginPage.editButton.click();
        loginPage.waitMethod(2);
       WebElement element = loginPage.ISBN;
       element.clear();
       element.sendKeys("TLKN-193");
        loginPage.waitMethod(2);

        loginPage.submitButton.click();



        loginPage.waitMethod(1);
        Assert.assertTrue(loginPage.bookHasBeenUpdated.isDisplayed());

        driver.driver().quit();
    }
}

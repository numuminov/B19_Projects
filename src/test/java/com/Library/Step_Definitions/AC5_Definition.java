package com.Library.Step_Definitions;

import com.Library.POM_Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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
        loginPage.ISBN.sendKeys("TLKN-193");
        loginPage.waitMethod(2);

        loginPage.submitButton.click();



        loginPage.waitMethod(1);
        Assert.assertTrue(loginPage.bookHasBeenUpdated.isDisplayed());


    }
}

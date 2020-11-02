package com.Library.Step_Definitions;

import com.Library.POM_Pages.LoginPage;
import com.Utilities.driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.sql.Driver;

public class AC4_Definition {
    LoginPage loginPage = new LoginPage();


    @When( "I search for a book in the 'Search' box")
    public void searchBox(){
        loginPage.searchBox.sendKeys("Hobbit"+ Keys.ENTER);
        loginPage.waitMethod(3);
    }

    @Then("all results containing what I searched for should appear on the screen")
    public void checkRes(){
        Assert.assertTrue(loginPage.checkHobbitAppear.isDisplayed());
        driver.driver().quit();
    }



}

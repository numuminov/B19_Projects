package com.Library.Step_Definitions;

import com.Library.POM_Pages.LoginPage;
import com.Utilities.driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Driver;

public class AC2_Definition {
    LoginPage loginPage = new LoginPage();


    @When("I click on 'Book Categories' drop down")
    public  void Book_Categories_drop_down(){
        loginPage.book_categories.click();
        loginPage.waitMethod(1);

    }


    @Then("I should be able to select the genre of book I want to filter on the screen")
    public  void choose_genre(){

        loginPage.selectHistorycalGenre();
        loginPage.waitMethod(1);

        Assert.assertTrue(loginPage.historycal_genre.isSelected());
        driver.driver().quit();
    }

}

package com.Library.Step_Definitions;

import com.Library.POM_Pages.LoginPage;
import com.Utilities.driver;
import io.cucumber.java.en.Then;

public class AC1_Definition {
    LoginPage loginPage = new LoginPage();


    @Then("I should be able to click on Add Book and add a new book to the database")
    public void i_should_be_able_to_click_on_add_book_and_add_a_new_book_to_the_database() {

        loginPage.fillTheInfoforAddBook();
        driver.driver().quit();
    }
}

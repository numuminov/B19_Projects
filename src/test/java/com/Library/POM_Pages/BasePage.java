package com.Library.POM_Pages;

import com.Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {
    @FindBy(id="inputEmail")
    private WebElement usernameInput;

    @FindBy(id="inputPassword")
    private WebElement passwordInput;

    @FindBy(xpath = "//button")
    private WebElement submitButton;

    public void librarianLogin(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("userLibrarian"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordLibrarian"));
        submitButton.click();
    }



}

package com.Library.POM_Pages;

import com.Utilities.driver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(driver.driver(), this);
    }
}

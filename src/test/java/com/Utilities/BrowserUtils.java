package com.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;


public class BrowserUtils {
    private static WebDriverWait wait = new WebDriverWait(driver.driver(), 20);

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void enterText(WebElement webElement, String text){
        WebDriverWait wait=new WebDriverWait(driver.driver(),10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(webElement, "value",text));
    }

    public void waitUntilClick(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver.driver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



}
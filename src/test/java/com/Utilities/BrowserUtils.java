package com.Utilities;

import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserUtils {
    private static WebDriverWait wait = new WebDriverWait(com.Utilities.driver.driver(), 20);

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
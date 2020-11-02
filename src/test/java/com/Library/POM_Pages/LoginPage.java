package com.Library.POM_Pages;

import com.Utilities.ConfigurationReader;
import com.Utilities.driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class LoginPage extends  BasePage {
    @FindBy(id = "inputEmail")
    private WebElement usernameElement;

    @FindBy(id = "inputPassword")
    private WebElement passwordElement;


    @FindBy(className = "navbar-brand")
    private WebElement checkDash;


    @FindBy(xpath ="//span[@class='title'][.='Books']")
    public WebElement BookButton;

    @FindBy(xpath = "//span[@style='float:right']")
    public WebElement AddBookButton;

    @FindBy(xpath = "//input[@placeholder='Book Name']")
    public WebElement bookNameInput;

    @FindBy(xpath = "//input[@placeholder='ISBN']")
    public WebElement ISBN;

    @FindBy(xpath = "//input[@placeholder='Year']")
    public WebElement year;

    @FindBy(xpath = "//input[@placeholder='Author']")
    public WebElement author;

    @FindBy(id = "book_group_id")
    public WebElement category;




    @FindBy(id = "description")
    public WebElement description;



    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;



    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


    @FindBy(xpath = "//table[@id='tbl_books']//td[.='Rhondan Byrne']")
    public WebElement finalConfirmation;

    @FindBy(id = "book_categories")
    public WebElement book_categories;

    @FindBy(xpath = "//select[@id='book_categories']//option[@value='11']")
    public WebElement historycal_genre;

    @FindBy(xpath = "//table[@id='tbl_books']//td[.='The Hobbit']")
    public WebElement checkHobbitAppear;


    @FindBy(xpath = "//a[@onclick='Books.edit_book(2003)']")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement bookHasBeenUpdated;

    public void getDriver(){
       driver.driver().get(ConfigurationReader.getProperty("url"));
        driver.driver().manage().window().maximize();
    }

    public void login(){
        String username = ConfigurationReader.getProperty("librarianUsername");
        String password = ConfigurationReader.getProperty("librarianPassword");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);
    }

    public  WebElement getCheckDash(){
        return this.checkDash;
    }

    public void waitMethod(int sec){
        int count = sec*1000;
        try {
            Thread.sleep(count);
        }catch (InterruptedException e){

        }
    }

    public void selectCategory(){
        category.click();
        waitMethod(3);
        WebElement selectCat = driver.driver().findElement(By.xpath("//select[@id='book_group_id']/option[@value='10']"));
        selectCat.click();
    }

    public void selectHistorycalGenre(){
        book_categories.click();
        waitMethod(1);
        historycal_genre.click();
    }

    public void fillTheInfoforAddBook(){

        AddBookButton.click();
        waitMethod(3);
        bookNameInput.sendKeys("Secret");
        ISBN.sendKeys("123431");
        year.sendKeys("2000");
        author.sendKeys("Rhondan Byrne");
        description.sendKeys("Good book");
        selectCategory();
        waitMethod(2);
        submitButton.click();

        System.out.println("=================================Confirmation=====================================================");
        waitMethod(3);

        searchBox.sendKeys("Rhondan"+ Keys.ENTER);
        waitMethod(4);
        Assert.assertTrue(finalConfirmation.isDisplayed());

    }
}

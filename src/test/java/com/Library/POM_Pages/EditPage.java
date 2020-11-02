package com.Library.POM_Pages;

import com.Utilities.BrowserUtils;
import com.Utilities.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class EditPage extends BasePage {
    BrowserUtils browserUtils=new BrowserUtils();

    public EditPage() {
        PageFactory.initElements(driver.driver(), this);
    }



    @FindBy(xpath = "//a[@href='#books']")
    private WebElement booksTab;

    public void clickOnBookTab(){
        WebDriverWait wait= new WebDriverWait(driver.driver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(booksTab));
        booksTab.click();
    }

    @FindBy(xpath = "//a[@href='tpl/add-book.html']")
    private WebElement addBookButton;

    public void clickOnAddBook(){
        WebDriverWait wait=new WebDriverWait(driver.driver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(addBookButton));
        addBookButton.click();
    }
    public boolean addBookIsClickable(){
        return addBookButton.isEnabled();
    }

    @FindBy(css="[placeholder='Book Name']")
    private WebElement bookNameInputBox;

    public void bookNameEnter(String text){
        browserUtils.waitUntilClick(bookNameInputBox);
        bookNameInputBox.clear();
        bookNameInputBox.sendKeys(text);
    }

    @FindBy(css="[placeholder='Author']")
    private WebElement authorInputBox;

    public void authorEnter(String text){
        browserUtils.waitUntilClick(authorInputBox);
        authorInputBox.clear();
        authorInputBox.sendKeys(text);
    }

    @FindBy(css="[placeholder='Year']")
    private WebElement yearInputBox;

    public void yearEnter(String text){
        browserUtils.waitUntilClick(yearInputBox);
        yearInputBox.clear();
        yearInputBox.sendKeys(text);
    }

    @FindBy(css="[placeholder='ISBN']")
    private WebElement isbnInputBox;

    public void isbnEnter(String text){
        browserUtils.waitUntilClick(isbnInputBox);
        isbnInputBox.clear();
        isbnInputBox.sendKeys(text);
    }

    @FindBy(id="description")
    private WebElement descriptionInputBox;

    public void descriptionEnter(String text){
        browserUtils.waitUntilClick(descriptionInputBox);
        descriptionInputBox.clear();
        descriptionInputBox.sendKeys(text);
    }

    @FindBy(id="book_group_id")
    private WebElement bookCategory;

    public void selectBookCategory(String category){
        Select select=new Select(bookCategory);
        select.selectByVisibleText(category);
    }

    @FindBy(xpath ="//button[@type='submit']")
    private WebElement saveButton;

    public void clickSaveButton(){
        saveButton.click();
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBox;

    public void searchForBook(String book){
        WebDriverWait wait=new WebDriverWait(driver.driver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(book);
    }
    @FindBy(xpath = "//div[@class='toast-message']")
    private WebElement popup;

    public boolean isBookSaved(){
        WebDriverWait wait=new WebDriverWait(driver.driver(),15);
        wait.until(ExpectedConditions.visibilityOf(popup));
        return popup.isDisplayed();

    }

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    private WebElement editBook;

    public void editingBook(){
        browserUtils.waitUntilClick(editBook);
        editBook.click();
    }



    @FindBy(xpath = "//tr[@role='row']/td[3]")
    private WebElement bookTitle;

    public boolean verifySavedBook( String bookInfo){
        // String xpath=  "//td[.='"+bookInfo+"']";
        WebDriverWait wait=new WebDriverWait(driver.driver(),10);
        wait.until(ExpectedConditions.textToBePresentInElement(bookTitle,bookInfo));
        String str=bookTitle.getText();
        //System.out.println("Name of the book: "+str);
        bookInfo=bookInfo.toLowerCase();
        str=str.toLowerCase();
        return bookInfo.contains(str);

    }
    @FindBy(id = "book_categories")
    private WebElement bookCategoryDropDown;

    public void sortBookCategories(String category){
        Select select= new Select(bookCategoryDropDown);
        select.deselectByVisibleText(category);

    }








}

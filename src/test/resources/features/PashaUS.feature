
Feature: As user I should  be able to login under librarian credential and check Book functionalities


  Background:
    Given I have logged into Library Application
    When I navigate to Books tab



  Scenario: Add book functionality AC1
    #Given I have logged into Library Application
    #When I navigate to Books tab
    Then I should be able to click on Add Book and add a new book to the database



  Scenario:check "Book Categories" drop down AC2
  # Given I am on the "Books" tab
    When I click on 'Book Categories' drop down
    Then I should be able to select the genre of book I want to filter on the screen


  Scenario: check "Search" box functionality AC4
    #  Given I am on the "Books" tab
    When I search for a book in the 'Search' box
    Then all results containing what I searched for should appear on the screen


  Scenario:check "Edit Book" functionality AC5
  #Given I am on the "Books" tab
    When I click on 'Edit Book'
    Then I should be able to edit and save the book information

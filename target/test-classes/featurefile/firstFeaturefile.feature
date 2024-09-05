Feature: Application Login

Background:
#Given setup the entries in the database
When launch the browser from config variables
And hit the home page url of banking site


@RegressionTest
  Scenario: Admin page default login
    Given User is on netbanking landing page 
    When User loginto application with "admin" and password "123"
    Then Home page is displayed
    And cards are displayed
    
  @Mobiletest @netbankingDB
  Scenario: User page default login
    Given User is on netbanking landing page 
    When User loginto application with "user" and password "456"
    Then Home page is displayed
    And cards are displayed

@SmokeTest   @MortgageDB
    Scenario Outline: User page default login
    Given User is on netbanking landing page 
    When User loginto application with "<Username>" and password "<Password>" 
    Then Home page is displayed
    And cards are displayed
    
    Examples:
    |Username| Password |
    |CreditUser | hello12 |
    | DebitUser| 456 |
    
    
    @SmokeTest
    Scenario: User page default sign up
    Given User is on practice landing page 
    When User signup into application  
    |Rithanya|
    |Nuvali|
    |abc@gmail.com|
    |0912345678|
    |Address|
    Then Home page is displayed
    And cards are displayed
    
    
    
    
    
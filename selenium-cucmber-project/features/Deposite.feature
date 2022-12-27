Feature: Deposite
@regression
Scenario: deposite
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "mngr464494" and Password as "UjAjYbA"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on deposit link
     Then Page Title should be "Guru99 Bank Amount Deposit Page"
     When User fill amount deposite form
     And click on submit button
     Then Page Title should be "demo.guru99.com"

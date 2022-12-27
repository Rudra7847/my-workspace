Feature: EditAccount
@regression
Scenario: Edit Account
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "mngr464494" and Password as "UjAjYbA"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on edit Account
     Then Page Title should be "Guru99 Edit Account Page"
     When User enter Account No
     And click on submit3 button
     Then Page Title should be "demo.guru99.com"
     


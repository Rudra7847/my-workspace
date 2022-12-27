Feature: NewAccount
@Sanity
Scenario:Add New Account
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "mngr464494" and Password as "UjAjYbA"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on new Account
     Then Page Title should be "Guru99 bank add new account"
     When User enter customer id
     And Select Account type
     And Enter Initial Deposite
     And Click on submit2
     Then Page Title should be "Gtpl Bank Customer Registration Page"
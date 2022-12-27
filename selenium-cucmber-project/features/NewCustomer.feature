Feature: NewCustomer
@regession
Scenario:Add New Customer
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "mngr464494" and Password as "UjAjYbA"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on new customer
     Then Page Title should be "Guru99 Bank New Customer Entry Page"
     When User enter customer info
     And click on submit button
     Then Page Title should be "Guru99 Bank Customer Registration Page"
    
     
    
     
     

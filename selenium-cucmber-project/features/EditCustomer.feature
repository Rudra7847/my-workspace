Feature: EditCustomer
@Sanity
Scenario: Edit Customer
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "mngr464494" and Password as "UjAjYbA"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on edit customer
     Then Page Title should be "Guru99 Bank Edit Customer Page"
     When User enter customer id
     And click on submit1 button
     Then Page Title should be "Guru99 Bank Edit Customer Entry Page"
     
    

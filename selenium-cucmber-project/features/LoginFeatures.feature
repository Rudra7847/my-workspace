Feature:Login
@Sanity
Scenario:Successful Login With Valid Credentials
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "mngr464494" and Password as "UjAjYbA"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on Log out link
     Then Page Title should be "Guru99 Bank Home Page"
     And close all browsers
     
     
     
@regession
Scenario Outline:Successful Login With Valid Credentials DDT
     Given User Launch Chrome browser
     When User open URL "https://demo.guru99.com/V4/index.php"
     And User enters UserId as "<email>" and Password as "<password>"
     And Click on LOGIN
     Then Page Title should be "Guru99 Bank Manager HomePage"
     When User click on Log out link
     Then Page Title should be "Guru99 Bank Home Page"
     And close all browsers
     
 Examples:
 |email|password|
 |mngr464494|UjAjYbA|
 |mngr457877|YduramY|
 |mngr452000|abcdefg|    
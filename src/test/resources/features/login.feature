@login
Feature: To login to the application

  @Googlelogin
  Scenario: To login using Google
    Then To Click the Continue with Google button
    Then To select the google account "dawoodibu97@gmail.com"
    Then To provide users details and create the account
    Then To verify whether user has been logged in successfully into the app using google
   Then To check whether user can be able to delete the account using delete button


  @facebooklogin
  Scenario: To login using Facebook
    Then To Click the Continue with facebook button
    Then To provide users details and create the account using facebook
    Then To verify whether user has been logged in successfully into the app using facebook
#    Then To check whether user can be able to signout from his account using signout button

  @maillogin
  Scenario: To login using mail id
    Then To click the signinsignup button at top
    Then To Click the continue with Email button
    Then To Enter the valid email address in the Email field box with "dawod.ibrahim@euroland.com"
    Then To click the Next Button
    Then To Enter the First name as "Dawood"
    Then To Enter the last name as "Ibrahim"
    Then To Enter the password as "1234@Qwer"
    Then To Enter the confirm password as "1234@Qwer"
    Then To click next button
    Then To Enter the Company Value as "Euroland"
    Then To Select the profession from the dropdown
    Then To click the skip button
    Then To click the verify captcha Screen
    Then To select the Captcha
    Then To check whether the user has been logged in successfully into the app using mail







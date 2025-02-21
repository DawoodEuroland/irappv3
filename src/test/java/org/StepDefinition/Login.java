package org.StepDefinition;

import io.cucumber.java.en.*;
import org.Locators.LoginPojo;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;


public class Login extends BaseClass {
String gmail;
        LoginPojo login;

        @Then("To click the signinsignup button at top")
        public void to_click_the_signinsignup_button_at_top() throws InterruptedException {
            login = new LoginPojo();
            Click(login.getSignInAndSignUp(),10);
        }

        @Then("To Click the continue with Email button")
        public void to_click_the_continue_with_email_button() {

            Click(login.getContinueWithEmail(),10);
        }


        @Then("To Enter the valid email address in the Email field box with {string}")
        public void to_enter_the_valid_email_address_in_the_email_field_box_with(String email) {
            sendValues(login.getEnterEmail(), email,10,500);
        }
        @Then("To click the Next Button")
        public void to_click_the_next_button() throws InterruptedException {
            sleep(3000);
            Click(login.getNextEmail(),10);
            Click(login.getPrivacyPopupContinueButton(),10);
        }


        @Then("To Enter the First name as {string}")
        public void to_enter_the_first_name_as(String fname) {

            sendValues(login.getFirstNameEmail(), fname,10,500);
        }

        @Then("To Enter the last name as {string}")
        public void to_enter_the_last_name_as(String lname) {

            sendValues(login.getLastNameEmail(), lname,10,500);
        }

        @Then("To Enter the password as {string}")
        public void to_enter_the_password(String password) {
            sendValues(login.getPasswordEmail(), password,10,500);
        }

        @Then("To Enter the confirm password as {string}")
        public void to_enter_the_confirm_password(String confirmPassword) {
            sendValues(login.getConfirmPasswordEmail(), confirmPassword,10,500);
        }

        @Then("To click next button")
        public void to_click_next_button() {

            Click(login.getNextCreateEmailAccount(),10);
        }

        @Then("To Enter the Company Value as {string}")
        public void to_enter_the_company_value(String company) throws InterruptedException {
            sleep(3000);
            sendValues(login.getCompanyBox(), company,10,500);
        }

        @Then("To Select the profession from the dropdown")
        public void to_select_the_profession_from_the_dropdown() {
            Click(login.getProfessionDropDown(),10);
            Click(login.getBrokerProfession(),10);
        }

        @Then("To click the skip button")
        public void to_click_the_skip_button() {
            Click(login.getSkipButton(),10);
        }

        @Then("To click the verify captcha Screen")

        public void to_click_the_verify_captcha_screen() throws InterruptedException {
            sleep(3000);

        }
        @Then("To select the Captcha")
        public void to_select_the_captcha() throws InterruptedException {

            sleep(15000);
        }

        @Then("To check whether the user has been logged in successfully into the app using mail")
        public void to_check_whether_the_user_has_been_logged_in_successfully_into_the_app() throws InterruptedException {
            verifyLoginSuccess("mail",login);

}


//Google Login
    @Then("To Click the Continue with Google button")
    public void to_click_the_continue_with_google_button() throws InterruptedException {
        to_click_the_signinsignup_button_at_top();
        Click(login.getContinuewithGoogle(),10);
    }
    @Then("To select the google account {string}")
    public void to_select_the_google_account(String google) throws InterruptedException {
        gmail = google;
        //login.getAccountElementByEmail(google);
        sleep(2000);
        Click(login.getAccountElementByEmail(google), 10);
    }

    @Then("To provide users details and create the account")
    public void to_provide_users_details_and_create_the_account() throws InterruptedException {
        Click(login.getPrivacyPopupContinueButton(),10);
        Click(login.getGoogle_FaceBook_NextButton(),10);
        to_enter_the_company_value("Euroland");
        to_select_the_profession_from_the_dropdown();
        Click(login.getContinueButton(),10);
        to_click_the_verify_captcha_screen();
        to_select_the_captcha();


    }
    @Then("To verify whether user has been logged in successfully into the app using google")
    public void to_verify_whether_user_has_been_logged_in_successfully_into_the_app_using_google() throws InterruptedException {
        verifyLoginSuccess("google",login);
    }


    @Then("To check whether user can be able to delete the account using delete button")
    public void to_check_whether_user_can_be_able_to_delete_the_account_using_delete_button() {
char firstLetter = gmail.toUpperCase().charAt(0);
Click(login.getFirstNameIcon(firstLetter),10);

    }

//facebook login


    @Then("To Click the Continue with facebook button")
    public void to_click_the_continue_with_facebook_button() throws InterruptedException {
        to_click_the_signinsignup_button_at_top();
        Click(login.getContinueWithFaceBook(),10);


    }
    @Then("To provide users details and create the account using facebook")
    public void to_provide_users_details_and_create_the_account_using_facebook() throws InterruptedException {
        Click(login.getPrivacyPopupContinueButton(),10);
        Click(login.getGoogle_FaceBook_NextButton(),10);
        to_enter_the_company_value("Euroland");
        to_select_the_profession_from_the_dropdown();
        Click(login.getContinueButton(),10);
        to_click_the_verify_captcha_screen();
        to_select_the_captcha();
    }
    @Then("To verify whether user has been logged in successfully into the app using facebook")
    public void to_verify_whether_user_has_been_logged_in_successfully_into_the_app_using_facebook() throws InterruptedException {
        verifyLoginSuccess("facebook",login);
    }
    @Then("To check whether user can be able to signout from his account using signout button")
    public void to_check_whether_user_can_be_able_to_signout_from_his_account_using_signout_button() {

    }
        }






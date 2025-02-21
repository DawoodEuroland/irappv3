package org.Locators;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.StepDefinition.Login;
import org.utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

    public LoginPojo() {

        PageFactory.initElements(new AppiumFieldDecorator(BaseClass.driver), this);

    }

    //Email Login

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sign In / Sign Up\"]")
    private WebElement signInAndSignUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue with Email\"]")
    private WebElement continueWithEmail;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement enterEmail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
    private WebElement nextEmail;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"First name,input\"]/android.view.ViewGroup/android.widget.EditText")
    private WebElement firstNameEmail;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Last name,input\"]/android.view.ViewGroup/android.widget.EditText")
    private WebElement lastNameEmail;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"password\"]/android.widget.EditText")
    private WebElement passwordEmail;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Confirm password,input\"]/android.view.ViewGroup/android.widget.EditText")
    private WebElement confirmPasswordEmail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
    private WebElement nextCreateEmailAccount;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement companyBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Profession\"]")
    private WebElement professionDropDown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Broker\"]")
    private WebElement brokerProfession;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Skip\"]")
    private WebElement skipButton;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Create account\"]")
    private WebElement continueButton;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id=\"recaptcha-anchor\"]")
    private WebElement checkboxCaptcha;




    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Good Morning,\"]")
    private WebElement morningMessage;

    public WebElement getMorningMessage() {

        return morningMessage;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Good Afternoon,\"]")
    private WebElement afternoonMessage;

    public WebElement getAfternoonMessage() {

        return afternoonMessage;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Good Evening,\"]")
    private WebElement eveMessage;

    public WebElement getEveMessage() {
        return eveMessage;
    }

    public WebElement getSignInAndSignUp() {

        return signInAndSignUp;
    }

    public WebElement getContinueWithEmail() {
        return continueWithEmail;
    }

    public WebElement getEnterEmail() {
        return enterEmail;
    }

    public WebElement getNextEmail() {
        return nextEmail;
    }

    public WebElement getFirstNameEmail() {
        return firstNameEmail;
    }

    public WebElement getLastNameEmail() {
        return lastNameEmail;
    }

    public WebElement getPasswordEmail() {
        return passwordEmail;
    }

    public WebElement getConfirmPasswordEmail() {
        return confirmPasswordEmail;
    }

    public WebElement getNextCreateEmailAccount() {
        return nextCreateEmailAccount;
    }

    public WebElement getCompanyBox() {
        return companyBox;
    }

    public WebElement getProfessionDropDown() {
        return professionDropDown;
    }

    public WebElement getBrokerProfession() {
        return brokerProfession;
    }

    public WebElement getSkipButton() {
        return skipButton;
    }

    public WebElement getContinueButton() {return continueButton;
    }

    public WebElement getCheckboxCaptcha() {
        return checkboxCaptcha;
    }

    //Google Login

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue with Google\"]")
    private WebElement continuewithGoogle;

    public WebElement getContinuewithGoogle() {
        return continuewithGoogle;
    }


    public WebElement getAccountElementByEmail(String email) {
        WebElement googleaccount =  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/account_name' and @text='"+email+"']"));

        return googleaccount;
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Next,button\"]")
    private WebElement google_FaceBook_NextButton;



    public WebElement getGoogle_FaceBook_NextButton() {
        return google_FaceBook_NextButton;
    }
//facebook login

    public WebElement getContinueWithFaceBook() {
        return continueWithFaceBook;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue with Facebook\"]")
    private WebElement continueWithFaceBook;



    //Privacy and terms popup

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Privacy and Terms\"]")
    private WebElement privacyPolicyPopUP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
    private WebElement privacyPopupContinueButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cancel\"]")
    private WebElement getPrivacyPopupCancelButton;

    public WebElement getPrivacyPolicyPopUP() {
        return privacyPolicyPopUP;
    }

    public WebElement getPrivacyPopupContinueButton() {
        return privacyPopupContinueButton;
    }

    public WebElement getGetPrivacyPopupCancelButton() {
        return getPrivacyPopupCancelButton;
    }


    //Delete Account
    public WebElement getFirstNameIcon(char icon) {
        WebElement IconLetter = driver.findElement(By.xpath("//android.widget.TextView[@text='"+icon+"']"));
        return IconLetter;
    }



}
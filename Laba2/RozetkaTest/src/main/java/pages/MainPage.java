package pages;

import elements.MainPageElements;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverConfig;
import utils.DriverManager;

import javax.swing.*;


public class MainPage extends MainPageElements {
    private static final DriverConfig cfg = ConfigFactory.create(DriverConfig.class);


    public static MainPage getInstance() {
        return new MainPage();
    }

    public MainPage openLoginModal() {
        btnLogin.click();
        return getInstance();
    }

    public MainPage inputEmail() {
        inputEmailFld.sendKeys(cfg.email());
        return getInstance();
    }

    public MainPage inputPassword() {
        inputPasswordFld.sendKeys(cfg.password());
        return getInstance();
    }

    public MainPage inputWrongEmail() {
        inputEmailFld.sendKeys(cfg.wrongEmail());
        return getInstance();
    }

    public MainPage inputWrongPassword() {
        inputPasswordFld.sendKeys(cfg.wrongPassword());
        return getInstance();
    }

    public MainPage loginToAcc() {
        btnSubmit.click();
        try {
            Thread.sleep(5000); // There is a delay here because the notification for incorrect data does not have time to appear
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getInstance();
    }

    public MainPage verifyLoginModalUiElementsDisplayed() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(inputEmailFld.isDisplayed())
                .describedAs("Email field")
                .isTrue();
        softAssertions.assertThat(inputEmailTxt.isDisplayed())
                .describedAs("Email field")
                .isTrue();
        softAssertions.assertThat(inputEmailTxt.getText())
                .describedAs("Email field")
                .isEqualTo("Ел. пошта або телефон");

        softAssertions.assertAll();
        return getInstance();
    }

    public MainPage checkFacebookAndGoogleBtns() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(btnFacebook.isDisplayed())
                .describedAs("Facebook button")
                .isTrue();
        softAssertions.assertThat(btnGoogle.isDisplayed())
                .describedAs("Google button")
                .isTrue();

        softAssertions.assertAll();
        return getInstance();
    }

    public MainPage checkLoginAndRegistrationBtns() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(btnSubmit.getText())
                .describedAs("Submit button")
                .isEqualTo("Увійти");
        softAssertions.assertThat(btnRegister.getText())
                .describedAs("Registration button")
                .isEqualTo("Зареєструватися");
        softAssertions.assertAll();
        return getInstance();
    }

    public MainPage checkErrorMessageEmail() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(errorEmailMessage.isDisplayed())
                .describedAs("Error message")
                .isTrue();
        softAssertions.assertThat(errorEmailMessage.getText())
                .describedAs("Error message")
                .isEqualTo("Введено невірну адресу ел. пошти або номер телефону");
        softAssertions.assertAll();
        return getInstance();
    }

    public MainPage checkReCaptchaErrorMessage() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(reCaptchaErrorMessage.isDisplayed())
                .describedAs("Error message")
                .isTrue();
        softAssertions.assertThat(reCaptchaErrorMessage.getText())
                .describedAs("Error message")
                .isEqualTo("Необхідно підтвердити, що ви не робот");
        softAssertions.assertAll();
        return getInstance();
    }
}

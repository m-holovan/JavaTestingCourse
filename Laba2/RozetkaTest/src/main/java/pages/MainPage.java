package pages;

import elements.MainPageElements;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;
import utils.DriverConfig;


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

    public MainPage loginToAcc() {
        btnSubmit.click();
        return getInstance();
    }

    public MainPage verifyLoginModalUiElemetsDisplayed() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(inputEmailFld.isDisplayed())
                .describedAs("Email field")
                .isTrue();
        softAssertions.assertThat(inputEmailTxt.isDisplayed())
                .describedAs("Email field")
                .isTrue();
        softAssertions.assertThat(inputEmailFld.getText())
                .describedAs("Email field")
                .isEqualTo("Ел. пошта або телефон");

        softAssertions.assertAll();
        return getInstance();
    }
}

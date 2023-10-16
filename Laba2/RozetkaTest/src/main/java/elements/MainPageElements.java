package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RozetkaFactory;

public class MainPageElements extends RozetkaFactory {
    @FindBy(xpath = "//button[@class='header__button ng-star-inserted'][1]")
    protected WebElement btnLogin;

    @FindBy(css = "input#auth_email")
    protected WebElement inputEmailFld;

    @FindBy(xpath = "//input[@id=\"auth_email\"]//preceding::label")
    protected WebElement inputEmailTxt;

    @FindBy(css = "input#auth_pass")
    protected WebElement inputPasswordFld;

    @FindBy(css = "button.button.button--large.button--green.auth-modal__submit.ng-star-inserted")
    protected WebElement btnSubmit;

    @FindBy(css = "button.button.button--large.button--gray.button--with-icon.auth-modal__social-button.auth-modal__social-button_type_facebook")
    protected WebElement btnFacebook;

    @FindBy(css = "button.button.button--large.button--gray.button--with-icon.auth-modal__social-button")
    protected WebElement btnGoogle;

    @FindBy(css = "button.auth-modal__register-link.button.button--link.ng-star-inserted")
    protected WebElement btnRegister;

    @FindBy(xpath = "(//p[contains(@class, 'error-message') and contains(@class, 'ng-star-inserted')])[1]")
    protected WebElement errorEmailMessage;

    @FindBy (xpath = "//*[@class='error-message error-message_color_red']")
    protected WebElement reCaptchaErrorMessage;
}

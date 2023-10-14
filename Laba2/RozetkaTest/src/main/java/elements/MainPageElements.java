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
}

import org.testng.annotations.Test;
import pages.MainPage;
import utils.DriverManager;

public class MainPageTest {

    @Test
    void testSteps() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginModal()
                .verifyLoginModalUiElementsDisplayed()
                .checkFacebookAndGoogleBtns()
                .checkLoginAndRegistrationBtns()
                .inputEmail()
                .inputPassword()
                .loginToAcc()
                .checkReCaptchaErrorMessage();
    }

    @Test
    void wrongEmailAndPassword() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginModal()
                .inputWrongEmail()
                .inputWrongPassword()
                .loginToAcc()
                .checkErrorMessageEmail();
    }
}

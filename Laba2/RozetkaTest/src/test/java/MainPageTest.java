import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest {

    @Test
    void testSteps(){
        MainPage mainPage = new MainPage();
        mainPage.openLoginModal()
                .verifyLoginModalUiElemetsDisplayed()
                .inputEmail()
                .inputPassword()
                .loginToAcc();
    }
}

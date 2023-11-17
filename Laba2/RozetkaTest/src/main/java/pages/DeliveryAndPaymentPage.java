package pages;

import elements.DeliveryAndPaymentElements;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverManager;

public class DeliveryAndPaymentPage extends DeliveryAndPaymentElements {
    public static DeliveryAndPaymentPage getInstance() {
        return new DeliveryAndPaymentPage();
    }

    public DeliveryAndPaymentPage openPage() {
        //scrollPage();
        deliveryAndPaymentBtn.click();
        return getInstance();
    }

    public DeliveryAndPaymentPage checkHeader() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(referenceCenterHeader.isDisplayed())
                .isTrue();
        softAssertions.assertThat(deliveryHeader.isDisplayed())
                .isTrue();

        softAssertions.assertAll();
        return getInstance();
    }

    public DeliveryAndPaymentPage scrollPage() {
        DriverManager driverManager = new DriverManager();
        WebDriver webDriver = driverManager.initOrGetDriver();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", deliveryAndPaymentBtn);

        return getInstance();
    }

}

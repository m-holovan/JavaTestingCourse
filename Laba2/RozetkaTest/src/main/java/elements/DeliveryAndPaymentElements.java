package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RozetkaFactory;

public class DeliveryAndPaymentElements extends RozetkaFactory {

    @FindBy(css = "a.ng-tns-c1400081795-3[href='https://help.rozetka.com.ua/p/97-dostavka/']")
    protected WebElement deliveryAndPaymentBtn;

    @FindBy(css = "div.link-logo.logo.d-flex.align-items-center.text-center.me-4")
    protected WebElement referenceCenterHeader;

    @FindBy(css = "div.head-block.d-flex.mb-4")
    protected WebElement deliveryHeader;
}

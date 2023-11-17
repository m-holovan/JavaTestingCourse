import org.testng.annotations.Test;
import pages.DeliveryAndPaymentPage;

public class DeliveryAndPaymentsPageTest {

    @Test
    void deliveryPageTest(){
        DeliveryAndPaymentPage deliveryAndPaymentPage = new DeliveryAndPaymentPage();

        deliveryAndPaymentPage.openPage();
        deliveryAndPaymentPage.checkHeader();
    }
}

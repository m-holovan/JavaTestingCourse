package pages;

import elements.MainPageElements;
import elements.ProductListElements;
import org.aeonbits.owner.ConfigFactory;
import utils.DriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;


public class ProductListPage extends ProductListElements {
    private static final DriverConfig cfg = ConfigFactory.create(DriverConfig.class);

    public static ProductListPage getInstance() {
        return new ProductListPage();
    }

    public ProductListPage inputTextInSearchField() {
        searchField.sendKeys("samsung s22");
        return getInstance();
    }

    public ProductListPage findProduct() {
        findButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getInstance();
    }

    public ProductListPage addToOrder() {
        orderButton.click();
        return getInstance();
    }

    public ProductListPage openCart() {
        cartButton.click();
        return getInstance();
    }

    public ProductListPage checkIndex() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(indexIcon.isDisplayed())
                .describedAs("Count of products icon")
                .isTrue();

        softAssertions.assertAll();
        return getInstance();
    }
}

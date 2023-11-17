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

    public ProductListPage inputSecondProductInSearchField() {
        clearSearchFieldButton.click();
        searchField.sendKeys("playstation 5");
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getInstance();
    }

    public ProductListPage openCart() {
        cartButton.click();
        return getInstance();
    }

    public ProductListPage closeCart() {
        closeCartButton.click();
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

    public ProductListPage checkTotalPrice() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(price.getText())
                .isEqualTo(totalPrice.getText());

        softAssertions.assertAll();
        return getInstance();
    }

    public ProductListPage checkTotalPriceOfTwoProducts() {
        String totalSum = "47 298₴";
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(totalPrice.getText())
                .isEqualTo(totalSum);

        softAssertions.assertAll();
        return getInstance();
    }
}

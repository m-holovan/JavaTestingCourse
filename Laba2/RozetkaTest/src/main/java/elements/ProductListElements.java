package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RozetkaFactory;

public class ProductListElements extends RozetkaFactory {
    @FindBy(css = "input.search-form__input.ng-untouched.ng-pristine.ng-valid")
    protected WebElement searchField;

    @FindBy (css = "button.button.button_color_green.button_size_medium.search-form__submit")
    protected WebElement findButton;

    @FindBy (css = "span.goods-tile__price-value")
    protected WebElement price;

    @FindBy (css = "app-buy-button.toOrder.ng-star-inserted")
    protected WebElement orderButton;

    @FindBy(css = "span.badge.badge--green.ng-star-inserted")
    protected WebElement indexIcon;

    @FindBy (css = "button.header__button.ng-star-inserted.header__button--active")
    protected WebElement cartButton;
}

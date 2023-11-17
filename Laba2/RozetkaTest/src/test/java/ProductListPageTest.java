import org.testng.annotations.Test;
import pages.ProductListPage;

public class ProductListPageTest {

    @Test
    void buyProducts(){
        ProductListPage productListPage = new ProductListPage();

        productListPage.inputTextInSearchField();
        productListPage.findProduct();
        productListPage.addToOrder();
        productListPage.checkIndex();
        productListPage.openCart();
        productListPage.checkTotalPrice();
        productListPage.closeCart();
        productListPage.inputSecondProductInSearchField();
        productListPage.findProduct();
        productListPage.addToOrder();
        productListPage.checkIndex();
        productListPage.openCart();
        productListPage.checkTotalPriceOfTwoProducts();
    }
}

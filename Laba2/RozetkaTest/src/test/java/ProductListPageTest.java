import org.testng.annotations.Test;
import pages.ProductListPage;

public class ProductListPageTest {

    @Test
    void firstTest(){
        ProductListPage productListPage = new ProductListPage();

        productListPage.inputTextInSearchField();
        productListPage.findProduct();
        productListPage.addToOrder();
        productListPage.checkIndex();
        productListPage.openCart();
    }
}

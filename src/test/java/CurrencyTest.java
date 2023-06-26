
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CurrencyTest extends BaseTest {

    @Test
    void changeCurrency() {

        HomePage homePage = new HomePage(driver);
        ProductCardPage productCardPage = new ProductCardPage(driver);

        String expectedCurrency ="€";

        homePage.clickButtonCurrency();
        homePage.clickCurrencyEur();

        Assertions.assertEquals(expectedCurrency, productCardPage.getCurrency());




    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCardPage extends AbstractObjectPage{

    @FindBy(xpath = "//strong[contains(text(),'€')]")
    private WebElement currency;

    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    public String getCurrency() {
        return currency.getText();
    }
}


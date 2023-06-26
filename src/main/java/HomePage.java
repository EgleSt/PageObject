import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractObjectPage {

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
    private WebElement ButtonLogin;

    @FindBy(xpath = "(//a[normalize-space()='Register'])[1]")
    private WebElement ButtonRegister;

    @FindBy(xpath = "//span[normalize-space()='Currency']")
    private WebElement ButtonCurrency;

    @FindBy(xpath = "//button[contains(text(),'€ Euro')]")
    private WebElement CurrencyEur;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccount() {
        myAccount.click();
    }

    public void clickButtonLogin() {
        ButtonLogin.click();
    }

    public void clickButtonRegister() {
        ButtonRegister.click();
    }

    public void clickButtonCurrency() {
        ButtonCurrency.click();

    }

    public void clickCurrencyEur(){
        CurrencyEur.click();
    }
}


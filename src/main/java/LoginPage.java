import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {

    @FindBy(css = "#input-email")
    private WebElement inputEmail;

    @FindBy(css = "#input-password")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement ButtonLogin;

    @FindBy(css = ".alert-danger")
    private WebElement warningMessage;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setInputPassword(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void clickButtonLogin() {
        ButtonLogin.click();
    }

    public String getWarningMessageText() {
        return warningMessage.getText();

    }


}

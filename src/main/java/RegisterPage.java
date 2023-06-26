import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends AbstractObjectPage {
    @FindBy(id = "input-firstname")
    private WebElement inputFirstname;
    @FindBy(id = "input-lastname")
    private WebElement inputLastname;
    @FindBy(id = "input-email")
    private WebElement inputEmail;
    @FindBy(id = "input-telephone")
    private WebElement inputTelephone;
    @FindBy(css = "#input-password")
    private WebElement inputPassword;
    @FindBy(css = "#input-confirm")
    private WebElement inputPasswordConfirm;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement iAgree;
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement Continue;
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    private WebElement warningMessage;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    public void setInputFirstname(String firstname) {
        inputFirstname.sendKeys(firstname);
    }

    public void setInputLastname(String lastname) {
        inputLastname.sendKeys(lastname);
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setInputTelephone(String telephone) {
        inputTelephone.sendKeys(telephone);

    }

    public void setInputPassword(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void setInputPasswordConfirm(String pass) {
        inputPasswordConfirm.sendKeys(pass);
    }

    public void clickAgree() {

        iAgree.click();
    }

    public void clickContinue() {
        Continue.click();
    }

    public String getWarningMessageText() {
        return warningMessage.getText();
    }
}


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    void correctWarningOnFailedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);


        String expectedWarning = "Warning: No match for E-Mail Address and/or Password.";

        homePage.clickMyAccount();
        homePage.clickButtonLogin();


        loginPage.setInputEmail("egle@gmail.com");
        loginPage.setInputPassword("pass");
        loginPage.clickButtonLogin();

        Assertions.assertEquals(expectedWarning, loginPage.getWarningMessageText());



    }
}

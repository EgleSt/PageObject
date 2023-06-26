
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RegisterTest extends BaseTest {

    @Test
    void registerUser(){
        RegisterPage registerPage = new RegisterPage(driver);
        HomePage homePage = new HomePage(driver);
        String expectedWarning = "Your Account Has Been Created!";

        homePage.clickMyAccount();
        homePage.clickButtonRegister();
        registerPage.setInputFirstname("Jonas");
        registerPage.setInputLastname("Jonaitis");
        //registerPage.setInputEmail("jonas@gmail.com");

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        registerPage.setInputEmail("username"+ randomInt +"@gmail.com");

        registerPage.setInputTelephone("370555444");
        registerPage.setInputPassword("pass");
        registerPage.setInputPasswordConfirm("pass");
        registerPage.clickAgree();
        registerPage.clickContinue();

        Assertions.assertEquals(expectedWarning, registerPage.getWarningMessageText());


    }


}

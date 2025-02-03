package Test;

import Page.Base;
import Page.Page_registerUser;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_RegisterUser extends Base {
    private WebDriver driver;
    private Page_registerUser pageRegisterUser;
    private Base base;

    public void setUp() throws Exception{
        pageRegisterUser=new Page_registerUser(driver);
        driver=pageRegisterUser.chromeDriverConnection();
        pageRegisterUser.visit("https://automationexercise.com/");
    }

    @Test
    public void RegistrarUsuario(){
        pageRegisterUser.RegisterUser();
        pageRegisterUser.EnterCredential("IsabelTest","imhiguera022487@gmail.com");
        pageRegisterUser.selectCountry("Canada");
        pageRegisterUser.AddressInformation("Isabel","Higuera","Real audiencia, quito");
        pageRegisterUser.AddressInformation2("Montreal","montreal","170130","09953228343");
        pageRegisterUser.ValidateAccountCreated();
    }


}


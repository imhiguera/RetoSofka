package Test;
import Page.Base;
import Page.Page_loginUser;
import Page.Page_registerUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_LoginUser extends Base {
    private static WebDriver driver;
    private Base base;
    private static Page_loginUser loginUser;
    private static Page_registerUser registerUser;


    public static void setUp() throws Exception{
        registerUser=new Page_registerUser(driver);
        loginUser=new Page_loginUser(driver);
        driver= registerUser.chromeDriverConnection();
        registerUser.visit("https://automationexercise.com/");
    }
    @Test
    public void LoginUser(){
        loginUser.EnterLoginCredentials("imhiguera022487@gmail.com","Isabel1987");
        loginUser.ValidateLogin();
    }




}

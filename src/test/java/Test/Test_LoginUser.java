package Test;
import Page.Base;
import Page.Page_loginUser;
import Page.Page_registerUser;
import org.openqa.selenium.WebDriver;

public class Test_LoginUser extends Base {
    private WebDriver driver;
    private Base base;
    private Page_loginUser loginUser;
    private Page_registerUser registerUser;

    public void setUp() throws Exception{
        registerUser=new Page_registerUser(driver);
        loginUser=new Page_loginUser(driver);
        driver= registerUser.chromeDriverConnection();
        registerUser.visit("https://automationexercise.com/");
    }
    public void Test(){
        loginUser.EnterLoginCredentials("imhiguera022487@gmail.com","Isabel1987");
        loginUser.ValidateLogin();
    }




}

package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_loginUser extends Base{

    @FindBy(css ="[data-qa='login-email']" ) private WebElement txLoginEmail;
    @FindBy(css ="[data-qa='login-password']" ) private WebElement txLoginPass;
    @FindBy(css ="[data-qa='login-button']" ) private WebElement btLogin;
    By loginLocator=By.linkText("Registrada como Isabel Higuera");
    public Page_loginUser(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void EnterLoginCredentials(String email,String pass){
        type("imhiguera022487@gmail.com",(By) txLoginEmail);
        type("Isabel1987",(By) txLoginPass);
        click((By) btLogin);
    }
    public void ValidateLogin(){
        if(isDisplayed(loginLocator)){
            System.out.println("Ingreso con exito");
        }

    }




}

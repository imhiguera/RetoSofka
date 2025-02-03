package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_registerUser extends Base {

    //localizadores
    By registerLinkLocator=By.linkText("Registrarse / Iniciar sesión");
    By homePageLocator=By.xpath("img[@src='static/images/home/logo.png']");
    @FindBy(css ="[data-qa='signup-name']" ) private WebElement userName;
    @FindBy(css ="[data-qa='signup-email']" ) private WebElement emailEnter;
    @FindBy(css ="[data-qa='signup-button']") private WebElement btRegister;
    @FindBy(css ="[data-qa='password']") private WebElement pass;
    @FindBy(css ="[data-qa='first_name']") private WebElement txFirstName;
    @FindBy(css ="[data-qa='last_name']") private WebElement txLastName;
    @FindBy(css ="[data-qa='address']") private WebElement txAddress;
    @FindBy(css ="[data-qa='country']") private WebElement listCountry;
    @FindBy(css ="[data-qa='state']") private WebElement txState;
    @FindBy(css ="[data-qa='city']") private WebElement txCity;
    @FindBy(css ="[data-qa='zipcode']") private WebElement txZipcode;
    @FindBy(css ="[data-qa='mobile_number']") private WebElement txmobileNumber;
    @FindBy(css ="[data-qa='create-account']") private WebElement btCreateAccount;
    @FindBy(css ="[data-qa='account-created']") private WebElement msgaccountCreated;
    @FindBy(css ="[data-qa='continue-button']") private WebElement btContinuar;


    public Page_registerUser(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void RegisterUser(){
        if(driver.findElement(homePageLocator).isDisplayed()){
            click(registerLinkLocator);
        }
    }

    public void EnterCredential(String user, String email){
        type("IsabelTest", (By) userName);
        type("imhiguera022487@gmail.com", (By) emailEnter);
        click((By) btRegister);
        type("Isabel1987",(By) pass);
    }
    public void selectCountry(String pais){
        Select dropdown = new Select(listCountry);
        dropdown.selectByVisibleText(pais);
    }
    public void AddressInformation(String nombre,String apellido, String direccion){
        type("Isabel", (By) txFirstName);
        type("Higuera",(By) txLastName);
        type("Real audiencia, quito",(By) txAddress);
    }
    public void AddressInformation2(String estado, String ciudad, String codigopostal, String telefono){
        type("Montreal", (By) txState);
        type("montreal",(By) txCity);
        type("170130",(By) txZipcode);
        type("09953228343",(By) txmobileNumber);
        click((By) btCreateAccount);
    }
    public void ValidateAccountCreated(){
        if(isDisplayed((By) msgaccountCreated)){
            System.out.println("Cuenta creda con éxito");
        }
        click((By) btContinuar);
    }




}

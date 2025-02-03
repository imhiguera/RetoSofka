package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Base {
// declaramos el objeto webdrivers
WebDriver driver;

//declaramos el constructor de la clase
    public Base(){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
//creando el metodo para la coneccion con el chrome
    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.drive","C:\\Users\\isabel.higuera\\Desktop\\Curso\\pryectos\\Automatizacion\\untitled1\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        return driver;
    }
//wrapping de los métodos de selenium que mas usamos

    //devuelve un elemento
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    //devuelve una lista de elementos
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }
    public String getText(WebElement element){
        return element.getText();

    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public Boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public void visit(String url){
        driver.get(url);
    }



}

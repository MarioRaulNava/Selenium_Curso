package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    // Elemento boton Signin

    public By byButtonSignin = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver driver)
    {
        WebElement buttonSignin = driver.findElement(byButtonSignin);
        return buttonSignin;
    }


    // eLEMENTOS iNPUT uSUARIO

    public By byinputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byinputUser);
        return inputUser;
    }

    //Elemento password

    public By byPassword = By.id("passwd");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byPassword);
        return inputPassword;
    }






}

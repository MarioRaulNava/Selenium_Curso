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


    // ELEMENTOS INPUT USUARIO

    public By byinputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byinputUser);
        return inputUser;
    }



    //3 ELEMENTO TAP WOMAN
    public By byTapWoman = By.partialLinkText("Women");
    public WebElement TapWoman(WebDriver driver)
    {
        WebElement  tapWoman = driver.findElement(byTapWoman);
        return tapWoman;
    }

    //4 ELEMENTO BOTON PRUEBA
    public By byBotonPrueba = By.xpath("test");
    public WebElement BtnPruba (WebDriver driver)
    {
        WebElement  btnPrueba= driver.findElement(byBotonPrueba);
        return btnPrueba;
    }


    //Elemento password

    public By byPassword = By.id("passwd");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byPassword);
        return inputPassword;
    }






}

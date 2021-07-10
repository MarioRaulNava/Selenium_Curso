package Features;


import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login
{
    //***********Instancias**************

    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils Utils = new SeleniumUtils();


    public void miLogin (WebDriver driver) throws Exception
    {
        // Se da clic en el boton SignIn
        Thread.sleep(2000);
        //Se da clic en el Boton Signin
        Utils.ClickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);

        //Se realiza desplazamiento hacia la parte inferior
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);
        Utils.loading(driver, 4000);

        // Se da clic y se llena el user
        Utils.ClickButton(elementsLogin.InputUser(driver));
        Utils.limpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);
        Thread.sleep(2000);

        //SE DA CLIC Y SE LLENA EL INPUT PASSWORD
        WebElement inputPassword = driver.findElement(By.id("passwd"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("test1234");
        Thread.sleep(2000);

        //SE DA CLIC EN EL BOTON SIGIN
        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        buttonSignIn.click();
        Thread.sleep(2000);
    }
}

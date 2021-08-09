package Features;

import Common.BaseTest;
import Utils.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Alertas extends BaseTest
{
    //******** Instancias *****************
    WebDriverWait wait;
    SeleniumUtils Utils = new SeleniumUtils();

    @Test
    public void alerts () throws Exception
    {
        // Instancia de objeto JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Aceptar Alerta
        js.executeScript("alert('Un mensaje para el amigo Vic que no baila pero como toma');");
        wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.alertIsPresent());
        Utils.loading(driver,5000);
    /*    driver.switchTo().alert().accept();
        Utils.loading(driver,3000);
    */
        // DISMIS Alerta ---> Lo que hace esta funcion es cancelar las alertas, se cumple cuando existe un boton cancelar, salir
        String Alert = driver.switchTo().alert().getText();
        System.out.println("El Texto es: " + Alert);
        driver.switchTo().alert().dismiss();



    }

}

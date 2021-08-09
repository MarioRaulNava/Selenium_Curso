package Common;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseTest
{
    //***********INSTANCIAS************
    protected static WebDriver driver = null;
    Login login = new Login();


    @BeforeTest
    public void Login () throws Exception

    {
    //Crear driver
    driver = Config.navegadorFirefox();

    // Maximizar ventana
    driver.manage().window().maximize();

    // La funcion "driver.get" Nos sirve para mandar la Url al navegador
    driver.get(Config.URL_QA);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // por medio del objeto "Login", mandamos traer (Instanciamos) el proceso de iniciar session
    login.miLogin(driver);
    }


    @AfterTest
    public void tearDown()
    {
        //La funcion "Drive.quit" nos sirve para cerrar el navegador
        driver.quit();
     }

}

package Common;


import Features.Login;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest
{
    //***********INSTANCIAS************
    protected static WebDriver driver = null;
    Login login = new Login();


    @Before
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


    @After
    public void tearDown()
    {
        //La funcion "Drive.quit" nos sirve para cerrar el navegador
        driver.quit();
     }

}

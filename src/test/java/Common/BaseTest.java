package Common;


import Features.Login;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest
{
    //***********INSTANCIAS************
    public static WebDriver driver = null;
    Login login = new Login();


    @Before
    public void Login () throws Exception

    {
    //Crear driver
    driver = Config.navegadorChrome();

    // Maximizar ventana
    driver.manage().window().maximize();

    // La funcion "driver.get" Nos sirve para mandar la Url al navegador
    driver.get(Config.URL_QA);

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

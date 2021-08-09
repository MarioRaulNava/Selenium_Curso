package Features;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MiPrimerTestDos
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        //Se coloca la direccion del driver, sea chrome, sea mozilla o edge.
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        //Crea la instancia del navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Envia la direccion del sistema al navegador
        driver.get("https://www.amazon.com/");

    }


/*@Test
public void TestAmazon  () throws InterruptedException
{

    WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
    inputBusqueda.click();
    inputBusqueda.sendKeys("Alexa");
    inputBusqueda.submit();
    Thread.sleep(4000);

}*/

    @Test
    public void UsoXpath ()  throws InterruptedException
    {
        //Este xpath es absoluto, por buenas practicas no se debe utilizar
    /*WebElement bottonCompras = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[5]/div[2]/span[2]"));
    bottonCompras.click();
    Thread.sleep(5000);*/

        //Utilizando xpath con tag (tag: span, img, button, input, select)y un atributo
    /*WebElement buttonCompras = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
    buttonCompras.click();
    Thread.sleep(5000);*/

        //Utilizando xpath por contains usando "*", el asterisco se puede reemplazar por el tag o tipo de elemento
    /*WebElement cuentasYListas = driver.findElement(By.xpath("//*[contains(text(), 'Cuenta y Listas')]"));
    cuentasYListas.click();
    Thread.sleep(5000);*/

        //Uso de xpath con multiple atributo
    /*WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
    inputBusqueda.click();
    inputBusqueda.clear();
    inputBusqueda.sendKeys("Celulares");
    inputBusqueda.submit();

    Thread.sleep(5000);*/

        //Uso de xpath por relation Ship
        WebElement inputBusqueda = driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();
        Thread.sleep(5000);
    }


    @After
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }
}

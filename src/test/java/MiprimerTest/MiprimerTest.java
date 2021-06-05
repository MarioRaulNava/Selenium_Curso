package MiprimerTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiprimerTest

{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        // Se coloca la direccion del driver, sa chrome, mozilla o edge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        // Crea la instancia del navegador
        driver = new ChromeDriver();

        // maximiza el navegador
        driver. manage().window().maximize();

        //Envia la direccion del sistema al navegador
        driver.get("https://www.amazon.com/");
    }

     @Test
    public void TestAmazon () throws InterruptedException
    {
        WebElement InputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        InputBusqueda.click();
        InputBusqueda.sendKeys("Alexa");
        // InputBusqueda.submit();                              // Submit es como enter
        Thread.sleep(4000);
        WebElement BottonLupa = driver.findElement(By.id("nav-search-submit-button"));
        BottonLupa.click();
        Thread.sleep(4000);
    }


    @Test

    public void UsoXpath()  throws InterruptedException
    {
        //Este xpath es absoluto por lo que no se debe de considerar
        /* WebElement buttonCompras = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div[3]/div/a[4]/div[2]/span[2]\n"));
                buttonCompras.click();
        Thread.sleep(5000);
        
        */


        WebElement buttonCompras = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        buttonCompras.click();
        Thread.sleep(5000);
    }


    @After
    public void tearDown()       //nombre del Cierre de navegador
    {
        // Cierra el navegador
        driver.quit();
    }



}

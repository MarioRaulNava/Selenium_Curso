package TareaAutomation;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TareaUno
{
    private WebDriver driver;

    @Before
    public void setUp()
    {
        //Se coloca la direccion del driver, sea chrome, sea mozilla o edge desde el SRC donde se descargo el driver.
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        driver = new ChromeDriver();                            //Crea la instancia del navegador

        driver.manage().window().maximize();                    //Maximiza el navegador

        driver.get("http://automationpractice.com//");         //Envia la direccion del sistema al navegador
    }

    @Test
    public void TestPractices () throws InterruptedException      //InterruptedException es para que tome los segundos de espera
    {

        WebElement inputLogin = driver.findElement(By.xpath("//div//nav//div[@class='header_user_info']"));  //Fucking Div me hizo perder tiempo
        inputLogin.click();                                        // Es la accion que se dara al elemento
        Thread.sleep (10000);                             // Aqui despues de 5 segundos duerme la pantalla y cierra

        WebElement inputEmail = driver.findElement(By.xpath("//div//form//input[@id='email']"));           // Ingreso de campo de Email
        inputEmail.click();
        inputEmail.sendKeys("Raul");
        inputEmail.submit();
        Thread.sleep(3000);

        WebElement inputPass = driver.findElement(By.xpath("//span//input[@id='passwd']"));           // Ingreso de campo de Password
        inputPass.click();
        inputPass.sendKeys("Raul");
        inputPass.submit();
        Thread.sleep(3000);

        WebElement inputSignin = driver.findElement(By.xpath("//form//button[@class='btn btn-default button-search']"));           // Ingreso de campo de SigIn
        inputSignin.click();
        Thread.sleep(10000);





        WebElement inputLoginUno = driver.findElement(By.xpath("//div//nav//div[@class='header_user_info']"));  //Fucking Div me hizo perder tiempo
        inputLoginUno.click();                                        // Es la accion que se dara al elemento
        Thread.sleep (10000);                             // Aqui despues de 5 segundos duerme la pantalla y cierra

        WebElement inputEmailUno = driver.findElement(By.xpath("//div//form//input[@id='email']"));           // Ingreso de campo de Email
        inputEmailUno.click();
        inputEmailUno.sendKeys("");
        inputEmailUno.submit();
        Thread.sleep(3000);

        WebElement inputPassUno = driver.findElement(By.xpath("//span//input[@id='passwd']"));           // Ingreso de campo de Password
        inputPassUno.click();
        inputPassUno.sendKeys("Raul");
        inputPassUno.submit();
        Thread.sleep(3000);

        WebElement inputSigninUno = driver.findElement(By.xpath("//form//button[@class='btn btn-default button-search']"));           // Ingreso de campo de SigIn
        inputSigninUno.click();
        Thread.sleep(20000);





    }

    @After
    public void CloseBrowser()
    {
       driver.quit();     //Cierra el navegador
    }

}

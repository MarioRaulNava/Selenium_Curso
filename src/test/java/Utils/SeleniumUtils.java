package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class SeleniumUtils
{
    WebDriver driver;
    public void ClickButton(WebElement element)
    {
        element.click();
    }

    public void LimpiarInput(WebElement element)
    {
        element.clear();
    }

    public void limpiarYLlenarInput(WebElement input, String data)
    {
        LimpiarInput(input);
        input.sendKeys(data);
    }

    public void  loading (WebDriver driver, int timeMiliseconds) throws Exception
    {
        Thread.sleep(timeMiliseconds);
    }

    public WebElement waitElement (WebDriver driver, By locator)
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3));

        WebElement elemento = wait.until(new Function<WebDriver, WebElement>()
        {

            public WebElement apply(WebDriver driver)
            {
                try {
                    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

                } catch (NoSuchElementException nsee)
                {

                throw new TimeoutException("NoSuchElementException: Locator not found" + locator);
                }
            }
        });
        return null;
    }

}

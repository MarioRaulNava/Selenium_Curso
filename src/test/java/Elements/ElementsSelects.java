package Elements;

import Common.BaseTest;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsSelects
{
    // 1 Element Tap Women
    public By byTapWoman = By.xpath("//a[@title='Women']");
    public WebElement TapWoman(WebDriver driver)
    {
        WebElement tapWoman = driver.findElement(byTapWoman);
        return tapWoman;
    }

    // 2 Element Boton mas tops
    public By bybottonMasTops = By.xpath("//div/ul/li[1]/span[@class='grower CLOSE'] ");
    public WebElement BottonMasTops (WebDriver driver)
    {
        WebElement bottonMasTops = driver.findElement(bybottonMasTops);
        return bottonMasTops;
    }

    // 3 Element boton T Shirt
    public By bybottonTSshirts = By.xpath("//div/ul/li[1]/ul/li[1]/a[contains(text(), 'T-shirts')]");
    public WebElement BottonTSshirts (WebDriver driver)
    {
        WebElement bottonTSshirts = driver.findElement(bybottonTSshirts);
        return bottonTSshirts;
    }

    // 4 Element Lista desplegable
    public By bySelectSort = By.id("selectProductSort");
    public WebElement SelectSort (WebDriver driver)
    {
        WebElement selectSort = driver.findElement(bySelectSort);
        return selectSort;
    }
}

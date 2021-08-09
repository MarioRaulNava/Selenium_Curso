package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selects extends BaseTest

{

    //************* Intancias ************
    SeleniumUtils utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void listaconClicks () throws Exception
    {
        // Se valida la presencia del elemento
        utils.waitElement(driver, elementsSelects.byTapWoman);

        // Se da click en el elemento
        utils.ClickButton(elementsSelects.TapWoman(driver));
        utils.loading(driver,3000);

        // Se valida la presencia del elemento mas la opcion de tops
        utils.waitElement(driver,elementsSelects.bybottonMasTops);

        // Se da clic en el elemento opcion Tops
        utils.ClickButton(elementsSelects.BottonMasTops(driver));
        utils.loading(driver, 2000);

        // Se valida la presencia del elemento T shirts
        utils.waitElement(driver,elementsSelects.bybottonTSshirts);

        //Se da clic en el elemento T shirts
        utils.ClickButton(elementsSelects.BottonTSshirts(driver));


        //*********** Seleccionar opciones de una lista con clicks **********
        /* Esta Opcion por buenas practicas no se utiliza pero la conocemos */

        //Se valida la presencia del elemnto "lista Sort"
        utils.waitElement(driver, elementsSelects.bySelectSort);

        //Se da clic en el elemento o Lista Sort
        utils.ClickButton(elementsSelects.SelectSort(driver));
        utils.loading(driver,2000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        utils.loading(driver,3000);
    }


    @Test
        public void listaConSendKeys() throws Exception
    {
        //1 Se valida la presencia del elemento
        utils.waitElement(driver, elementsSelects.byTapWoman);

        //2 Se da click en el elemento
        utils.ClickButton(elementsSelects.TapWoman(driver));
        utils.loading(driver,3000);

        //3 Se valida la presencia del elemento mas la opcion de tops
        utils.waitElement(driver,elementsSelects.bybottonMasTops);

        //4 Se da clic en el elemento opcion Tops
        utils.ClickButton(elementsSelects.BottonMasTops(driver));
        utils.loading(driver, 2000);

        //5 Se valida la presencia del elemento T shirts
        utils.waitElement(driver,elementsSelects.bybottonTSshirts);

        //6 Se da clic en el elemento T shirts
        utils.ClickButton(elementsSelects.BottonTSshirts(driver));


        //**************Manejo de Listas con SendKeys***************
        // Esta opcion es aceptable

        utils.waitElement (driver, elementsSelects.bySelectSort);
        utils.loading(driver, 2000);

        String opcionEsperada = "Product Name: A to Z";
        elementsSelects.SelectSort(driver).sendKeys(opcionEsperada);
        utils.loading(driver, 3000);

    }

    @Test
    public void ListaUsandoClase () throws Exception
    {
        //1 Se valida la presencia del elemento
        utils.waitElement(driver, elementsSelects.byTapWoman);

        //2 Se da click en el elemento
        utils.ClickButton(elementsSelects.TapWoman(driver));
        utils.loading(driver,3000);

        //3 Se valida la presencia del elemento mas la opcion de tops
        utils.waitElement(driver,elementsSelects.bybottonMasTops);

        //4 Se da clic en el elemento opcion Tops
        utils.ClickButton(elementsSelects.BottonMasTops(driver));
        utils.loading(driver, 2000);

        //5 Se valida la presencia del elemento T shirts
        utils.waitElement(driver,elementsSelects.bybottonTSshirts);

        //6 Se da clic en el elemento T shirts
        utils.ClickButton(elementsSelects.BottonTSshirts(driver));

        //*************** manejo de listas con clase select *********
        //Opcion recomendada

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        utils.loading(driver, 1000);

        utils.waitElement(driver,elementsSelects.bySelectSort);
        utils.loading(driver,1000);
        String opcionEsperada = "In stock";
        elementsSelects.SelectSort(driver);
        Select selectlista = new Select(elementsSelects.SelectSort(driver));

        selectlista.selectByVisibleText(opcionEsperada);



    }

}

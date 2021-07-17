package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selects extends BaseTest

{

    //************* Intancias ************
    SeleniumUtils utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void listaconClicks () throws Exception
    {
        // Se valida la presencia del elemento
        utils.waitElement(driver, elementsSelects.TapWoman(driver),elementsSelects.byTapWoman);

        // Se da click en el elemento
        utils.ClickButton(elementsSelects.TapWoman(driver));
        utils.loading(driver,3000);

        // Se valida la presencia del elemento mas la opcion de tops
        utils.waitElement(driver,elementsSelects.BottonMasTops(driver),elementsSelects.bybottonMasTops);

        // Se da clic en el elemento opcion Tops
        utils.ClickButton(elementsSelects.BottonMasTops(driver));
        utils.loading(driver, 2000);

        // Se valida la presencia del elemento T shirts
        utils.waitElement(driver,elementsSelects.BottonTSshirts(driver),elementsSelects.bybottonTSshirts);

        //Se da clic en el elemento T shirts
        utils.ClickButton(elementsSelects.BottonTSshirts(driver));


        //*********** Seleccionar opciones de una lista con clicks **********
        /* Esta Opcion por buenas practicas no se utiliza pero la conocemos */

        //Se valida la presencia del elemnto "lista Sort"
        utils.waitElement(driver, elementsSelects.SelectSort(driver), elementsSelects.bySelectSort);

        //Se da clic en el elemento o Lista Sort
        utils.ClickButton(elementsSelects.SelectSort(driver));
        utils.loading(driver,2000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        utils.loading(driver,3000);



    }

}

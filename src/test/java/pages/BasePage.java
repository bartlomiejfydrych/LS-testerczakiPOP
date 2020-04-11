package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Konstruktor
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    //Metoda czekająca na element
    public void waitVisibility(By element){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    //Metoda na kliknięcie
    public void click(By element){
        waitVisibility(element);
        driver.findElement(element).click();
    }

    //Metoda na napisanie tekstu
    public void writeText(By element, String text){
        waitVisibility(element);
        driver.findElement(element).sendKeys(text);
    }

    //Metoda na odczytanie tekstu
    public String readText(By element){
        waitVisibility(element);
        return driver.findElement(element).getText();
    }

    //Asercja
    public void assertEquals(By element, String expectedText){
        waitVisibility(element);
        Assert.assertEquals(readText(element), expectedText);
    }
}

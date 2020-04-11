package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Konstruktor
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,5);
    }

    //Wspólne WebElementy dla wszystkich stron
    @FindBy(css = "[href=\"/\"]") WebElement naglowek;

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

    //Metoda na powrót do GlownaPage
    public GlownaPage returnToGlownaPage(){
        naglowek.click();
        return new GlownaPage(driver);
    }

    //Asercja
    public void assertEquals(By element, String expectedText){
        waitVisibility(element);
        Assert.assertEquals(readText(element), expectedText);
    }
}

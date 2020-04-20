package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NiestandardoweListyPage extends BasePage {

    public NiestandardoweListyPage(WebDriver driver) {
        super(driver);
    }

    //String niestandardoweListyURL = "http://testerczaki.pl/listy";

    // Elementy zadania 1:
    @FindBy(css = "button:first-of-type") WebElement z1wybierzButton;
    @FindBy(css = ".show > a:nth-child(3)") WebElement z1element3;
    @FindBy(id = "alert1") WebElement z1alert;
    // Elementy zadania 2:
    @FindBy(css = "button#dropdown_coins") WebElement z2wybierzButton;
    @FindBy(id = "search2") WebElement wyszukajInput;
    @FindBy(css = "[value=\"Element 2\"]") WebElement z2element2;
    @FindBy(id = "alert2") WebElement z2alert;

    // Metody zadania 1:
    public void z1kliknijWybierzButton(){
        z1wybierzButton.click();
    }
    public void z1kliknijElement3(){
        z1element3.click();
    }
    public void z1sprawdzAlert(){
        Assert.assertTrue(z1alert.isDisplayed());
    }
    // Metody zadania 2:
    public void z2kliknijWybierzButton(){
        z2wybierzButton.click();
    }
    public void z2wyszukajTekst(){
        wyszukajInput.sendKeys("Element 2");
    }
    public void z2kkliknijElement2(){
        z2element2.click();
    }
    public void z2sprawdzAlert(){
        Assert.assertTrue(z2alert.isDisplayed());
    }
}

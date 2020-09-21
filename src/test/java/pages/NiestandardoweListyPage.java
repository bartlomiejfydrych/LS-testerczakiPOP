package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NiestandardoweListyPage extends BasePage {

    public NiestandardoweListyPage(WebDriver driver) {
        super(driver);
    }

    //String niestandardoweListyURL = "http://dawidkaruga.pl/testerczaki/listy";

    // Elementy zadania 1:
    @FindBy(css = "button:first-of-type") WebElement z1wybierzButton;
    @FindBy(css = ".dropdown-menu > a") List<WebElement> z1elementy;
    @FindBy(id = "alert1") WebElement z1alert;
    // Elementy zadania 2:
    @FindBy(css = "button#dropdown_coins") WebElement z2wybierzButton;
    @FindBy(id = "search2") WebElement wyszukajInput;
    @FindBy(css = "#menuItems > input") List<WebElement> z2elementy;
    @FindBy(id = "alert2") WebElement z2alert;

    // Metody zadania 1:
    public void z1kliknijWybierzButton(){
        z1wybierzButton.click();
    }
    public void z1kliknijElement(int index){
        z1elementy.get(index).click();
    }
    public void z1sprawdzAlert(){
        Assert.assertTrue(z1alert.isDisplayed());
    }
    // Metody zadania 2:
    public void z2kliknijWybierzButton(){
        z2wybierzButton.click();
    }
    public void z2wyszukajTekst(String Element){
        wyszukajInput.sendKeys(Element);
    }
    public void z2kliknijElement(int index){
        z2elementy.get(index).click();
    }
    public void z2sprawdzAlert(){
        Assert.assertTrue(z2alert.isDisplayed());
    }
}

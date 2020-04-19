package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class KliknijPrzytrzymajPage extends BasePage {

    public KliknijPrzytrzymajPage(WebDriver driver) {
        super(driver);
    }

    String kliknijPrzytrzymajURL = "http://testerczaki.pl/mysz";

    // Elementy zadania 1:
    @FindBy(id = "contextClick") WebElement z1prawyPrzycisk;
    @FindBy(css = ".list-group> li:nth-child(2)") WebElement z1opcja2;
    @FindBy(id = "alert1") WebElement z1alert;
    // Elementy zadania 2:
    @FindBy(id = "holdClick") WebElement z2przytrzymajPrzycisk;
    @FindBy(id = "alert2") WebElement z2alert;

    Actions actions = new Actions(driver);

    // Metody zadania 1:
    public void sprawdzAlert1(){
        Assert.assertTrue(z1alert.isDisplayed());
    }
    public void kliknijPrawym(){
        actions.contextClick(z1prawyPrzycisk).perform();
    }
    public void kliknijOpcje2(){
        z1opcja2.click();
    }
    // Metody zadania 2:
    public void sprawdzAlert2(){
        Assert.assertTrue(z2alert.isDisplayed());
    }
    public void przytrzymajPrzycisk(){
        actions.clickAndHold(z2przytrzymajPrzycisk).pause(3100).release().perform();
    }
}

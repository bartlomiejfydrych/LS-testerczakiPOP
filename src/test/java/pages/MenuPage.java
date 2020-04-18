package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    //String menuURL = "http://testerczaki.pl/menu";

    // Elementy zadania 1:
    @FindBy(css = ".navbar-expand> .collapse > .navbar-nav > a:nth-child(2)") WebElement z1link2;
    @FindBy(id = "alert1") WebElement z1alert;
    // Elementy zadania 2:
    @FindBy(className = "m-2") WebElement z2rozwinButton;
    @FindBy(css = "#navbarNavAltMarkup > .navbar-nav > a:nth-child(3)") WebElement z2link3;
    @FindBy(id = "alert2") WebElement z2alert;
    // Elementy zadania 3:
    @FindBy(css = "[role=\"button\"]") WebElement z3link3;
    @FindBy(css = ".show > a:nth-child(3)") WebElement z3link3_c;
    @FindBy(id = "alert3") WebElement z3alert;
    // Elementy zadania 4:
    @FindBy(xpath = "(//a[contains(@class,\"dropdown-toggle\")])[2]") WebElement z4link3;
    @FindBy(xpath = "(//div[contains(@class,\"dropdown-menu\")])[2]/a[2]") WebElement z4link3_b;
    @FindBy(id = "alert4") WebElement z4alert;
    // Elementy zadania 5:
    @FindBy(xpath = "(//a[contains(@class,\"dropdown-toggle\")])[3]") WebElement z5link3;
    @FindBy(className = "hover2nd") WebElement z5link3_b;
    @FindBy(css = ".dropdown2nd > a:nth-child(1)") WebElement z5link3_b1;
    @FindBy(css = ".dropdown2nd > a:nth-child(5)") WebElement z5link3_b5;
    @FindBy(id = "alert5") WebElement z5alert;

    Actions action = new Actions(driver);

    // Metody zadania 1:
    public void z1kliknijLink2(){
        z1link2.click();
    }
    public void z1sprawdzAlert(){
        Assert.assertTrue(z1alert.isDisplayed());
    }
    // Metody zadania 2:
    public void z2rozwinListe(){
        z2rozwinButton.click();
    }
    public void z2kliknijLink3(){
        z2link3.click();
    }
    public void z2sprawdzAlert(){
        Assert.assertTrue(z2alert.isDisplayed());
    }
    // Metody zadania 3:
    public void z3kliknijListe(){
        z3link3.click();
    }
    public void z3kliknijLink3_c(){
        z3link3_c.click();
    }
    public void z3sprawdzAlert(){
        Assert.assertTrue(z3alert.isDisplayed());
    }
    // Metody zadania 4:
    public void z4kliknijLink3_b(){
        action.moveToElement(z4link3)
                .moveToElement(z4link3_b).click().perform();
    }
    public void z4sprawdzAlert(){
        Assert.assertTrue(z4alert.isDisplayed());
    }
    // Metody zadania 5:
    public void z5kliknijLink3_b5(){
        action.moveToElement(z5link3)
                .moveToElement(z5link3_b)
                .moveToElement(z5link3_b1)
                .moveToElement(z5link3_b5).click().perform();
    }
    public void z5sprawdzAlert(){
        Assert.assertTrue(z5alert.isDisplayed());
    }
}

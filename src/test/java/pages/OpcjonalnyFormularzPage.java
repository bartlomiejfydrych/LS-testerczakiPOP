package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpcjonalnyFormularzPage extends BasePage {

    public OpcjonalnyFormularzPage(WebDriver driver) {
        super(driver);
    }

    //String opcjonalnyFormularzURL = "http://dawidkaruga.pl/testerczaki/opcjonalny";

    @FindBy(id = "firstName") WebElement imieInput;
    @FindBy(id = "lastName") WebElement nazwiskoInput;
    @FindBy(id = "email") WebElement emailInput;
    @FindBy(css = "label[for=\"add\"]") WebElement dodatkowePolaCheckbox;
    @FindBy(id = "city") WebElement miastoInput;
    @FindBy(id = "street") WebElement ulicaInput;
    @FindBy(id = "submit") WebElement wyslijButton;
    @FindBy(id = "alert") WebElement gratulacjeAlert;

    public void wpiszImie(String imie){
        imieInput.sendKeys(imie);
    }
    public void wpiszNazwisko(String nazwisko){
        nazwiskoInput.sendKeys(nazwisko);
    }
    public void wpiszEmail(String email){
        emailInput.sendKeys(email);
    }
    public void zaznaczDodatkowePola(){
        dodatkowePolaCheckbox.click();
    }
    public void wpiszMiasto(String miasto){
        wait.until(ExpectedConditions.visibilityOf(miastoInput));
        miastoInput.sendKeys(miasto);
    }
    public void wpiszUlica(String ulica){
        wait.until(ExpectedConditions.visibilityOf(ulicaInput));
        ulicaInput.sendKeys(ulica);
    }
    public void wyslijDane(){
        wyslijButton.click();
    }
    public void sprawdzAlert(){
        Assert.assertTrue(gratulacjeAlert.isDisplayed());
    }
}
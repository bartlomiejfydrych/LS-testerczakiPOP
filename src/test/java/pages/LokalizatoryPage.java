package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class LokalizatoryPage extends BasePage {

    public LokalizatoryPage(WebDriver driver) {
        super(driver);
    }

    //String lokalizatoryURL = "http://dawidkaruga.pl/testerczaki/lokalizatory";

    @FindBy(className = "firstName") WebElement imieInput;
    @FindBy(css = "[placeholder=\"Nazwisko\"]") WebElement nazwiskoInput;
    @FindBy(className = "custom-select") WebElement krajSelect;
    @FindBy(css = "select.form-control") WebElement jezykSelect;
    @FindBy(css = "textarea.form-control") WebElement oSobieInput;
    @FindBy(className = "form-control-file") WebElement plikZalacznik;

    //Płeć
    @FindBy(css = "div.mb-3 > div.custom-radio:nth-of-type(1)>.custom-control-label") WebElement mezczyznaRadio;
    @FindBy(css = "div.mb-3>div.custom-radio:nth-of-type(2)>.custom-control-label") WebElement kobietaRadio;
    @FindBy(css = "div.mb-3>div.custom-radio:nth-of-type(3)>.custom-control-label") WebElement inneRadio;

    @FindBy(css = ".custom-checkbox>.custom-control-label") WebElement regulaminCheckbox;
    @FindBy(css = "[type=\"submit\"]") WebElement wyslijButton;
    @FindBy(className = "alert-success") WebElement gratulacjeAlert;

    public void wpiszImie(String imie) {
        imieInput.sendKeys(imie);
    }
    public void wpiszNazwisko(String nazwisko) {
        nazwiskoInput.sendKeys(nazwisko);
    }

    public void wybierzKraj(String krajNazwa) {
        Select kraj = new Select(krajSelect);
        kraj.selectByVisibleText(krajNazwa);
    }

    public void wybierzJezyk(String... jezyki) {
        Select jezyk = new Select(jezykSelect);
        for ( String jezykNazwa : jezyki ) {
            jezyk.selectByVisibleText(jezykNazwa);
        }
    }

    public void wpiszSobie(String tekst) {
        oSobieInput.sendKeys(tekst);
    }

    public void wyslijPlik() {
        String textTest = new File("src/test/resources/TextTest.txt").getAbsolutePath();
        plikZalacznik.sendKeys(textTest);
    }

    public void wybierzPlec(String plec) throws Exception {
        switch (plec) {
            case "Mężczyzna":
                mezczyznaRadio.click();
                break;
            case "Kobieta":
                kobietaRadio.click();
                break;
            case "Inne":
                inneRadio.click();
                break;
            default:
                throw new Exception("Źle podana płeć.");
        }
    }

    public void akceptujRegulamin() {
        regulaminCheckbox.click();
    }
    public void wyslijDane() {
        wyslijButton.click();
    }
    public void sprawdzAlert() {
        Assert.assertTrue(gratulacjeAlert.isDisplayed());
    }
}
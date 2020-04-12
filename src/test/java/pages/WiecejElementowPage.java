package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class WiecejElementowPage extends BasePage {

    public WiecejElementowPage(WebDriver driver) {
        super(driver);
    }

    String wiecejElementowURL = "http://testerczaki.pl/wiecej";

    @FindBy(id = "firstName") WebElement imieInput;
    @FindBy(id = "lastName") WebElement nazwiskoInput;
    @FindBy(id = "country") WebElement krajSelect;
    @FindBy(id = "lang") WebElement jezykSelect;
    @FindBy(id = "about") WebElement oSobieInput;
    @FindBy(id = "file") WebElement plikZalacznik;

    //Płeć
    @FindBy(id = "male") WebElement mezczyznaRadio;
    @FindBy(id = "female") WebElement kobietaRadio;
    @FindBy(id = "other") WebElement inneRadio;

    @FindBy(id = "rules") WebElement regulaminCheckbox;
    @FindBy(id = "submit") WebElement wyslijButton;
    @FindBy(className = ".alert-success") WebElement gratulacjeAlert;

    public void wpiszImie(String imie){
        imieInput.sendKeys(imie);
    }
    public void wpiszNazwisko(String nazwisko){
        nazwiskoInput.sendKeys(nazwisko);
    }
    public void wybierzKraj(String krajNazwa){
        Select kraj = new Select(krajSelect);
        kraj.selectByVisibleText(krajNazwa);
    }
    public void wybierzJezyk(String jezykNazwa){
        Select jezyk = new Select(jezykSelect);
        jezyk.selectByVisibleText(jezykNazwa);
    }
    public void wpiszSobie(String tekst){
        oSobieInput.sendKeys(tekst);
    }
    public void wyslijPlik(){
        String textTest = new File("src/test/resources/TextTest.txt").getAbsolutePath();
        plikZalacznik.sendKeys(textTest);
    }
    public void wybierzPlec(String plec){
        switch (plec){
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
                System.out.println("Źle podana płeć.");
        }
    }

//    public void wybierzPlec(String plec){
//        if(plec.equals("Mężczyzna")){
//            mezczyznaRadio.click();
//        }
//        else if(plec.equals("Kobieta")){
//            kobietaRadio.click();
//        }
//        else if(plec.equals("Inne")){
//            inneRadio.click();
//        }
//        else{
//            System.out.println("Podano złą płeć.");
//        }
//    }

    public void akceptujRegulamin(){
        regulaminCheckbox.click();
    }
    public void wyslijDane(){
        wyslijButton.click();
    }
    public void sprawdzAlert(){
        Assert.assertTrue(gratulacjeAlert.isDisplayed());
    }
}

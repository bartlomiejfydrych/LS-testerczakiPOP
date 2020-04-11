package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PodstawyPage extends BasePage {

    public PodstawyPage(WebDriver driver){
        super(driver);
    }

    String podstawyURL = "http://testerczaki.pl/podstawy";

    @FindBy(id = "firstName") WebElement imieInput;
    @FindBy(id = "lastName") WebElement nazwiskoInput;
    @FindBy(id = "email") WebElement emailInput;
    @FindBy(id = "city") WebElement miastoInput;
    @FindBy(id = "street") WebElement ulicaInput;
    @FindBy(id = "rules") WebElement regulaminCheckbox;
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
    public void wpiszMiasto(String miasto){
        miastoInput.sendKeys(miasto);
    }
    public void wpiszUlica(String ulica){
        ulicaInput.sendKeys(ulica);
    }
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

package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WiecejRamekPage extends BasePage {

    public WiecejRamekPage(WebDriver driver) {
        super(driver);
    }

    //String wiecejRamekURL = "http://testerczaki.pl/ramki";

    @FindBy(css = "[src=\"/iframe2.php\"]") WebElement iframe2;
    @FindBy(css = "[src=\"/iframe3.php\"]") WebElement iframe3;
    @FindBy(css = "[src=\"/iframe4.php\"]") WebElement iframe4;
    @FindBy(css = "[src=\"/iframe5.php\"]") WebElement iframe5;
    @FindBy(id = "firstName") WebElement imieInput;
    @FindBy(id = "lastName") WebElement nazwiskoInput;
    @FindBy(id = "email") WebElement emailInput;
    @FindBy(id = "city") WebElement miastoInput;
    @FindBy(id = "street") WebElement ulicaInput;
    @FindBy(id = "rules") WebElement regulaminCheckbox;
    @FindBy(id = "submit") WebElement wyslijButton;
    @FindBy(id = "alert") WebElement gratulacjeAlert;

    public void przejdzDoIframe2(){
        driver.switchTo().frame(iframe2);
    }
    public void przejdzDoIframe3(){
        driver.switchTo().frame(iframe3);
    }
    public void przejdzDoIframe4(){
        driver.switchTo().frame(iframe4);
    }
    public void przejdzDoIframe5(){
        driver.switchTo().frame(iframe5);
    }
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
    public void wrocDoDomyslnegoOkna(){
        driver.switchTo().defaultContent();
    }
}

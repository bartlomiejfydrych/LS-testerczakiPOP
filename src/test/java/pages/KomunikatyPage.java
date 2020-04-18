package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KomunikatyPage extends BasePage {

    public KomunikatyPage(WebDriver driver) {
        super(driver);
    }

    //String komunikatyURL = "http://testerczaki.pl/komunikaty";

    @FindBy(id = "msg") WebElement komunikatInput;
    @FindBy(id = "msgBtn") WebElement wyswietlKomunikatButton;
    @FindBy(id = "submit") WebElement sprawdzKomunikatButton;
    @FindBy(id = "alert") WebElement gratulacjeAlert;
    Alert alert = przejdzNaAlert();
    String tekst = pobierzTekstAlert();

    public void kliknijWyswietlKomunikat(){
        wyswietlKomunikatButton.click();
    }
    public void kliknijSprawdzKomunikat(){
        sprawdzKomunikatButton.click();
    }
    public Alert przejdzNaAlert(){
        driver.switchTo().alert();
        return null;
    }
    public void wklejKomunikat(){
        komunikatInput.sendKeys(tekst);
    }
    public String pobierzTekstAlert(){
        alert.getText();
        return null;
    }
    public void akceptujAlert(){
        alert.accept();
    }
    public void odrzucAlert(){
        alert.dismiss();
    }
    public void wyslijTekstDoAlert(String tekst){
        alert.sendKeys(tekst);
    }
    public void sprawdzPoprawnosc(){
        Assert.assertTrue(gratulacjeAlert.isDisplayed());
    }
}

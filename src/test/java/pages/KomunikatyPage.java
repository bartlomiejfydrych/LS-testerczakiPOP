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

    //String komunikatyURL = "http://dawidkaruga.pl/testerczaki/komunikaty";

    @FindBy(id = "msg") WebElement komunikatInput;
    @FindBy(id = "msgBtn") WebElement wyswietlKomunikatButton;
    @FindBy(id = "submit") WebElement sprawdzKomunikatButton;
    @FindBy(id = "alert") WebElement gratulacjeAlert;

    Alert alert;
    String tekst;

    public void przejdzNaAlert(){
        alert = driver.switchTo().alert();
    }
    public void pobierzTekstAlert(){
        tekst = alert.getText();
    }
    public void kliknijWyswietlKomunikat(){
        wyswietlKomunikatButton.click();
    }
    public void kliknijSprawdzKomunikat(){
        sprawdzKomunikatButton.click();
    }
    public void wklejKomunikat(){
        komunikatInput.sendKeys(tekst);
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

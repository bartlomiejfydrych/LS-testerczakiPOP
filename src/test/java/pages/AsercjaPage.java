package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsercjaPage extends BasePage {

    public AsercjaPage(WebDriver driver) {
        super(driver);
    }

    //String asercjaURL = "http://testerczaki.pl/asercja";

    @FindBy(id = "firstName") WebElement imieInput;
    @FindBy(id = "lastName") WebElement nazwiskoInput;
    @FindBy(id = "email") WebElement emailInput;
    @FindBy(id = "city") WebElement miastoInput;
    @FindBy(id = "rulesLabel") WebElement regulaminChceckbox;
    @FindBy(id = "submit") WebElement wyslijButton;

    public void wpiszImie(String imie){
        imieInput.sendKeys(imie);
        Assert.assertEquals(imie, imieInput.getAttribute("value"));
    }
    public void wpiszNazwisko(String nazwisko){
        nazwiskoInput.sendKeys(nazwisko);
        Assert.assertEquals(nazwisko, nazwiskoInput.getAttribute("value"));
    }
    public void wpiszEmail(String email){
        emailInput.sendKeys(email);
        Assert.assertEquals(email, emailInput.getAttribute("value"));
    }
    public void wpiszMiasto(String miasto){
        miastoInput.sendKeys(miasto);
        Assert.assertEquals(miasto, miastoInput.getAttribute("value"));
    }
    public void akceptujRegulamin(){
        regulaminChceckbox.click();
        Assert.assertTrue(regulaminChceckbox.isSelected());
    }
    public void wyslijDane(){
        wyslijButton.click();
    }
}

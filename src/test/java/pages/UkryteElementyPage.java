package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UkryteElementyPage extends BasePage {

    public UkryteElementyPage(WebDriver driver) {
        super(driver);
    }

    //String ukryteElementyURL = "http://testerczaki.pl/ukryte";

    @FindBy(css = ".container>.row:nth-of-type(3) form") WebElement poprawnyKontener;
    @FindBy(css = ".container>.row:nth-of-type(3) form #firstName") WebElement imieInput;
    @FindBy(css = ".container>.row:nth-of-type(3) form #lastName") WebElement nazwiskoInput;
    @FindBy(css = ".container>.row:nth-of-type(3) form #email") WebElement emailInput;
    @FindBy(css = ".container>.row:nth-of-type(3) form #city") WebElement miastoInput;
    @FindBy(css = ".container>.row:nth-of-type(3) form #street") WebElement ulicaInput;
    @FindBy(css = ".container>.row:nth-of-type(3) form #rules") WebElement regulaminCheckbox;
    @FindBy(css = ".container>.row:nth-of-type(3) form #submit") WebElement wyslijButton;
    @FindBy(css = ".container>.row:nth-of-type(3) form #alert") WebElement gratulacjeAlert;

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

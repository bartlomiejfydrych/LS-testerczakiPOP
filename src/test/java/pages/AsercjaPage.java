package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AsercjaPage extends PodstawyPage {

    public AsercjaPage(WebDriver driver) {
        super(driver);
    }

    //String asercjaURL = "http://testerczaki.pl/asercja";

    public void asercjeSprawdzajaceFormularz(String imie, String nazwisko, String email, String miasto){
        Assert.assertEquals(imie, imieInput.getAttribute("value"));
        Assert.assertEquals(nazwisko, nazwiskoInput.getAttribute("value"));
        Assert.assertEquals(email, emailInput.getAttribute("value"));
        Assert.assertEquals(miasto, miastoInput.getAttribute("value"));
    }

    public void asercjaSprawdzajacaRegulaminCheckbox(){
        Assert.assertTrue(regulaminCheckbox.isSelected());
    }
}
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class OknaZakladkiPage extends BasePage {

    public OknaZakladkiPage(WebDriver driver) {
        super(driver);
    }

    //String oknaZakladkiURL = "http://dawidkaruga.pl/testerczaki/okna";

    @FindBy(id = "newTab") WebElement podstawyKarta;
    @FindBy(id = "newWindow") WebElement podstawyOkno;

    public PodstawyPage otworzPodstawyNowaKarta(){
        podstawyKarta.click();
        return new PodstawyPage(driver);
    }
    public PodstawyPage otworzPodstawyNoweOkno(){
        podstawyOkno.click();
        return new PodstawyPage(driver);
    }
    public void powiekszOkno(){
        driver.manage().window().maximize();
    }
    public void przelaczKarteOkno(int numer){
        List<String> kartyOkna = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(kartyOkna.get(numer));
    }
}

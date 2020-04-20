package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TabelePage extends BasePage {

    public TabelePage(WebDriver driver) {
        super(driver);
    }

    //String tabeleURL = "http://testerczaki.pl/tabele";

    @FindBy(id = "avg") WebElement sredniaInput;
    @FindBy(id = "age") WebElement wiekInput;
    @FindBy(id = "name") WebElement imieInput;
    @FindBy(id = "submit1") WebElement sprawdzButton;
    @FindBy(id = "alert1") WebElement alert;

    String wiekJanusza = "";
    String imieWarszawiaka = "";
    double srednia = 0;
    int sum = 0;

    public void odczytajDaneTabeli(){
        List<WebElement> rows = driver.findElements(By.cssSelector("#table1 tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector("td"));
            WebElement imie = cells.get(0);
            WebElement wiek = cells.get(1);
            WebElement miasto = cells.get(2);
            sum += Integer.parseInt(wiek.getText());

            if (imie.getText().equals("Janusz")) wiekJanusza = wiek.getText();
            if (miasto.getText().equals("Warszawa")) imieWarszawiaka = imie.getText();

            double srednia = (double)sum / (double)rows.size();
        }
    }
    public void wpiszSrednia(){
        sredniaInput.sendKeys(Double.toString(srednia));
    }
    public void wpiszWiek(){
        wiekInput.sendKeys(wiekJanusza);
    }
    public void wpiszImie(){
        imieInput.sendKeys(imieWarszawiaka);
    }
    public void kliknijSprawdz(){
        sprawdzButton.click();
    }
    public void sprawdzAlert(){
        Assert.assertTrue(alert.isDisplayed());
    }
}
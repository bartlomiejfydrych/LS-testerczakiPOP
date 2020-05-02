package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RamkaPage extends BasePage {

    public RamkaPage(WebDriver driver) {
        super(driver);
    }

    //String ramkaURL = "http://testerczaki.pl/ramka";

    @FindBy(id = "frame") WebElement iframeOne;

    public void przejdzDoIframeOne(){
        driver.switchTo().frame(iframeOne);
    }
    public void wrocDoDomyslnegoOkna(){
        driver.switchTo().defaultContent();
    }
}

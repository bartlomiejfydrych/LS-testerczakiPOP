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
    public void cofnijDoParentFrame(){
        driver.switchTo().parentFrame();
    }
    public void wrocDoDomyslnegoOkna(){
        driver.switchTo().defaultContent();
    }

}

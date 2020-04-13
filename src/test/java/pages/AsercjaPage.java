package pages;

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
    
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlownaPage extends BasePage {

    //Konstruktor
    public GlownaPage(WebDriver driver) {
        super(driver);
    }

    String adresURL = "http://testerczaki.pl/";

    //Web Elementy
    @FindBy(id = "podstawy") WebElement podstawyZacznij;
    @FindBy(id = "wiecej") WebElement wiecejElementowZacznij;
    @FindBy(id = "asercja") WebElement asercjaZacznij;
    @FindBy(css = "[href=\"/lokalizatory\"]") WebElement lokalizatoryZacznij;
    @FindBy(css = "[href=\"/ukryte\"]") WebElement ukryteElementyZacznij;
    @FindBy(css = "[href=\"/opcjonalny\"]") WebElement opcjonalnyFormularzZacznij;
    @FindBy(css = "[href=\"/ramka\"]") WebElement ramkaZacznij;
    @FindBy(css = "[href=\"/ramki\"]") WebElement wiecejRamekZacznij;
    @FindBy(css = "[href=\"/okna\"]") WebElement oknaZakladkiZacznij;
    @FindBy(css = "[href=\"/komunikaty\"]") WebElement komunikatyZacznij;
    @FindBy(css = "[href=\"/menu\"]") WebElement menuZacznij;
    @FindBy(css = "[href=\"/przeciagnij\"]") WebElement przeciagnijUpuscZacznij;
    @FindBy(css = "[href=\"/mysz\"]") WebElement kliknijPrzetrzymajZacznij;
    @FindBy(css = "[href=\"/listy\"]") WebElement niestandardoweListyZacznij;
    @FindBy(css = "[href=\"/tabele\"]") WebElement tabeleZacznij;

    //Metody
    public GlownaPage goToGlownaPage(){
        driver.get(adresURL);
        return this;
    }

    public PodstawyPage goToPodstawyPage(){
        podstawyZacznij.click();
        return new PodstawyPage(driver);
    }

    public WiecejElementowPage goToWiecejElementowPage(){
        wiecejElementowZacznij.click();
        return new WiecejElementowPage(driver);
    }

    public AsercjaPage goToAsercjaPage(){
        asercjaZacznij.click();
        return new AsercjaPage(driver);
    }

    public LokalizatoryPage goToLokalizatoryPage(){
        lokalizatoryZacznij.click();
        return new LokalizatoryPage(driver);
    }

    public UkryteElementyPage goToUkryteElementyPage(){
        ukryteElementyZacznij.click();
        return new UkryteElementyPage(driver);
    }

    public OpcjonalnyFormularzPage goToOpcjonalnyFormularzPage(){
        opcjonalnyFormularzZacznij.click();
        return new OpcjonalnyFormularzPage(driver);
    }

    public RamkaPage goToRamkaPage(){
        ramkaZacznij.click();
        return new RamkaPage(driver);
    }

    public WiecejRamekPage goToWiecejRamekPage(){
        wiecejRamekZacznij.click();
        return new WiecejRamekPage(driver);
    }

    public OknaZakladkiPage goToOknaZakladkiPage(){
        oknaZakladkiZacznij.click();
        return new OknaZakladkiPage(driver);
    }

    public KomunikatyPage goToKomunikatyPage(){
        komunikatyZacznij.click();
        return new KomunikatyPage(driver);
    }

//    public GlownaPage goToPodstawyPage(){
//        podstawyZacznij.click();
//        return new PodstawyPage(driver);
//    }
//
//    public GlownaPage goToPodstawyPage(){
//        podstawyZacznij.click();
//        return new PodstawyPage(driver);
//    }

}

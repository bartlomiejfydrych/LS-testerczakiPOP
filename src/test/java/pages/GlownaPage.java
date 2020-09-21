package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlownaPage extends BasePage {

    //Konstruktor
    public GlownaPage(WebDriver driver) {
        super(driver);
    }

    String adresURL = "http://dawidkaruga.pl/testerczaki/";

    //Web Elementy
    @FindBy(id = "podstawy") WebElement podstawyZacznij;
    @FindBy(id = "wiecej") WebElement wiecejElementowZacznij;
    @FindBy(id = "asercja") WebElement asercjaZacznij;
    @FindBy(css = "[href=\"/testerczaki/lokalizatory\"]") WebElement lokalizatoryZacznij;
    @FindBy(css = "[href=\"/testerczaki/ukryte\"]") WebElement ukryteElementyZacznij;
    @FindBy(css = "[href=\"/testerczaki/opcjonalny\"]") WebElement opcjonalnyFormularzZacznij;
    @FindBy(css = "[href=\"/testerczaki/ramka\"]") WebElement ramkaZacznij;
    @FindBy(css = "[href=\"/testerczaki/ramki\"]") WebElement wiecejRamekZacznij;
    @FindBy(css = "[href=\"/testerczaki/okna\"]") WebElement oknaZakladkiZacznij;
    @FindBy(css = "[href=\"/testerczaki/komunikaty\"]") WebElement komunikatyZacznij;
    @FindBy(css = "[href=\"/testerczaki/menu\"]") WebElement menuZacznij;
    @FindBy(css = "[href=\"/testerczaki/przeciagnij\"]") WebElement przeciagnijUpuscZacznij;
    @FindBy(css = "[href=\"/testerczaki/mysz\"]") WebElement kliknijPrzetrzymajZacznij;
    @FindBy(css = "[href=\"/testerczaki/listy\"]") WebElement niestandardoweListyZacznij;
    @FindBy(css = "[href=\"/testerczaki/tabele\"]") WebElement tabeleZacznij;

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
    public MenuPage goToMenuPage(){
        menuZacznij.click();
        return new MenuPage(driver);
    }
    public PrzeciagnijUpuscPage goToPrzeciagnijUpuscPage(){
        przeciagnijUpuscZacznij.click();
        return new PrzeciagnijUpuscPage(driver);
    }
    public KliknijPrzytrzymajPage goToKliknijPrzytrzymajPage(){
        kliknijPrzetrzymajZacznij.click();
        return new KliknijPrzytrzymajPage(driver);
    }
    public NiestandardoweListyPage goToNiestandardoweListyPage(){
        niestandardoweListyZacznij.click();
        return new NiestandardoweListyPage(driver);
    }
    public TabelePage goToTabelePage(){
        tabeleZacznij.click();
        return new TabelePage(driver);
    }
}

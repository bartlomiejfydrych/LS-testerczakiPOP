package tests;

import org.junit.Test;
import pages.PodstawyPage;
import pages.WiecejRamekPage;

public class WiecejRamekTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        WiecejRamekPage wiecejRamekPage = glownaPage.goToWiecejRamekPage();
        PodstawyPage podstawyPage = new PodstawyPage(driver);
        wiecejRamekPage.przejdzDoIframe2();
        podstawyPage.wpiszImie("Bartek");
        podstawyPage.wpiszNazwisko("Bogucki");
        wiecejRamekPage.przejdzDoIframe3();
        podstawyPage.wpiszEmail("saturn993@amorki.pl");
        wiecejRamekPage.cofnijDoParentFrame();
        wiecejRamekPage.przejdzDoIframe4();
        podstawyPage.wpiszMiasto("Radom");
        wiecejRamekPage.wrocDoDomyslnegoOkna();
        wiecejRamekPage.przejdzDoIframe5();
        podstawyPage.wpiszUlica("Kochanowskiego 4a/5");
        wiecejRamekPage.wrocDoDomyslnegoOkna();
        podstawyPage.akceptujRegulamin();
        podstawyPage.wyslijDane();
        podstawyPage.sprawdzAlert();
        wiecejRamekPage.wrocDoDomyslnegoOkna();
    }
}

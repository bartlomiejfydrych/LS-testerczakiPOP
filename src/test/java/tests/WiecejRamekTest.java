package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.WiecejRamekPage;

public class WiecejRamekTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToWiecejRamekPage();
        WiecejRamekPage wiecejRamekPage = new WiecejRamekPage(driver);
        wiecejRamekPage.przejdzDoIframe2();
        wiecejRamekPage.wpiszImie("Bartek");
        wiecejRamekPage.wpiszNazwisko("Bogucki");
        wiecejRamekPage.przejdzDoIframe3();
        wiecejRamekPage.wpiszEmail("saturn993@amorki.pl");
        wiecejRamekPage.cofnijDoParentFrame();
        wiecejRamekPage.przejdzDoIframe4();
        wiecejRamekPage.wpiszMiasto("Radom");
        wiecejRamekPage.wrocDoDomyslnegoOkna();
        wiecejRamekPage.przejdzDoIframe5();
        wiecejRamekPage.wpiszUlica("Kochanowskiego 4a/5");
        wiecejRamekPage.wrocDoDomyslnegoOkna();
        wiecejRamekPage.akceptujRegulamin();
        wiecejRamekPage.wyslijDane();
        wiecejRamekPage.sprawdzAlert();
        wiecejRamekPage.wrocDoDomyslnegoOkna();
    }
}

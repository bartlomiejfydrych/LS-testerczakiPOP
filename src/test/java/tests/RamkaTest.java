package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.RamkaPage;

public class RamkaTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToRamkaPage();
        RamkaPage ramkaPage = new RamkaPage(driver);
        ramkaPage.przejdzDoIframeOne();
        ramkaPage.wpiszImie("Bartek");
        ramkaPage.wpiszNazwisko("Bogucki");
        ramkaPage.wpiszEmail("saturn993@amorki.pl");
        ramkaPage.wpiszMiasto("Radom");
        ramkaPage.wpiszUlica("Kochanowskiego 4a/5");
        ramkaPage.akceptujRegulamin();
        ramkaPage.wyslijDane();
        ramkaPage.sprawdzAlert();
        ramkaPage.wrocDoDomyslnegoOkna();
    }
}

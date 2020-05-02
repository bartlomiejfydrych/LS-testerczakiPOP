package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.PodstawyPage;
import pages.RamkaPage;

public class RamkaTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest() {
        RamkaPage ramkaPage = glownaPage.goToRamkaPage();
        PodstawyPage podstawyPage = new PodstawyPage(driver);
        ramkaPage.przejdzDoIframeOne();
        podstawyPage.wpiszImie("Bartek");
        podstawyPage.wpiszNazwisko("Bogucki");
        podstawyPage.wpiszEmail("saturn993@amorki.pl");
        podstawyPage.wpiszMiasto("Radom");
        podstawyPage.wpiszUlica("Kochanowskiego 4a/5");
        podstawyPage.akceptujRegulamin();
        podstawyPage.wyslijDane();
        podstawyPage.sprawdzAlert();
        ramkaPage.wrocDoDomyslnegoOkna();
    }
}

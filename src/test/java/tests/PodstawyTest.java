package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.PodstawyPage;

public class PodstawyTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest() {
        PodstawyPage podstawyPage = glownaPage.goToPodstawyPage();
        podstawyPage.wpiszImie("Bartek");
        podstawyPage.wpiszNazwisko("Bogucki");
        podstawyPage.wpiszEmail("saturn993@amorki.pl");
        podstawyPage.wpiszMiasto("Radom");
        podstawyPage.wpiszUlica("Kochanowskiego 4a/5");
        podstawyPage.akceptujRegulamin();
        podstawyPage.wyslijDane();
        podstawyPage.sprawdzAlert();
    }

}

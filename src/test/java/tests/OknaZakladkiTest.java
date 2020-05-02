package tests;

import org.junit.Test;
import pages.OknaZakladkiPage;
import pages.PodstawyPage;

public class OknaZakladkiTest extends BaseTest {

    private void WypelnijPodstawy() {
        PodstawyPage podstawyPage = new PodstawyPage(driver);
        podstawyPage.wpiszImie("Bartek");
        podstawyPage.wpiszNazwisko("Bogucki");
        podstawyPage.wpiszEmail("saturn993@amorki.pl");
        podstawyPage.wpiszMiasto("Radom");
        podstawyPage.wpiszUlica("Kochanowskiego 4a/5");
        podstawyPage.akceptujRegulamin();
        podstawyPage.wyslijDane();
        podstawyPage.sprawdzAlert();
    }

    @Test
    public void poprawneZalogowanieKarta() {
        OknaZakladkiPage oknaZakladkiPage = glownaPage.goToOknaZakladkiPage();
        oknaZakladkiPage.otworzPodstawyNowaKarta();
        oknaZakladkiPage.przelaczKarteOkno(1);
        WypelnijPodstawy();
    }

    @Test
    public void poprawneZalogowanieOkno() {
        OknaZakladkiPage oknaZakladkiPage = glownaPage.goToOknaZakladkiPage();
        oknaZakladkiPage.otworzPodstawyNoweOkno();
        oknaZakladkiPage.przelaczKarteOkno(1);
        oknaZakladkiPage.powiekszOkno();
        WypelnijPodstawy();
    }
}

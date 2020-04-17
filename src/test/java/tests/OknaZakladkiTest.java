package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.OknaZakladkiPage;
import pages.PodstawyPage;

public class OknaZakladkiTest extends BaseTest{

    @Test
    public void poprawneZalogowanieKarta(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToOknaZakladkiPage();
        OknaZakladkiPage oknaZakladkiPage = new OknaZakladkiPage(driver);
        oknaZakladkiPage.otworzPodstawyNowaKarta();
        oknaZakladkiPage.przelaczKarteOkno(1);
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
    public void poprawneZalogowanieOkno(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToOknaZakladkiPage();
        OknaZakladkiPage oknaZakladkiPage = new OknaZakladkiPage(driver);
        oknaZakladkiPage.otworzPodstawyNoweOkno();
        oknaZakladkiPage.przelaczKarteOkno(1);
        oknaZakladkiPage.powiekszOkno();
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
}

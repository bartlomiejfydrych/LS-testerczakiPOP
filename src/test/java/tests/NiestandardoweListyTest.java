package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.NiestandardoweListyPage;

public class NiestandardoweListyTest extends BaseTest {

    @Test
    public void zadanie1Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToNiestandardoweListyPage();
        NiestandardoweListyPage niestandardoweListyPage = new NiestandardoweListyPage(driver);
        niestandardoweListyPage.z1kliknijWybierzButton();
        niestandardoweListyPage.z1kliknijElement3();
        niestandardoweListyPage.z1sprawdzAlert();
    }
    @Test
    public void zadanie2Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToNiestandardoweListyPage();
        NiestandardoweListyPage niestandardoweListyPage = new NiestandardoweListyPage(driver);
        niestandardoweListyPage.z2kliknijWybierzButton();
        niestandardoweListyPage.z2wyszukajTekst();
        niestandardoweListyPage.z2kkliknijElement2();
        niestandardoweListyPage.z2sprawdzAlert();
    }
    @Test
    public void wszystkieZadaniaTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToNiestandardoweListyPage();
        NiestandardoweListyPage niestandardoweListyPage = new NiestandardoweListyPage(driver);
        niestandardoweListyPage.z1kliknijWybierzButton();
        niestandardoweListyPage.z1kliknijElement3();
        niestandardoweListyPage.z1sprawdzAlert();
        niestandardoweListyPage.z2kliknijWybierzButton();
        niestandardoweListyPage.z2wyszukajTekst();
        niestandardoweListyPage.z2kkliknijElement2();
        niestandardoweListyPage.z2sprawdzAlert();
    }
}

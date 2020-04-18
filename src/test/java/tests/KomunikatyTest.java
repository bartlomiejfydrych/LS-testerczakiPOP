package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.KomunikatyPage;

public class KomunikatyTest extends BaseTest {

    @Test
    public void poprawnyKomunikat(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToKomunikatyPage();
        KomunikatyPage komunikatyPage = new KomunikatyPage(driver);
        komunikatyPage.kliknijWyswietlKomunikat();
        komunikatyPage.przejdzNaAlert();
        komunikatyPage.pobierzTekstAlert();
        komunikatyPage.akceptujAlert();
        komunikatyPage.wklejKomunikat();
        komunikatyPage.kliknijSprawdzKomunikat();
        komunikatyPage.akceptujAlert();
        komunikatyPage.odrzucAlert();
        komunikatyPage.wyslijTekstDoAlert("tak");
        komunikatyPage.akceptujAlert();
        komunikatyPage.sprawdzPoprawnosc();
    }
}

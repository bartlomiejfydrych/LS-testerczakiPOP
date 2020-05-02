package tests;

import org.junit.Test;
import pages.KomunikatyPage;

public class KomunikatyTest extends BaseTest {

    @Test
    public void poprawnyKomunikat(){
        KomunikatyPage komunikatyPage = glownaPage.goToKomunikatyPage();
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
package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.KliknijPrzytrzymajPage;

public class KliknijPrzytrzymajTest extends BaseTest {

    @Test
    public void zadanie1Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToKliknijPrzytrzymajPage();
        KliknijPrzytrzymajPage kliknijPrzytrzymajPage = new KliknijPrzytrzymajPage(driver);
        kliknijPrzytrzymajPage.kliknijPrawym();
        kliknijPrzytrzymajPage.kliknijOpcje2();
        kliknijPrzytrzymajPage.sprawdzAlert1();
    }
    @Test
    public void zadanie2Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToKliknijPrzytrzymajPage();
        KliknijPrzytrzymajPage kliknijPrzytrzymajPage = new KliknijPrzytrzymajPage(driver);
        kliknijPrzytrzymajPage.przytrzymajPrzycisk();
        kliknijPrzytrzymajPage.sprawdzAlert2();
    }
    @Test
    public void wszystkieZadaniaTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToKliknijPrzytrzymajPage();
        KliknijPrzytrzymajPage kliknijPrzytrzymajPage = new KliknijPrzytrzymajPage(driver);
        kliknijPrzytrzymajPage.kliknijPrawym();
        kliknijPrzytrzymajPage.kliknijOpcje2();
        kliknijPrzytrzymajPage.sprawdzAlert1();
        kliknijPrzytrzymajPage.przytrzymajPrzycisk();
        kliknijPrzytrzymajPage.sprawdzAlert2();
    }
}

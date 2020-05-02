package tests;

import org.junit.Before;
import org.junit.Test;
import pages.GlownaPage;
import pages.KliknijPrzytrzymajPage;

public class KliknijPrzytrzymajTest extends BaseTest {

    KliknijPrzytrzymajPage kliknijPrzytrzymajPage;

    @Before
    public void setUp(){
        super.setUp();
        kliknijPrzytrzymajPage = glownaPage.goToKliknijPrzytrzymajPage();
    }

    @Test
    public void zadanie1Test() {
        kliknijPrzytrzymajPage.kliknijPrawym();
        kliknijPrzytrzymajPage.kliknijOpcje2();
        kliknijPrzytrzymajPage.sprawdzAlert1();
    }

    @Test
    public void zadanie2Test() {
        kliknijPrzytrzymajPage.przytrzymajPrzycisk();
        kliknijPrzytrzymajPage.sprawdzAlert2();
    }

    @Test
    public void wszystkieZadaniaTest() {
        kliknijPrzytrzymajPage.kliknijPrawym();
        kliknijPrzytrzymajPage.kliknijOpcje2();
        kliknijPrzytrzymajPage.sprawdzAlert1();
        kliknijPrzytrzymajPage.przytrzymajPrzycisk();
        kliknijPrzytrzymajPage.sprawdzAlert2();
    }
}

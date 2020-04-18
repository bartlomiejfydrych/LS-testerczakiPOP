package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.MenuPage;

public class MenuTest extends BaseTest {

    @Test
    public void zadanie1Test() {
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToMenuPage();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.z1kliknijLink2();
        menuPage.z1sprawdzAlert();
    }
    @Test
    public void zadanie2Test() {
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToMenuPage();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.z2rozwinListe();
        menuPage.z2kliknijLink3();
        menuPage.z2sprawdzAlert();
    }
    @Test
    public void zadanie3Test() {
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToMenuPage();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.z3kliknijListe();
        menuPage.z3kliknijLink3_c();
        menuPage.z3sprawdzAlert();
    }
    @Test
    public void zadanie4Test() {
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToMenuPage();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.z4kliknijLink3_b();
        menuPage.z4sprawdzAlert();
    }
    @Test
    public void zadanie5Test() {
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToMenuPage();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.z5kliknijLink3_b5();
        menuPage.z5sprawdzAlert();
    }
    @Test
    public void wszystkieZadaniaTest() {
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToMenuPage();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.z1kliknijLink2();
        menuPage.z1sprawdzAlert();
        menuPage.z2rozwinListe();
        menuPage.z2kliknijLink3();
        menuPage.z2sprawdzAlert();
        menuPage.z3kliknijListe();
        menuPage.z3kliknijLink3_c();
        menuPage.z3sprawdzAlert();
        menuPage.z4kliknijLink3_b();
        menuPage.z4sprawdzAlert();
        menuPage.z5kliknijLink3_b5();
        menuPage.z5sprawdzAlert();
    }
}
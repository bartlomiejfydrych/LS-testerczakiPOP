package tests;

import org.junit.Before;
import org.junit.Test;
import pages.MenuPage;

public class MenuTest extends BaseTest {

    MenuPage menuPage;

    @Before
    public void setUp() {
        super.setUp();
        menuPage = glownaPage.goToMenuPage();
    }

    @Test
    public void zadanie1Test() {
        menuPage.z1kliknijLink2();
        menuPage.z1sprawdzAlert();
    }

    @Test
    public void zadanie2Test() {
        menuPage.z2rozwinListe();
        menuPage.z2kliknijLink3();
        menuPage.z2sprawdzAlert();
    }

    @Test
    public void zadanie3Test() {
        menuPage.z3kliknijListe();
        menuPage.z3kliknijLink3_c();
        menuPage.z3sprawdzAlert();
    }

    @Test
    public void zadanie4Test() {
        menuPage.z4kliknijLink3_b();
        menuPage.z4sprawdzAlert();
    }

    @Test
    public void zadanie5Test() {
        menuPage.z5kliknijLink3_b5();
        menuPage.z5sprawdzAlert();
    }

    @Test
    public void wszystkieZadaniaTest() {
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
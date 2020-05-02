package tests;

import org.junit.Before;
import org.junit.Test;
import pages.GlownaPage;
import pages.NiestandardoweListyPage;

public class NiestandardoweListyTest extends BaseTest {

    NiestandardoweListyPage niestandardoweListyPage;

    @Before
    public void setUp(){
        super.setUp();
        niestandardoweListyPage = glownaPage.goToNiestandardoweListyPage();
    }

    @Test
    public void zadanie1Test() {
        niestandardoweListyPage.z1kliknijWybierzButton();
        niestandardoweListyPage.z1kliknijElement(2);
        niestandardoweListyPage.z1sprawdzAlert();
    }

    @Test
    public void zadanie2Test() {
        niestandardoweListyPage.z2kliknijWybierzButton();
        niestandardoweListyPage.z2wyszukajTekst("Element");
        niestandardoweListyPage.z2kliknijElement(1);
        niestandardoweListyPage.z2sprawdzAlert();
    }

    @Test
    public void wszystkieZadaniaTest() {
        zadanie1Test();
        zadanie2Test();
    }
}

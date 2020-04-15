package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.OpcjonalnyFormularzPage;

public class OpcjonalnyFormularzTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToOpcjonalnyFormularzPage();
        OpcjonalnyFormularzPage opcjonalnyFormularzPage = new OpcjonalnyFormularzPage(driver);
        opcjonalnyFormularzPage.wpiszImie("Krzysiek");
        opcjonalnyFormularzPage.wpiszNazwisko("Frank");
        opcjonalnyFormularzPage.wpiszEmail("henryk23@wp.pl");
        opcjonalnyFormularzPage.zaznaczDodatkowePola();
        opcjonalnyFormularzPage.wpiszMiasto("Katowice");
        opcjonalnyFormularzPage.wpiszUlica("Jana Pawła 2b/13");
        opcjonalnyFormularzPage.wyslijDane();
        opcjonalnyFormularzPage.sprawdzAlert();
    }
}

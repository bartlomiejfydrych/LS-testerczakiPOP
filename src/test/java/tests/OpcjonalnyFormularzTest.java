package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.OpcjonalnyFormularzPage;

public class OpcjonalnyFormularzTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest() {
        OpcjonalnyFormularzPage opcjonalnyFormularzPage = glownaPage.goToOpcjonalnyFormularzPage();
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
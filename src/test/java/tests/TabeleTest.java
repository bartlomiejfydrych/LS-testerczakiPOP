package tests;

import org.junit.Test;
import pages.TabelePage;

public class TabeleTest extends BaseTest {

    @Test
    public void zadanieTest() {
        TabelePage tabelePage = glownaPage.goToTabelePage();
        tabelePage.odczytajDaneTabeli();
        tabelePage.wpiszSrednia();
        tabelePage.wpiszWiek();
        tabelePage.wpiszImie();
        tabelePage.kliknijSprawdz();
        tabelePage.sprawdzAlert();
    }
}
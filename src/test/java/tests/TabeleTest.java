package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.TabelePage;

public class TabeleTest extends BaseTest {

    @Test
    public void zadanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToTabelePage();
        TabelePage tabelePage = new TabelePage(driver);
        tabelePage.odczytajDaneTabeli();
        tabelePage.wpiszSrednia();
        tabelePage.wpiszWiek();
        tabelePage.wpiszImie();
        tabelePage.kliknijSprawdz();
        tabelePage.sprawdzAlert();
    }
}

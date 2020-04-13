package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.LokalizatoryPage;

public class LokalizatoryTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToLokalizatoryPage();
        LokalizatoryPage lokalizatoryPage = new LokalizatoryPage(driver);
        lokalizatoryPage.wpiszImie("Natalia");
        lokalizatoryPage.wpiszNazwisko("Pyskacz");
        lokalizatoryPage.wybierzKraj("Tonga");
        lokalizatoryPage.wybierzJezyk("Python");
        lokalizatoryPage.wybierzJezyk("PHP");
        lokalizatoryPage.wpiszSobie("Pasjonatka gotowania i dobrego kotleta. \n" +
                "Netflix, chill i Monsterki to moje motto");
        lokalizatoryPage.wyslijPlik();
        lokalizatoryPage.wybierzPlec("Kobieta");
        lokalizatoryPage.akceptujRegulamin();
        lokalizatoryPage.wyslijDane();
        lokalizatoryPage.sprawdzAlert();
    }
}

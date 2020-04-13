package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.WiecejElementowPage;

public class WiecejElementowTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToWiecejElementowPage();
        WiecejElementowPage wiecejElementowPage = new WiecejElementowPage(driver);
        wiecejElementowPage.wpiszImie("Karolek");
        wiecejElementowPage.wpiszNazwisko("Korbacz");
        wiecejElementowPage.wybierzKraj("Meksyk");
        wiecejElementowPage.wybierzJezyk("Java");
        wiecejElementowPage.wybierzJezyk("C#");
        wiecejElementowPage.wpiszSobie("Prawdziwy fanatyk wędkarstwa. Z zamiłowania akrobata. \n" +
                "Pan maruda oraz niszczyciel dobrej zabawy. Pogromca uśmiechów dzieci.");
        wiecejElementowPage.wyslijPlik();
        wiecejElementowPage.wybierzPlec("Mężczyzna");
        wiecejElementowPage.akceptujRegulamin();
        wiecejElementowPage.wyslijDane();
        wiecejElementowPage.sprawdzAlert();
    }
}

package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.WiecejElementowPage;

public class WiecejElementowTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest() throws Exception {
        WiecejElementowPage wiecejElementowPage = glownaPage.goToWiecejElementowPage();
        wiecejElementowPage.wpiszImie("Karolek");
        wiecejElementowPage.wpiszNazwisko("Korbacz");
        wiecejElementowPage.wybierzKraj("Meksyk");
        wiecejElementowPage.wybierzJezyk("Java", "C#");
        wiecejElementowPage.wpiszSobie("Prawdziwy fanatyk wędkarstwa. Z zamiłowania akrobata. \n" +
                "Pan maruda oraz niszczyciel dobrej zabawy. Pogromca uśmiechów dzieci.");
        wiecejElementowPage.wyslijPlik();
        wiecejElementowPage.wybierzPlec("Mężczyzna");
        wiecejElementowPage.akceptujRegulamin();
        wiecejElementowPage.wyslijDane();
        wiecejElementowPage.sprawdzAlert();
    }
}
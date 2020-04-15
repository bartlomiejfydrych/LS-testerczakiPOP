package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.UkryteElementyPage;

public class UkryteElementyTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToUkryteElementyPage();
        UkryteElementyPage ukryteElementyPage = new UkryteElementyPage(driver);
        ukryteElementyPage.wpiszImie("Damian");
        ukryteElementyPage.wpiszNazwisko("Bosak");
        ukryteElementyPage.wpiszEmail("mostek55@interia.pl");
        ukryteElementyPage.wpiszMiasto("Gdańsk");
        ukryteElementyPage.wpiszUlica("Radowida 19c/5");
        ukryteElementyPage.akceptujRegulamin();
        ukryteElementyPage.wyslijDane();
        ukryteElementyPage.sprawdzAlert();
    }
}

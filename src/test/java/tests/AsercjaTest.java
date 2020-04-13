package tests;

import org.junit.Test;
import pages.AsercjaPage;
import pages.GlownaPage;

public class AsercjaTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){

        String imie = "Marian";
        String nazwisko = "Rowerek";
        String email = "marianek22@o2.pl";
        String miasto = "Sosnowiec";

        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToAsercjaPage();
        AsercjaPage asercjaPage = new AsercjaPage(driver);
        asercjaPage.wpiszImie(imie);
        asercjaPage.wpiszNazwisko(nazwisko);
        asercjaPage.wpiszEmail(email);
        asercjaPage.wpiszMiasto(miasto);
        asercjaPage.akceptujRegulamin();

        asercjaPage.asercjeSprawdzajaceFormularz(imie, nazwisko, email, miasto);
        
        asercjaPage.wyslijDane();
    }
}

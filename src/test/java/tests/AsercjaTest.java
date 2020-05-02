package tests;

import org.junit.Test;
import pages.AsercjaPage;
import pages.GlownaPage;
import pages.PodstawyPage;

public class AsercjaTest extends BaseTest {

    @Test
    public void poprawneLogowanieTest(){

        String imie = "Marian";
        String nazwisko = "Rowerek";
        String email = "marianek22@o2.pl";
        String miasto = "Sosnowiec";
        String ulica = "Koparki 14a/7";

        AsercjaPage asercjaPage = glownaPage.goToAsercjaPage();
        asercjaPage.wpiszImie(imie);
        asercjaPage.wpiszNazwisko(nazwisko);
        asercjaPage.wpiszEmail(email);
        asercjaPage.wpiszMiasto(miasto);
        asercjaPage.wpiszUlica(ulica);
        asercjaPage.asercjeSprawdzajaceFormularz(imie, nazwisko, email, miasto);
        asercjaPage.akceptujRegulamin();
        asercjaPage.asercjaSprawdzajacaRegulaminCheckbox();
        asercjaPage.wyslijDane();
    }
}
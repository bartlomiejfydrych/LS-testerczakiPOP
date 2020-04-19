package tests;

import org.junit.Test;
import pages.GlownaPage;
import pages.PrzeciagnijUpuscPage;

public class PrzeciagnijUpuscTest extends BaseTest {

    @Test
    public void zadanie1Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToPrzeciagnijUpuscPage();
        PrzeciagnijUpuscPage przeciagnijUpuscPage = new PrzeciagnijUpuscPage(driver);
        przeciagnijUpuscPage.przeniesElementyDoGrupyB();
        przeciagnijUpuscPage.sprawdzAlert1();
    }
    @Test
    public void zadanie2Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToPrzeciagnijUpuscPage();
        PrzeciagnijUpuscPage przeciagnijUpuscPage = new PrzeciagnijUpuscPage(driver);
        przeciagnijUpuscPage.posortujElementy();
        przeciagnijUpuscPage.sprawdzAlert2();
    }
    @Test
    public void zadanie3Test(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToPrzeciagnijUpuscPage();
        PrzeciagnijUpuscPage przeciagnijUpuscPage = new PrzeciagnijUpuscPage(driver);
        przeciagnijUpuscPage.przeniesElementyDoGrupyYhtml5();
        przeciagnijUpuscPage.sprawdzAlert3();
    }
    @Test
    public void wszystkieZadaniaTest(){
        GlownaPage glownaPage = new GlownaPage(driver);
        glownaPage.goToPrzeciagnijUpuscPage();
        PrzeciagnijUpuscPage przeciagnijUpuscPage = new PrzeciagnijUpuscPage(driver);
        przeciagnijUpuscPage.przeniesElementyDoGrupyB();
        przeciagnijUpuscPage.sprawdzAlert1();
        przeciagnijUpuscPage.posortujElementy();
        przeciagnijUpuscPage.sprawdzAlert2();
        przeciagnijUpuscPage.przeniesElementyDoGrupyYhtml5();
        przeciagnijUpuscPage.sprawdzAlert3();
    }
}

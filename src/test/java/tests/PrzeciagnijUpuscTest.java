package tests;

import org.junit.Before;
import org.junit.Test;
import pages.GlownaPage;
import pages.PrzeciagnijUpuscPage;

public class PrzeciagnijUpuscTest extends BaseTest {

    PrzeciagnijUpuscPage przeciagnijUpuscPage;

    @Before
    public void setUp(){
        super.setUp();
        przeciagnijUpuscPage = glownaPage.goToPrzeciagnijUpuscPage();
    }

    @Test
    public void zadanie1Test() {
        przeciagnijUpuscPage.przeniesElementyDoGrupyB();
        przeciagnijUpuscPage.sprawdzAlert1();
    }

    @Test
    public void zadanie2Test() {
        przeciagnijUpuscPage.posortujElementy();
        przeciagnijUpuscPage.sprawdzAlert2();
    }

    @Test
    public void zadanie3Test() {
        przeciagnijUpuscPage.przeniesElementyDoGrupyYhtml5();
        przeciagnijUpuscPage.sprawdzAlert3();
    }

    @Test
    public void wszystkieZadaniaTest() {
        przeciagnijUpuscPage.przeniesElementyDoGrupyB();
        przeciagnijUpuscPage.sprawdzAlert1();
        przeciagnijUpuscPage.posortujElementy();
        przeciagnijUpuscPage.sprawdzAlert2();
        przeciagnijUpuscPage.przeniesElementyDoGrupyYhtml5();
        przeciagnijUpuscPage.sprawdzAlert3();
    }
}

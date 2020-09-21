package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GlownaPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    GlownaPage glownaPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://dawidkaruga.pl/testerczaki/");
        glownaPage = new GlownaPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

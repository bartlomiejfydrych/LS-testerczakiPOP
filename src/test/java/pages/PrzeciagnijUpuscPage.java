package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrzeciagnijUpuscPage extends BasePage {

    public PrzeciagnijUpuscPage(WebDriver driver) {
        super(driver);
    }

    //String przeciagnijUpuscURL = "http://dawidkaruga.pl/testerczaki/przeciagnij";

    // Elementy zadania 1:
    @FindBy(id = "simpleList2") WebElement grupaB;
    @FindBy(id = "alert1") WebElement alert1;
    @FindBy(css = "#simpleList1 li") List<WebElement> elementyZadanie1;
    // Elementy zadania 2:
    @FindBy(id = "alert2") WebElement alert2;
    // Elementy zadania 3:
    @FindBy(css = "#simpleList4 > li") List<WebElement> elementyZadanie3;
    @FindBy(id = "test1") WebElement element1X;
    @FindBy(id = "test2") WebElement element2X;
    @FindBy(id = "simpleList5") WebElement grupaY;
    @FindBy(id = "alert3") WebElement alert3;

    Actions action = new Actions(driver);

    // Metody zadania 1:
    public void sprawdzAlert1() {
        Assert.assertTrue(alert1.isDisplayed());
    }

    public void przeniesElementyDoGrupyB() {
        for (WebElement element : elementyZadanie1) {
            action.dragAndDrop(element, grupaB).perform();
        }
    }

    // Metody zadania 2:
    public void sprawdzAlert2() {
        Assert.assertTrue(alert2.isDisplayed());
    }

    public void posortujElementy() {
        List<WebElement> listOfAllWebElements = new ArrayList<>();
        for (int i = 5; i >= 1; i--) {
            listOfAllWebElements.add(driver.findElement(By.cssSelector("[data-order=\"" + i + "\"]")));
        }
        for (WebElement element : listOfAllWebElements) {
            Actions smoothMove = action.clickAndHold(element);
            for (int e = 0; e < 10; e++) {
                smoothMove.moveByOffset(0, -30);
            }
            smoothMove.release().perform();
        }
    }

    // Metody zadania 3:
    public void sprawdzAlert3() {
        Assert.assertTrue(alert3.isDisplayed());
    }

    public void przeniesElementyDoGrupyYhtml5() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        File file = new File("src/test/resources/drag_and_drop_helper.js");

        String script = null;
        try {
            script = readFile(file.getAbsolutePath())
                    + "\nsimulateHTML5DragAndDrop(arguments[0], arguments[1])";
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (WebElement element : elementyZadanie3){
            javascriptExecutor.executeScript(script, element, grupaY);
        }
    }

    private static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, StandardCharsets.UTF_8);
    }
}

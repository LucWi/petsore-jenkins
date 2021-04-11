package acceptencetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Tag("acceptence")
public class AcceptenceTests {

    @Test
    @DisplayName("Basic test of Ordina")
    void testOrdina(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ordina.nl/");
        String title = driver.getTitle();
        System.out.println("title is "+ title);
        Assertions.assertEquals(title, "Ordina Nederland | Homepage | Ahead of Change", "Title has changed to: " + title);
        driver.close();
    }
}

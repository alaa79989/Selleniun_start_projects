package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelleninumTesting_2 {

    static WebDriver browser;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
    }

    @Test
    public void testPasswordValidation() throws InterruptedException {
        WebElement passwordField = browser.findElement(By.id("password"));
        passwordField.sendKeys("Alaa123"); // סיסמה חיובית

        WebElement submitButton = browser.findElement(By.cssSelector("input[type='submit']"));
        String currentPage = browser.getCurrentUrl();
        submitButton.click();

        // בדיקה שהעמוד השתנה
        String newPage = browser.getCurrentUrl();
        assertNotEquals(currentPage, newPage);

        // מקרה שלילי
        passwordField = browser.findElement(By.id("password"));
        passwordField.clear();
        Thread.sleep(500); // המתנה קלה (למנוע בעיה עם clear)
        passwordField.sendKeys("Alaa1");

        currentPage = browser.getCurrentUrl();
        submitButton.click();

        newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
   
    // מקרה שלילי
    passwordField = browser.findElement(By.id("password"));
    passwordField.clear();
    Thread.sleep(500); // המתנה קלה (למנוע בעיה עם clear)
    passwordField.sendKeys("Alsas");

    currentPage = browser.getCurrentUrl();
    submitButton.click();

    newPage = browser.getCurrentUrl();
    assertEquals(currentPage, newPage);
    
    
 // מקרה שלילי
    passwordField = browser.findElement(By.id("password"));
    passwordField.clear();
    Thread.sleep(500); // המתנה קלה (למנוע בעיה עם clear)
    passwordField.sendKeys("hgdk#");

    currentPage = browser.getCurrentUrl();
    submitButton.click();

    newPage = browser.getCurrentUrl();
    assertEquals(currentPage, newPage);
    
 // מקרה שלילי
    passwordField = browser.findElement(By.id("password"));
    passwordField.clear();
    Thread.sleep(500); // המתנה קלה (למנוע בעיה עם clear)
    passwordField.sendKeys("1234");

    currentPage = browser.getCurrentUrl();
    submitButton.click();

    newPage = browser.getCurrentUrl();
    assertEquals(currentPage, newPage);
    
    
 // מקרה שלילי
    passwordField = browser.findElement(By.id("password"));
    passwordField.clear();
    Thread.sleep(500); // המתנה קלה (למנוע בעיה עם clear)
    passwordField.sendKeys("&hgfs88");

    currentPage = browser.getCurrentUrl();
    submitButton.click();

    newPage = browser.getCurrentUrl();
    assertEquals(currentPage, newPage);
    
}
}


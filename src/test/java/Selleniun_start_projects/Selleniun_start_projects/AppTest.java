package Selleniun_start_projects.Selleniun_start_projects;

public class AppTest {
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.junit.Before;
	import java.time.Duration;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import static org.junit.Assert.*;
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNotEquals;

	import java.lang.Thread;
	import org.openqa.selenium.support.ui.Select;

	import Selleniun_start_projects.Selleniun_start_projects.App.isEquilateral;

	public class AppTest {

		
		static WebDriver browser;

		@Before
		public void setup() {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");

			
			browser = new FirefoxDriver();
			browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		}

		
		@Test
		public void Tests_1() {

			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("6.0");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("6.0");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("6.0");

			String currentPage = browser.getCurrentUrl();
			browser.findElement(By.id("identify-triangle-action")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
		}

		@Test
		public void Tests_2() {

			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2.0");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3.0");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("4.0");

			String currentPage = browser.getCurrentUrl();
			browser.findElement(By.id("identify-triangle-action")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
		}

		@Test
		public void Tests_3() {

			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("5.0");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("4.0");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("4.0");

			String currentPage = browser.getCurrentUrl();
			browser.findElement(By.id("identify-triangle-action")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
		}

		@Test
		public void Tests_4() {

			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("9");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("1");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("6");

			String currentPage = browser.getCurrentUrl();
			browser.findElement(By.id("identify-triangle-action")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
		}
		@Test
		public void Tests_5() {

			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("4.0");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("5.0");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("4.0");

			String currentPage = browser.getCurrentUrl();
			browser.findElement(By.id("identify-triangle-action")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
		}
		@Test
		public void Tests_6() {

			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("4.0");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("4.0");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("5.0");

			String currentPage = browser.getCurrentUrl();
			browser.findElement(By.id("identify-triangle-action")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
		}
}

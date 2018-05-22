package headless.chrome.headless.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class firefoxHeadless  {

//	@Test
//	public void test32()  {
//		
//	    FirefoxBinary firefoxBinary = new FirefoxBinary();
//	    firefoxBinary.addCommandLineOptions("--headless");
//	    System.setProperty("webdriver.gecko.driver", "/root/geckodriver");
//	    FirefoxOptions firefoxOptions = new FirefoxOptions();
//	    firefoxOptions.setBinary(firefoxBinary);
//	    FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
//		
//		driver.get("http://www.google.pl");
//		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
//		
//		driver.findElement(By.cssSelector("div.rc h3:nth-child(1)")).click();
//		Assert.assertEquals("Pierwsze kroki z Selenium – Selenium IDE - Kainos Polska", driver.getTitle());
//	}
	@Test
	public void test33() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.pl");
	}
}

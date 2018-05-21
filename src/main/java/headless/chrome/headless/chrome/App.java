package headless.chrome.headless.chrome;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void test()
    {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/usr/bin/chromium-browser");
		options.addArguments("--headless");

		
		WebDriver driver = new ChromeDriver(options);
				
		driver.get("http://www.google.pl");
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.xpath("(//div//h3)[1]")).click();
		Assert.assertEquals(driver.getTitle(), "Selenium");
        
    }
}

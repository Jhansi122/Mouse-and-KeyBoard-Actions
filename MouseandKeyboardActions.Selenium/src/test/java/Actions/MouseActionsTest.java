package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsTest {
	WebDriver driver;

	@Test

	public void mouseAction() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\Geckodriver\\geckodriver.exe\\");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		System.out.println("Title of the webpage is " + title);
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		ele.sendKeys("selenium");
		ele.click();

		WebElement ele1 = driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@value='Google Search']"));
		ele1.click();
		Actions action = new Actions(driver);

		WebElement ele2 = driver.findElement(By.className("LC20lb"));

		// Right click

		action.contextClick(ele2).sendKeys(Keys.CONTROL +"t").sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
		 driver.quit();

	}
}

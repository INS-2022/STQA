package in.vesit.stqa;

/*
* Demonstrate the Locator (id, css selector, path)
*/

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	public static void main (String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			WebDriverPathHelper.CHROME_DRIVER_PATH);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// By ID
			driver.findElement(By.name("user-name")).sendKeys("standard_user");//locatorid
			Thread.sleep(5000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");//locaternam
			Thread.sleep(5000);
			driver.findElement(By.id("login-button")).click();//locator className
			Thread.sleep(5000);
			// Css Selector ID
			driver.findElement(By.cssSelector("#item_4_title_link")).click();
			Thread.sleep(5000);
			// By xpath
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/button")).click();
			Thread.sleep(5000);
			// By CSS Selector class
			driver.findElement(By.cssSelector(".shopping_cart_link")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(5000);
			driver.close();
	}
}

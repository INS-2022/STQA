package in.vesit.stqa;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				WebDriverPathHelper.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// By ID
		driver.findElement(By.name("user-name")).sendKeys("standard_user");// locatorid
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");// locaternam
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();// locator className
		Thread.sleep(5000);
		// Css Selector ID

		Select s = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select")));
		s.selectByVisibleText("Name (Z to A)");

		Thread.sleep(5000);
		driver.close();
	}
}
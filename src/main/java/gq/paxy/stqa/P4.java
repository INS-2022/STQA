package gq.paxy.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		String appUrl = "http://demo.guru99.com/test/guru99home/";
		driver.get(appUrl);
		Thread.sleep(2000);
		// Click on Registration link
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/div/div/ul/li[4]/a")).click();
//		/html/body/div[3]/div[2]/nav/div/div/ul/li[4]/a
		Thread.sleep(2000);
		// Go back to Home Page
		driver.navigate().back();
		Thread.sleep(2000);
		// Go forward to Registration page
		driver.navigate().forward();
		Thread.sleep(2000);
		// Go back to Home page
		driver.navigate().to(appUrl);
		Thread.sleep(2000);
		// Refresh browser
		driver.navigate().refresh();
		Thread.sleep(2000);
		// Close browser
		driver.close();
	}
}

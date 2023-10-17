package gq.paxy.stqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

		WebDriver webDriver = new ChromeDriver();

		webDriver.get("https://narenderkeswani.com/stqap8.html");
		webDriver.findElement(By.name("fullname")).sendKeys("Narender Keswani");
		webDriver.findElement(By.name("submit")).click();

		// Switching to Alert
		Alert alert = webDriver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = webDriver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(2000);
	}
}

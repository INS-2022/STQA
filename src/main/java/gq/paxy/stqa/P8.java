package gq.paxy.stqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				WebDriverPathHelper.CHROME_DRIVER_PATH);

		WebDriver webDriver = new ChromeDriver();

		webDriver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		// Switching to Alert
		Alert alert = webDriver.switchTo().alert();

		// Capturing and printing alert message.
		System.out.println(webDriver.switchTo().alert().getText());
		
		alert.accept();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		// Switching to Alert
		alert = webDriver.switchTo().alert();

		// Capturing and printing alert message.
		System.out.println(webDriver.switchTo().alert().getText());
		alert.accept();

		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(2000);
		// Switching to Alert
		alert = webDriver.switchTo().alert();
		alert.sendKeys("Prathamesh");
		Thread.sleep(2000);
		// Capturing and printing alert message.
		System.out.println(webDriver.switchTo().alert().getText());
		alert.accept();
		System.out.println(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/p")).getText());
		
		Thread.sleep(2000);
		webDriver.close();
	}
}

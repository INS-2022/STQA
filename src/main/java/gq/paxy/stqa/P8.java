package gq.paxy.stqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Exam\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver webDriver = new ChromeDriver();

		webDriver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		// Switching to Alert
		Alert alert = webDriver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = webDriver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(2000);
	}
}

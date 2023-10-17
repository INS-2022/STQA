package gq.paxy.stqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"/usr/bin/chromedriver");
		WebDriver wd=new ChromeDriver();
		wd.get("http://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		wd.findElement(By.id("no")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("buttoncheck")).click();
		Thread.sleep(2000);
		List<WebElement> elements = wd.findElements(By.name("name"));
		System.out.println("Number of elements:" +elements.size());
		Thread.sleep(2000);
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
			Thread.sleep(2000);
		}
	}
}

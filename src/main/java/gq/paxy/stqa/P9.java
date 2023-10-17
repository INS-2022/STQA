package gq.paxy.stqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver wd = new ChromeDriver();
		wd = new ChromeDriver();

		wd.get("https://narenderkeswani.com/stqa9.html");

		Select s = new Select(wd.findElement(By.name("fromStn")));
		Select t = new Select(wd.findElement(By.name("toStn")));
		s.selectByVisibleText("KALYAN JN");
		t.selectByVisibleText("GANAGAPUR ROAD");

		String sMessage = s.getFirstSelectedOption().getText();
		String tMessage = t.getFirstSelectedOption().getText();

		System.out.println(sMessage);
		System.out.println(tMessage);

		Thread.sleep(2000);

		Select list = new Select(wd.findElement(By.name("favFood")));

		if (list.isMultiple()) {
			list.selectByIndex(0);
			list.selectByValue("vadavpav");
			list.selectByVisibleText("Paneer");
			System.out.println("Selected:");

			List<WebElement> selected1 = list.getAllSelectedOptions();
			for (WebElement el : selected1) {
				System.out.println("Selected: " + el.getAttribute("value"));
			}

			Thread.sleep(5000);
			list.deselectByIndex(3);
			list.deselectAll();
			System.out.println("Deselected");
		}
	}
}
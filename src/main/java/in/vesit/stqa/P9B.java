package in.vesit.stqa;

/*
* Demonstrate: Handling Drop Down, List Boxes
*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P9B {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", WebDriverPathHelper.CHROME_DRIVER_PATH);

		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select s = new Select(
				webDriver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select")));
		s.selectByVisibleText("India");
		Thread.sleep(2000);
		System.out.println(s.getFirstSelectedOption().getText().toString());
		Thread.sleep(5000);
	}
}

package in.vesit.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class P10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				WebDriverPathHelper.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		// Radio Button1 is selected
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");
		// Radio Button1 is de-selected and Radio Button2 is selected
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
		// Selecting CheckBox
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		// This will Toggle the Check box
		option1.click();
		// Check whether the Check box is toggled on
		if (option1.isSelected()) {
			System.out.println("Checkbox is Toggled On");
		} else {
			System.out.println("Checkbox is Toggled Off");
		}
		Thread.sleep(5000);
		// Selecting Checkbox and using isSelected Method
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 2; i++) {
			chkFBPersist.click();
			System.out.println("Facebook Persists Checkbox Statusis - " + chkFBPersist.isSelected());
		}
		Thread.sleep(5000);
		driver.close();
	}

}

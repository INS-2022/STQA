package in.vesit.stqa;

/*
* Implicit Wait (Synchronization)
*/

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7A {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", WebDriverPathHelper.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";

		// launch Chrome and redirect it to the Base URL
		driver.get("https://demo.guru99.com/test/guru99home/");
		// Maximizes the browser window
		driver.manage().window().maximize();
		// get the actual value of the title
		aTitle = driver.getTitle();
		// compare the actual title with the expected title
		if (aTitle.equals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		// close browser
		driver.close();
	}

}

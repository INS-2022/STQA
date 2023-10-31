package in.vesit.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P13 {
	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void demoClass(String email, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", WebDriverPathHelper.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(5000);
		;
		Assert.assertTrue(driver.getCurrentUrl().matches("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"), "Invalid credentials");
		System.out.println("Login successful");
	}

	@AfterMethod
	void ProgramTermination() {
		driver.quit();
	}

	@DataProvider(name = "testdata")
	public Object[][] testDataExample() {
		ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\paxyi\\git\\STQA\\p13test.xlsx");
		

		int rows = configuration.getRowCount(0);

		Object[][] signin_credentials = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;
	}

}

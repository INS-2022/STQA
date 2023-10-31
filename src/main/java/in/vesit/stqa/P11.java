package in.vesit.stqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class P11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", WebDriverPathHelper.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();

        // Navigate to the jQuery UI Demo website
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(5000);

        // Switch to the frame that contains the interactive demo
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Initialize a new Actions instance
        Actions actions = new Actions(driver);

        // Find the source and target elements
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));

        // Perform the drag and drop action
        actions.dragAndDrop(sourceElement, targetElement).perform();
        Thread.sleep(5000);

        // Switch back to the default content
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
	}
}

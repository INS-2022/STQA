package in.vesit.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
    public static void main( String[] args ) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
    			WebDriverPathHelper.CHROME_DRIVER_PATH);
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/guru99home/");
    	Thread.sleep(2000);
    	// navigates to the page consisting an iframe
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	driver.switchTo().frame("a077aa5e"); //switching the frame by ID
    	Thread.sleep(2000);
    	System.out.println("Switching to iframe");
    	driver.findElement(By.xpath("html/body/a/img")).click();
    	Thread.sleep(2000);
    	//Clicks the iframe
    	System.out.println("Finished");
    	driver.close();
    	driver.quit();
    }
}

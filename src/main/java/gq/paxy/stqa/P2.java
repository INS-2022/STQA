package gq.paxy.stqa;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a == 1) {
			System.setProperty("webdriver.gecko.driver",
					"/usr/local/bin/geckodriver");
			WebDriver driver = new FirefoxDriver();
			String baseUrl = "http://demo.guru99.com/test/newtours/";
			String expectedTitle = "Welcome: Mercury Tours";
			String actualTitle = "";
			// launch browser and direct it to the Base URL
			driver.get(baseUrl);
			// get the actual value of the title
			actualTitle = driver.getTitle();
			System.out.print(actualTitle);
			if (actualTitle.contentEquals(expectedTitle)) {
				System.out.println("Test Passed!");
			} else {
				System.out.println("Test Failed");
			}

			// close browser
			driver.close();
		} else if (a == 2) {
			System.setProperty("webdriver.chrome.driver",
					"/usr/bin/chromedriver" + "" + ""
							+ "" + "");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "http://demo.guru99.com/test/newtours/";
			String expectedTitle = "Welcome: Mercury Tours";
			String actualTitle = "";
			// launch browser and direct it to the Base URL
			driver.get(baseUrl);
			// get the actual value of the title
			actualTitle = driver.getTitle();
			System.out.print(actualTitle);
			/*
			 * compare the actual title of the page with the expected one and print the
			 * result as "Passed" or "Failed"
			 */
			if (actualTitle.contentEquals(expectedTitle)) {
				System.out.println("Test Passed!");
			} else {
				System.out.println("Test Failed");
			}

			// close browser
			driver.close();
		} else {
			System.out.print("Invalid option");

		}
	}
}

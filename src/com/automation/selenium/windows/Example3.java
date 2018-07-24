package com.automation.selenium.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use switchToWindow method*/
class Example3 {

	@Test
	public void test() {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.get("https://www.hondacarindia.com/");

			WebElement lnkService = driver.findElement(By.xpath("//*[@class='menuIcon serviceIcon']"));

			lnkService.click();
			
			Thread.sleep(5000);

			Set<String> windowHandles = driver.getWindowHandles();

			System.out.println("Number of Windows/Browsers:" + windowHandles.size());

			Object[] windows = windowHandles.toArray();

			for (int index = 0; index < windows.length; index++) {
				driver.switchTo().window(windows[index].toString());
				System.out.println("Title:" + driver.getTitle());
				driver.close();
			}

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}

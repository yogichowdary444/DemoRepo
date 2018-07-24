package com.automation.selenium.mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This example show how to use WebElement click method*/
public class Example0 {

	@Test
	public void clickMethod() {

		WebDriver driver = null;
		try {

			driver = DriverHelper.getDriver("CHROME");

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.get("http://electoralsearch.in/");

			WebElement btnContinue = driver.findElement(By.id("continue"));

			btnContinue.click();

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}
	}

}

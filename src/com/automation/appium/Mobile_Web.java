package com.automation.appium;

import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/* This example shows how to execute script in mobile browser*/

class Mobile_Web {

	private WebDriver driver = null;

	@SuppressWarnings("rawtypes")
	@BeforeTest
	private void setUp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"a1a1e4a3");
			//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.get("https://www.policybazaar.com/");
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}

	}

	@Test
	public void createHomeInsurance() {

		try {

			driver.findElement(By.xpath("//*[text()='Home Insurance']")).click();

			driver.findElement(By.xpath("//*[text()=' Rented ']")).click();

			driver.findElement(By.id("ddlPropertyAge")).sendKeys("Upto 30 years");

			driver.findElement(By.xpath("//*[text()=' Flat / Apartment ']")).click();

			driver.findElement(By.xpath("//*[@for='rdStruct']")).click();

			driver.findElement(By.id("next_1")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("ddlStructureCover")).sendKeys("50,00,000");

			driver.findElement(By.id("next_2")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("txtName")).sendKeys("SCOTT");

			driver.findElement(By.xpath("//*[@for='rdMale']")).click();

			driver.findElement(By.xpath("//*[@for='rdMarried']")).click();

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpDay")).sendKeys("11");

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpMonth")).sendKeys("Aug");

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpYear")).sendKeys("1985");

			driver.findElement(By.id("ddlAnnualIncome")).sendKeys("10-15 Lakhs");

			driver.findElement(By.id("txtEmail")).sendKeys("scott@scott.com");

			driver.findElement(By.id("txtMobile")).sendKeys("9112345678");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
	@AfterTest
	private void tearDown() {
		try {
			driver.close();
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

}

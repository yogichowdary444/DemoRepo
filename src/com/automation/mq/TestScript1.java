package com.automation.mq;

import java.net.Inet4Address;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript1 {

	public static void main(String[] args) throws Exception {
		
		String browser = "chrome";
		WebDriver driver = null;
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumWorkspace\\Sessions\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "FF":
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumWorkspace\\Sessions\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","D:\\SeleniumWorkspace\\Sessions\\resources\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement lstIDProof = driver.findElement(By.name("cars"));
		Select select = new Select(lstIDProof);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Opel");
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.deselectByVisibleText("Audi");
		System.out.println(select.getAllSelectedOptions().size());
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}

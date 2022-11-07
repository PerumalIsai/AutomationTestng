package com.baseclass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeSuite
	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Parameters({"url"})
	@Test
	public void url(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static WebElement findByxpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	@Parameters({"screen"})
	@AfterSuite
	public static void takesScreenshot(String name) {
		try {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File source = screen.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\Selenium Screenshot\\TestngScreenshot\\" + name + ".png");
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

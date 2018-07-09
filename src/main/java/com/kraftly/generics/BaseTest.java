package com.kraftly.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author CBT
 * this is the description about base test class.
 * it has got 2 method, 1 is to open the browser and close the browser
 * 
 */
public abstract class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeClass
	public void browserLaunch()
	{
		//initialiazes the browser.
		ChromeDriverManager.getInstance().setup();
		//create the instances of chrome browser
	    driver= new ChromeDriver();
	    //enter the AUT url
		
		
		//initiates the wait to all test classes
		wait= new WebDriverWait(driver, 15);
		
		//maximizes the window0
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kraftly.com/");
	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		//closes the browser
		driver.quit();
	}
	

}

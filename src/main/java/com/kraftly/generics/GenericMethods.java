package com.kraftly.generics;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	static WebDriverWait wait;
	public static void webDriverWaitURLContains(WebDriver driver, String url)
	{
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains(url));
		
	}
	public static void webDriverWaitTitleContains(WebDriver driver, String title)
	{
		wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public static void webDriverWaitVisibilityOfElement(WebDriver driver, WebElement element)
	{
		wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void switchtoWindowTitle(WebDriver driver,String etitle)
	{
		Set<String> handles = driver.getWindowHandles();
		String atitle = null;
		first:
		for(String handle:handles)
		{
			
			driver.switchTo().window(handle);
			atitle= driver.getTitle();
			if(atitle.contains(etitle))
			{
				break first;
			}
			
		}
	}
	
	public static void pageDown(WebElement element)
	{
		element.sendKeys(Keys.PAGE_DOWN);
		
	}
	
	public static void pageUp(WebElement element)
	{
		element.sendKeys(Keys.PAGE_UP);
	}
	//mouse over action
	public static void mouseMoveToElement(WebDriver driver, WebElement element)
	{
		Actions actions= new Actions(driver);
		
		actions.moveToElement(element).perform();
	}
	
	public static void dropDown(WebElement element, int indexValue) {
		Select select= new Select(element);
		select.selectByIndex(indexValue);	
	}	
	
	public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement subelementToHover,WebElement elementToClick) {
		Actions action = new Actions(driver);
		//action.moveToElement(elementToHover).click(elementToClick).build().perform();
		action.moveToElement(elementToHover).moveToElement(subelementToHover).click(elementToClick).perform();
		
}
	
}

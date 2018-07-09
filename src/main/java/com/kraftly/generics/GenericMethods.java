package com.kraftly.generics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
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
	
}

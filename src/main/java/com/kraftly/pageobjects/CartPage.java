package com.kraftly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kraftly.generics.BasePage;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="place")
	private WebElement elePlaceOrder;
	
	public WebElement clickOnPlaceOrder()
	{
		return elePlaceOrder;
	}
}

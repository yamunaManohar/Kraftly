package com.kraftly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kraftly.generics.BasePage;

public class ProductDetailsPage extends BasePage  {

	public ProductDetailsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	@FindBy(id="pincodeUser")
	private WebElement elePinCode;
	public WebElement checkDelivery()
	{
		return elePinCode;
	}
	@FindBy(xpath="//input[@class='pincode-verify']")
	public WebElement eleCheck;
	public WebElement clickOnCheck()
	{
		return eleCheck;
	}
	
	@FindBy(xpath="//span[@class='badge shopping-badge']")
	private WebElement eleCartButton;
	public WebElement clickOnAddToCart()
	{
		return eleCartButton;
	}
	
	@FindBy(xpath="//div[@class='buyNow']")
	private WebElement eleBuyNow;
	public WebElement clickOnBuyNow()
	{
		return eleBuyNow;
	}
	
	@FindBy(xpath="//i[@class='fa fa-heart-o']")
	private WebElement eleWishlistSymbol;
	public WebElement clickOnWishlistSymbol()
	{
		return eleWishlistSymbol;
	}
}

package com.kraftly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kraftly.generics.BasePage;

public class Collections extends BasePage{

	public Collections(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Latest Collections ']")
	private WebElement eleLatestCollectionLink;
	
	public WebElement getEleLatestCollectionLink()
	{
		return eleLatestCollectionLink;
	}
	
	@FindBy(xpath="//a[text()='Women's Western Wear']")
	private WebElement eleWomensWestrenWearLink;
	
	public WebElement getEleWomensWestrenWearLink()
	{
		return eleWomensWestrenWearLink;
	}
	@FindBy(xpath="//a[text()='Wedding Store']")
	private WebElement eleWeddingStore;
	
	public WebElement getEleWeddingStore()
	{
		return eleWeddingStore;
	}
	
	@FindBy(xpath="//a[text()='Spring & Summer Fashion']")
	private WebElement eleSpringAndSummerFashion;
	
	public WebElement getEleSpringAndSummerFashion()
	{
		return eleSpringAndSummerFashion;
	}
	
	@FindBy(xpath="//a[text()='All Latest Collections']")
	private WebElement eleAllLatestCollections;
	
	public WebElement getEleAllLatestCollections() {
		return eleAllLatestCollections;
	}
	
}

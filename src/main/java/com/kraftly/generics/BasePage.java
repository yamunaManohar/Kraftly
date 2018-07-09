package com.kraftly.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver, WebDriverWait wait)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		this.wait = wait;
	}
	@FindBy(xpath="//*[text()='Sign Up']")
	private WebElement signUpBTN;
	
	//to get multiple action to get text, attibute, click....
	public WebElement getSignupBTN()
	{
		return signUpBTN;
	}
	
	@FindBy(xpath="login-google")
	private WebElement signInLink;
	
	public WebElement getSignInLink()
	{
		return signInLink;
	}
	@FindBy(id="women")
	private WebElement eleWomenLink;
	
	public WebElement getEleWomenLink()
	{
		return eleWomenLink;
	}
	
	@FindBy(id="men")
	private WebElement eleMenLink;
	
	public WebElement getEleMenLink()
	{
		return eleMenLink;
	}
	
	@FindBy(id="homeandliving")
	private WebElement eleHomeAndLivingLink;
	
	public WebElement getEleHomeAndLivingLink()
	{
		return eleHomeAndLivingLink;
	}
	
	@FindBy(xpath="//a[text()='Mobile Cases']")
	private WebElement eleMobileCasesLink;
	
	public WebElement getEleMobileCasesLink()
	{
		return eleMobileCasesLink;
	}
	
	@FindBy(id="accessories")
	private WebElement eleAccessoriesLink;
	
	public WebElement getEleAccessoriesLink()
	{
		return eleAccessoriesLink;
	}
	
	@FindBy(id="babyandkids")
	private WebElement eleBabyAndKidsLink;
	
	public WebElement getEleBabyAndKidsLink()
	{
		return eleBabyAndKidsLink;
	}
	
	@FindBy(xpath="//a[text()='Personalised']")
	private WebElement elePersonalisedLink;
	
	public WebElement getelePersonalisedLink()
	{
		return elePersonalisedLink;
	}
	
	@FindBy(id="collection")
	private WebElement eleCollectionLink;
	
	public WebElement getEleCollectionLink()
	{
		return eleCollectionLink;
	}
	
	@FindBy(id="handicrafts")
	private WebElement eleHandiCraftsLink;
	
	public WebElement getEleHandiCraftLink()
	{
		return eleHandiCraftsLink;
	}
	
	@FindBy(id="gifts")
	private WebElement eleGiftsLink;
	
	public WebElement getEleGiftsLinkLink()
	{
		return eleGiftsLink;
	}
	
	@FindBy(id="SALE")
	private WebElement eleSALELink;
	
	public WebElement getEleSALELink()
	{
		return eleSALELink;
	}
	
	@FindBy(id="search-desktop")
	private WebElement eleSearchInput;
	
	public WebElement getEleSearchInput()
	{
		return eleSearchInput;
	}
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement eleSearchBTN;
	
	public WebElement getEleSearchBTN()
	{
		return eleSearchBTN;
	}
}

package com.kraftly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kraftly.generics.BasePage;

public class HomePage  extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//button[text()='Account ']")
	private WebElement eleAccountBTN;
	
	
	public WebElement getEleAccountBTN() {
		
		return eleAccountBTN;
	}
	
	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement eleLogOutLink;
	
	public WebElement getEleLogOutLink()
	{
		return eleLogOutLink;
	}
	@FindBy(xpath="//p[text()='Hi Flagroot']")
	private WebElement eleDetailsInfo;
	
	public WebElement getEleDetails()
	{
		return eleDetailsInfo;
	}
	@FindBy(xpath="//label[text()='User Name:']//..//div[1]")
	private WebElement eleUserName;
	
	public WebElement getUserName()
	{
		return eleUserName;
	}
	@FindBy(xpath=".//body")
	private WebElement eleScroll;
	
	public WebElement getEleScroll()
	{
		return eleScroll;
	}
}

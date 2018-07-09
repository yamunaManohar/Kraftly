package com.kraftly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kraftly.generics.BasePage;

public class GoogleSignIn extends BasePage {

	public GoogleSignIn(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="identifierId")
	private WebElement eleGoogleEmailTextFld;

	public WebElement geteleGoogleEmailTextFld()
	{
		return eleGoogleEmailTextFld;
	}
	
	 @FindBy(id="identifierNext")
	 private WebElement eleGoogleEmailNextBTN;
	 
	 public WebElement geteleGoogleEmailNextBTN()
		{
			return eleGoogleEmailNextBTN;
		}
	 
	 @FindBy(name="password")
	 private WebElement eleGooglePasswordBTN;
	 public WebElement getEleGooglePasswordBTN()
	 {
		 return eleGooglePasswordBTN;
	 }
	 
	 @FindBy(xpath="//span[text()='Next']")
	 private WebElement eleGooglePasswordNextBTN;
	 public WebElement getEleGooglePasswordNextBTN()
	 {
		 return eleGooglePasswordNextBTN;
	 }
	 
}

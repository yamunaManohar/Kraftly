package com.kraftly.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kraftly.generics.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement eleSignInLink;
	
	public WebElement geteleSignInLink()
	{
		return eleSignInLink;
	}
	
	@FindBy(id="login-google")
	private WebElement eleSignWithGoogle;
	
	public WebElement geteleSignWithGoogle()
	{
		return eleSignWithGoogle;
	}
	
	@FindBy(id="login-facebook")
	private WebElement eleSignInWithFB;
	
	public WebElement geteleSignInWithFB()
	{
		return eleSignInWithFB;
	}
	
	@FindBy(id="login-google")
	private WebElement eleSignUpWithGoogleLink;
	public WebElement getEleSignUpWithGoogleLink()
	{
		return eleSignUpWithGoogleLink;
	}
	
	
	
	@FindBy(name="email")
	private WebElement eleEmailKraftlyCredentialsTextFld;
	
	public WebElement getEleEmailInKraftlyCredentials()
	{
		return eleEmailKraftlyCredentialsTextFld;
	}
	
	@FindBy(id="pass")
	private WebElement elePasswordKraftlyCredentialsTextFld;
	
	public WebElement getElePasswordKraftlyCredentialsTextFld()
	{
		return elePasswordKraftlyCredentialsTextFld;
	}
	
	@FindBy(id="ga_signin")
	private WebElement eleSignInBTN;
	
	
	public WebElement getEleSignBTN() {
		// TODO Auto-generated method stub
		return eleSignInBTN;
	}

}

package com.kraftly.scripts;


import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.kraftly.generics.Auto_Constatnts;
import com.kraftly.generics.BaseTest;
import com.kraftly.generics.GenericMethods;
import com.kraftly.generics.InputData;
import com.kraftly.pageobjects.GoogleSignIn;
import com.kraftly.pageobjects.HomePage;

import com.kraftly.pageobjects.LoginPage;
import com.kraftly.pageobjects.ProductDetailsPage;
import com.kraftly.pageobjects.CartPage;
import com.kraftly.pageobjects.Collections;

public class TC_1 extends BaseTest {
		
	@Test
	public void test1() throws InterruptedException, IOException
		{
			//Instance creation
			HomePage homePagePO= new HomePage(driver, wait);
			
			LoginPage loginPagePO= new LoginPage(driver, wait);
				
			GoogleSignIn googleSignInPO= new GoogleSignIn(driver, wait);
			
			Collections collectionsPO= new  Collections(driver, wait);
			
			ProductDetailsPage detailsPagepo= new ProductDetailsPage(driver, wait);
			
			CartPage cartPagepo= new CartPage(driver, wait);
			
			//to click on SignUp button
			homePagePO.getSignupBTN().click();
			Thread.sleep(10000);
			
			loginPagePO.geteleSignWithGoogle().click();
			//switch to google login page
			GenericMethods.switchtoWindowTitle(driver, "Sign in - Google Accounts");
			
			Thread.sleep(10000);
			String email= InputData.getPropertyValue(Auto_Constatnts.INPUTPROPERTIES_PATH,"EMAILID");
			String password	= InputData.getPropertyValue(Auto_Constatnts.INPUTPROPERTIES_PATH, "PASSWORD");
			
			googleSignInPO.geteleGoogleEmailTextFld().sendKeys(email);
			Thread.sleep(1000);
			
			googleSignInPO.geteleGoogleEmailNextBTN().click();
			Thread.sleep(1000);
			googleSignInPO.getEleGooglePasswordBTN().sendKeys(password);
			Thread.sleep(100);
			googleSignInPO.getEleGooglePasswordNextBTN().click();
			Thread.sleep(100);
			//switching to kraftly main page
			GenericMethods.switchtoWindowTitle(driver, "Kraftly");
			
		
			WebElement collectionLink = homePagePO.getEleCollectionLink();
			Actions act= new Actions(driver);
			act.moveToElement(collectionLink).perform();
			Thread.sleep(1000);
			WebElement allLatestCollections = collectionsPO.getEleAllLatestCollections();
			act.moveToElement(allLatestCollections).perform();
			Thread.sleep(1000);
			WebElement womensWestrenWearLink = collectionsPO.getEleWomensWestrenWearLink();
			act.moveToElement(womensWestrenWearLink).click().perform();
			Thread.sleep(1000);
			/*
			WebElement collectionWebelement = driver.findElement(By.xpath("//a[.='Collections']"));
			WebElement latestCollecn = driver.findElement(By.xpath("//a[.='Latest Collections ']"));
			WebElement westernWear = driver.findElement(By.xpath("//a[@href='/curations/sale-women-western-wear?ref=topmenu']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(collectionWebelement).perform();
			Thread.sleep(3000);
			act.moveToElement(latestCollecn).perform();
			Thread.sleep(2000);
			*/
			//act.moveToElement(westernWear).click().perform();
			//Thread.sleep(6000);
			
			
			

			/*
			GenericMethods.mouseMoveToElement(driver, homePagePO.getEleCollectionLink());
			Thread.sleep(1000);
			
			GenericMethods.mouseMoveToElement(driver, collectionsPO.getEleLatestCollectionLink());
			Thread.sleep(1000);
		    GenericMethods.mouseMoveToElement(driver, collectionsPO.getEleWomensWestrenWearLink());
		    
		    collectionsPO.getEleWomensWestrenWearLink().click();
		    
		    Thread.sleep(1000);
		   
		   
		   
		
		
			WebElement collections = driver.findElement(By.id("collection"));
			WebElement latestCollection = driver.findElement(By.xpath("//a[text()='Latest Collections ']"));
			WebElement womensWesterWear = driver.findElement(By.xpath("//a[@href='/curations/sale-women-western-wear?ref=topmenu']"));
			Actions act= new Actions(driver);
			act.moveToElement(collections).perform();
			Thread.sleep(5000);
			act.moveToElement(latestCollection).perform();
			Thread.sleep(5000);
			act.moveToElement(womensWesterWear).click().perform();
			
			Thread.sleep(5000);
			//GenericMethods.switchtoWindowTitle(driver, "Women's Westren Wear");
			

				
			/*
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[@src='https://sellon.kraftly.com/web/tr:f-auto,w-250,h-250,c-maintain_ratio,pr-true/shop_29130/B473-70901_1_1472490844.jpg']")).click();
			GenericMethods.switchtoWindowTitle(driver, "Buy Glambing yellow designer crepe dress for women at 51% off in India - Kraftly - June 2018");
			Thread.sleep(10000);
			WebElement selectSize = driver.findElement(By.id("select-option"));
			
			GenericMethods.dropDown(selectSize, 0);
			Thread.sleep(100000);
		
			
			detailsPagepo.clickOnAddToCart().click();
			Thread.sleep(1000);

			GenericMethods.switchtoWindowTitle(driver, "Add to Cart - Your favourite products you selected at kraftly");
			Thread.sleep(1000);
			cartPagepo.clickOnPlaceOrder().click();
			
			driver.findElement(By.id("codpay")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("cod_pay_button")).click();
			Thread.sleep(1000);
			
			homePagePO.getEleAccountBTN().click();
			
			homePagePO.getEleLogOutLink().click();
			
			*/
			
			
			
			
	
	
		
		
		
		
		
		
		
		
			
			
		
		}
		
}

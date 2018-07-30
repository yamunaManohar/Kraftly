package com.kraftly.scripts;


import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Set;

import javax.security.auth.login.AccountNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
import com.relevantcodes.extentreports.LogStatus;
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
			
			Thread.sleep(1000);
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
			homePagePO.getEleAccountBTN().click();
			String userName = homePagePO.getEleDetails().getText();
			
			//GenericMethods.webDriverWaitTitleContains(driver,"Hi");
			Assert.assertEquals(userName, "Hi Flagroot");
			
			GenericMethods.HoverAndClick(driver, homePagePO.getEleCollectionLink(), collectionsPO.getEleLatestCollectionLink(),collectionsPO.getEleGiftsUnder499());
			GenericMethods.webDriverWaitVisibilityOfElement(driver, detailsPagepo.getCheckBoxMoreThan50());
			GenericMethods.mouseMoveToElement(driver, detailsPagepo.getCheckBoxMoreThan50());
			detailsPagepo.getCheckBoxMoreThan50().click();
			GenericMethods.pageDown(homePagePO.getEleScroll());
		/*	WebElement elem = driver.findElement(By.xpath(".//body"));
			//elem.sendKeys(Keys.PAGE_UP);
			elem.sendKeys(Keys.PAGE_DOWN);*/
			Thread.sleep(5000);
			logger.log(LogStatus.PASS, "This test is passed");
		}
		
}

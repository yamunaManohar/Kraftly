package com.kraftly.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.kraftly.generics.Auto_Constatnts;
import com.kraftly.generics.BaseTest;
import com.kraftly.generics.GenericMethods;
import com.kraftly.generics.InputData;
import com.kraftly.pageobjects.GoogleSignIn;
import com.kraftly.pageobjects.HomePage;
import com.kraftly.pageobjects.LoginPage;
import com.kraftly.pageobjects.ProductDetailsPage;

public class TC_2 extends BaseTest {
	
	@Test

	public void test2() throws InterruptedException, IOException
	{
		LoginPage loginPagePO= new LoginPage(driver, wait);
		
		HomePage homePagePo = new HomePage(driver, wait);
		
		GoogleSignIn googleSignInPO= new GoogleSignIn(driver, wait);
		
		ProductDetailsPage detailsPage= new ProductDetailsPage(driver, wait);
		
		homePagePo.getSignupBTN().click();
		
		Thread.sleep(1000);
		
		
		loginPagePO.geteleSignWithGoogle().click();
		
		Thread.sleep(1000);
		
		loginPagePO.geteleSignInLink().click();
		
		Thread.sleep(1000);
		
		GenericMethods.switchtoWindowTitle(driver, "Sign in - Google Accounts");
		
		String email = InputData.getPropertyValue(Auto_Constatnts.INPUTPROPERTIES_PATH,"EMAILID");
		String password =  InputData.getPropertyValue(Auto_Constatnts.INPUTPROPERTIES_PATH,"PASSWORD");
		
		googleSignInPO.geteleGoogleEmailTextFld().sendKeys(email);
		Thread.sleep(1000);
		googleSignInPO.geteleGoogleEmailNextBTN().click();
		Thread.sleep(1000);
		googleSignInPO.getEleGooglePasswordBTN().sendKeys(password);
		Thread.sleep(1000);
		googleSignInPO.getEleGooglePasswordNextBTN().click();
		Thread.sleep(1000);
		
		GenericMethods.switchtoWindowTitle(driver, "Kraftly");
		Thread.sleep(1000);
		homePagePo.getEleSearchInput().sendKeys("pink colour watch");
		Thread.sleep(10000);
		homePagePo.getEleSearchBTN().click();
		Thread.sleep(1000);
		
		
		//cant find the search results page and elements
		GenericMethods.switchtoWindowTitle(driver, "Search Page");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@src='https://sellon.kraftly.com/web/tr:f-auto,w-259,pr-true/shop_91383/product_img_91383_1525013647.jpg']")).click();
		Thread.sleep(1000);
		detailsPage.clickOnAddToCart().click();
		Thread.sleep(1000);
		
		
		
		
		
	}
	

}

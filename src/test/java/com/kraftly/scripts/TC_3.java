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

public class TC_3 extends BaseTest {
	
	@Test
	public void Filter() throws InterruptedException, IOException
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
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='https://sellon.kraftly.com/web/tr:f-auto,w-250,h-250,c-maintain_ratio,pr-true/shop_29130/B473-70901_1_1472490844.jpg']")).click();
		GenericMethods.switchtoWindowTitle(driver, "Buy Glambing yellow designer crepe dress for women at 51% off in India - Kraftly - June 2018");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-heart-o']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='yourLikes']")).click();
		Thread.sleep(1000);
		GenericMethods.switchtoWindowTitle(driver, "Explore Flagroot Test's Favorite Products On Kraftly");
		Thread.sleep(1000);
		
	}
}

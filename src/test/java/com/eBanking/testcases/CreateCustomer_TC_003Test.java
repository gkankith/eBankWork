package com.eBanking.testcases;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.eBanking.Generic_Utility.BaseClass;
import com.eBanking.Generic_Utility.File_Utility;
import com.eBanking.Generic_Utility.Webdriver_Utility;
import com.eBanking.pageobjects.CreateCustomer;
import com.eBanking.pageobjects.HomePage;
import com.eBanking.pageobjects.LoginPage;

public class CreateCustomer_TC_003Test extends BaseClass {
	
	@Test
	public void createCustomer_TC_003() throws IOException, InterruptedException {
		
		File_Utility f=new File_Utility();
		String baseurl=f.getPropertyData("url");
		String uname=f.getPropertyData("username");
		String pass=f.getPropertyData("password");
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		lp.login(uname, pass);
		lp.clickOnLogin();
		HomePage hp=new HomePage(driver);
		hp.clickNewCust();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("svg[fill='#5F6368']")).click();
		
		CreateCustomer cc=new CreateCustomer(driver);
		cc.enterCustName("ankith");
		cc.clickOnMaleGenderRadio();
		cc.enterDateOfBirth("17","01","1995");
		cc.enterAddress("Dwarakamayee home SarvabhoumaNagar Arekere");
		cc.enterCity("Banglore");
		cc.enterState("Karnataka");
		cc.enterPostal(577547);
		cc.enterMobileno(876216222);
		cc.enterEmail("gkankith143@gmail.com");
		cc.enterPassword("ankith@ebanking");
		cc.clickOnSubmit();
		
	}

}

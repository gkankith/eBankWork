package com.eBanking.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.eBanking.Generic_Utility.File_Utility;
import com.eBanking.Generic_Utility.Webdriver_Utility;
import com.eBanking.pageobjects.HomePage;
import com.eBanking.pageobjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	
	@Test
	public void launch() throws Throwable {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		File_Utility f=new File_Utility();
		String baseurl=f.getPropertyData("url");
		System.out.println(baseurl);
		driver.get(baseurl);
		String uname=f.getPropertyData("username");
		String pass = f.getPropertyData("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(uname, pass);
		lp.clickOnLogin();
		HomePage hp=new HomePage(driver);
		hp.clickLogout();
		Webdriver_Utility wlib=new Webdriver_Utility();
		wlib.handleAlertPopup(driver);
	}

}

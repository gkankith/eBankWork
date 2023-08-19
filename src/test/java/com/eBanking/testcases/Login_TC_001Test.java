package com.eBanking.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.eBanking.Generic_Utility.BaseClass;
import com.eBanking.Generic_Utility.File_Utility;
import com.eBanking.pageobjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TC_001Test extends BaseClass{
	
	
	@Test
	public void login_TC_001Test() throws Throwable
	{
		
		File_Utility f=new File_Utility();
		String baseurl = f.getPropertyData("url");
		String uname = f.getPropertyData("username");
		String pass = f.getPropertyData("password");
		System.out.println(baseurl+" "+uname+" "+pass);
		driver.get(baseurl);
		LoginPage l=new LoginPage(driver);
		l.login(uname, pass);
		l.clickOnLogin();
		
	}

}

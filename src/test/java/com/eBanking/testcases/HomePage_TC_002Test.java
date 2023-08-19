package com.eBanking.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.eBanking.Generic_Utility.BaseClass;
import com.eBanking.Generic_Utility.File_Utility;
import com.eBanking.Generic_Utility.Webdriver_Utility;
import com.eBanking.pageobjects.HomePage;
import com.eBanking.pageobjects.LoginPage;

public class HomePage_TC_002Test extends BaseClass{
	
	@Test
	public void homePage_TC_002Test() throws Throwable {
		File_Utility f=new File_Utility();
		String baseurl = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		
		driver.get(baseurl);
		LoginPage l=new LoginPage(driver);
		l.login(un, pwd);
		l.clickOnLogin();
		
		HomePage hp=new HomePage(driver);
		hp.clickNewCust();
		
		
	}

}

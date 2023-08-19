package com.eBanking.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eBanking.Generic_Utility.BaseClass;
import com.eBanking.Generic_Utility.Excel_Utility;
import com.eBanking.Generic_Utility.File_Utility;
import com.eBanking.pageobjects.HomePage;
import com.eBanking.pageobjects.LoginPage;

public class Practice extends BaseClass{

	@Test(dataProvider="LoginData")
	public void loinddt(String user,String pass) throws Throwable {
		File_Utility f=new File_Utility();
		String baseurl = f.getPropertyData("url");
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		lp.login(user, pass);
		lp.clickOnLogin();
		HomePage hp=new HomePage(driver);
		hp.clickLogout();
	}
	
	@DataProvider(name="LoginData")
	String  [][] getData() throws Throwable
	{
		Excel_Utility ex=new Excel_Utility();
		int cellcount=ex.getCellCount("Sheet1", 1);
		int rowcount = ex.getRowCount("Sheet1");
		
		String logindata[][]=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				logindata[i-1][j]=ex.readExcelData("Sheet1",i,j);
			}
		}
		return logindata;
	}
}

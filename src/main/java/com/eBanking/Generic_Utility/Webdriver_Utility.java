package com.eBanking.Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Webdriver_Utility {
	
	public void handleAlertPopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void doubleClick(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.doubleClick(null)	;
		
	}
	
	public void handleHiddenDivPopup(WebDriver driver,WebElement element) {
		element.click();
	}

}

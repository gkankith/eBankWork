package com.eBanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(linkText="New Customer")
	private WebElement newcustlink;
	
	@FindBy(linkText="Edit Customer")
	private WebElement editcustlink;
	
	@FindBy(linkText="Delete Customer")
	private WebElement delcustlink;
	
	@FindBy(linkText="Log out")
	private WebElement logoutlink;
	
	/*@FindBy(linkText="New Account")
	private WebElement newacclink;
	
	@FindBy(linkText="Edit Account")
	private WebElement editacclink;
	
	@FindBy(linkText="Delete Account")
	private WebElement deleteacclink;*/
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getNewcustlink() {
		return newcustlink;
	}

	public WebElement getEditcustlink() {
		return editcustlink;
	}

	public WebElement getDelcustlink() {
		return delcustlink;
	}
	
	
	
	//logic
	
	public void clickLogout() {
		logoutlink.click();
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public void clickNewCust() {
		newcustlink.click();
		
	}
	
	public void clickEditCust() {
		editcustlink.click();
		
	}
	public void clickDeleteCust() {
		delcustlink.click();
	}
	
}
	

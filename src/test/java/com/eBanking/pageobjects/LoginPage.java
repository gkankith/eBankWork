package com.eBanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="uid")
	private WebElement untxt;
	
	@FindBy(name="password")
	private WebElement pwdtxt;
	
	@FindBy(name="btnLogin")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntxt() {
		return untxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	//logic
	public void login(String un, String pwd )
	{
		untxt.sendKeys(un);
		pwdtxt.sendKeys(pwd);
		
	}
	public void clickOnLogin()
	{
		lgbtn.click();
	}
}

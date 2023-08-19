package com.eBanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {
	
	@FindBy(name="name")
	private WebElement custnametxt;
	
	@FindBy(xpath="//input[@name='rad1' and @value='m']")
	private WebElement maleradbtn;
	
	@FindBy(xpath="//input[@name='rad1' and @value='f']")
	private WebElement femaleradbtn;

	@FindBy(id="dob")
	private WebElement dob;
	
	@FindBy(name="addr")
	private WebElement addresstxt;
	
	@FindBy(name="city")
	private WebElement citytxt;
	
	@FindBy(name="state")
	private WebElement statetxt;
	
	@FindBy(name="pinno")
	private WebElement pintxt;
	
	@FindBy(name="telephoneno")
	private WebElement mobilenotxt;
	
	@FindBy(name="emailid")
	private WebElement emailtxt;
	
	@FindBy(name="password")
	private WebElement passtxt;
	
	@FindBy(name="sub")
	private WebElement submitbtn;
	
	
	public CreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getCustnametxt() {
		return custnametxt;
	}


	public WebElement getMaleradbtn() {
		return maleradbtn;
	}


	public WebElement getFemaleradbtn() {
		return femaleradbtn;
	}


	public WebElement getDob() {
		return dob;
	}


	public WebElement getAddresstxt() {
		return addresstxt;
	}


	public WebElement getCitytxt() {
		return citytxt;
	}


	public WebElement getStatetxt() {
		return statetxt;
	}


	public WebElement getPintxt() {
		return pintxt;
	}


	public WebElement getMobilenotxt() {
		return mobilenotxt;
	}


	public WebElement getEmailtxt() {
		return emailtxt;
	}


	public WebElement getPasstxt() {
		return passtxt;
	}


	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	//logic
	
	public void enterCustName(String uname)
	{
		custnametxt.sendKeys(uname);
	}
	
	public void clickOnMaleGenderRadio() {
		maleradbtn.click();
	}
	
	public void clickOnFemaleGenderRadio() {
		femaleradbtn.click();
	}
	
	public void enterDateOfBirth(String date,String month,String year) {
		dob.sendKeys(date);
		dob.sendKeys(month);
		dob.sendKeys(year);
	}
	
	public void enterAddress(String add)
	{
		addresstxt.sendKeys(add);
	}
	public void enterCity(String city)
	{
		citytxt.sendKeys(city);
	}
	public void enterState(String state)
	{
		statetxt.sendKeys(state);
	}
	public void enterPostal(int postcode)
	{
		pintxt.sendKeys(String.valueOf(postcode));
	}
	public void enterMobileno(int mobile)
	{
		mobilenotxt.sendKeys(String.valueOf(mobile));
	}
	public void enterEmail(String email)
	{
		emailtxt.sendKeys(email);
	}
	public void enterPassword(String pass)
	{
		passtxt.sendKeys(pass);
	}
	public void clickOnSubmit()
	{
		submitbtn.click();
	}
	
	
}

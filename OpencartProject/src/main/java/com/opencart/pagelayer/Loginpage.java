 package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.TestBase;

public class Loginpage  {
	
	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	//-----obj repo------
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Email_address;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password;

	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement Login_btn;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]")
	WebElement erroe_msgs;
	//----------actions------
	
	public void enterEmailAddress(String data)
	{
		Email_address.sendKeys(data);
	}
	public void enterPassword(String data)
	{
		Password.sendKeys(data);
	}
	public void  clickOnLoginButton()
	{
		Login_btn.click();
	}
	public String getErrorsmsg()
	{
		String msg2 = erroe_msgs.getText();
		return msg2;
	}
	
	
}

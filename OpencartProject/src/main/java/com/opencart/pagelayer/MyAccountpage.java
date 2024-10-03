package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountpage {

	public MyAccountpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")
	private WebElement Myaccount_text;
	
	@FindBy(xpath="//a[contains(text(),'Modify your address book entries')]")
	WebElement address_book_link;
	
	public void clickOnAddressBookLink()
	{
		address_book_link.click();
	}
	
	public String getSuccessMsg()
	{
		String msgs=Myaccount_text.getText();
		return msgs;
	}
}

package com.opencart.testlayer;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.opencart.pagelayer.Homepage;
import com.opencart.pagelayer.Loginpage;
import com.opencart.pagelayer.MyAccountpage;
import com.opencart.testbase.TestBase;

//@Listeners(com.opencart.utilities.ListenerSetup.class)

public class Logintest  extends TestBase{
	@Test
	public void verifyLogintestWithValidDetails()
	{
	String expected_result="My Account";
	Homepage homepage_obj=new Homepage(driver);
	Loginpage loginpage_obj= new Loginpage(driver);
	MyAccountpage myaccountpage_obj=new MyAccountpage(driver);
	homepage_obj.clickOnMyAccountLink();
	homepage_obj.clickOnLoginLink();
	
	loginpage_obj.enterEmailAddress("priyanka123456789@gmail.com");
	loginpage_obj.enterPassword("priyanka12345");
	loginpage_obj.clickOnLoginButton();
	String actual_result=myaccountpage_obj.getSuccessMsg();
	
	System.out.println(actual_result);
	
	Assert.assertEquals(actual_result,expected_result);
	}
	@Test
	public void verifyLogintestWithInValidDetails()
	{
	String expected_result="Warning: No match for E-Mail Address and/or Password.";
	Homepage homepage_obj=new Homepage(driver);
	Loginpage loginpage_obj= new Loginpage(driver);
	MyAccountpage myaccountpage_obj=new MyAccountpage(driver);
	homepage_obj.clickOnMyAccountLink();
	homepage_obj.clickOnLoginLink();
	
	loginpage_obj.enterEmailAddress("priyanka123456789@gmail.com");
	loginpage_obj.enterPassword("priyanka11");
	loginpage_obj.clickOnLoginButton();
	String actual_result=loginpage_obj.getErrorsmsg();
	
	System.out.println(actual_result);
	
	Assert.assertEquals(actual_result,expected_result);
	}

}

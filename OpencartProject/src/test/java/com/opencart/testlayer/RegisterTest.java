package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.Homepage;
import com.opencart.pagelayer.Registerpage;
import com.opencart.testbase.TestBase;

public class RegisterTest extends TestBase {
	@Test
	public void verifyRegisterWithValidDetails()
	{
		String expected_result = "Your Account Has Been Created";
		Homepage homepage_obj=new Homepage(driver);
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnRegisterLink();
		Registerpage registerpage_obj=new Registerpage(driver);
		registerpage_obj.enterFirstName("priyankaa");
		registerpage_obj.enterLastName("raikwar");
		registerpage_obj.enterEmail("priyanka123456789@gmail.com");
		registerpage_obj.entertelephone("1234567");
		registerpage_obj.enterPassword("priyanka12345");
		registerpage_obj.enterConfirmPassword("priyanka12345");
		registerpage_obj.clickOnPrivacyPolicyCheckbox(); 
		registerpage_obj.clickOnContinueButton();
		
		String actual_result = registerpage_obj.getSuccessfulMessage();
		System.out.println(actual_result);
	
		Assert.assertEquals(actual_result,expected_result);
		
		
		
	}
	
	

}

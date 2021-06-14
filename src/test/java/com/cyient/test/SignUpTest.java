package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.SignupPage;

public class SignUpTest extends WebDriverWrapper {

	@Test

	public void signInTest() throws Exception

	{
		SignupPage signup =new SignupPage(driver);
		signup.passCookie();
		signup.popUp();
		signup.selectSignin();
		signup.selectUsername("h2@gmail.com");
		signup.selectSignIn();
		//signup.getErrorMessage();
		String actualValue = signup.getErrorMessage();
		System.out.println(actualValue);
	    Assert.assertEquals(actualValue,signup.getErrorMessage());
	
	
}
}
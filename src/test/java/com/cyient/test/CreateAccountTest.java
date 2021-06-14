package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.CreateAccountPage;
import com.cyient.page.SignupPage;
import com.cyient.utilities.DataProviderUtils;

public class CreateAccountTest extends WebDriverWrapper {
	@Test(dataProvider="NewUserExcelData",dataProviderClass=DataProviderUtils.class)

	public void joinInTest(String fname, String lname, String mail, String pass) throws InterruptedException {
		
		
		CreateAccountPage create =new CreateAccountPage(driver);
		create.selectJoin();
		create.sendfirstName(fname);
		create.sendLastName(lname);
		create.sendMail(mail);
		create.sendPassword(pass);
		create.selectCreate();
		Thread.sleep(3000);
		String actualValue = create.getErrorMessage();
		System.out.println(actualValue);
	    Assert.assertEquals(actualValue,create.getErrorMessage());
	

		/*driver.findElement(By.xpath("//a[text()='Join now']")).click();
		driver.findElement(By.id("firstName")).sendKeys("shraddha");
		driver.findElement(By.id("lastName")).sendKeys("Hiwarkar");
		driver.findElement(By.id("emailAddress")).sendKeys("h2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Hiwarkar,123");
		// driver.findElement(By.xpath("//span[@class='block
		// option__labelMarker']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Create account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Please agree to the Terms of Use']")).click();*/
	}
}

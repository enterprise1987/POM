package com.facebook.TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fbk.TestBaseDemo.TestBase;
import com.fbk.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage o;
	String title;
	String ExpectedTitle="Facebook";
	public LoginPageTest()
	{
		super();
	}
	@BeforeSuite
	public void SetUp()
	{
		initialisation();
		o=new LoginPage();
	}
	@Test
	public void VerifyTitle()
	{
		//SoftAssert softassertions=new SoftAssert();
		title=o.verifytitle();
		System.out.println(title);
		//softassertions.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test
	public void Login()
	{
		o.verifyLogin();
	}
	@AfterSuite
	public void Close_Browser()
	{
		driver.close();
	}
}

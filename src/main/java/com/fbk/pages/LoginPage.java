package com.fbk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbk.TestBaseDemo.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement usermail;
	
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);   // pageFactory is  a class and initelements initiates the elements
	}
	
	public String verifytitle()
	{
		return driver.getTitle();
	}
	public void verifyLogin()
	{
		usermail.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
	}
}
	



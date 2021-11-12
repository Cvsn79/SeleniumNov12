package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(id="user_login")
	private WebElement uname;
	
	@FindBy(id="user_password")
	private WebElement pass;
	
	@FindBy(name="submit")
	private WebElement SignIn;
	
	@FindBy(css = "#login_form > div.alert.alert-error")
	private WebElement ErrorMsg;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String GetErrorMsgText()
	{
		String Errormessage = ErrorMsg.getText();
		return Errormessage;
		
	}
	
	public void ApplicationLogin(String LoginName,String Loginpwd)
	{
		uname.sendKeys(LoginName);
		pass.sendKeys(Loginpwd);
		SignIn.click();
		
	}
	
	
	}

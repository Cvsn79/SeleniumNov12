package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirm 
{
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement ConfirmText;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement username;
	
	@FindBy(id="logout_link")
	private WebElement logout;
	
	@FindBy(id="signin_button")
	private WebElement Signin;
	
	
	public TransferFundsConfirm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutfromapplication()
	{
		username.click();
		logout.click();
		Signin.click();
	}
	public String TransferconfirmText()
	{
	String ActualText = ConfirmText.getText();
	return ActualText;			
	}
}

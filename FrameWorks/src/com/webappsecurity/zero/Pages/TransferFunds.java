package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFunds {
	
	@FindBy(partialLinkText="Funds")
	private WebElement TransferFunds;
	
	public TransferFunds(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clicktransferfunds()
	{
		TransferFunds.click();
	}
	
	public Boolean isTransferFundsPresent()
	{
	Boolean transferFundspresent =	TransferFunds.isDisplayed();
	return transferFundspresent;
	}

}

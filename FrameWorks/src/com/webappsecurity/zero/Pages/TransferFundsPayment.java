package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPayment {
	
	@FindBy(id="tf_fromAccountId")
	private WebElement FromAccount;
	
	@FindBy(id="tf_toAccountId")
	private WebElement ToAccount;
	
	@FindBy(id="tf_amount")
	private WebElement Amount;
	
	@FindBy(id="tf_description")
	private WebElement Description;
	
	@FindBy(id="btn_submit")
	private WebElement ButtonSubmit;
	

	
	public TransferFundsPayment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void PaymentTransfer(String Amt, String Descript)
	{
		
		
		Select FromActDD = new Select(FromAccount);
		FromActDD.selectByIndex(2);
		
		Select ToActDD = new Select(ToAccount);
		ToActDD.selectByIndex(3);
		
		Amount.sendKeys(Amt);
		Description.sendKeys(Descript);
		ButtonSubmit.click();
		
		
	}

}

package com.webappsecurity.zero.Testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFunds;
import com.webappsecurity.zero.Pages.TransferFundsConfirm;
import com.webappsecurity.zero.Pages.TransferFundsPayment;
import com.webappsecurity.zero.Pages.TransferFundsVerify;

import utils.GenericMethods;

public class VerifyFundTransferTest extends Base 
{

	@Test
	
	public void VerifyFundTransfer() throws IOException
	{
		Login lp = new Login(driver);
		TransferFunds tf = new TransferFunds(driver);
		TransferFundsPayment tfp = new TransferFundsPayment(driver);
		TransferFundsVerify tfv = new TransferFundsVerify(driver);
		TransferFundsConfirm tfc = new TransferFundsConfirm(driver);
		
		String[][] data = GenericMethods.getData("C:\\Users\\neera\\Full Testing\\Selinium\\Testdata.xlsx", "Product");
		
		for (int i = 1; i<data.length; i++)
		{
		lp.ApplicationLogin(data[i][0], data[i][1]);
		tf.clicktransferfunds();
		tfp.PaymentTransfer(data[i][2], data[i][3]);
		tfv.button_submit_verify();
		String actualText = tfc.TransferconfirmText();
		String expectedText = data[i][4];
		Assert.assertEquals(actualText, expectedText);
		tfc.logoutfromapplication();
		}

}
}
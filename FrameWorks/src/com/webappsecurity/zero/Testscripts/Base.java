package com.webappsecurity.zero.Testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	WebDriver driver;
	@BeforeClass   //For batch execution need to specify class for BeforeTest and AfterTest
					//as BeforeClass and AfterClass
	public void openbrowser()
	{
		 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

		driver = new ChromeDriver(capability);	
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	@AfterClass
	public void closeappl()
	{
		driver.close();
	}
	

}

package kdf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	WebDriver driver;
	
	public void openBrowser()
	{
		driver = new ChromeDriver();
	}
	
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void navigateApp(String url)
	{
		driver.get(url);
	}
	
	public void enterintextBox(String locatorValue, String Testdata)
	{
		driver.findElement(By.id(locatorValue)).sendKeys(Testdata);	
	}

	public void clickButton(String loc, String locvalue)
	{
		if (loc.equals("name"))
		{
		driver.findElement(By.name(locvalue)).click();
		}
	else if(loc.equals("xpath"))
		{
		driver.findElement(By.xpath(locvalue)).click();
		}
	}
	public String getMsg(String loc, String locvalue)
	{
		
		String errormsg = null;
		if(loc.equals("cssselector")) 
		{	
		 errormsg = driver.findElement(By.cssSelector(locvalue)).getText();
		}
		else if(loc.equals("id"))
		{
			errormsg = driver.findElement(By.id(locvalue)).getText();
		}
		return errormsg;
	}
	
	public void closeApp()
	{
		driver.close();
	}
}

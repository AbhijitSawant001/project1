package KiteTest;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_files.base_class;
import Library_files.utilityClass;
import Module1_login.kiteBuyEquityModulePage;
import Module1_login.kiteHomePage;
import Module1_login.kiteLogin1Page;
import Module1_login.kiteLogin2Page;



public class kiteTestClass extends base_class
{
	kiteLogin1Page login1;
	kiteLogin2Page login2;
	kiteHomePage home;
	kiteHomePage logOut;
	kiteBuyEquityModulePage buyEquity;
	
	int TCID;
	
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browserName) throws IOException
	{	
		 initilizeBrowser(browserName);
		 
		 login1=new kiteLogin1Page(driver);
		 login2=new kiteLogin2Page(driver);
		 home=new kiteHomePage(driver);
		 logOut=new kiteHomePage(driver);
		 buyEquity=new kiteBuyEquityModulePage(driver);
		
	}
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login1.inputKiteLogin1PageUserName(utilityClass.dataTC("UN"));
		login1.inputKiteLoginPage1Password(utilityClass.dataTC("PWD"));
		login1.clickKiteLoginPage1loginButton();
		login2.inputkiteLogin2PagePin(utilityClass.dataTC("PIN"));
		login2.clickkiteLogin2PageContinueButton();
		buyEquity.verifykiteBuyEquityModulePageDisplayed();
		
	}
	
	@Test
	public void verifyUserName() throws EncryptedDocumentException, IOException
	{	
		TCID=12345;
	
		String actUserName=home.verifykiteHomePageUserID();
		String expUserName=utilityClass.testData(0, 3);
		System.out.println(actUserName);
		System.out.println(expUserName);
	    assertEquals(actUserName, expUserName);
	}
	

	
	
//	@Test
//	public void verifyBuyModuleDisplayed() throws IOException 
//	{	
//		home.clickKiteHomePageBuy();
//		boolean displayResult=buyEquity.verifykiteBuyEquityModulePageDisplayed();
//		soft.assertTrue(displayResult,"The Buy Equity Module is Not Displayed");
//		
//	}
	

	@AfterMethod
	public void logOut(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			utilityClass.screenshot(driver, TCID);
		}
	
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
}

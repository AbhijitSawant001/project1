package Module1_login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteBuyEquityModulePage
{
	@FindBy(xpath="//div[@class='content']")private WebElement buyEquityModule;

	@FindBy(xpath="//button[@type='submit']")private WebElement buyButton;

	public kiteBuyEquityModulePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifykiteBuyEquityModulePageDisplayed() 
	{
		boolean result = buyEquityModule.isDisplayed();
		return result;
	}
}

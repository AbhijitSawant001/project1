package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2Page 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;
	public kiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputkiteLogin2PagePin(String pinNum)
	{
		pin.sendKeys(pinNum);
	}
	
	public void clickkiteLogin2PageContinueButton() 
	{
		continueBtn.click();
	}
	
}

package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin1Page 
{
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PW;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbtn;
	
	public kiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputKiteLogin1PageUserName(String user)
	{
		UN.sendKeys(user);
	}
	public void inputKiteLoginPage1Password(String pass)
	{
		PW.sendKeys(pass);
	}
	
	public void clickKiteLoginPage1loginButton()
	{
		loginbtn.click();
	}
	
	
}

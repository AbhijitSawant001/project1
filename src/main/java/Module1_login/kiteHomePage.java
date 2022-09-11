package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library_files.base_class;

public class kiteHomePage extends base_class
{	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutBtn;
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement buy;
	@FindBy(xpath="(//span[@class='nice-name'])[1]")private WebElement tataPower;
	
	public kiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifykiteHomePageUserID()
	{
		String actUserID = userID.getText();
		return actUserID;
	}
	
	
	
	public void clickKiteHomePageLogOut()
	{	
		userID.click();
		logOutBtn.click();
	}
	
	public void clickKiteHomePageBuy () 
	{
		Actions act=new Actions(driver);
		act.moveToElement(tataPower).perform();
		buy.click();
		
	}
	
	
	

}

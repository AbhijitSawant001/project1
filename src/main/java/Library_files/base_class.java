package Library_files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base_class 
{	public WebDriver driver;
	public void initilizeBrowser() throws IOException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijit\\eclipse-workspace\\kite_framework\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(utilityClass.dataTC("URL"));
	}

}

package Library_files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class base_class 
{	public WebDriver driver;
	public void initilizeBrowser(String browserName) throws IOException
	{
		if(browserName.equals("Chrome"))
		{
			ChromeOptions Option=new ChromeOptions();
			Option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\git\\project1\\project1\\Browsers\\chromedriver.exe");
			driver=new ChromeDriver(Option);
		}
		else if (browserName.equals("Edge")) 
		{
			EdgeOptions Option=new EdgeOptions();
			Option.addArguments("--disable-notifications");
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\LENOVO\\git\\project1\\project1\\Browsers\\msedgedriver.exe");
			driver=new EdgeDriver(Option);
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(utilityClass.dataTC("URL"));
	}

}

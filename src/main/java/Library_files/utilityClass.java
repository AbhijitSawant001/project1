package Library_files;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class utilityClass
{
	public static String testData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Abhijit\\eclipse-workspace\\kite_framework\\Test Data\\zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	public static void screenshot(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Abhijit\\eclipse-workspace\\selenium\\screenshots\\TestCase"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	public static String dataTC(String key) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Abhijit\\eclipse-workspace\\selenium\\src\\POM_DDF_TestNG_BaseClass_UtilityClass\\loginCredentials.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
		
	}
}

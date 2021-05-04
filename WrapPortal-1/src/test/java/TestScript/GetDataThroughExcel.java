package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataConfig;

public class GetDataThroughExcel 
{
	WebDriver driver;
	@Test(dataProvider="excelData")
	public void loginTest(String userName, String password)
	{
		System.setProperty("webdriver.chrome.driver", "./src/Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.wrapportal.com/");//beta url
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUserName")).sendKeys(userName);//demotest2 User
		driver.findElement(By.id("txtPassword")).sendKeys(password);//Password
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}
	//this work for us verified
	@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\TestDataFile.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(filePath);
		int row=config.getRowCount(0);
		
		Object[][] data = new Object[row][2];
		for(int i=1;i<row;i++)
		{
			data[i][0]=config.getExcelData("Sheet1", i, 0);
			data[i][1]=config.getExcelData("Sheet1", i, 1);
		}
		return data;
		
	}
}

package ObjectRepository_CPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CPO_ReportsModule 
{
	
	public static WebElement element;
	
	
	 static String selectProgram="//select[@id='ddlProject']";
	 static String selectCategory="//select[@id='ddlCategory']";
	 static String openReport="//table[@id='ReportsGrid']/tbody/tr[position()>1]//td[contains(text(),'Contractor Deduct Tracking')]/following::td[position()=1]/a";

	
	public static WebElement selectProgram(WebDriver driver)
	{
		element=driver.findElement(By.xpath(selectProgram));
		return element;
	}
	public static WebElement selectCategory(WebDriver driver)
	{
		element=driver.findElement(By.xpath(selectCategory));
		return element;
	}
	public static WebElement openReport(WebDriver driver, String reportName)
	{
		element=driver.findElement(By.xpath("//table[@id='ReportsGrid']/tbody/tr[position()>1]//td[contains(text(),'"+reportName+"')]/following::td[position()=1]/a"));
		return element;
	}
	

}

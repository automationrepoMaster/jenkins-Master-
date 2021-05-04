package ObjectRepository_NCP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_NCP_Enrollment_Tracking 
{
	
	public static WebElement element;
	
	
	 static String addFilterBtn="//input[@id='btnAddFilter']";
	 static String radioBtnTrade="//input[@id='rblSort_0']";
	 static String radioBtnContractor="//input[@id='rblSort_1']";
	 static String selectProgram="//select[@id='ListBox2']";
	 static String selectContractor="//select[@id='ListBox3']";
	 static String btnBuildReport="//input[@id='btnBuildReport']";
	 
	 static String reportHeader="//span[@id='Label1']";
	 
	 public static WebElement addFilterBtn(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(addFilterBtn));
		 return element;
		 
	 }
	 public static WebElement radioBtnTrade(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(radioBtnTrade));
		 return element;
		 
	 } public static WebElement radioBtnContractor(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(radioBtnContractor));
		 return element;
		 
	 } public static WebElement selectProgram(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(selectProgram));
		 return element;
		 
	 } public static WebElement selectContractor(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(selectContractor));
		 return element;
		 
	 } 
	 public static WebElement btnBuildReport(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(btnBuildReport));
		 return element;
		 
	 }
	 public static WebElement reportHeader(WebDriver driver)
	 {
		 element=driver.findElement(By.xpath(reportHeader));
		 return element;
		 
	 }
	 
}

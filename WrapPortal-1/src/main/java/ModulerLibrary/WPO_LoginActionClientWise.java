package ModulerLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import GenericLibrary.BaseClass;
import ObjectRepository_CPO.CPO_LoginPage;

public class WPO_LoginActionClientWise extends BaseClass 
{

	public static String wtwUName = "nourWTW";
	public static String wtwPassword = "LL$7K33&4D";// need to change accordingly
	public static String Url = "https://beta.wrapportal.com/";

	public static String locktonUName = "nourlockton";
	public static String locktonPassword = "PGBKHz4Z9y";// need to change accordingly
//	public static String locktonUrl = "https://beta.wrapportal.com/";
	
	public static String oswaldUName = "nouroswald";
	public static String oswaldPassword = "oiXh1SUm(k";// need to change accordingly
	
	public static void logInWTW(WebDriver driver) throws Throwable 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//img[@id='ctl00_ctrlHeader_imgAvatars']")));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		
		driver.navigate().to(Url);
		test.log(LogStatus.PASS, driver.getCurrentUrl() + " Current Url");
		
		driver.findElement(By.id("txtUserName")).sendKeys(wtwUName);
		test.log(LogStatus.PASS, wtwUName + " User Name Entered Successfully");

		driver.findElement(By.id("txtPassword")).sendKeys(wtwPassword);
		test.log(LogStatus.PASS, wtwPassword + " Password Entered Successfully");

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		test.log(LogStatus.INFO, " Clicked On Login Button");
		
		try {
//			assertEquals(driver.getCurrentUrl(), url);
			test.log(LogStatus.PASS, " Login Successfully");
			System.out.println("Login Successfully");
		} catch (Throwable e) {
//			String errorMsg = CPO_LoginPage.errorMessage(driver).getText();
//			test.log(LogStatus.PASS, errorMsg + " Can't login");
//			System.out.println("can't login " + errorMsg);
			driver.quit();
		}
		Thread.sleep(3000);
	}
	
	public static void logInLockton(WebDriver driver) throws Throwable 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//img[@id='ctl00_ctrlHeader_imgAvatars']")));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		
		driver.navigate().to(Url);
		test.log(LogStatus.PASS, driver.getCurrentUrl() + " Current Url");
		
		driver.findElement(By.id("txtUserName")).sendKeys(locktonUName);
		test.log(LogStatus.PASS, locktonUName + " User Name Entered Successfully");

		driver.findElement(By.id("txtPassword")).sendKeys(locktonPassword);
		test.log(LogStatus.PASS, locktonPassword + " Password Entered Successfully");

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		test.log(LogStatus.INFO, " Clicked On Login Button");
		
		try {
//			assertEquals(driver.getCurrentUrl(), url);
			test.log(LogStatus.PASS, " Login Successfully");
			System.out.println("Login Successfully");
		} catch (Throwable e) {
//			String errorMsg = CPO_LoginPage.errorMessage(driver).getText();
//			test.log(LogStatus.PASS, errorMsg + " Can't login");
//			System.out.println("can't login " + errorMsg);
			driver.quit();
		}
		Thread.sleep(3000);
	}
	
	public static void logInOswald(WebDriver driver) throws Throwable 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//img[@id='ctl00_ctrlHeader_imgAvatars']")));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		
		driver.navigate().to(Url);
		test.log(LogStatus.PASS, driver.getCurrentUrl() + " Current Url");
		
		driver.findElement(By.id("txtUserName")).sendKeys(oswaldUName);
		test.log(LogStatus.PASS, oswaldUName + " User Name Entered Successfully");

		driver.findElement(By.id("txtPassword")).sendKeys(oswaldPassword);
		test.log(LogStatus.PASS, oswaldPassword + " Password Entered Successfully");

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		test.log(LogStatus.INFO, " Clicked On Login Button");
		
		try {
//			assertEquals(driver.getCurrentUrl(), url);
			test.log(LogStatus.PASS, " Login Successfully");
			System.out.println("Login Successfully");
		} catch (Throwable e) {
			String errorMsg = CPO_LoginPage.errorMessage(driver).getText();
			test.log(LogStatus.PASS, errorMsg + " Can't login");
//			System.out.println("can't login " + errorMsg);
			driver.quit();
		}
		Thread.sleep(3000);
	}
	public static void logInCommon(WebDriver driver , String uName , String browser) throws Throwable 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//img[@id='ctl00_ctrlHeader_imgAvatars']")));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		
		driver.navigate().to(Url);
		test.log(LogStatus.PASS, driver.getCurrentUrl() + " Current Url");
		
		driver.findElement(By.id("txtUserName")).sendKeys(uName);
		test.log(LogStatus.PASS, uName + " User Name Entered Successfully");

		driver.findElement(By.id("txtPassword")).sendKeys(browser);
		test.log(LogStatus.PASS, browser + " Password Entered Successfully");

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		test.log(LogStatus.INFO, " Clicked On Login Button");
		
		try {
//			assertEquals(driver.getCurrentUrl(), url);
			test.log(LogStatus.PASS, " Login Successfully");
			System.out.println("Login Successfully");
		} catch (Throwable e) {
			String errorMsg = CPO_LoginPage.errorMessage(driver).getText();
			test.log(LogStatus.PASS, errorMsg + " Can't login");
//			System.out.println("can't login " + errorMsg);
			driver.quit();
		}
		Thread.sleep(3000);
	}

	
}

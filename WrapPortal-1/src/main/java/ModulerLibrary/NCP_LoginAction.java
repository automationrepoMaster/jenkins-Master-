package ModulerLibrary;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_NCP.NCP_LoginPage;


public class NCP_LoginAction extends BaseClass
{
	
	public static String uName="JimmySmith114211";//"JimmySmith113888";//"JimmySmith114211";//
	public static String password="uX6R1i0L7KxA";//"uO5J6h4K1UdS";//"uX6R1i0L7KxA";//
	public static String navigateURL="https://cp5beta.getenrolled.us/";//"https://cp5beta.getenrolled.us/";//https://cp5preprod.getenrolled.us/";//"https://cp5.getenrolled.us/";//"https://cp5preprod.getenrolled.us/";
	
	
	public static void logInNCP(WebDriver driver) throws Throwable
	{	
		driver.navigate().to(navigateURL);
		test.log(LogStatus.PASS,driver.getCurrentUrl()+ " Current Url");
		NCP_LoginPage.userName(driver).sendKeys(uName);
		//WebDriverCommonLib wb= new WebDriverCommonLib();
		//wb.waitForElemnet(NCP_LoginPage.password(driver));
		test.log(LogStatus.PASS,uName+ " User Name Entered Successfully");
		NCP_LoginPage.password(driver).sendKeys(password);
		test.log(LogStatus.PASS,password+ " Password Entered Successfully");
		Thread.sleep(3000);
		//wb.waitForElemnet(NCP_LoginPage.loginBtn(driver));
		NCP_LoginPage.loginBtn(driver).click();
		test.log(LogStatus.INFO, " Clicked On Login Button");
		try 
		{
			assertEquals(driver.getCurrentUrl(), navigateURL);
			 test.log(LogStatus.PASS," Login To New Contractor Portal Successfully");
				System.out.println("Login Successfully");
		} catch (Throwable e) 
		{
			String errorMsg=NCP_LoginPage.errorMessage(driver).getText();
			 test.log(LogStatus.PASS,errorMsg+ " Can't login");
			System.out.println("can't login "+errorMsg);
			driver.quit();
		}
		Thread.sleep(3000);
	}
}

package ModulerLibrary;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.LogStatus;
import GenericLibrary.BaseClass;
import ObjectRepository_NCP.NCP_LoginPage;

public class NCP_SponsorLoginAction extends BaseClass
{

	public static String uName="JimmySmith107442";//sponsor login 
	public static String password="iY5L6u3M7LqT";
	public static String navigateURL="https://cp5preprod.getenrolled.us/";//"https://cp5beta.getenrolled.us/";//https://cp5preprod.getenrolled.us/";//"https://cp5.getenrolled.us/";//"https://cp5preprod.getenrolled.us/";
	
	
	public static void logInNCP(WebDriver driver) throws Throwable
	{	
		driver.navigate().to(navigateURL);
		test.log(LogStatus.PASS,driver.getCurrentUrl()+ " Current Url");
		NCP_LoginPage.userName(driver).sendKeys(uName);
		test.log(LogStatus.PASS,uName+ " User Name Entered Successfully");
		NCP_LoginPage.password(driver).sendKeys(password);
		test.log(LogStatus.PASS,password+ " Password Entered Successfully");
		Thread.sleep(3000);
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

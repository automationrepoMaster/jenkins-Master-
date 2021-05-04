package ModulerLibrary;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.LogStatus;
import GenericLibrary.BaseClass;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_LoginPage;

public class CPO_LogInAction extends BaseClass {
	public static String uName = "JimmySmith114211";//"JimmySmith113888";//"JimmySmith114211";// "JimmySmith90022";
	public static String password = "uX6R1i0L7KxA";//"uO5J6h4K1UdS";//uX6R1i0L7KxA";// "Cs2t4Q ";
	public static String url="https://beta.getenrolled.us/Login/welcome.aspx";//"https://preprod.getenrolled.us/Login/welcome.aspx";//https://www.locktonwrap.com/Login/welcome.aspx";
	
	public static void logInCPO(WebDriver driver) throws Throwable {
		
		driver.navigate().to("https://beta.getenrolled.us/");//("https://preprod.getenrolled.us/");
		// driver.navigate().to("http://beta.getenrolled.us/");
//		driver.navigate().to("https://www.locktonwrap.com/");
		// driver.navigate().to("http://dev.getenrolled.us/");
		test.log(LogStatus.PASS, driver.getCurrentUrl() + " Current Url");
		CPO_LoginPage.userName(driver).sendKeys(uName);
		test.log(LogStatus.PASS, uName + " User Name Entered Successfully");
		CPO_LoginPage.password(driver).sendKeys(password);
		test.log(LogStatus.PASS, password + " Password Entered Successfully");
		CPO_LoginPage.loginBtn(driver).click();
		test.log(LogStatus.INFO, " Clicked On Login Button");
		try {
			assertEquals(driver.getCurrentUrl(), url);
			test.log(LogStatus.PASS, " Login To Contractor Portal Successfully");
			System.out.println("Login Successfully");
		} catch (Throwable e) {
			String errorMsg = CPO_LoginPage.errorMessage(driver).getText();
			test.log(LogStatus.PASS, errorMsg + " Can't login");
			System.out.println("can't login " + errorMsg);
			driver.quit();
		}
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		CPO_HomePage.AlertCloseBtn(driver).click();
		test.log(LogStatus.INFO, " Clicked On Alert Window Close Button");
		driver.switchTo().defaultContent();

	}
}

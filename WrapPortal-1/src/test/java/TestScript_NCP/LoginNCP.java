package TestScript_NCP;

import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.NCP_LoginAction;
import ModulerLibrary.NCP_ReportSelectAction;
import ObjectRepository_NCP.NCP_ReportPage;

public class LoginNCP extends BaseClass
{
	
	WebDriverCommonLib wb= new WebDriverCommonLib();
	String programName="Program7852";
	String reportName="Initial Deduct";
	
	
	@Test
	public void loginNCpTest() throws Throwable
	{
		NCP_LoginAction.logInNCP(driver);
		NCP_ReportSelectAction.selectReport(driver, programName,reportName);
		
		wb.selectSingleValueFromList(NCP_ReportPage.selectReportNameFromList(driver), reportName);	

		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		//driver.switchTo().window(wb.map.get("childID"));
		//driver.manage().window().maximize();
		
		
		driver.close();
		
	}
}

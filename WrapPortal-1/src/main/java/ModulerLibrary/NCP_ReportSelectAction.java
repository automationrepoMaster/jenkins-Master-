package ModulerLibrary;

import org.openqa.selenium.WebDriver;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository_NCP.NCP_HomePage;
import ObjectRepository_NCP.NCP_ReportPage;

public class NCP_ReportSelectAction extends BaseClass
{
	
	public static void selectReport(WebDriver driver,String programName, String reportName) throws Throwable
	{	
		WebDriverCommonLib wb=new WebDriverCommonLib();
		NCP_HomePage.ReportModule(driver).click();
		Thread.sleep(3000);
		NCP_ReportPage.selectProgramField(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValueFromList(NCP_ReportPage.selectProgramFromList(driver), programName);
		
		
		/*wb.selectSingleValueFromList(NCP_ReportPage.selectReportNameFromList(driver), reportName);	

		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
*/	
		
	}
}

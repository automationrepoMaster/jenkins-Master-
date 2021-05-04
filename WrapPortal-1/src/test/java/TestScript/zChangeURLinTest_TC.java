package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_MyProjectsModule;

public class zChangeURLinTest_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	
	@Test
	public void temp() throws Throwable
	{
		String ProgramName="Sony Tower Test";
		String ProjectName="Sony Project One";
		String TradeNo="721";
		String TradeName="Accommodation";
		String ContractorName="Sony 1 Contractor Company";
		String EnrollmentType="WC & GL Enrollment";
		
		String BaseUrl=driver.getCurrentUrl();//store base url for future use 
		CPO_LogInAction.logInCPO(driver);	
		/*Thread.sleep(5000);
		driver.switchTo().frame(0);
		CPO_HomePage.AlertCloseBtn(driver).click();
		test.log(LogStatus.INFO," Clicked On Alert Window Close Button");
		driver.switchTo().defaultContent();*/
		CPO_HomePage.IconMyProjects(driver).click();
		test.log(LogStatus.INFO, " Clicked On My Projects Page");
		wb.selectSingleValue(CPO_MyProjectsModule.selectProgram(driver), ProgramName);
		wb.selectSingleValue(CPO_MyProjectsModule.selectProjects(driver), ProjectName);
		wb.selectSingleValue(CPO_MyProjectsModule.selectTrade(driver), TradeName );
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",CPO_MyProjectsModule.selectContractorPackage(driver, ProgramName, ProjectName,TradeNo,ContractorName, EnrollmentType));
		test.log(LogStatus.PASS,ProgramName+" "+ProjectName+" "+ TradeNo+" "+ EnrollmentType+" Contractor Package Selected");
		
		driver.navigate().to(BaseUrl);//navigate to base url
		
//		driver.quit();
	}
	
}

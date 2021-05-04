package TestScipts_CPO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository_CPO.CPO_Add_CP_EnrollmentPage;
import ObjectRepository_CPO.CPO_Add_Closeout;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_MyProjectsModule;

public class CPO_Add_Closeout_Test extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test
	public void testCloseOut() throws Throwable {
		String ProgramName = "Automation Program dont touch";
		String ProjectName = "Test Project 10";//"Test 132 ON";//"Test Project 10";
		String TradeNo="Trade65412";
		String TradeName="Trade65412";
		String ContractorName = "Alex Comp2273";
		String EnrollmentType = "WC & GL Enrollment";
		String closeOutDate="10/30/2020";
		
		String BaseUrl = driver.getCurrentUrl();// store base url for future use
		CPO_LogInAction.logInCPO(driver);

		CPO_HomePage.IconMyProjects(driver).click();
		test.log(LogStatus.INFO, " Clicked On My Projects Page");
		wb.selectSingleValue(CPO_MyProjectsModule.selectProgram(driver), ProgramName);
		Thread.sleep(2500);
		wb.selectSingleValue(CPO_MyProjectsModule.selectProjects(driver), ProjectName);
		Thread.sleep(2500);
		wb.selectSingleValue(CPO_MyProjectsModule.selectTrade(driver), TradeName);

		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", CPO_MyProjectsModule.selectContractorPackage(driver, ProgramName,
				ProjectName, TradeNo, ContractorName, EnrollmentType));
		test.log(LogStatus.PASS, ProgramName + " " + ProjectName + " " + TradeNo + " " + EnrollmentType
				+ " Contractor Package Selected");
		js.executeScript("arguments[0].click();",CPO_Add_CP_EnrollmentPage.linkcloseout(driver));
		Thread.sleep(2500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		CPO_Add_Closeout.closeOutDateField(driver).sendKeys(closeOutDate);
		Thread.sleep(2000);
		CPO_Add_Closeout.closeOutDateField(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.INFO, " Closeout date added Successfully");
		Thread.sleep(1000);
		CPO_Add_Closeout.closeOutDateSaveBtn(driver).click();
		test.log(LogStatus.INFO, " Clicked On Closeout Date Save Button");
		js.executeScript("arguments[0].scrollIntoView();",CPO_Add_Closeout.companyName(driver));
		CPO_Add_Closeout.companyName(driver).sendKeys("ABC Company");
		test.log(LogStatus.INFO, " Company name Added Successfully");
		CPO_Add_Closeout.IndividualName(driver).sendKeys("ABC Testing");
		test.log(LogStatus.INFO, " individual Added Successfully");
		js.executeScript("arguments[0].scrollIntoView();",CPO_Add_Closeout.Telephone(driver));
		CPO_Add_Closeout.Telephone(driver).sendKeys("12456321456314");
		test.log(LogStatus.INFO, " Telephone Added Successfully");
		
		CPO_Add_Closeout.Email(driver).sendKeys("kiran@nourtek.com");
		test.log(LogStatus.INFO, " Email Added Successfully");
		
		CPO_Add_Closeout.CheckBox(driver).click();
		test.log(LogStatus.INFO, " Clicked on Final Check Box");
		
		js.executeScript("arguments[0].click();",CPO_Add_Closeout.saveAndClose(driver));
		test.log(LogStatus.INFO, " Clicked On Save And Close Button");
		
		CPO_Add_Closeout.CloseOutAlertTextArea(driver).sendKeys("Testing Closeout");
		test.log(LogStatus.INFO, " Alert Message Added Successfully");
		Thread.sleep(2000);
		
		CPO_Add_Closeout.CloseOutAlertSaveBtn(driver).click();
		test.log(LogStatus.INFO, " Clicked on Alert Save Button");
		
		driver.switchTo().window(wb.map.get("parentID"));
		driver.navigate().to(BaseUrl);// navigate to base url
		test.log(LogStatus.INFO, " Closeout Submitted Successfully");
		
	}
		
}

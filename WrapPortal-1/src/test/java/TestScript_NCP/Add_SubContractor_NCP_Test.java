package TestScript_NCP;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.NCP_LoginAction;
import ObjectRepository_NCP.EnrollCP_AddSubContractorPage;
import ObjectRepository_NCP.NCP_HomePage;

public class Add_SubContractor_NCP_Test extends BaseClass
{
WebDriverCommonLib wb= new WebDriverCommonLib();
	
	String programName="Sony Test 132";
	String projectName="Test 132 ON";
	String tradeName="TN7673";
	@Test
	public void testSubContractor() throws Throwable
	{
		String BaseUrl=driver.getCurrentUrl();
		
		NCP_LoginAction.logInNCP(driver);
		NCP_HomePage.btnFilterBy(driver).click();
		test.log(LogStatus.PASS, " Clicked On Filter Button");
		
		NCP_HomePage.selectProgramField(driver).click();
		test.log(LogStatus.PASS, " Clicked On Select Program Field");
		Thread.sleep(1000);
		wb.selectSingleValueFromList(NCP_HomePage.selectProgramFromList(driver),programName );
		test.log(LogStatus.PASS, programName+" Program Name successfully selected form drop down");
		Thread.sleep(1000);
		NCP_HomePage.selectProjectField(driver).click();
		test.log(LogStatus.PASS, " Clicked On Select Project Field");
		Thread.sleep(1000);
		wb.selectSingleValueFromList(NCP_HomePage.selectProjectFromList(driver),projectName );
		test.log(LogStatus.PASS, projectName+" Project Name successfully selected form drop down");
		Thread.sleep(1000);
		NCP_HomePage.selectTradeField(driver).click();
		test.log(LogStatus.PASS, " Clicked On Select Trade Field");
		Thread.sleep(1000);
		wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver), tradeName);
		test.log(LogStatus.PASS, tradeName+" Trade successfully selected form drop down");
		Thread.sleep(1000);
		NCP_HomePage.btnSearch(driver).click();
		test.log(LogStatus.PASS, " Clicked on Search Button");
		Thread.sleep(2000);
		NCP_HomePage.selectPreviewPanelProjectDropdown(driver, projectName).click();
		test.log(LogStatus.PASS, " Clicked on Selected Contractor Package");
		Thread.sleep(1000);
		NCP_HomePage.selectEnrollmentTab(driver, "Subcontractors").click();
		test.log(LogStatus.PASS, " Clicked on Enrollement View");
		Thread.sleep(3000);
		EnrollCP_AddSubContractorPage.addSubContractorsBtn(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Clicked on Add SubContractor Button");
		EnrollCP_AddSubContractorPage.subContractorCostSearchContractorField(driver).click();
		EnrollCP_AddSubContractorPage.subContractorCostSearchContractorField(driver).sendKeys("Alex");
		Thread.sleep(2000);
		EnrollCP_AddSubContractorPage.subContractorCostSearchContractorField(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, " SubContractor Selected successfully");
		EnrollCP_AddSubContractorPage.subContractorCostTradeField(driver).click();
		EnrollCP_AddSubContractorPage.subContractorCostTradeField(driver).sendKeys("Test");
		Thread.sleep(1500);
		test.log(LogStatus.PASS, " Trade Selected successfully");
		EnrollCP_AddSubContractorPage.subContractorCostTradeField(driver).sendKeys(Keys.TAB);
		EnrollCP_AddSubContractorPage.subContractorCostContractvalueField(driver).sendKeys("10000");
		test.log(LogStatus.PASS, " Contract Value Added successfully");
		EnrollCP_AddSubContractorPage.subContractorCostEstmitedStartDate(driver).click();
		EnrollCP_AddSubContractorPage.subContractorCostEstmitedStartDate(driver).sendKeys("08/15/2020");
		test.log(LogStatus.PASS, " Estimated Date Added successfully");
		EnrollCP_AddSubContractorPage.subContractorCostSaveBtn(driver).click();
		test.log(LogStatus.PASS, " Clicked on Save Button");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", EnrollCP_AddSubContractorPage.closeSubContractorWindow(driver));
		test.log(LogStatus.PASS, " Sub Contractor Added Successfully");
		driver.navigate().to(BaseUrl);
		
		
	}
}

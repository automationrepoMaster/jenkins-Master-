package TestScript_NCP;

import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;

public class Add_Claims_NCP_Test extends BaseClass
{
	
	WebDriverCommonLib wb= new WebDriverCommonLib();
	String programName="Automation Program dont touch";
	String projectName="Test 132 ON";
	String tradeName="T7026";
	
	/*@Test
	public void testClaims(String TestCaseName,String programName, String projectName , String tradeName) throws Throwable
	{*/
	@Test
	public void testClaims() throws Throwable
	{
		// Cliam Module Option in NCP and OCP is hidden in 06-02-2021 Release 
		
		
		/*
		 * String BaseUrl=driver.getCurrentUrl(); NCP_LoginAction.logInNCP(driver);
		 * NCP_HomePage.btnFilterBy(driver).click(); test.log(LogStatus.PASS,
		 * " Clicked On Filter Button");
		 * NCP_HomePage.selectProgramField(driver).click(); test.log(LogStatus.PASS,
		 * " Clicked On Select Program Field");
		 * wb.selectSingleValueFromList(NCP_HomePage.selectProgramFromList(driver),
		 * programName ); test.log(LogStatus.PASS,
		 * programName+" Program Name successfully selected form drop down");
		 * NCP_HomePage.selectProjectField(driver).click(); test.log(LogStatus.PASS,
		 * " Clicked On Select Project Field");
		 * wb.selectSingleValueFromList(NCP_HomePage.selectProjectFromList(driver),
		 * projectName ); test.log(LogStatus.PASS,
		 * tradeName+" Project Name successfully selected form drop down");
		 * Thread.sleep(1000); NCP_HomePage.selectTradeField(driver).click();
		 * Thread.sleep(1000); test.log(LogStatus.PASS,
		 * " Clicked On Select Trade Field");
		 * wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver),
		 * tradeName); test.log(LogStatus.PASS,
		 * tradeName+" Trade successfully selected form drop down");
		 * NCP_HomePage.btnSearch(driver).click(); test.log(LogStatus.PASS,
		 * " Clicked on Search Button"); Thread.sleep(2000);
		 * NCP_HomePage.selectPreviewPanelProjectDropdown(driver, projectName).click();
		 * test.log(LogStatus.PASS, " Clicked on Selected Contractor Package");
		 * Thread.sleep(1000); NCP_HomePage.selectEnrollmentTab(driver,
		 * "Claims").click(); test.log(LogStatus.PASS, " Clicked on Claims View");
		 * Thread.sleep(3000); EnrollCP_AddClaimsPage.addCliamsBtn(driver).click();
		 * test.log(LogStatus.PASS, " Clicked on Add Claims Button");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.claimDate(driver));
		 * EnrollCP_AddClaimsPage.claimDate(driver).sendKeys("05/05/2020");
		 * Thread.sleep(2000);
		 * EnrollCP_AddClaimsPage.claimDate(driver).sendKeys(Keys.TAB);
		 * test.log(LogStatus.PASS, " Claim Date Added Successfully");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.ClaimStatusField(driver));
		 * wb.selectSingleValueFromList(EnrollCP_AddClaimsPage.selectClaimStatusFromList
		 * (driver), "Open"); test.log(LogStatus.PASS,
		 * " Claim Status Added Successfully");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.claimNumber(driver));
		 * EnrollCP_AddClaimsPage.claimNumber(driver).sendKeys("Calim no 124521");
		 * test.log(LogStatus.PASS, " Claim Number Added Successfully");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.claimAmount(driver));
		 * EnrollCP_AddClaimsPage.claimAmount(driver).sendKeys("1000");
		 * test.log(LogStatus.PASS, " Claim Amount Added Successfully");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.ClaimTypeField(driver));
		 * wb.selectSingleValueFromList(EnrollCP_AddClaimsPage.selectClaimTypeFromList(
		 * driver), "General Liability"); test.log(LogStatus.PASS,
		 * " Claim Type Added Successfully");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.reportDate(driver));
		 * EnrollCP_AddClaimsPage.reportDate(driver).sendKeys("05/06/2020");
		 * test.log(LogStatus.PASS, " Claim Report Date Added Successfully");
		 * EnrollCP_AddClaimsPage.CloseDate(driver).click();
		 * EnrollCP_AddClaimsPage.CloseDate(driver).sendKeys("08/06/2020");
		 * test.log(LogStatus.PASS, " Claim Close Date Added Successfully");
		 * EnrollCP_AddClaimsPage.LossDate(driver).click();
		 * EnrollCP_AddClaimsPage.LossDate(driver).sendKeys("05/06/2020");
		 * test.log(LogStatus.PASS, " Claim Loss Date Added Successfully");
		 * EnrollCP_AddClaimsPage.LossTime(driver).click();
		 * EnrollCP_AddClaimsPage.LossTime(driver).sendKeys("100");
		 * test.log(LogStatus.PASS, " Claim Loss Time Added Successfully");
		 * wb.waitForElemnet(EnrollCP_AddClaimsPage.cliamDescriptionField(driver));
		 * EnrollCP_AddClaimsPage.cliamDescriptionField(driver).
		 * sendKeys("Testing Claims Field"); Thread.sleep(1500);
		 * test.log(LogStatus.PASS, " Claim Description Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantNameField(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantNameField(driver).sendKeys("Kiran");
		 * test.log(LogStatus.PASS, " Claimant Name Field Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantAddress1(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantAddress1(driver).
		 * sendKeys("Test Address 1 field"); test.log(LogStatus.PASS,
		 * " Claimant Address1 Field Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantAddress2(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantAddress2(driver).sendKeys("Address 2 field");
		 * test.log(LogStatus.PASS, " Claimant Address2 Field Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantCity(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantCity(driver).sendKeys("LA");
		 * test.log(LogStatus.PASS, " Claimant City Field Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantZIPCode(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantZIPCode(driver).sendKeys("12345678");
		 * test.log(LogStatus.PASS, " Claimant ZipCode Field Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantPhone(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantPhone(driver).sendKeys("1236547891234");
		 * test.log(LogStatus.PASS, " Claimant Phone Field Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantLostDays(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantLostDays(driver).sendKeys("100");
		 * test.log(LogStatus.PASS, " Claimant Lost Days Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantPartOfBody(driver).click();
		 * EnrollCP_AddClaimsPage.cliamantPartOfBody(driver).sendKeys("Test");
		 * test.log(LogStatus.PASS, " Claimant Part of Body Added Successfully");
		 * EnrollCP_AddClaimsPage.cliamantCauseDescription(driver).
		 * sendKeys("Testing Cause"); test.log(LogStatus.PASS,
		 * " Claimant Cause Description Added Successfully"); JavascriptExecutor js =
		 * (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();",EnrollCP_AddClaimsPage.saveBtn(
		 * driver)); test.log(LogStatus.PASS, " Clicked on Claim Save Button");
		 * Thread.sleep(5000);
		 * js.executeScript("arguments[0].click();",EnrollCP_AddClaimsPage.
		 * addCliamsCloseIcon(driver));
		 * 
		 * test.log(LogStatus.PASS, " Claim Added Successfully");
		 * 
		 * driver.navigate().to(BaseUrl);//navigate to base url
		 */		
		
	}
	
}

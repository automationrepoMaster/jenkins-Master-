package TestScipts_CPO;

import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;

public class CPO_Add_Claim_Test extends BaseClass
{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test
	public void testClaims() throws Throwable {
		
		
		// Cliam Module Option in NCP and OCP is hidden in 06-02-2021 Release 
		
		
		/*
		 * String ProgramName = "Automation Program dont touch"; String ProjectName =
		 * "Test Project 10"; String TradeNo="TRNO2579"; String TradeName="Trades2579";
		 * String ContractorName="Alex Comp2273"; String
		 * EnrollmentType="WC & GL Enrollment";
		 * 
		 * String BaseUrl = driver.getCurrentUrl();// store base url for future use
		 * CPO_LogInAction.logInCPO(driver);
		 * 
		 * CPO_HomePage.IconMyProjects(driver).click(); test.log(LogStatus.INFO,
		 * " Clicked On My Projects Page");
		 * wb.selectSingleValue(CPO_MyProjectsModule.selectProgram(driver),
		 * ProgramName); Thread.sleep(2500);
		 * wb.selectSingleValue(CPO_MyProjectsModule.selectProjects(driver),
		 * ProjectName); Thread.sleep(2500);
		 * wb.selectSingleValue(CPO_MyProjectsModule.selectTrade(driver), TradeName);
		 * 
		 * Thread.sleep(6000); JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();",
		 * CPO_MyProjectsModule.selectContractorPackage(driver, ProgramName,
		 * ProjectName, TradeNo, ContractorName, EnrollmentType));
		 * test.log(LogStatus.PASS, ProgramName + " " + ProjectName + " " + TradeNo +
		 * " " + EnrollmentType + " Contractor Package Selected");
		 * js.executeScript("arguments[0].click();",CPO_Add_CP_EnrollmentPage.linkClaims
		 * (driver)); Thread.sleep(1500); wb.getWindowIDs();
		 * driver.switchTo().window(wb.map.get("childID"));
		 * driver.manage().window().maximize(); Thread.sleep(4000);
		 * 
		 * wb.waitForElemnet(CPO_Add_Claim.claimDate(driver)); Thread.sleep(2000);
		 * CPO_Add_Claim.claimDate(driver).sendKeys("05/05/2020",Keys.TAB);
		 * test.log(LogStatus.PASS, " Claim Date Added Successfully");
		 * 
		 * 
		 * wb.selectSingleValue(CPO_Add_Claim.selectClaimStatusFromList(driver),
		 * "Open"); test.log(LogStatus.PASS, " Claim Status Added Successfully");
		 * 
		 * CPO_Add_Claim.claimNumber(driver).sendKeys("Calim no 124521");
		 * test.log(LogStatus.PASS, " Claim Number Added Successfully");
		 * 
		 * CPO_Add_Claim.claimAmount(driver).sendKeys("1000"); test.log(LogStatus.PASS,
		 * " Claim Amount Added Successfully");
		 * 
		 * wb.selectSingleValue(CPO_Add_Claim.selectClaimTypeFromList(driver),
		 * "General Liability"); test.log(LogStatus.PASS,
		 * " Claim Type Added Successfully");
		 * 
		 * CPO_Add_Claim.reportDate(driver).sendKeys("05/06/2020"); Thread.sleep(2000);
		 * CPO_Add_Claim.reportDate(driver).sendKeys(Keys.TAB); test.log(LogStatus.PASS,
		 * " Claim Report Date Added Successfully");
		 * CPO_Add_Claim.CloseDate(driver).click();
		 * CPO_Add_Claim.CloseDate(driver).sendKeys("12/06/2020"); Thread.sleep(2000);
		 * CPO_Add_Claim.CloseDate(driver).sendKeys(Keys.TAB); test.log(LogStatus.PASS,
		 * " Claim Close Date Added Successfully");
		 * CPO_Add_Claim.LossDate(driver).click();
		 * CPO_Add_Claim.LossDate(driver).sendKeys("05/06/2020"); Thread.sleep(2000);
		 * CPO_Add_Claim.LossDate(driver).sendKeys(Keys.TAB); test.log(LogStatus.PASS,
		 * " Claim Loss Date Added Successfully");
		 * CPO_Add_Claim.LossTime(driver).click();
		 * CPO_Add_Claim.LossTime(driver).sendKeys("100"); test.log(LogStatus.PASS,
		 * " Claim Loss Time Added Successfully");
		 * 
		 * CPO_Add_Claim.cliamDescriptionField(driver).sendKeys("Testing Claims Field");
		 * Thread.sleep(1500); test.log(LogStatus.PASS,
		 * " Claim Description Added Successfully");
		 * js.executeScript("arguments[0].click();",CPO_Add_Claim.cliamantNameField(
		 * driver)); CPO_Add_Claim.cliamantNameField(driver).sendKeys("Kiran");
		 * test.log(LogStatus.PASS, " Claimant Name Field Added Successfully");
		 * CPO_Add_Claim.cliamantAddress1(driver).click();
		 * CPO_Add_Claim.cliamantAddress1(driver).sendKeys("Test Address 1 field");
		 * test.log(LogStatus.PASS, " Claimant Address1 Field Added Successfully");
		 * CPO_Add_Claim.cliamantAddress2(driver).click();
		 * CPO_Add_Claim.cliamantAddress2(driver).sendKeys("Address 2 field");
		 * test.log(LogStatus.PASS, " Claimant Address2 Field Added Successfully");
		 * CPO_Add_Claim.cliamantCity(driver).click();
		 * CPO_Add_Claim.cliamantCity(driver).sendKeys("LA"); test.log(LogStatus.PASS,
		 * " Claimant City Field Added Successfully");
		 * CPO_Add_Claim.cliamantZIPCode(driver).click();
		 * CPO_Add_Claim.cliamantZIPCode(driver).sendKeys("12345678");
		 * test.log(LogStatus.PASS, " Claimant ZipCode Field Added Successfully");
		 * 
		 * js.executeScript("arguments[0].click();",CPO_Add_Claim.cliamantPhone(driver))
		 * ; CPO_Add_Claim.cliamantPhone(driver).sendKeys("1236547891234");
		 * test.log(LogStatus.PASS, " Claimant Phone Field Added Successfully");
		 * js.executeScript("arguments[0].click();",CPO_Add_Claim.cliamantLostDays(
		 * driver)); CPO_Add_Claim.cliamantLostDays(driver).sendKeys("100");
		 * test.log(LogStatus.PASS, " Claimant Lost Days Added Successfully");
		 * js.executeScript("arguments[0].scrollIntoView();",CPO_Add_Claim.
		 * cliamantPartOfBody(driver));
		 * CPO_Add_Claim.cliamantPartOfBody(driver).sendKeys("Test");
		 * test.log(LogStatus.PASS, " Claimant Part of Body Added Successfully");
		 * CPO_Add_Claim.cliamantCauseDescription(driver).sendKeys("Testing Cause");
		 * test.log(LogStatus.PASS, " Claimant Cause Description Added Successfully");
		 * js.executeScript("arguments[0].scrollIntoView();",CPO_Add_Claim.
		 * saveAndCloseBtn(driver));
		 * js.executeScript("arguments[0].click();",CPO_Add_Claim.saveAndCloseBtn(driver
		 * )); test.log(LogStatus.PASS, " Clicked on Claim Save Button");
		 * Thread.sleep(5000);
		 * 
		 * driver.switchTo().window(wb.map.get("parentID"));
		 * driver.navigate().to(BaseUrl);// navigate to base url
		 * test.log(LogStatus.INFO, " Claim Added Successfully");
		 */
		
	}
}

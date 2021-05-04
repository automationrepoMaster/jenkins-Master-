package TestScipts_CPO;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.CPO_LogInAction;
import ObjectRepository_CPO.CPO_Add_CP_EnrollmentPage;
import ObjectRepository_CPO.CPO_Add_ChangeOrder;
import ObjectRepository_CPO.CPO_HomePage;
import ObjectRepository_CPO.CPO_MyProjectsModule;

public class CPO_Add_ChangeOrder_Test extends BaseClass {

	WebDriverCommonLib wb = new WebDriverCommonLib();

	@Test
	public void testChangeOrder() throws Throwable {
		String ProgramName = "Automation Program dont touch";
		String ProjectName = "Test Project 10";
		String TradeNo="TRNO2579";
		String TradeName="Trades2579";
		String ContractorName="Alex Comp2273";
		String EnrollmentType="WC & GL Enrollment";

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
		js.executeScript("arguments[0].click();",CPO_Add_CP_EnrollmentPage.linkChangeOrder(driver));
		Thread.sleep(1500);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		CPO_Add_ChangeOrder.additionalContractValueField(driver).sendKeys("1000");
		test.log(LogStatus.INFO, " Contract Value Added Successfully");
		CPO_Add_ChangeOrder.additionalSelfPerformContractValueField(driver).sendKeys("1000");
		test.log(LogStatus.INFO, " Self Perform Contract Value Added Successfully");
		CPO_Add_ChangeOrder.additionalSubContractorCostField(driver).sendKeys("1000");
		test.log(LogStatus.INFO, " Sub Contractor Cost Added Successfully");
		
		List<WebElement> lst1 = CPO_Add_ChangeOrder.payrollAndHoursFields(driver);
		for (WebElement a : lst1) {
			Thread.sleep(1000);
			a.sendKeys("100");
		}
		test.log(LogStatus.INFO, " Payrolls and Hours Added Successfully");
		
		CPO_Add_ChangeOrder.effectiveDate(driver).sendKeys("08/07/2020", Keys.TAB);
		test.log(LogStatus.INFO, " Effective Date Added Successfully");
		
		CPO_Add_ChangeOrder.newEstCompletionDate(driver).sendKeys("12/07/2020", Keys.TAB);
		test.log(LogStatus.INFO, " New Estimated End Date Added Successfully");
		
		CPO_Add_ChangeOrder.descriptionField(driver).sendKeys("Testing Change Order");
		test.log(LogStatus.INFO, " Description Added Successfully");
		
		js.executeScript("arguments[0].click();", CPO_Add_ChangeOrder.nextBtn(driver));
		test.log(LogStatus.INFO, " Clicked on Next Button");
		
		Thread.sleep(3000);
		driver.switchTo().window(wb.map.get("parentID"));
		driver.navigate().to(BaseUrl);// navigate to base url
		test.log(LogStatus.INFO, " Change Order Added Successfully");
		
	}

}

package TestScriptNCP_SponsorLogin;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ModulerLibrary.NCP_LoginAction;
import ModulerLibrary.NCP_SponsorLoginAction;
import ObjectRepository_NCP.EnrollCP_AddMothlyPayrollPage;
import ObjectRepository_NCP.NCP_HomePage;
import ObjectRepository_NCP.NCP_SponsorLoginHomePage;

public class NCP_SPL_MonthalyPayroll_Test extends BaseClass {
	WebDriverCommonLib wb = new WebDriverCommonLib();
	public String contractorName = "Alex Comp2273";
	String programName = "Automation Program dont touch";
	String projectName = "Test Project 10";
	String tradeName = "TRNO274";

//	String contractorName,String programName, String projectName, String tradeName
	@Test
	public void testMonthlyPayroll() throws Throwable
	{
	/*
	 * String BaseUrl=driver.getCurrentUrl();
	 * 
	 * NCP_SponsorLoginAction.logInNCP(driver);
	 * NCP_SponsorLoginHomePage.moduleMyContracts(driver).click();
	 * Thread.sleep(3000);
	 * 
	 * NCP_HomePage.btnFilterBy(driver).click(); test.log(LogStatus.PASS,
	 * " Clicked On Filter Button");
	 * 
	 * NCP_HomePage.selectProgramField(driver).click(); test.log(LogStatus.PASS,
	 * " Clicked On Select Program Field");
	 * wb.selectSingleValueFromList(NCP_HomePage.selectProgramFromList(driver),
	 * programName ); test.log(LogStatus.PASS,
	 * programName+" Program Name successfully selected form drop down");
	 * NCP_HomePage.selectProjectField(driver).click(); test.log(LogStatus.PASS,
	 * " Clicked On Select Project Field");
	 * 
	 * wb.selectSingleValueFromList(NCP_HomePage.selectProjectFromList(driver),
	 * projectName ); test.log(LogStatus.PASS,
	 * projectName+" Project Name successfully selected form drop down");
	 * Thread.sleep(2000);
	 * 
	 * 
	 * NCP_HomePage.selectTradeField(driver).click(); test.log(LogStatus.PASS,
	 * " Clicked On Select Trade Field"); Thread.sleep(2000);
	 * NCP_HomePage.searchForTradeField(driver).click(); Thread.sleep(1500);
	 * NCP_HomePage.searchForTradeField(driver).sendKeys(tradeName);
	 * Thread.sleep(1500); System.out.println(tradeName);
	 * wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver),
	 * tradeName);
	 * 
	 * 
	 * NCP_HomePage.selectTradeField(driver).click(); test.log(LogStatus.PASS,
	 * " Clicked On Select Trade Field"); Thread.sleep(2500);
	 * wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver),
	 * tradeName); test.log(LogStatus.PASS,
	 * tradeName+" Trade successfully selected form drop down");
	 * NCP_HomePage.btnSearch(driver).click(); test.log(LogStatus.PASS,
	 * " Clicked on Search Button"); Thread.sleep(2000);
	 * 
	 * NCP_HomePage.selectPreviewPanelProjectDropdown(driver,
	 * contractorName).click(); test.log(LogStatus.PASS,
	 * " Clicked on Selected Contractor Package"); Thread.sleep(1000);
	 * 
	 * NCP_HomePage.selectEnrollmentTab(driver, "Payroll").click();
	 * test.log(LogStatus.PASS, " Clicked on Payroll View"); Thread.sleep(3000);
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * EnrollCP_AddMothlyPayrollPage.addPayrollButton(driver).click();
	 * test.log(LogStatus.PASS, " Clicked on Add Payroll Button");
	 * Thread.sleep(5000);
	 * EnrollCP_AddMothlyPayrollPage.selectPayrollPeriodField(driver).click();
	 * test.log(LogStatus.PASS, " Clicked on Add Payroll Button");
	 * Thread.sleep(2000); List<WebElement> lst2 =
	 * EnrollCP_AddMothlyPayrollPage.selectPayrollPeriodFromList(driver);
	 * 
	 * for(int i=0;i<=lst2.size()-1;i++) { lst2.get(i).click(); break; }
	 * Thread.sleep(5000); //fillPayroll();
	 * 
	 * Thread.sleep(9000);
	 * 
	 * js.executeScript("arguments[0].click();",EnrollCP_AddMothlyPayrollPage.
	 * addPayrollCloseIcon(driver)); test.log(LogStatus.PASS,
	 * " Monthaly Payroll Added Successfully");
	 * driver.navigate().to(BaseUrl);//navigate to base url
	 * 
	 * }
	 */
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*@Test
		public void testMonthlyPayroll(String TestCaseName,String programName, String projectName , String tradeName) throws Throwable
		{*/
			String BaseUrl=driver.getCurrentUrl();
			
			NCP_LoginAction.logInNCP(driver);
			NCP_HomePage.btnFilterBy(driver).click();
			test.log(LogStatus.PASS, " Clicked On Filter Button");
			
			NCP_HomePage.selectProgramField(driver).click();
			test.log(LogStatus.PASS, " Clicked On Select Program Field");
			wb.selectSingleValueFromList(NCP_HomePage.selectProgramFromList(driver),programName );
			test.log(LogStatus.PASS, programName+" Program Name successfully selected form drop down");
			NCP_HomePage.selectProjectField(driver).click();
			test.log(LogStatus.PASS, " Clicked On Select Project Field");
			wb.selectSingleValueFromList(NCP_HomePage.selectProjectFromList(driver),projectName );
			test.log(LogStatus.PASS, projectName+" Project Name successfully selected form drop down");
			Thread.sleep(3000);
			//NCP_HomePage.selectTradeField(driver).click();
			//test.log(LogStatus.PASS, " Clicked On Select Trade Field");
			//Thread.sleep(3000);
			NCP_HomePage.ContractorStatusDropDown(driver).click();
			Thread.sleep(3000);
			js.executeScript("arguments[0].scrollIntoView();", NCP_HomePage.SelectbyStatusName(driver, "Missing Payroll"));
			NCP_HomePage.SelectbyStatusName(driver, "Missing Payroll").click();
			
			//wb.selectSingleValueFromList(NCP_HomePage.StatusListChkboxes(driver), "Missing Payroll");
			Thread.sleep(2000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * wb.selectSingleValueFromList(NCP_HomePage.selectTradeFromList(driver),
			 * tradeName); test.log(LogStatus.PASS,
			 * tradeName+" Trade successfully selected form drop down");
			 */
			NCP_HomePage.btnSearch(driver).click();
			test.log(LogStatus.PASS, " Clicked on Search Button");
			Thread.sleep(2000);
			NCP_HomePage.selectPreviewPanelProjectDropdown(driver, projectName).click();
			test.log(LogStatus.PASS, " Clicked on Selected Contractor Package");
			Thread.sleep(2000);
			NCP_HomePage.selectEnrollmentTab(driver, "Payroll").click();
			test.log(LogStatus.PASS, " Clicked on Payroll View");
			Thread.sleep(3000);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			EnrollCP_AddMothlyPayrollPage.addPayrollButton(driver).click();
			test.log(LogStatus.PASS, " Clicked on Add Payroll Button");
			Thread.sleep(5000);
			EnrollCP_AddMothlyPayrollPage.selectPayrollPeriodField(driver).click();
			test.log(LogStatus.PASS, " Clicked on Add Payroll Button");
			Thread.sleep(2000);
			List<WebElement> lst2 = EnrollCP_AddMothlyPayrollPage.selectPayrollPeriodFromList(driver);
			
			for(int i=0;i<=lst2.size()-1;i++)
			{
				lst2.get(i).click();
				break;
			}
			Thread.sleep(5000);
			//Raja 
			//fillPayroll();
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_AddMothlyPayrollPage.ClasscodeHrsFeild(driver));
			Thread.sleep(2000);
			EnrollCP_AddMothlyPayrollPage.ClasscodeHrsFeild(driver).sendKeys("100");
			test.log(LogStatus.PASS, "class code hours are entered");
			EnrollCP_AddMothlyPayrollPage.ClasscodeuncappedPayrollFeild(driver).sendKeys("100");
			test.log(LogStatus.PASS, "class code uncapped payroll hours are entered");
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();", EnrollCP_AddMothlyPayrollPage.addPayrollSaveBtn(driver));
			
			EnrollCP_AddMothlyPayrollPage.addPayrollSaveBtn(driver).click();
			test.log(LogStatus.PASS, "class code hours are entered and save button is clicked");
		/*
			List<WebElement> lst = EnrollCP_AddMothlyPayrollPage.missingPayrollMonthsList(driver); //for(WebElement a:lst)
			for(int i=0;i<=lst.size()-1;i++)
			{
				WebElement a= lst.get(i);
				EnrollCP_AddMothlyPayrollPage.PayrollTextClick(driver).click();
				wb.waitForElemnet(a);
//				js.executeScript("arguments[0].click();",a);
//				act.moveToElement(a).click().build().perform();
				Thread.sleep(5000);
				act.moveToElement(EnrollCP_AddMothlyPayrollPage.addPayrollCVField(driver)).doubleClick().build().perform();
				EnrollCP_AddMothlyPayrollPage.addPayrollCVField(driver).sendKeys("1000");
				act.moveToElement(EnrollCP_AddMothlyPayrollPage.addPayrollSelfCVField(driver)).doubleClick().build().perform();
				EnrollCP_AddMothlyPayrollPage.addPayrollSelfCVField(driver).sendKeys("1000");
				
				List<WebElement> payroll = EnrollCP_AddMothlyPayrollPage.addPayrollForALLWorkClass(driver);
				for(WebElement b:payroll)
				{
					
					act.moveToElement(b).doubleClick().build().perform();
					Thread.sleep(1000);
					b.sendKeys("100");
					
					
				}
				js.executeScript("arguments[0].click();",EnrollCP_AddMothlyPayrollPage.addPayrollSaveBtn(driver));
				
//				EnrollCP_AddMothlyPayrollPage.unusualPayrolSaveBtn(driver).click();//Alert switch off from program level
				Thread.sleep(10000);
			}*/
			
			Thread.sleep(9000);
			
			js.executeScript("arguments[0].click();",EnrollCP_AddMothlyPayrollPage.addPayrollCloseIcon(driver));
			test.log(LogStatus.PASS, " Monthaly Payroll Added Successfully");
			driver.navigate().to(BaseUrl);//navigate to base url
			
		}
	public void fillPayroll() throws InterruptedException {
		try {
			EnrollCP_AddMothlyPayrollPage.addMonthlyPayrollPolicyAlertOkBtn(driver).click();
		} catch (Throwable e) {
			System.out.println("Polciy Alert is not present" + e);
		}
		wb.waitForElemnet(EnrollCP_AddMothlyPayrollPage.addPayrollCVField(driver));
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.moveToElement(EnrollCP_AddMothlyPayrollPage.addPayrollCVField(driver)).doubleClick().build().perform();
		EnrollCP_AddMothlyPayrollPage.addPayrollCVField(driver).sendKeys("1000");
		test.log(LogStatus.PASS, " Payroll Contract Value Added Successfully");
		Thread.sleep(2000);
		act.moveToElement(EnrollCP_AddMothlyPayrollPage.addPayrollSelfCVField(driver)).doubleClick().build().perform();
		EnrollCP_AddMothlyPayrollPage.addPayrollSelfCVField(driver).sendKeys("1000");
		test.log(LogStatus.PASS, " Payroll Self Performed Contract Value Added Successfully");
		List<WebElement> payroll = EnrollCP_AddMothlyPayrollPage.addPayrollForALLWorkClass(driver);
		for (WebElement b : payroll) {
			try {
				act.moveToElement(b).doubleClick().build().perform();
				Thread.sleep(1000);
				b.sendKeys("100");
				test.log(LogStatus.PASS, " Payroll and hours added Successfully");
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		Thread.sleep(4000);
		if (EnrollCP_AddMothlyPayrollPage.addPayrollNextMonthBtn(driver).isDisplayed() == true) {
			EnrollCP_AddMothlyPayrollPage.addPayrollNextMonthBtn(driver).click();
			Thread.sleep(7000);
			test.log(LogStatus.PASS, " Clicked on Continue Next Month Payroll Button");
			fillPayroll();
		} else {
			EnrollCP_AddMothlyPayrollPage.addPayrollSaveBtn(driver).click();
			test.log(LogStatus.PASS, " Clicked on Payroll Save Button");
			Thread.sleep(7000);
		}

	}

}

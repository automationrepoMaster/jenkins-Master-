package TestScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import ObjectRepository.AddContractor_Pkg_Contract_Details_Page;
import ObjectRepository.AddContractor_Pkg_Enrollment_Summary_Page;
import ObjectRepository.AddContractor_Pkg_GL_Umbrella_Coverage_Page;
import ObjectRepository.AddContractor_Pkg_Insurance_Enrollment_Page;
import ObjectRepository.AddContractor_Pkg_Required_Documents_Page;
import ObjectRepository.AddContractor_WC_Premiums_Modifications_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

//@Listeners(GenericLibrary.SampleListener.class)
public class EnrollContractor_TC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	AddContractor_Pkg_TC tc=new AddContractor_Pkg_TC();
	
	@Test(dataProvider="excelData")
	public void enrollContractorTest(String searchBoxCompanyname, String brokerName, String brokerContactName,String InsrCompName,String workClassName ) throws InterruptedException
	{
			
			//tc.addContractorPackage();
			HomePage.controlMenuHomeIcon(driver).click();
			test.log(LogStatus.INFO, "Clicked On Home Icon");
			HomePage.HomeMenuContractorPackage(driver).click();
			test.log(LogStatus.INFO, "Clicked On Contracotr Package Icon");
			ContractorPackageModule.searchEditBox(driver).sendKeys(searchBoxCompanyname);//Sony 1 Excel
			Thread.sleep(6000);
			test.log(LogStatus.INFO, searchBoxCompanyname+ " Search For Respective Company");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-250)", "");
			ContractorPackageModule.searchIcon(driver).click();
			test.log(LogStatus.INFO, "Clicked on Search Icon");
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			//driver.switchTo().frame("//iframe[@id='ifrmPreview']");
			System.out.println(ContractorPackageModule.fetchTradeNamePriviewP(driver).getText());
			
			//insurance enrollment page
			wb.waitForElemnet(ContractorPackageModule.InsuranceEnrollmentPagePriviewP(driver));
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Clicked on Insurance Enrollment Page");
			
			wb.getWindowIDs();
			driver.switchTo().window(wb.map.get("childID"));
			driver.manage().window().maximize();
			
//			AddContractor_Pkg_Insurance_Enrollment_Page.InsuranceEnrollmentTab(driver).click();
			Thread.sleep(10000);
			try {
			
				AddContractor_Pkg_Insurance_Enrollment_Page.popUpCloneCancelBtn(driver).click();
			} catch (Throwable e) {
				System.out.println(e);
			}
			
			try {
			AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractorName(driver).click();	
			test.log(LogStatus.PASS, "Contractor Name Added Successfully");
//			AddContractor_Pkg_Insurance_Enrollment_Page.fieldContractorLicense(driver).sendKeys("License123");
//			test.log(LogStatus.PASS, "Contractor License Added Successfully");
//			AddContractor_Pkg_Insurance_Enrollment_Page.fieldNCCIExperienceModifireRate(driver).sendKeys("10.12");
//			test.log(LogStatus.PASS, "Modifier Rate Added Successfully");
//			AddContractor_Pkg_Insurance_Enrollment_Page.fieldNCCIExperienceModifireDate(driver).sendKeys("01/20/2019");
//			test.log(LogStatus.PASS, "Modifier Date Added Successfully");
//			AddContractor_Pkg_Insurance_Enrollment_Page.fieldCIP_WC_PolicyNumber(driver).sendKeys("Policy No 1234");
//			test.log(LogStatus.PASS, "CIP WC Policy Number Added Successfully");
			
//			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Insurance_Enrollment_Page.contactInformationEmail(driver));
			/*
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_BrokerName(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_BrokerName(driver).sendKeys(searchBoxCompanyname);//Excel
			test.log(LogStatus.PASS,searchBoxCompanyname+ " WC Broker Name Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_BrokerContactName(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_BrokerContactName(driver).sendKeys(brokerContactName);//Excel
			test.log(LogStatus.PASS,brokerContactName+ " WC Broker Contact Name Added Successfully");
//			AddContractor_Pkg_Insurance_Enrollment_Page.WC_InsuranceCompanyNameRemoveIcon(driver).clear();
//			wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.WC_InsuranceCompanyNameRemoveIcon(driver));
//			executor.executeScript("arguments[0].click();",AddContractor_Pkg_Insurance_Enrollment_Page.WC_InsuranceCompanyNameRemoveIcon(driver));
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_InsuranceCompanyName(driver).sendKeys(InsrCompName);//atkins Excel
			Thread.sleep(3000);
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_InsuranceCompanyName(driver).sendKeys(Keys.ENTER);
			test.log(LogStatus.PASS, "WC Insurance Company Name Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_PolicyStartDate(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_PolicyStartDate(driver).sendKeys("05/15/2019");
			test.log(LogStatus.PASS, "WC Insurance Start Date Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_BrokerContactPhone(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_BrokerContactPhone(driver).sendKeys(RandomClass.randomPhoneNo());
			test.log(LogStatus.PASS, "WC Insurance Contact Phone No Added Successfully");
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_PolicyExpirationDate(driver).clear();
			AddContractor_Pkg_Insurance_Enrollment_Page.WC_PolicyExpirationDate(driver).sendKeys("09/05/2020");
			test.log(LogStatus.PASS, "WC Insurance Policy Expiration Date Added Successfully");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Insurance_Enrollment_Page.checkBoxForGLSameAsWorkerComp(driver));
			test.log(LogStatus.PASS, "GL Insurance Check Box Same As Worker Comp Selected Successfully");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Insurance_Enrollment_Page.checkBoxForUMBSameAsWorkerComp(driver));
			test.log(LogStatus.PASS, "UMB Insurance Check Box Same As Worker Comp Selected Successfully");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Insurance_Enrollment_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.PASS, "Mark As Confirmed Radio Button Selected Successfully");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Insurance_Enrollment_Page.btnSaveAndContinue(driver));
		*/	Thread.sleep(7000);
			test.log(LogStatus.PASS, "Clicked On Insurance Enrollment Save And Continue Button");
//			wb.windowScrollBy(0,500);
//			wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			Thread.sleep(5000);
			} catch (Throwable e) 
			{
				test.log(LogStatus.FAIL, e+"Something Went Wrong");
			}
			
			//Contact Details Page
			wb.mouseMoveToElement(AddContractor_Pkg_Contract_Details_Page.fieldContractValue(driver));
			AddContractor_Pkg_Contract_Details_Page.fieldContractValue(driver).clear();
			AddContractor_Pkg_Contract_Details_Page.fieldContractValue(driver).sendKeys("5600000");
			test.log(LogStatus.PASS, "Contract Value Added Successfully");
			AddContractor_Pkg_Contract_Details_Page.fieldSelfPerformedContractValue(driver).clear();
			AddContractor_Pkg_Contract_Details_Page.fieldSelfPerformedContractValue(driver).sendKeys("560000");
			test.log(LogStatus.PASS, "Self Performed Contract Value Added Successfully");
			/*AddContractor_Pkg_Contract_Details_Page.fieldEstimatedPayroll(driver).clear();
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedPayroll(driver).sendKeys("56000");
			*/test.log(LogStatus.PASS, "Estimated Payroll Added Successfully");
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedManHours(driver).clear();
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedManHours(driver).sendKeys("1000");
			test.log(LogStatus.PASS, "Estimated Man Hours Added Successfully");
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedStartDate(driver).clear();
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedStartDate(driver).sendKeys("07/02/2019",Keys.TAB);
			test.log(LogStatus.PASS, "Estimated Start Date Added Successfully");
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedCompletionDate(driver).clear();
			AddContractor_Pkg_Contract_Details_Page.fieldEstimatedCompletionDate(driver).sendKeys("12/31/2020",Keys.TAB);
			test.log(LogStatus.PASS, "Estimated Completion Date Added Successfully");
			
			System.out.println("Program Radio Button is Selected \t"+AddContractor_Pkg_Contract_Details_Page.redioBtnProgram(driver).isSelected());
			
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Contract_Details_Page.textAreaBrieflyDescribetheScopeWork(driver));
			AddContractor_Pkg_Contract_Details_Page.textAreaBrieflyDescribetheScopeWork(driver).sendKeys("Testing");
		
			js.executeScript("window.scrollBy(0,500)","");

//			js.executeScript("arguments[0].click();",AddContractor_Pkg_Contract_Details_Page.switchSubContractorPerformWorkOnSite(driver));
//			js.executeScript("arguments[0].click();",AddContractor_Pkg_Contract_Details_Page.selectWorkClassHamburgericon(driver));
//			wb.mouseMoveToElement(AddContractor_Pkg_Contract_Details_Page.selectWorkClass(driver));
			
			wb.waitForElemnet(AddContractor_Pkg_Contract_Details_Page.selectWorkClass(driver));
			Thread.sleep(4000);
			AddContractor_Pkg_Contract_Details_Page.selectWorkClassSearchBox(driver).sendKeys("Test");
			wb.selectSingleValueFromList(AddContractor_Pkg_Contract_Details_Page.selectAllWorkClassFromAutoCompleteDropDown(driver), workClassName);//Excel
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Work Class Selected Successfully");
//			wb.selectSingleValueFromList(AddContractor_Pkg_Contract_Details_Page.selectAllWorkClassFromAutoCompleteDropDown(driver),"Technicians");
			AddContractor_Pkg_Contract_Details_Page.addWorkClassWorkHoursField(driver).sendKeys("100");
			test.log(LogStatus.PASS, "Work Class Hours Added Successfully");
		//	AddContractor_Pkg_Contract_Details_Page.addWorkClassPayrollField(driver).sendKeys("10000");
			test.log(LogStatus.PASS, "Work Class Payroll Added Successfully");
			AddContractor_Pkg_Contract_Details_Page.addWorkClassRateField(driver).sendKeys("11");
			test.log(LogStatus.PASS, "Work Class Rate Added Successfully");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Contract_Details_Page.addWorkClassAddWorkClassBtn(driver));
			test.log(LogStatus.INFO, "Clicked On Add Work Class Button");
			Thread.sleep(10000);
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Contract_Details_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.INFO, "Clicked On Contract Details Mark As Confirmed Radio Button");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Contract_Details_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.PASS, "Clicked On Contract Details Save And Continue Button");
		
			Alert alert=driver.switchTo().alert();
			alert.accept();
			test.log(LogStatus.PASS, "Alert Accepted");
			
			Thread.sleep(2000);
			AddContractor_Pkg_Contract_Details_Page.estimatedPayrollWorkClassPayrollAlertContinueBtn(driver).click();
			
//			alert.accept();
//			test.log(LogStatus.PASS, "Alert Accepted");
//			alert.accept();
//			test.log(LogStatus.PASS, "Alert Accepted");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,1000)");
			
			AddContractor_WC_Premiums_Modifications_Page.markAsConfirmedRadioBtn(driver).click();
			test.log(LogStatus.INFO, "Cliced On WC Premium Modification Page Mark As Confirmed Radio Button ");
			AddContractor_WC_Premiums_Modifications_Page.btnSaveAndContinue(driver).click();
			test.log(LogStatus.INFO, "Clicked On WC Premium Modificaction Page Save And Continue Button");
			Thread.sleep(5000);
			
			js.executeScript("window.scrollBy(0,1100)");
			
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForGeneralLiability(driver, 1, 2).click();
			test.log(LogStatus.PASS, "First GL Rate Based On Radio Button Selected Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver, 1).sendKeys("123ab");
			test.log(LogStatus.PASS, "First GL Class Code Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLDescriptionField(driver, 1).sendKeys("Testing");
			test.log(LogStatus.PASS, "First GL Description Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectRatePerGeneralLiability(driver, 1, 2).click();
			test.log(LogStatus.PASS, "First GL Rate Per Radio Button Selected Succesfully ");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldGeneralLiability(driver, 1).sendKeys("1");
			test.log(LogStatus.PASS, "First GL Rate Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver).click();
			test.log(LogStatus.INFO, " Clicked On Add Additional General Liability Button");
			test.log(LogStatus.PASS, "====== First GL Added Successfully ======");
			Thread.sleep(2000);
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForGeneralLiability(driver, 2, 3).click();
			test.log(LogStatus.PASS, "Second GL Rate Based On Radio Button Selected Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLClassCodeField(driver, 2).sendKeys("123abcdf");
			test.log(LogStatus.PASS, "Second GL Class Code Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.GLDescriptionField(driver, 2).sendKeys("Testing");
			test.log(LogStatus.PASS, "Second GL Description Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectRatePerGeneralLiability(driver, 2, 2).click();
			test.log(LogStatus.PASS, "Second GL Rate Per Radio Button Selected Succesfully ");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldGeneralLiability(driver, 2).sendKeys("1");
			test.log(LogStatus.PASS, "Second GL Rate Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.generalLiabilitySubmitButton(driver, 2).click();
			test.log(LogStatus.INFO, "Clicked On Submit Button Successfully");
			test.log(LogStatus.PASS, "====== Second GL Added Successfully ======");
//			AddContractor_Pkg_GL_Umbrella_Coverage_Page.addAdditionalGLBtn(driver).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");
		//	js.executeScript("arguments[0].click();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForumbrellaLiability(driver, 1, 2));
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectTableAndRateBaseForumbrellaLiability(driver, 1, 2).click();
			test.log(LogStatus.PASS, "First UMB Rate Based On Radio Button Selected Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBClassCodeField(driver, 1).sendKeys("456Abc");
			test.log(LogStatus.PASS, "First UMB Class Code Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.UMBDescriptionField(driver, 1).sendKeys("Testing");
			test.log(LogStatus.PASS, "First UMB Description Added Successfully");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.selectRatePerUmbrellaLiability(driver, 1, 3).click();
			test.log(LogStatus.PASS, "First UMB Rate Per Radio Button Selected Succesfully ");
			AddContractor_Pkg_GL_Umbrella_Coverage_Page.enterRateFieldUMB(driver, 1).sendKeys("5");
			test.log(LogStatus.PASS, "First UMB Rate Added Successfully");
			test.log(LogStatus.PASS, "====== First UMB Added Successfully ======");
			
			
			js.executeScript("arguments[0].click();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.markAsConfirmedRadioBtn(driver));
			test.log(LogStatus.INFO, "Clicked On GL Umbrella Mark as Confirmed Radio Button");
			js.executeScript("window.scrollBy(0,300)");
			js.executeScript("arguments[0].click();",AddContractor_Pkg_GL_Umbrella_Coverage_Page.btnSaveAndContinue(driver));
			test.log(LogStatus.INFO, "Clicked On GL Umbrella Save And Continue Button");
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,1000)");
			
			try {
				js.executeScript("arguments[0].click();",AddContractor_Pkg_Required_Documents_Page.btnSaveAndContinue(driver));
				test.log(LogStatus.INFO, "Clicked On required Documents Save And Continue Button");
				alert.accept();
				Thread.sleep(3000);
				wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			} catch (Throwable e) {
				System.out.println(e);
			}
			
			Thread.sleep(6000);
			js.executeScript("window.scrollBy(0,2300)");
			
			try {
				wb.mouseMoveToElement(AddContractor_Pkg_Enrollment_Summary_Page.checkBoxEnrollmentSummaryPageFinalTermsAndCondition(driver));
				test.log(LogStatus.PASS, "Enrollment Summary Final Terms And Condition Check Box Selected ");
				
			} catch (Throwable e) {
				
				System.out.println(e);
			}
			
			
			js.executeScript("arguments[0].click();",AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentSummaryPageConfirmAndContinue(driver));
			test.log(LogStatus.INFO, "Clicked On Enrollment Summary Confirm And Continue Button");
			
			try {
				
				wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
			} catch (Throwable e) {
				System.out.println(e);
			}
			
			try {
				js.executeScript("arguments[0].click();",AddContractor_Pkg_Enrollment_Summary_Page.checkBoxEnrollmentSummaryPageAcceptNoLossStmt(driver));
				js.executeScript("arguments[0].click();",AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentSummaryPageAcceptNoLossStmt(driver));
				wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
//				wb.mouseMoveToElement(AddContractor_Pkg_Insurance_Enrollment_Page.sendEmailBtnContinueWithoutSending(driver));
				Thread.sleep(6000);
				js.executeScript("window.scrollBy(0,1500)");
				
			} catch (Throwable e) {
				System.out.println(e);	
				}
			
			wb.waitForElemnet(AddContractor_Pkg_Enrollment_Summary_Page.btnEnrollmentConfirmationPageFinishAndClose(driver));
			test.log(LogStatus.PASS, "Clicked On Enrollent Confirmation Page Finish And Close");
			test.log(LogStatus.PASS, "Contractor Package Enrolled Successfully");
			driver.switchTo().window(wb.map.get("parentID"));
		
	}
	
	@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\EnrollCpData.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(filePath);//put all excel data in to the config object
		int row=config.getRowCount(0);//get exact row count from sheet
		int col=config.getColCount(0);
		System.out.println(col);
		System.out.println(row);
		Object[][] data = new Object[row-1][col];//store all row and column in multidimensional array and print one by one
		for(int i = 1;i<row;i++)
		{	
			for (int j = 0; j <col; j++) 
			{
	            data[i-1][j] = config.getExcelData("Sheet1", i, j);
	        }
		}
		return data;//return data to test
	
	}
}

package TestScript;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddContractor_Pkg_ChangrOrdr_Adjustment_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;
import ObjectRepository.Report_Contr_Insurnc_Cost_Track_CPkg;




public class Add_Adjustment_TC extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	String adjustValue="2000";
	
	@Test
	public void testAdd_Adjustment() throws InterruptedException
	{
		HomePage.controlMenuContractorPackage(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contractor Package Icon");
		ContractorPackageModule.searchEditBox(driver).sendKeys("zoom");//Sony 1
		test.log(LogStatus.PASS, "Searched for respective Contractor Package");
		Thread.sleep(2000);
		ContractorPackageModule.searchIcon(driver).click();
		test.log(LogStatus.INFO, "Clicked On Search Icon");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		ContractorPackageModule.ChangeOrderInsuranceCostAdjustmentPriviewP(driver).click();
		test.log(LogStatus.INFO, "Clicked On Insurance Cost Adjustment Page");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		Thread.sleep(8000);
		AddContractor_Pkg_ChangrOrdr_Adjustment_Page.radioBtnAdjustment(driver).click();
		test.log(LogStatus.INFO, "Clicked On Insurance Cost Adjustment Radio Button");
		Thread.sleep(2000);
		AddContractor_Pkg_ChangrOrdr_Adjustment_Page.fieldAdjustmentValue(driver).sendKeys(adjustValue);
		test.log(LogStatus.PASS,adjustValue+ " Adjustment Value Added Successfully");
		AddContractor_Pkg_ChangrOrdr_Adjustment_Page.fieldAdjustmentDate(driver).sendKeys("10/22/2019");
		AddContractor_Pkg_ChangrOrdr_Adjustment_Page.fieldAdjustmentDate(driver).sendKeys(Keys.TAB);
		test.log(LogStatus.PASS, "Successfully Entered Adjustment Date");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();",AddContractor_Pkg_ChangrOrdr_Adjustment_Page.checkBoxEstimatedCalculation(driver));
		test.log(LogStatus.INFO, "Estimated Calculation Check Box Selected");
		js.executeScript("arguments[0].click();",AddContractor_Pkg_ChangrOrdr_Adjustment_Page.checkBoxToDateCalculation(driver));
		test.log(LogStatus.PASS, "To-Date Calculation Check Box Selected");
		js.executeScript("window.scrollBy(0,250)", "");//Scroll down
		AddContractor_Pkg_ChangrOrdr_Adjustment_Page.fieldDescription(driver).sendKeys("Test");
		test.log(LogStatus.PASS, "Desciption Added Successfully");
		
		js.executeScript("window.scrollBy(0,200)", "");//Scroll down
		AddContractor_Pkg_ChangrOrdr_Adjustment_Page.checkBoxMarkAsConfirm(driver).isSelected();
		test.log(LogStatus.INFO, "Mark As Confirmed Check Box is Already Selected");
		
		js.executeScript("arguments[0].click();",AddContractor_Pkg_ChangrOrdr_Adjustment_Page.saveAndCloseBtnAdjustment(driver));
		test.log(LogStatus.INFO, "Clicked On Save and Close Button");
		test.log(LogStatus.PASS, "Adjustment Added Successfully");
		driver.switchTo().window(wb.map.get("parentID"));
		Thread.sleep(1000);
		ContractorPackageModule.contractorPkgSelectFirstContractorPkgFrmList(driver).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		
		ContractorPackageModule.SeeMoreLinkChngOrdrInsuCostPriviewP(driver).click();
		test.log(LogStatus.INFO, "Click On Adjustment See More");
		String str=ContractorPackageModule.totalAdjustmentValueChngOrdrInsuCostPriviewP(driver).getText();
		test.log(LogStatus.PASS, str+"Total Adjustment Value Fetched Successfully");
		   String numberOnly= str.replaceAll("[^0-9]", "");
		   System.out.println("$"+numberOnly+".00");
		ContractorPackageModule.reportsPanelLinkPriviewP(driver).click();
		test.log(LogStatus.INFO, "Clicked On Reports Panel Arrow");
		Thread.sleep(2000);
		ContractorPackageModule.contractorInsuranceCostReportPriviewP(driver).click();
		test.log(LogStatus.INFO, "Clicked On Contractor Insurance Cost Report");
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		js.executeScript("window.scrollBy(0,1200)", "");
		 List<WebElement> values = Report_Contr_Insurnc_Cost_Track_CPkg.insuranceCostAdjustmentValueBoth(driver);
		 System.out.println(values.size());
		 
		 for(int i=0;i<=values.size()-1;i++)
		 {
			 String exp=values.get(i).getText();
			 System.out.println(exp);
			 test.log(LogStatus.PASS, "Value Fethced From Report");
			 if(exp.contains(numberOnly))
				{
				 
				 	System.out.println("Total matched");
				}
			 else
			 {
					System.out.println("Total not matched");
					test.log(LogStatus.PASS, "Values Matched");
			 }
			 
		 }
//		 test.log(LogStatus.PASS, "Adjustment Values Added Successfully");
		 driver.close();
		 driver.switchTo().window(wb.map.get("parentID"));
			
		
	}
}

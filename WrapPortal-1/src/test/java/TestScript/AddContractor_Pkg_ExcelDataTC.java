package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;
import ObjectRepository.AddContractor_Pkg_Page;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class AddContractor_Pkg_ExcelDataTC extends BaseClass
{
	WebDriverCommonLib wb=new WebDriverCommonLib();
	EnrollContractorWithouExcel_TC en=new EnrollContractorWithouExcel_TC();
	AddMonthlyPayroll_TC mp=new AddMonthlyPayroll_TC();
	Add_Adjustment_TC adj=new Add_Adjustment_TC();
//	String ranTrade=RandomClass.randomTrade();

	@Test(dataProvider="excelData")
	public void addContractorPackage(String ProgramName,String ProjectName,String EnrollmentType,String ContractorName,String ContactName, String tradeName) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		System.out.println("Program Name-" +ProgramName +"\t Project Name-"+ProjectName + "\t EnrollmentType-" +EnrollmentType +"\t ContractorName-"+ContractorName+"\t tradeName-" +tradeName );
		HomePage.controlMenuContractorPackage(driver).click();
		Thread.sleep(6000);
		test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-250)", "");
		js.executeScript("arguments[0].click();",ContractorPackageModule.addIcon(driver));
		test.log(LogStatus.INFO, "Clicked On Add Contractor Package Icon");
		Thread.sleep(2000);
		//ContractorPackageModule.addIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		driver.manage().window().maximize();
	
		//Select program 
		wb.waitForElemnet(AddContractor_Pkg_Page.selectProgram(driver));
		AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys(ProgramName);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProgramDropdownAutocomplete(driver), ProgramName);
		//AddContractor_Pkg_Page.selectProgramSearchBox(driver).sendKeys("Sony Tower Test",Keys.TAB);
		System.out.println("Program Added Successfully");
		test.log(LogStatus.PASS, ProgramName+" Program  added successfully");
	
		Thread.sleep(5000);
		//select project
//		wait.until(ExpectedConditions.elementToBeSelected(AddContractor_Pkg_Page.selectProject(driver)));
		AddContractor_Pkg_Page.selectProject(driver).click();
		Thread.sleep(500);
		AddContractor_Pkg_Page.selectProjectSearchBox(driver).sendKeys(ProjectName);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectProjectDropdownAutocomplete(driver), ProjectName);
		System.out.println("Project Added Successfully");
		test.log(LogStatus.PASS, ProjectName+" Project added successfully");
		
		Thread.sleep(5000);
		//select enrollment type		
//		wait.until(ExpectedConditions.elementToBeSelected(AddContractor_Pkg_Page.selectEnrollmentType(driver)));
		AddContractor_Pkg_Page.selectEnrollmentType(driver).click();
		Thread.sleep(1000);
		AddContractor_Pkg_Page.selectEnrollmentTypeSearchBox(driver).sendKeys(EnrollmentType);
		System.out.println("Enrollment Type Added Successfully");
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectEnrollmentTypeDropdownAutocomplete(driver), EnrollmentType);
		test.log(LogStatus.PASS, EnrollmentType+" Enrollment Type added successfully");
		
		Thread.sleep(5000);
		//select Compliance 
		AddContractor_Pkg_Page.non_CIP_Compliance(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectCompliance(driver), "Non-CIP Compliance");
		test.log(LogStatus.PASS," Compliance added successfully");		
		
		Thread.sleep(5000);
		//select contractor
		AddContractor_Pkg_Page.selectContractor(driver).click();
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(ContractorName);
		Thread.sleep(2000);
		AddContractor_Pkg_Page.selectContractor(driver).sendKeys(Keys.ENTER);
		System.out.println("Contractor Added Successfully");
		test.log(LogStatus.PASS, "Contractor added successfully");
		Thread.sleep(4000);
		
		Thread.sleep(5000);
		//select contact
		AddContractor_Pkg_Page.SelectContact(driver).click();
		AddContractor_Pkg_Page.SelectContactSearchBox(driver).click();
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.SelectContactAutoCompllete(driver),ContactName);
		test.log(LogStatus.PASS, ContactName+ " Contact added successfully");
		
		//select Trade
		AddContractor_Pkg_Page.selectTrade(driver).click();
//		System.out.println(ranTrade);
//		AddContractor_Pkg_Page.selectTradeSearchBox(driver).click();
//		wb.printListData(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver));
		Thread.sleep(2000);
		AddContractor_Pkg_Page.selectTradeSearchBox(driver).sendKeys(tradeName);
		//take a trade name from excel 
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver), tradeName);
		/*//take a random trade from random class
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectTradeDropdownAutocomplete(driver), tradeName);*/
		Thread.sleep(2000);
		System.out.println("Trade Added Successfully");
		test.log(LogStatus.PASS, tradeName+" Trade added successfully");
		
		//Select Upper Tier Contractor
		
		/*AddContractor_Pkg_Page.selectUpperTierContractor(driver).click();
		AddContractor_Pkg_Page.selectUpperTierContractorSearchBox(driver).click();
		Thread.sleep(2000);
		wb.selectSingleValueFromList(AddContractor_Pkg_Page.selectUpperTierContractorDropdownAutocomplete(driver), "Glod Corporation");
		*/
		Thread.sleep(2000);
		AddContractor_Pkg_Page.btnNext(driver).click();
		test.log(LogStatus.INFO, "Clicked On Next Button");
		Thread.sleep(1000);
		
		try {
			
			AddContractor_Pkg_Page.alertConfirmComplianceContinueBtn(driver).click();//newly added alert for compliance button 20/01/2020			
		
		} catch (Throwable e) 
		{
			System.out.println(e);
		}
				
		AddContractor_Pkg_Page.sendEmailCloseBtn(driver).click();
		
		driver.switchTo().window(wb.map.get("parentID"));
		System.out.println("Contractor Package Created Successfully");
		test.log(LogStatus.PASS, "Contractor Package Created successfully");
		

//		en.enrollContractorTest();
		
//		mp.testMonthlyPayroll();//Alex Contractor Comp4229 DBA DBA4229
//		adj.testAdd_Adjustment();
		
	}
	
	@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		//String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\Add Contractor Pkg Data.xlsx";
		String filePath  = "D:\\NOURTEK\\Wrap Portal-2\\testData\\Add Contractor Pkg Data.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(filePath);//put all excel data in to the config object
		int row=config.getRowCount(0);//get exact row count from sheet
		int col=config.getColCount(0);
		System.out.println("column= "+col);
		System.out.println("row = "+row);
		Object[][] data = new Object[row-1][col];//store all row and column in multidimensional array and print one by one
		for(int i = 1;i<row;i++)
		{	
			for (int j = 0; j <col; j++) 
			{
	            data[i-1][j] = config.getExcelData("Sheet3", i, j);
	        }
		}
		return data;//return data to test
		
	}

	
	//this code for only one column data
	/*@DataProvider(name="excelData")
	public Object [] [] passdata()
	{		
		String filePath="E:\\kp workspace selenium\\Wrap Portal\\testData\\TestDataFile.xlsx";
		ExcelDataConfig config=new ExcelDataConfig(filePath);
		int row=config.getRowCount(0);
		System.out.println(row);
		Object[][] data = new Object[row][1];
		for(int i=0;i<row;i++)
		{
			data[i][0]=config.getData("Sheet1", i, 0);//for first column
//			data[i][1]=config.getData("Sheet1", i, 1);//for second column
		}
		return data;
		
	}*/
	
}

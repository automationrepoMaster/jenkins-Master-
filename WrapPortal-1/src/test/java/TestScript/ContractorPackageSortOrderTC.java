package TestScript;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import GenericLibrary.BaseClass;
import ObjectRepository.ContractorPackageModule;
import ObjectRepository.HomePage;

public class ContractorPackageSortOrderTC extends BaseClass
{
	
	@Test
	public void testContactorPkgSortOrder() throws InterruptedException 
	{		
//		WebDriverWait wait=new WebDriverWait(driver, 60);
		HomePage.controlMenuContractorPackage(driver).click();
		Thread.sleep(6000);
		test.log(LogStatus.INFO, "Clicked On Control Menu Contractor Package Icon");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
		int x= 1;//update code with different logic on 11-08-2020
		do {
			try {
				ContractorPackageModule.seeMoreLink(driver).click();
				Thread.sleep(4000);
				System.out.println("clicked");
			} catch (Throwable e) {
				System.out.println(e);
				x=2;
			}
			
		} while (x==1);
		
		/*String totalCount=ContractorPackageModule.displayingTotalCountOfContractorPkg(driver).getText();
		System.err.println(totalCount);
		totalCount=totalCount.replaceAll("[^a-zA-Z0-9]", "");
		System.err.println(totalCount);
		int intCount=Integer.parseInt(totalCount);
		int ans=intCount/25;
		int result=ans+1;
		System.out.println("Divide result= "+result);
		int count=0;
		for(int i=1;i<=result;i++)
		{
			try {
				ContractorPackageModule.seeMoreLink(driver).click();
				Thread.sleep(4000);
			} catch (ElementNotInteractableException e) 
			{
				System.out.println(e);
			}
			
			count++;
		}
		System.out.println("Click count "+count);
*/		Thread.sleep(5000);

		List<WebElement> lstOfCp = ContractorPackageModule.contractorPkgSelectAllContractorPkgFrmList(driver);
		System.out.println("Size of list ="+lstOfCp.size());
		
		List<WebElement> contractorName = ContractorPackageModule.contractorPkgSelectAllContractorNameFrmList(driver);
		System.out.println("Size of list ="+contractorName.size());
		List<WebElement> projectName = ContractorPackageModule.contractorPkgSelectAllProjectNameFrmList(driver);
		System.out.println("Size of list ="+projectName.size());
		List<WebElement> enrollmentName = ContractorPackageModule.contractorPkgSelectAllEnrollmentTypeFrmList(driver);
		System.out.println("Size of list ="+enrollmentName.size());
		List<WebElement> statusName = ContractorPackageModule.contractorPkgSelectAllStatusFrmList(driver);
		System.out.println("Size of list ="+statusName.size());
		List<WebElement> ProgramName = ContractorPackageModule.contractorPkgSelectAllProgramNameFrmList(driver);
		System.out.println("Size of list ="+ProgramName.size());
		List<WebElement> tradeName = ContractorPackageModule.contractorPkgSelectAllTradeNameFrmList(driver);
		System.out.println("Size of list ="+tradeName.size());
		
        // This data needs to be written (Object[]) 		
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		String cn = "1";

		for (int j = 0; j <= ProgramName.size() - 1; j++) {
			System.out.println(lstOfCp.get(j).getText());
			data.put(cn,
					new Object[] { ProgramName.get(j).getText(), contractorName.get(j).getText(),
							projectName.get(j).getText(), enrollmentName.get(j).getText(), statusName.get(j).getText(),
							tradeName.get(j).getText() });
			cn = cn + 1;

		}

		System.out.println("Out form for loop");

		XSSFWorkbook workbook = new XSSFWorkbook();
		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Contractor Pacakge Details");

		// Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			// this creates a new row in the sheet
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				// this line creates a cell in the next column of that row
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}
		try {
			// this Writes the workbook contribute
			FileOutputStream out = new FileOutputStream(new File("D:\\Data Output12.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("gfgcontribute.xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
/*
 * write data into excel file through list and map
	XSSFWorkbook workbook = new XSSFWorkbook(); 
    // Create a blank sheet 
    XSSFSheet sheet = workbook.createSheet("Contractor Pacakge Details"); 

    // This data needs to be written (Object[]) 
	        Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
    data.put("1", new Object[]{ "ID", "NAME", "LASTNAME" }); 
    data.put("2", new Object[]{ 1, "Pankaj", "Kumar" }); 
    data.put("3", new Object[]{ 2, "Prakashni", "Yadav" }); 
    data.put("4", new Object[]{ 3, "Ayan", "Mondal" }); 
    data.put("5", new Object[]{ 4, "Virat", "kohli" }); 
	  
    // Iterate over data and write to sheet 
    Set<String> keyset = data.keySet(); 
    int rownum = 0; 
    for (String key : keyset) { 
        // this creates a new row in the sheet 
        Row row = sheet.createRow(rownum++); 
        Object[] objArr = data.get(key); 
        int cellnum = 0; 
        for (Object obj : objArr) { 
            // this line creates a cell in the next column of that row 
            Cell cell = row.createCell(cellnum++); 
            if (obj instanceof String) 
                cell.setCellValue((String)obj); 
            else if (obj instanceof Integer) 
                cell.setCellValue((Integer)obj); 
        } 
    } 
    try { 
        // this Writes the workbook gfgcontribute 
        FileOutputStream out = new FileOutputStream(new File("D:\\Data Output.xlsx")); 
        workbook.write(out); 
        out.close(); 
        System.out.println("gfgcontribute.xlsx written successfully on disk."); 
    } 
    catch (Exception e) { 
        e.printStackTrace(); 
    } 
*/





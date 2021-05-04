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
import ObjectRepository.ClassCodeModule;
import ObjectRepository.HomePage;

public class ClassCodeSortOrder extends BaseClass
{
	
	@Test
	public void testClassCodeSortOrder() throws InterruptedException
	{
		HomePage.controlMenuHomeIcon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.INFO, "Clicked on Home Icon");
		HomePage.HomeMenuPrograms(driver).click();
		Thread.sleep(6000);
		test.log(LogStatus.INFO, "Clicked on Project Module Icon");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
		
		int x= 1;
		do {
			try {
				ClassCodeModule.seeMoreBtnClassCode(driver).click();
				Thread.sleep(4000);
				System.out.println("clicked");
			} catch (Throwable e) {
				System.out.println(e);
				x=2;
			}
			
		} while (x==1);
		/*String totalCount=ClassCodeModule.displayTotalCountOfClassCode(driver).getText();
		int intCount=Integer.parseInt(totalCount);
		int ans=intCount/25;
		int result=ans+1;
		System.out.println("Divide result= "+result);
		int count=0;
		for(int i=1;i<=result;i++)
		{
			try {
				ClassCodeModule.seeMoreBtnClassCode(driver).click();
				Thread.sleep(4000);
				count++;	
			} catch (Throwable e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
		System.out.println("Click count "+count);*/
		Thread.sleep(5000);
		
		List<WebElement> classcodeDescription = ClassCodeModule.selectAllClassCodeDescriptionFrmLst(driver);
		System.out.println(classcodeDescription.size());
		List<WebElement> classcode = ClassCodeModule.selectAllClassCodeFrmLst(driver);
		List<WebElement> classCodeType = ClassCodeModule.selectAllClassCodeTypeFrmLst(driver);
		List<WebElement> modifiedDate = ClassCodeModule.selectAllClassCodeModifiedDateFrmLst(driver);
		
		
		
		  // This data needs to be written (Object[]) 		
				Map<String, Object[]> data = new TreeMap<String, Object[]>();
				String cn = "1";
				for (int j = 0; j <= classcodeDescription.size() - 1; j++) {
					
					data.put(cn,
							new Object[] { classcodeDescription.get(j).getText(), classcode.get(j).getText(),
									classCodeType.get(j).getText(), modifiedDate.get(j).getText() });
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
					FileOutputStream out = new FileOutputStream(new File("D:\\ClassCodeDetailsOutput.xlsx"));
					workbook.write(out);
					out.close();
					System.out.println("gfgcontribute.xlsx written successfully on disk.");
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
}

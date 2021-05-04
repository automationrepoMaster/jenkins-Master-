package TestScript_NCP;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ExcelDataConfig;

public class NCP_TestCases extends BaseClass
{

	
	@Test(dataProvider = "excelData")
	public void testNCPFunctionality(String TestCaseName,String ProgramName, String Projects , String TradeNo) throws Throwable
	{
		String testCaseName=TestCaseName;
		System.out.println("in NCP Test Case Class");
		/*
		switch (testCaseName) {
		case "EnrollCP":
				EnrollContractorPackageWC_GL_Test tc1 = new EnrollContractorPackageWC_GL_Test();
				tc1.enrollCPWC_GL(TestCaseName, ProgramName,  Projects ,  TradeNo);
//				testNCPEnrollCP(TestCaseName, ProgramName,  Projects , TradeNo);						
			break;
			
		case "AddChangeOrder":

			Add_ChangeOrder_NCP_Test tc2 = new Add_ChangeOrder_NCP_Test();
			tc2.testChangeOrder(TestCaseName, ProgramName,  Projects ,  TradeNo);

			break;

		case "AddMonthlyPayroll":

			Add_MonthlyPayroll_NCP_Test tc3 = new Add_MonthlyPayroll_NCP_Test();
			tc3.testMonthlyPayroll(TestCaseName, ProgramName,  Projects ,  TradeNo);

			break;
			
		case "AddCloseout":
				
			Add_CloseOut_NCP_Test tc4 = new Add_CloseOut_NCP_Test();
			tc4.addCloseOutTest(TestCaseName, ProgramName,  Projects ,  TradeNo);
			break;
			
		case "AddClaims":

			Add_Claims_NCP_Test tc5 = new Add_Claims_NCP_Test();
			tc5.testClaims(TestCaseName, ProgramName,  Projects ,  TradeNo);

			break;

		default:
			System.out.println("please enter the valid Credentials");
			break;
		}
*/		
	}
	
	/*@Test
	public void testNCPEnrollCP(String TestCaseName,String ProgramName,String  Projects ,String  TradeNo) throws Throwable
	{
		EnrollContractorPackageWC_GL_Test tc1 = new EnrollContractorPackageWC_GL_Test();
		tc1.enrollCPWC_GL(TestCaseName, ProgramName,  Projects ,  TradeNo);
	}*/
	
	
	@DataProvider(name = "excelData")
	public Object[][] passdata() 
	{
		//String filePath = "E:\\kp workspace selenium\\Wrap Portal\\testData\\NCP Test Data.xlsx";
		String filePath="D:\\NOURTEK\\Wrap Portal-2\\testData\\NCP Test Data.xlsx";
		ExcelDataConfig config = new ExcelDataConfig(filePath);// put all excel
		int row = config.getRowCount(0);// get exact row count from sheet
		int col = config.getColCount(0);
		System.out.println(col);
		System.out.println(row);

		Object[][] data = new Object[row - 1][col];// store all row and column
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = config.getExcelData("Sheet1", i, j);
			}
		}
		return data;// return data to test
	}
}

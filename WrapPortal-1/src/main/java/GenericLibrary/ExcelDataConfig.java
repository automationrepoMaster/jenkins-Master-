package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String filePath;
	public ExcelDataConfig(String excelpath)
	{
		try
		{
			File src= new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public String getExcelData(String sheetName, int row,int column)
	{	
		sheet =wb.getSheet(sheetName);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public void setExeclData(String SheetName,int rowNum,int celNum,String data) throws Throwable
	{
		org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(SheetName);
		sh.getRow(rowNum).createCell(celNum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();
	}

	public int getRowCount(int sheetIndex)
	{
		int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;

		return row;
		
	}
	public int getColCount(int sheetIndex)
	{
		int col = wb.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
		
		return col;
	}
	
	/*public static String[][] getExcelData1(String fileName, String sheetName) {
		XSSFWorkbook wb1;
		XSSFSheet sheet1;
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			 wb1 =new XSSFWorkbook(fs);
			Sheet sh = wb1.getSheet(sheetName);

			int totalNoOfCols = sh.getRow(0).getLastCellNum();
			int totalNoOfRows = sh.getLastRowNum();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getRow(i).getCell(j).getStringCellValue();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}
	*/
	
	
}

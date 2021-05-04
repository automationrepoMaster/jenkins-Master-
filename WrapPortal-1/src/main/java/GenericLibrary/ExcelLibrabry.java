package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrabry {

	public static XSSFSheet sheet;
	public static XSSFWorkbook workbook;
	public static int rowCount;
	public static File file;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fileinputstream;

	// To get Rows count
	public static  int getRowCount(String filename,String sheetname) throws IOException {

		fileinputstream = new FileInputStream(filename);
		workbook = new XSSFWorkbook(fileinputstream);
		sheet = workbook.getSheet(sheetname);
		int rowscount = sheet.getLastRowNum();
		workbook.close();
		fileinputstream.close();
		return rowscount;
	}

	// To get Cells Count

	public static int getCellData(String filename,String sheetname, int rowNum) throws IOException {

		fileinputstream = new FileInputStream(filename);
		workbook = new XSSFWorkbook(fileinputstream);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rowNum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		fileinputstream.close();
		return cellcount;
	}

	// To get Cell Data

	public static String getCellData(String filename,String sheetname, int rowNum, int columNum) throws IOException {

		fileinputstream = new FileInputStream(filename);
		workbook = new XSSFWorkbook(fileinputstream);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rowNum);
		cell = row.getCell(columNum);
		String data;
		try {

			DataFormatter dataformatter = new DataFormatter();
			String cellData = dataformatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			data = "";
		}
		workbook.close();
		fileinputstream.close();
		return data;

	}
	
}
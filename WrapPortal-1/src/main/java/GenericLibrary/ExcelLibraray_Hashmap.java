package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibraray_Hashmap {

	private static FileInputStream fis;
	private static Workbook wb;
	private static Sheet sh;
	private static Cell cell;
	private static Row row;
	private static String excelfilepath;
	private static Map<String, Integer> columns = new HashMap<>();

	public void setExcelFile(String ExcelPath, String SheetName) throws Exception {
        try {
            File f = new File(ExcelPath);

            if (!f.exists()) {
                f.createNewFile();
                System.out.println("File doesn't exist, so created!");
            }

            fis = new FileInputStream(ExcelPath);
            wb = WorkbookFactory.create(fis);
            sh = wb.getSheet(SheetName);
            //sh = wb.getSheetAt(0); //0 - index of 1st sheet
            if (sh == null) {
                sh = wb.createSheet(SheetName);
            }

            this.excelfilepath = ExcelPath;

            //adding all the column header names to the map 'columns'
            sh.getRow(0).forEach(cell ->{
                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


	public static String getCellData(int rownum, int colnum) throws Exception{
	    try{
	        cell = sh.getRow(rownum).getCell(colnum);
	        String CellData = null;
	        switch (cell.getCellType()){
	            case STRING:
	                CellData = cell.getStringCellValue();
	                break;
	            case NUMERIC:
	                if (DateUtil.isCellDateFormatted(cell))
	                {
	                    CellData = String.valueOf(cell.getDateCellValue());
	                }
	                else
	                {
	                    CellData = String.valueOf((long)cell.getNumericCellValue());
	                }
	                break;
	            case BOOLEAN:
	                CellData = Boolean.toString(cell.getBooleanCellValue());
	                break;
	            case BLANK:
	                CellData = "";
	                break;
	        }
	        return CellData;
	    }catch (Exception e){
	        return"";
	    }
	}

	public static String getCellData(String columnName, int rownum) throws Exception {
	    return getCellData(rownum, columns.get(columnName));
	}
}
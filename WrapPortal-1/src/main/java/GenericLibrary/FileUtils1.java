package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class FileUtils1 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String filePath;
	
	//String excelFilePath="./testData/TestDataFile.xlsx";
		
		public FileUtils1(String excelpath)
		{	
			filePath= excelpath;
			try
			{
				File src= new File(filePath);
				FileInputStream fis=new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
			}catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		
		//create generic method for properties file
		public Properties getPropertiesFileObject() throws Throwable
		{	//create 1 properies file and store all details like url and username password in that file and 
			//access this method from any class or from base class 
			FileInputStream fis=new FileInputStream("./testData/commonData.properties");
			Properties pObj=new Properties();
			pObj.load(fis);	
			return pObj;
		}
		
		//create generic method to access data from excel file
		
		public String getExcelData(String sheetName,int rowNum,int celNum) throws Throwable
		{
			//access data from excel file
//			FileInputStream fis=new FileInputStream(excelFilePath);
//			Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(sheetName);
			String data=sh.getRow(rowNum).getCell(celNum).getStringCellValue();
			wb.close();
			return data;
			
		}
		
		//write a data into the excel file
		public void setExeclData(String SheetName,int rowNum,int celNum,String data) throws Throwable
		{
//			FileInputStream fis=new FileInputStream(excelpath);
//			Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(SheetName);
			sh.getRow(rowNum).createCell(celNum).setCellValue(data);
			FileOutputStream fos=new FileOutputStream(filePath);
			wb.write(fos);
			wb.close();
		}
		
		
		//Screenshot code
		public static String getScreenshot(WebDriver driver)
		{
			String concat=".";
			 Date oDate = new Date();
			 SimpleDateFormat oSDF = new SimpleDateFormat("yyyyMMddHHmmss");
			 String sDate = oSDF.format(oDate);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src= ts.getScreenshotAs(OutputType.FILE);
			String path="./ExtentReports/Screenshots/screen"+sDate+".png";
			File destination=new File(path);
			
			try {
				
				FileUtils.copyFile(src, destination);
			} catch (Throwable e) 
			{
				System.out.println("captured Failed"+e.getMessage());
			}
			
			String tp= concat+path;
			return tp;
			
		}
		
		
		 public static String captureScreen(WebDriver driver,String fileName) 
		 {
			    if(fileName =="") {
			        fileName="Screenshot";  }

			    File destFile=null;
			    Calendar calendar =Calendar.getInstance() ;
			    SimpleDateFormat formater= new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");
			    File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			    try {

			         String reportDirectory = "/Wrap Portal-2/Screenshot/";
			         //String reportDirectory= new File(System.getProperty("user.dir")).getAbsolutePath()+"./src/main/java/com/test/automation/Demo/screenshot/";
			         destFile= new File((String)reportDirectory + fileName +"-" + formater.format(calendar.getTime())+ ".png");
			         FileUtils.copyFile(srcFile,destFile );
			         //This will help us to link screen shot in Extent report
			         Reporter.log("<a href='"+destFile+ "'><img src='" +destFile+"' height='100' width='100'/></a>");
			         //Reporter.log("<a href='"+destFile.getAbsolutePath()+ "'><img src='" +destFile.getAbsolutePath()+"' height='100' width='100'/></a>");
			    }
			    catch(IOException e) {
			        e.printStackTrace();
			    }
			    return destFile.toString();
			}
		 
		
		 
		
	}



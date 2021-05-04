package TestScript;

import org.testng.annotations.Test;

import GenericLibrary.FileUtils1;

public class LoginPageExcelData
{
	
		
		@Test
		public void LoginTest() throws Throwable
		{
			String filepath="null";
			//access data from excel file and print on console using apache poi
			FileUtils1 fu=new FileUtils1(filepath);
		
			for(int i=1; i<=5;i++)
			{
			String column1 = fu.getExcelData("Sheet1", i, 0);//row=i and column =0th(1stcolumn value)
			String column2 = fu.getExcelData("Sheet1", i, 1);//row=i and column=1st (2nd column value)
			System.out.println(column1 + "\t" +column2);
			}
			//write data into the file
			fu.setExeclData("Sheet1", 1, 3, "pass");
		}
	}



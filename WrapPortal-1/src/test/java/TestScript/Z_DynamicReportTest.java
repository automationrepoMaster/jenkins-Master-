package TestScript;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;

public class Z_DynamicReportTest extends BaseClass
{
	
	@Test
	public void testDynamicReport()
	{
		
		//for all wtw willcip report 
		String allReportList="//div[starts-with(@id,'divChild')]//span[@class='reportName']//span";//list
		String buildReportBtn="//input[@id='ctrlBuildReport_btnBuildReport' or @class='blueButton btnBuildReport' ]";
		String exportToPDF="//div[@id='divExportIcon']/ul/li[1]";
		String exportToExcel="//div[@id='divExportIcon']/ul/li[2]";
		String timeStamp="//table[@class='subTable tableHeader']/tbody/tr[1]";
				//"//span[@id='spnHeaderContent']//table/thead/tr[1]";
		String programName="//table[@class='contractorTable tableSubHeader']//tbody/tr[1]/td[2]/span";
		//span[@id='spnHeaderContent']//tr[3]//th[2]//span
		String sponsorName="//table[@class='contractorTable tableSubHeader']//tbody/tr[1]/td[3]/span";
		//span[@id='spnHeaderContent']//tr[3]//th[3]//span
		String projectName="//tbody//tbody[1]//tr[2]/th[@class]";
		String allProjectName="//tbody//tbody[*]//tr[2]/th[@class]//span";//list
		String allColumnName="//tbody//tbody[1]//tr[3]/th[@class and contains(text(),'')]";
		
		
		
		
		
		
		
		
		
		
	
				
	}
	
}

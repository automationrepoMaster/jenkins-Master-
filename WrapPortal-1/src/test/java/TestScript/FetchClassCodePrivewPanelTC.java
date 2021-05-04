package TestScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.ClassCodeModule;
import ObjectRepository.HomePage;

public class FetchClassCodePrivewPanelTC extends BaseClass
{
	@Test
	public void fetchClassCodeDetailsPriviewPanel() throws InterruptedException
	{
		HomePage.HomeMenuWorkClass(driver).click();
		ClassCodeModule.classCodeSelectFirstClassCodeFrmList(driver).click();
			
		Thread.sleep(2000);
		driver.switchTo().frame("ifrmPreview");//switch focus 	
		Thread.sleep(2000);	
		
		List<WebElement> wb=ClassCodeModule.classCodeStatusPrivewP(driver);
		System.out.println("Class Code Status"+wb.size());
		for(int i=0;i<=wb.size()-1;i++)
		{
			System.out.println(wb.get(i).getText());
		}
		
		System.out.println();
		System.out.println("Total Estimated Class Code");
		for(int i=0;i<=ClassCodeModule.classCodeTotalEstimatedClassCodePrivewP(driver).size()-1;i++)
		{
			System.out.println(ClassCodeModule.classCodeTotalEstimatedClassCodePrivewP(driver).get(i).getText());
		}
			System.out.println();
		List<WebElement> wb1 = ClassCodeModule.classCodeAverageClassCodePrivewP(driver);
		System.out.println("Average Class Code");
		for(int i=0;i<=wb1.size()-1;i++)
		{
			
			System.out.println(wb1.get(i).getText());
		}
		System.out.println();
		System.out.println("Total Reported Class Code (Excluding Closeout)");
		for(int i=0; i<=ClassCodeModule.classCodeTotalReportedClassCode_ExcludingCloseout_PrivewP(driver).size()-1;i++)
		{
			System.out.println(ClassCodeModule.classCodeTotalReportedClassCode_ExcludingCloseout_PrivewP(driver).get(i).getText());
		}
		System.out.println();
		System.out.println("Total Reported Class Code (Including Closeout)");
		for(int i=0;i<=ClassCodeModule.classCodeTotalReportedClassCode_IncludingCloseout_PrivewP(driver).size()-1;i++)
		{
			System.out.println(ClassCodeModule.classCodeTotalReportedClassCode_IncludingCloseout_PrivewP(driver).get(i).getText());
		}
		System.out.println();
		System.out.println("Average Reported Class Code");
		for(int i=0;i<=ClassCodeModule.classCodeAverageReportedClassCodePrivewP(driver).size()-1;i++)
		{
			System.out.println(ClassCodeModule.classCodeAverageReportedClassCodePrivewP(driver).get(i).getText());
		}
		
		
		driver.switchTo().parentFrame();
	}
	
	

}

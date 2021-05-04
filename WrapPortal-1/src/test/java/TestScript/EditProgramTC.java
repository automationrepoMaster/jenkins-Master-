package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddProgram_General_Info_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProgramModule;

public class EditProgramTC extends BaseClass
{
	
	@Test
	public void editProgramTC() throws InterruptedException
	{
		WebDriverCommonLib wb=new WebDriverCommonLib();
  		HomePage.HomeMenuPrograms(driver).click();
  		Thread.sleep(3000);
		ProgramModule.programEditIcon(driver).click();
		ProgramModule.programSelectFirstprogramFrmList(driver).click();
		Thread.sleep(3000);
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		AddProgram_General_Info_Page.programName(driver).click();
		System.out.println("Status Switch is selected or not \t"+AddProgram_General_Info_Page.switchStatus(driver).isSelected());
		
		System.out.println("offsite switch \t"+AddProgram_General_Info_Page.switchTrackOffsiteCoverage(driver).isSelected());

		WebElement element = AddProgram_General_Info_Page.switchStatus(driver);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		//element.click();
		
		//AddProgram_General_Info_Tab.switchStatus(driver).click();
		
//		WebElement element = AddProgram_General_Info_Tab.switchStatus(driver);
//		Actions action = new Actions(driver);
//		action.moveToElement(element);
		
		
		
		
//		java.util.List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		System.out.println(checkboxs.size());
//		
//		for(int i=0;i<checkboxs.size();i++)
//		{
//			String sVlaue=checkboxs.get(i).getAttribute("name");
//			if(sVlaue.equalsIgnoreCase("chkTrackOffsiteCoverage"))
//			{
//				checkboxs.get(i).click();
//			}
//			
//		}
		
		//AddProgram_General_Info_Tab.switchTrackOffsiteCoverage(driver).click();
		
		//AddProgram_General_Info_Tab.switchAllowNegotiatedCreditDeduct(driver).isSelected();
//		AddProgram_General_Info_Tab.switchAllowNegotiatedCreditDeduct(driver).click();
//		AddProgram_General_Info_Tab.switchStatus(driver).click();
		
//		WebElement element1=AddProgram_General_Info_Tab.switchStatus(driver);
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.visibilityOf(element1)); 
//		wait1.until(ExpectedConditions.elementToBeClickable(element1));
//		element1.click();
		
//		AddProgram_General_Info_Tab.switchAllowNegotiatedCreditDeduct(driver).isSelected();
	}
		
}

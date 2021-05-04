package TestScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddProject_General_Information_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class Verify_Project_DropDowns_TC extends BaseClass
{
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	@Test
	public void verifyProjectDropdown() throws Throwable
	{
		
		HomePage.controlMenuProject(driver).click();
		Thread.sleep(4000);
		ProjectModule.projectEditIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		WebElement lst = AddProject_General_Information_Page.selectProgramField(driver);
			Select sel=new Select(lst);
			 List<WebElement> size = sel.getOptions();
			 if(size.size()!=0)
			 {
				 System.out.println("PAss");
			 }
			 for(int i=0;i<size.size();i++)
			 {
				 System.out.println(size.get(i).getText());
			 }
			 
			 
			System.out.println( AddProject_General_Information_Page.verifyLinkisAvailableOrNot(driver).isEnabled());
			
			
		Thread.sleep(1500);
		System.out.println(AddProject_General_Information_Page.selectProgramField(driver).isDisplayed());
//		wb.mouseMoveToElement(AddProject_General_Information_Page.generalInformationCloseButton(driver));
		driver.close();
		driver.switchTo().window(wb.map.get("parentID"));
		
		
	}
}

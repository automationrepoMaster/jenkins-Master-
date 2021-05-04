package TestScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;
import ObjectRepository.AddProjectPage;
import ObjectRepository.AddProject_Certificate_Page;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectModule;

public class EditProjectTC extends BaseClass
{
	
	@Test
	public void editProject() throws InterruptedException
	{
		WebDriverCommonLib wb=new WebDriverCommonLib();
		HomePage.HomeMenuProjects(driver).click();
		Thread.sleep(1000);
		
		ProjectModule.projectSelectFirstProjectFrmList(driver).click();
		Thread.sleep(3000);

		ProjectModule.projectEditIcon(driver).click();
		wb.getWindowIDs();
		driver.switchTo().window(wb.map.get("childID"));
		
		AddProjectPage.addProjectCertificatesTab(driver).click();
		driver.manage().window().maximize();
		
		
		//driver.switchTo().frame("cntrWorkSiteCertificates_txtCertificateDescription_ifr");
		Thread.sleep(2000);
		AddProject_Certificate_Page.descriptionOperationsTextAreaBold(driver).click();
		
//		AddProject_Certificate_Page.descriptionOperationsTextArea(driver).click();
		Thread.sleep(2000);
		AddProject_Certificate_Page.selectCompanyNameToken(driver).click();
		AddProject_Certificate_Page.selectProgramNameToken(driver).click();
		
		//driver.switchTo().defaultContent();
		WebElement element=AddProject_Certificate_Page.projectSpecificPolicyRadioBtn(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element)); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
		
		
//		AddProject_Certificate_Page.projectSpecificPolicySwitch(driver).click();
		Thread.sleep(2000);
	
	}
	
}

package RajaTestScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;

public class SortDropdDown extends BaseClass{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	
	@Test
	
	public void CheckSortBy_DropDown() throws Throwable {
		
		ObjectRepository.HomePage.HomeMenuSponsors(driver).click();
		test.log(LogStatus.PASS, "Sponsor module is click");
		Thread.sleep(2000);
		ObjectRepository.SponsorsModule.SponsorAddIcon(driver).click();
		System.out.println("Sposnsor Add Icon is clicked");
		wb.SwitchtoChild1();
		
		//DropDown
		WebElement ele = driver.findElement(By.xpath("//select[@id='ddlSecurity']"));
		ArrayList originalList = new ArrayList();
		Select s = new Select (ele);
		for(WebElement E : s.getOptions()) {
			originalList.add(E.getText());
		}
		System.out.println("original List" + originalList);
		
		for(WebElement all : s.getAllSelectedOptions()) {
			if(all.getText().contains("Owner")) {
				System.out.println("Owner is avaialbel");
			
			}else {
				System.out.println("Owner is not available");
			}
			
		}
		
		String FirstText = s.getFirstSelectedOption().getText();
		Assert.assertEquals(FirstText, "Owner");
		System.out.println("Assert is validated");
	
			
		ArrayList sortedlist = originalList;
		Collections.sort(sortedlist);
		System.out.println("original List"+ originalList);
		System.out.println("sorted List " + sortedlist );
		
		if(originalList==sortedlist)
		{
			System.out.println("Dropdown sorted by Alaphabets");
		}else
		{
			System.out.println("Dropdown not sorted by Alaphabets");
		}
		driver.close();
		Thread.sleep(2000);
		wb.Switchtoparent();
		
		
		
		
		
	}

}

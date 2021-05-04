package RajaTestScripts;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CommonLibrary.WebDriverCommonLib;
import GenericLibrary.BaseClass;

public class CheckSort extends BaseClass{
	
	WebDriverCommonLib wb = new WebDriverCommonLib();
	
	public void sort_The_DropDown() throws Throwable {
		
		ObjectRepository.HomePage.HomeMenuSponsors(driver).click();
		System.out.println("Clicked on Sposnor icon");
		Thread.sleep(3000);
		ObjectRepository.SponsorsModule.SponsorAddIcon(driver).click();
		System.out.println("Plus button is clicked");
		Thread.sleep(1000);
		wb.SwitchtoChild1();
		WebElement element = driver.findElement(By.xpath("//select[@id='ddlSecurity']"));
		Select s = new Select(element);
		ArrayList list = new ArrayList();
		for(WebElement ele : s.getOptions()) {
			list.add(ele.getText());
		}
		System.out.println("list" + list);
		ArrayList verifylist = list;
		Collections.sort( verifylist);
		System.out.println("Verifylist "+  verifylist);
		System.out.println("List" + list);
		if(verifylist == list) {
			System.out.println("Dropdown is sorted");
		}else
		{
			System.out.println("Dropdown is not sorted");
		}
		
		driver.close();
		Thread.sleep(2000);
		wb.Switchtoparent();
		
	}

}

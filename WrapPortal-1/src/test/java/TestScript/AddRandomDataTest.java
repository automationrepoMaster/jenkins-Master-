package TestScript;

import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.RandomClass;
import ObjectRepository.HomePage;
import ObjectRepository.SponsorsModule;

public class AddRandomDataTest extends BaseClass
{
	@Test
	public void randomData() throws FileNotFoundException, InterruptedException
	{
		HomePage.HomeMenuSponsors(driver).click();
		SponsorsModule.sponsorSearchEditBox(driver).sendKeys(RandomClass.randomSponsorName());
		
		//collect all sponsors name and store it in the list 
		String path="//div[@class='panel-body']/div[1]/ul[*]/li[*]/div[1]//div[@class='companytitle']";
		List<WebElement>lst=driver.findElements(By.xpath(path));
		
		System.out.println("Numbers of Sponsors is:\t"+lst.size());
		String actual="AutoNation";//select sponsors in list
			for(int i=0;i<=lst.size()-1;i++)
			{
				String sponsorName=lst.get(i).getText();
				System.out.println(sponsorName);			
				
				if(sponsorName.contains(actual))//compare sponsor name with list
				{
					lst.get(i).click();//if match then click on that sponsor
				}
				
			}
			
		driver.switchTo().frame("ifrmPreview");//switch focus 		
		List<WebElement> lst1=SponsorsModule.sponsorFetchContactsPrivewP(driver);
		System.out.println("List of Contacts\t"+lst1.size());
		
		for(int i=0;i<= lst1.size()-1;i++)
			{
				System.out.print(lst1.get(i).getText());
				System.out.println();
			}
			driver.switchTo().defaultContent();
		SponsorsModule.sponsorSearchEditBox(driver).click();
	}
}



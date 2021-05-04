package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Report_Contr_Insurnc_Cost_Track_CPkg 
{
	
	
	
	
	private static WebElement element;
	private static List<WebElement> listElement;

	
	static String insuranceCostAdjustmentValueBoth ="//body[@class='SystemFont']/table[1]/tbody//tr/td[contains(text(),'Insurance Cost Adjustments')]/../td[position()=3 or position()=5]";
	static String insuranceCostAdjustmentEstimatedCalculation ="//body[@class='SystemFont']/table[1]/tbody//tr/td[contains(text(),'Insurance Cost Adjustments')]/../td[position()=3]";
	static String insuranceCostAdjustmentTo_DateCalculation ="//body[@class='SystemFont']/table[1]/tbody//tr/td[contains(text(),'Insurance Cost Adjustments')]/../td[position()=5]";

	public static List<WebElement> insuranceCostAdjustmentValueBoth(WebDriver driver) {
		listElement = driver.findElements(By.xpath(insuranceCostAdjustmentValueBoth));
		return listElement;
	}public static WebElement insuranceCostAdjustmentEstimatedCalculation(WebDriver driver) {
		element = driver.findElement(By.xpath(insuranceCostAdjustmentEstimatedCalculation));
		return element;
	}public static WebElement insuranceCostAdjustmentTo_DateCalculation(WebDriver driver) {
		element = driver.findElement(By.xpath(insuranceCostAdjustmentTo_DateCalculation));
		return element;
	}
}

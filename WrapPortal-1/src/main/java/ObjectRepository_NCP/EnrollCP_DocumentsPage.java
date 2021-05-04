package ObjectRepository_NCP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollCP_DocumentsPage 
{
	
	private static WebElement element;
	private static List<WebElement> listElement;
	
	
	static String closeDocumnetWindow="//span[contains(text(),'×')]";
	static String addNewDocumentBtn="//input[contains(@class,'upload-required--document position-absolute')]";
	static String documentNames="//h5[contains(text(),'Optional Documents')]/../../div[2]/div[*]/div[1]//div[contains(@class,'div-hover')]//span[@class='span-document-name']";//list
	
	
	public static WebElement closeDocumnetWindow(WebDriver driver)
	{
		element=driver.findElement(By.xpath(closeDocumnetWindow));
		return element;
	}
	public static WebElement addNewDocumentBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(addNewDocumentBtn));
		return element;
	}public static List<WebElement> documentNames(WebDriver driver)
	{
		listElement=driver.findElements(By.xpath(documentNames));
		return listElement;
	}
	
	
}

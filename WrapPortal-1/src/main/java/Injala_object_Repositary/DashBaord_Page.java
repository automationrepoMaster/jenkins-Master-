package Injala_object_Repositary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBaord_Page {
	
	
	public static WebElement element;
	public static List<WebElement>listElement;
	
	
	// Top Headings
	static String EmailIcon ="//li[@id='ctrlHeader_EmailMenu']//i[@id='IcoDisable']";
	static String OpenActionItemsIcon ="//li[@id='ctrlHeader_OpenActionItems']//i[@class='fa fa-bell ']";
	static String AssuretifyLogo ="//div[@class='logo-area']";
	static String DashBoardIcon ="//li[@id='ctrlHeader_DashboardMenu']//a[@id='ctrlHeader_liDashboard']";
	static String ContractsIcon ="//a[@id='ctrlHeader_liCompliance']/span[@id='ctrlHeader_lblCompliance']";
	static String ProjectsIcon ="//a[@id='ctrlHeader_liLocation']/span[@id='ctrlHeader_lblLocation']";
	static String RiskProfilesIcon ="//a[@id='ctrlHeader_liTier']/span[@id='ctrlHeader_lblTiers']";
	static String ContractorsIcon ="//a[@id='ctrlHeader_liVendors']/span[@id='ctrlHeader_lblVendors']";
	static String NotesIcon ="//li[@id='ctrlHeader_NotesMenu']/a[@id='ctrlHeader_liNotes']";
	static String MoreIcon ="//li[@id='ctrlHeader_moremenu']/a[@id='ctrlHeader_limore']";
	static String DocumentsICon ="//li[@id='ctrlHeader_DocumentsMenu']/a[@id='ctrlHeader_liDocuments']";
	static String CalenderHeadingIcon ="//li[@id='ctrlHeader_liliCalender']/a[@id='ctrlHeader_liCalender']";
	static String TasksIcon ="//li[@id='ctrlHeader_liliTasks']/a[@id='ctrlHeader_liTasks']";
	static String InsuranceCompanies ="//li[@id='ctrlHeader_liliIC']/a[@id='ctrlHeader_liIC']";
	static String AgenciesIcon ="//li[@id='ctrlHeader_liliAgency']/a[@id='ctrlHeader_liAgencies']";
	static String FeedsIcon ="//li[@id='ctrlHeader_liliFeeds']/a[@id='ctrlHeader_liFeeds']";
	static String TradesIcon ="//li[@id='ctrlHeader_liTrade']/a/span[@id='ctrlHeader_lblTrade']";
	static String ReportsIcon ="//li[@id='ctrlHeader_liReports']/a[@id='ctrlHeader_aReportsli']";
	static String SearchIcon ="//a[@id='search']/i[@class='fa fa-search']";
	static String ImageIcon ="//img[@id='ctrlHeader_imgUserProfilePic']";
	static String ProfileUserNameIcon ="//span[@id='ctrlHeader_lblUserName']";
	static String LogOutDownBtn ="//span[@id='ctrlHeader_lblUserName']/..//i[@class='fa fa-angle-down']";
	static String SettingsBtn ="//li[@id='ctrlHeader_liSettings']";
	static String ProfileBtn ="//li[@id='ctrlHeader_liMyProfile']";
	static String LogOutBtn ="//a/i[@class='fa fa-lock']/..";
	
	
	
	public static WebElement ImageIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ImageIcon));
		return element;	
	}
	public static WebElement ProfileUserNameIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ProfileUserNameIcon));
		return element;	
	}
	public static WebElement LogOutDownBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(LogOutDownBtn));
		return element;	
	}
	public static WebElement SettingsBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(SettingsBtn));
		return element;	
	}
	public static WebElement LogOutBtn(WebDriver driver) {
		element = driver.findElement(By.xpath(LogOutBtn));
		return element;	
	}
	
	public static WebElement SearchIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(SearchIcon));
		return element;	
	}
	public static WebElement EmailIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(EmailIcon));
		return element;	
	}
	public static WebElement OpenActionItemsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(OpenActionItemsIcon));
		return element;	
	}
	public static WebElement AssuretifyLogo(WebDriver driver) {
		element = driver.findElement(By.xpath(AssuretifyLogo));
		return element;	
	}
	public static WebElement DashBoardIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(DashBoardIcon));
		return element;	
	}
	public static WebElement ContractsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractsIcon));
		return element;	
	}
	public static WebElement ProjectsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ProjectsIcon));
		return element;	
	}
	public static WebElement RiskProfilesIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(RiskProfilesIcon));
		return element;	
	}
	public static WebElement ContractorsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ContractorsIcon));
		return element;	
	}
	public static WebElement NotesIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(NotesIcon));
		return element;	
	}
	public static WebElement MoreIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(MoreIcon));
		return element;	
	}
	public static WebElement DocumentsICon(WebDriver driver) {
		element = driver.findElement(By.xpath(DocumentsICon));
		return element;	
	}
	public static WebElement CalenderHeadingIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(CalenderHeadingIcon));
		return element;	
	}
	public static WebElement TasksIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(TasksIcon));
		return element;	
	}
	public static WebElement InsuranceCompanies(WebDriver driver) {
		element = driver.findElement(By.xpath(InsuranceCompanies));
		return element;	
	}
	public static WebElement AgenciesIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(AgenciesIcon));
		return element;	
	}
	public static WebElement FeedsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(FeedsIcon));
		return element;	
	}
	public static WebElement TradesIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(TradesIcon));
		return element;	
	}
	
	public static WebElement ReportsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ReportsIcon));
		return element;	
	}
	
	
	// First Line menu items
	
	static String WeatherIcon ="//i[@class='pull-left fa fa-sun-o icon-md icon-rounded']";
	static String CalenderIcon="//i[@class='pull-left fa fa-calendar icon-md icon-rounded']";
	static String OpenActioItemsIcon ="//h4[@id='hOpenActionItem']";
	static String ActiveVendorsIcon ="//li[@id='liActiveVendors']";
	static String TaskIcon ="//h4[@id='hTask']";
	static String DocumentsSizeIcon ="//h4[@id='hDocumentSize']";
	static String EmailsIcon ="//h4[@id='hEmails']";
	static String ActivitySinceLogin ="//h4[@id='hActivitysincelast login']";
	static String DateandTime ="//h4[@id='hDateandTime']";
	static String Add_RemoveComponents ="//a[@onclick ='OpenAddRemoveWidget(1)']//i[@class='pull-left fa fa-plus icon-md icon-rounded']";
	
	
	
	public static WebElement Add_RemoveComponents(WebDriver driver) {
		element = driver.findElement(By.xpath(Add_RemoveComponents));
		return element;	
	}
	public static WebElement WeatherIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(WeatherIcon));
		return element;	
	}
	public static WebElement CalenderIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(CalenderIcon));
		return element;	
	}
	public static WebElement OpenActioItemsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(OpenActioItemsIcon));
		return element;	
	}
	public static WebElement ActiveVendorsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(ActiveVendorsIcon));
		return element;	
	}
	public static WebElement TaskIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(TaskIcon));
		return element;	
	}
	public static WebElement DocumentsSizeIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(DocumentsSizeIcon));
		return element;	
	}
	public static WebElement EmailsIcon(WebDriver driver) {
		element = driver.findElement(By.xpath(EmailsIcon));
		return element;	
	}
	public static WebElement ActivitySinceLogin(WebDriver driver) {
		element = driver.findElement(By.xpath(ActivitySinceLogin));
		return element;	
	}
	public static WebElement DateandTime(WebDriver driver) {
		element = driver.findElement(By.xpath(DateandTime));
		return element;	
	}
	
	
	
	
	
	
	
	

}

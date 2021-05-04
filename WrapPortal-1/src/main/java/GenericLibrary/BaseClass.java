package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver = null;
	public static ExtentReports extent;
	public static ExtentTest test;

	Date oDate = new Date();
	SimpleDateFormat oSDF = new SimpleDateFormat("yyyyMMddHHmmss");
	String sDate = oSDF.format(oDate);
	String bNAme;

	@BeforeSuite
	public void reportGenerate() {
//		 String path=System.getProperty("user.dir")+"./ExtentReports/ExtentReport"+System.currentTimeMillis()+".html";
		String path = System.getProperty("user.dir") + "./ExtentReports/ExtentReport" + sDate + ".html";// accept
																										// systeam date
		extent = new ExtentReports(path, false);
		// extent = new ExtentReports("D://MyExtentReport.html", true);
		// extent.loadConfig(new File("E:\\kp workspace selenium\\Wrap
		// Portal\\extent-config.xml"));
		extent.loadConfig(new File("D:\\Code Repositary\\WrapPortal-1\\extent-config.xml"));
	}

	
	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(String browserName) throws Throwable {
//		extent = new ExtentReports("D://MyExtentReport.html", true);
//		extent.loadConfig(new File("E:\\kp workspace selenium\\Wrap Portal\\extent-config.xml"));
		// load property file and access the data
		FileInputStream fis = new FileInputStream("./testData/commonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
//		 bNAme = pObj.getProperty("browser");
		bNAme = browserName;
		System.out.println("browserNAme======>" + bNAme);
		System.out.println("====launch the Browser=====");
		// Browser name value access from property file
		if (bNAme.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "./src/Resource/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (bNAme.equals("chrome")) {
             WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./src/Resource/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (bNAme.equals("ie")) {
			//System.setProperty("webdriver.chrome.driver", "./src/Resource/IEDriverServer.exe");
			WebDriverManager.iedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = pObj.getProperty("url");// use property file to get url
		System.out.println("url======>" + url);
		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// use property file to get user name and password
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("txtUserName")).sendKeys(pObj.getProperty("username"));

		driver.findElement(By.id("txtPassword")).sendKeys(pObj.getProperty("password"));
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@BeforeMethod
	public void loginToApplication(Method method) {
		test = extent.startTest((this.getClass().getSimpleName() + " :: " + method.getName()), method.getName());
		// test.assignAuthor("Kiran Pirangute");
		test.assignAuthor("Raja Reddy");
		test.assignCategory("Functional Test");
		// driver.findElement(By.id("txtUserName")).sendKeys("demotest2");
		// driver.findElement(By.id("txtPassword")).sendKeys("p&q!sJ5Ml6");
		// driver.findElement(By.xpath("//a[text()='Login']")).click();
		// test.log(LogStatus.PASS, "Browser Launch successfully");
		test.log(LogStatus.PASS, "Test Started");
		test.log(LogStatus.PASS, "Browser Name " + bNAme);
	}

	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws Throwable {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName() + " Test has been Failed" + result.getStatus());
			test.log(LogStatus.FAIL, result.getThrowable());
			String screenshotpath = FileUtils1.getScreenshot(driver);
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotpath));
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(LogStatus.PASS, result.getName() + " Test has been Passed" + result.getStatus());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test Case : " + result.getName() + " Test has been Skipped" + result.getStatus());
			// extent.endTest(test);//add latter to test skip functionality with extent
			// report

		} else {
			System.out.println("Base Class Something Went Wrong");
		}

		test.log(LogStatus.PASS, "Test Ended");
		extent.endTest(test);
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() throws Throwable {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//img[@id='ctl00_ctrlHeader_imgAvatars']")));
//			driver.findElement(By.xpath("//img[@id='ctl00_ctrlHeader_imgAvatars']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
			driver.close();

		} catch (Throwable e) {
			extent.endTest(test);
			System.out.println(e);
//			extent.flush();
//			extent.close();
		}
	}

	@AfterSuite(alwaysRun = true)
	public void reportEnd() {
		extent.flush();
		extent.close();
	}

}

/*
 * // @BeforeClass // @Parameters({"browserName"}) // public void
 * launchBrowser(String browserName) // { // if
 * (browserName.equalsIgnoreCase("chrome")) // { //
 * System.setProperty("webdriver.chrome.driver", //
 * "./src/Resource/chromedriver.exe"); // driver = new ChromeDriver(); // // }
 * // else if (browserName.equalsIgnoreCase("firefox")) // { //
 * System.setProperty("webdriver.gecko.driver", //
 * "./src/Resource/geckodriver.exe"); // driver = new FirefoxDriver(); // // }
 * // else if (browserName.equalsIgnoreCase("ie")) // { //
 * System.setProperty("webdriver.ie.driver", //
 * "./src/Resource/IEDriverServer.exe"); // driver = new
 * InternetExplorerDriver(); // } // // driver.manage().window().maximize(); //
 * driver.get("https://beta.wrapportal.com/"); //
 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // }
 * 
 * // @BeforeMethod // @Test(dataProvider="excelData") // public void
 * loginTest(String userName, String password) // { //
 * driver.findElement(By.id("txtUserName")).sendKeys(userName); //
 * driver.findElement(By.id("txtPassword")).sendKeys(password); //
 * driver.findElement(By.xpath("//a[text()='Login']")).click(); // } //
 * 
 * // @DataProvider(name="excelData") // public Object [] [] passdata() // { //
 * ExcelDataConfig config=new //
 * ExcelDataConfig("./testData/TestDataFile.xlsx"); // int
 * row=config.getRowCount(0); // // Object[][] data = new Object[row][2]; //
 * for(int i=0;i<row;i++) // { // data[i][0]=config.getData(0, i, 0); //
 * data[i][1]=config.getData(0, i, 1); // } // return data; // // }
 * 
 * // if (iTestResult.getStatus() == ITestResult.FAILURE) { // String
 * screenshotPath = GetScreenshot.capture(driver, "screenShots"); //
 * test.log(LogStatus.FAIL, "Screenshot", //
 * test.addScreenCapture(screenshotPath)); // test.log(LogStatus.FAIL,
 * "Test Case Failed is " + iTestResult.getName()); // test.log(LogStatus.FAIL,
 * "Test Case Failed is " + // iTestResult.getThrowable()); // } else if
 * (iTestResult.getStatus() == ITestResult.SKIP) { // test.log(LogStatus.SKIP,
 * "Test Case Skipped is " + iTestResult.getName()); // } //
 * 
 * // if (result.getStatus() == ITestResult.FAILURE) { //
 * test.log(LogStatus.FAIL, result.getName()); //
 * test.log(LogStatus.FAIL,result.getThrowable()); ////
 * test.fail("Screen Shot : " + test.addScreenCaptureFromPath(screenShot)); // }
 * else if (result.getStatus() == ITestResult.SUCCESS) { //
 * test.log(LogStatus.PASS, result.getName()); //// test.pass("Screen Shot : " +
 * test.addScreenCaptureFromPath(screenShot)); // } else if (result.getStatus()
 * == ITestResult.SKIP) // { // test.skip("Test Case : " + result.getName() +
 * " has been skipped"); // }
 */
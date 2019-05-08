package web.sqedemomay9.dbdataset.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import web.sqedemomay9.dbdataset.webpageclasses.LoginScreen;
import web.sqedemomay9.dbdataset.webpageclasses.DashboardScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC1 extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 8;

	public TC1() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC1.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc1.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, LoginScreen.projectName);
		test = reports.startTest("TC1");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = LoginScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void LoginScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		LoginScreen objLoginScreen = PageFactory.initElements(driver, LoginScreen.class);
		testLogHeader(test, "Verify LoginScreen page");
		objLoginScreen.fillINPUTUserName_313507(configFileObj.getProperty("UserName"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered UserName : " + configFileObj.getProperty("UserName"+ i + datasetScreencount));
		objLoginScreen.fillINPUTPassword_313509(configFileObj.getProperty("Password"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
String text3 = objLoginScreen.clkBUTTONLogin_313511();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("Login"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on Button : " + configFileObj.getProperty("Login"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Button Text : " + configFileObj.getProperty("Login"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Text is displayed as : " + configFileObj.getProperty("Login"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void DashboardScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		DashboardScreen objDashboardScreen = PageFactory.initElements(driver, DashboardScreen.class);
		testLogHeader(test, "Verify DashboardScreen page");
		objDashboardScreen.clkIMGProfilePic_313535();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ProfilePicLink");
		objDashboardScreen.clkSPANLogout_313559();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : LogoutLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= DashboardScreen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { LoginScreenTest(datasets);}
			if(isElementDispalyed) { DashboardScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}
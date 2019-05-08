package web.sqedemomay9.dbdataset.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class LoginScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://192.168.1.142/\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"SQEDemoMay9\",\"project_description\":\"desc\",\"project_id\":287,\"module_name\":\"DBDataset\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":434,\"testcase_name\":\"TC1\",\"testcase_id\":469,\"testset_id\":0,\"executed_timestamp\":-1774994239,\"browser_type\":\"chrome\"}";

	public static String projectName = "sqedemomay9";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 8;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='username']")	
	private WebElement	UserName_313507INPUT;
	public void fillINPUTUserName_313507(String varInputValue) {
		waitForExpectedElement(driver, UserName_313507INPUT);
		UserName_313507INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='password']")	
	private WebElement	Password_313509INPUT;
	public void fillINPUTPassword_313509(String varInputValue) {
		waitForExpectedElement(driver, Password_313509INPUT);
		Password_313509INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//SECTION[@id='site-content']/DIV[1]/DIV[1]/FORM[1]/DIV[3]/BUTTON[1]")	
	private WebElement	Login_313511BUTTON;
	public String clkBUTTONLogin_313511() {
		waitForExpectedElement(driver, Login_313511BUTTON);		
		String text = Login_313511BUTTON.getText();
		Login_313511BUTTON.click();
		return text;
	}

}
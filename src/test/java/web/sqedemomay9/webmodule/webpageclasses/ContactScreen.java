package web.sqedemomay9.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class ContactScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"SQEDemoMay9\",\"project_description\":\"desc\",\"project_id\":287,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"Tc1\",\"testcase_id\":470,\"testset_id\":0,\"executed_timestamp\":-1773386316,\"browser_type\":\"chrome\"}";

	public static String projectName = "sqedemomay9";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ContactScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//A[@id='tpth']")	
	private WebElement	Tirupati_314165A;
	public String clkATirupati_314165() {
		waitForExpectedElement(driver, Tirupati_314165A);		
		String text = Tirupati_314165A.getText();
		Tirupati_314165A.click();
		return text;
	}

}
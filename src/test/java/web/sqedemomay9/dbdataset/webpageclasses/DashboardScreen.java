package web.sqedemomay9.dbdataset.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class DashboardScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://192.168.1.142/\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"SQEDemoMay9\",\"project_description\":\"desc\",\"project_id\":287,\"module_name\":\"DBDataset\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":434,\"testcase_name\":\"TC1\",\"testcase_id\":469,\"testset_id\":0,\"executed_timestamp\":-1774994239,\"browser_type\":\"chrome\"}";

	public static String projectName = "sqedemomay9";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 8;

	public DashboardScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//BODY[@id='loading']/NAV[1]/DIV[2]/NAV[1]/DIV[1]/DIV[2]/A[1]/SPAN[1]/IMG[1]")	
	private WebElement	ProfilePic_313535IMG;
	public void clkIMGProfilePic_313535() {
		waitForExpectedElement(driver, ProfilePic_313535IMG);		
		String text = ProfilePic_313535IMG.getText();
	}

	@FindBy(how = How.XPATH, using = "//BODY[@id='loading']/NAV[1]/DIV[2]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/A[4]/SPAN[1]")	
	private WebElement	Logout_313559SPAN;
	public void clkSPANLogout_313559() {
		waitForExpectedElement(driver, Logout_313559SPAN);		
		String text = Logout_313559SPAN.getText();
	}

}
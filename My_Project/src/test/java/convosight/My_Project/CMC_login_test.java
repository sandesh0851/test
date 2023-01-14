package convosight.My_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;





public class CMC_login_test extends Base_class


{
	CMC_Home_Page home;
	CMC_login login;
	@BeforeClass
	public void open_browser() throws IOException, InterruptedException
	{
		initializeBrowser();
		
	}		
		
		@BeforeMethod
	
	 public void login_to_CMC() throws IOException, InterruptedException
	{
			CMC_login login=new CMC_login(driver);
			Thread.sleep(3000);
		    login.Enterusername(Utility_class.getPFData("UN"));
		    Thread.sleep(3000);
	        login.Enterpassword(Utility_class.getPFData("pwd"));
	        Thread.sleep(3000);
	        login.clickonloginbtn();
	        Thread.sleep(5000);
}
		
		@Test
		public void verify_CMC_login() throws IOException
		{
			home=new CMC_Home_Page(driver);
			String actual_text=home.get_brand_text();
			String Expected_text=Utility_class.getPFData("Expected_value");
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(Expected_text, actual_text, "Failed :Not login to CMC page");
		}
		@AfterMethod
		public void logout_CMC()
		{
			home.click_on_Account();
			home.click_on_logout();
		}
		@AfterClass
		public void close_browser() throws InterruptedException
		{
			Thread.sleep(10000);
			driver.close();
		}

	
	}


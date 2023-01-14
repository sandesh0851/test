package convosight.My_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	WebDriver driver;
	public void initializeBrowser() throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandesh gaikwad\\Desktop\\convosight\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(Utility_class.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}


}

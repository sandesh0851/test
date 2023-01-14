package convosight.My_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CMC_Home_Page
{
	@FindBy(xpath="//span[text()='Brands']") private WebElement Brands;
	@FindBy(xpath="(//button[@type='button'])[1]") private WebElement Account; 
	@FindBy(xpath="//li[@role='menuitem']")private WebElement logout;
	
	CMC_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String get_brand_text() 
	{
		String Actual_name=Brands.getText();
		return Actual_name;
		
	}
	public void click_on_Account()
	{
		Account.click();
	}
	public void click_on_logout()
	{
		logout.click();
	}
	

}

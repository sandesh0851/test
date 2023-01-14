package convosight.My_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CMC_login extends Base_class
{
	@FindBy(xpath="//input[@type='text']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn; 
	
	
	CMC_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Enterusername(String UN)
	{
		Username.sendKeys(UN);
	}
	
	public void Enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickonloginbtn()
	{
		loginbtn.click();
	}
	
	

}

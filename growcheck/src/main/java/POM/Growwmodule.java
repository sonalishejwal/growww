package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Growwmodule {
	WebDriver driver;
	@FindBy (xpath="//div[text()='F&O - Futures & Options']")
	 private WebElement FnO;
	
	@FindBy (xpath="//div[text()='ETF - Exchange Traded Funds']")
	 private WebElement ETF;
	
	@FindBy (xpath="//div[text()='IPO - Initial Public Offerings']")
	 private WebElement IPO;
	
	@FindBy (xpath="//div[text()='SGB - Sovereign Gold Bond']")
	 private WebElement SGB;
	
	@FindBy (xpath="//i[text()='keyboard_arrow_down']")
	 private WebElement account;
	
	@FindBy (xpath="(//div[@class='settingItem valign-wrapper'])[4]")
	 private WebElement logout;
	
	
	
	
	
	
	/*WebElement FnO=driver.findElement(By.xpath("//div[text()='F&O - Futures & Options']"));
	FnO.click();
	
	WebElement ETF=driver.findElement(By.xpath("//div[text()='ETF - Exchange Traded Funds']"));
	ETF.click();
	
	WebElement IPO=driver.findElement(By.xpath("//div[text()='IPO - Initial Public Offerings']"));
	IPO.click();
	
	WebElement SGB=driver.findElement(By.xpath("//div[text()='SGB - Sovereign Gold Bond']"));
	SGB.click();

	*/
	
	
	public Growwmodule(WebDriver driver) 
	{ this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void ETF()
	{
		ETF.click();
	}
	
	public void IPO()
	{
		IPO.click();
	}
	public void FnO()
	{
		FnO.click();
	}
	public void SGB()
	{
		SGB.click();
	}
	public void account()
	{
		account.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	

}

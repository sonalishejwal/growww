package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Growwinternal {
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='inputShare']")
	private WebElement shareNSE;
	
	@FindBy (xpath="//span[text()='BUY']")
	private WebElement buybutton;
	
	@FindBy (xpath="//div[text()='BUY']")
	private WebElement buy;
	
	@FindBy (xpath="//div[text()='SELL']")
	private WebElement sell;
	
	

	
	public Growwinternal(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Shares()
	{
		shareNSE.sendKeys("0");
	}
	
	public void buybutton()
	{
		boolean res=buybutton.isEnabled();
		System.out.println(res+ " button enabled");
//		buy.click();
	}
	
	public void buy()
	{
		buy.click();
		boolean res=buy.isDisplayed();
		System.out.println(res+ " buy displayed");
//		buy.click();
	}
	
	public void sell()
	{
		sell.click();
		boolean res=sell.isEnabled();
		System.out.println(res+ "sell enabled");
//		buy.click();
	}

}

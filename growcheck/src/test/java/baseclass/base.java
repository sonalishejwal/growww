package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
public static WebDriver openChromebrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Sonali\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		return driver;
	}
	

	

}

package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static ChromeDriver driver;
	
	public static WebDriver getWebDriver() {
				
		 System.setProperty("webDriver.chrome.driver", "C:\\Tools\\chromdriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		 
		
		
	}

	
}

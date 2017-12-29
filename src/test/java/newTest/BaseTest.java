package newTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import driver.Driver;

public class BaseTest {
public static  WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception{
		driver = Driver.getWebDriver();
		
	}
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}

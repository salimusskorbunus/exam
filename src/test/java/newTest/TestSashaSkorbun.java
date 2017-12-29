package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSashaSkorbun extends BaseTest {
	@Test(priority = 1)
	public static void NavigateToHomePage() {
		driver.get("http://www.sashaskorbun.com");
		}
	
//	@Test(priority = 2)
//	public static void PagesElements() {
//		WebElement openContacts = driver.findElement(By.xpath("id(\"menu-item-309\")/a[1]"));
//		WebElement openGallery = driver.findElement(By.xpath("id(\"menu-item-69\")/a[1]"));
//		WebElement openAbout = driver.findElement(By.xpath("id(\"menu-item-41\")"));
//		WebElement openHome = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]"));
//	}
	
	@Test(priority = 2)
	public static void openGallery() {
		driver.findElement(By.xpath("id(\"menu-item-69\")")).click();
		
		
	}
	@Test(priority = 3)
	public static void openAbout() {
		driver.findElement(By.xpath("id(\"menu-item-41\")/a[1]")).click();
		
	}
	@Test(priority = 4)
	public static void openHome() {
		driver.findElement(By.xpath("id(\"menu-item-309\")/a[1]")).click();
		
	}
	@Test(priority = 5)
	public static void search() throws InterruptedException {
		driver.get("http://www.ya.ru");	
		WebElement search = driver.findElement(By.xpath("id(\"text\")"));
				
		search.click();
		search.clear();
		search.sendKeys("Portrait photography");
		search.click();
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		
		
		
		WebElement vv = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
		System.out.println(vv);
	
		
	}
}





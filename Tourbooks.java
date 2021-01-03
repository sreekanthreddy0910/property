package property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tourbooks {
WebDriver driver;
	
	@BeforeClass
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\korat\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseurl="https://www.propertycapsule.com/";
		driver.navigate().to(baseurl);
	}	
		@Test  
		public void TourBook() throws InterruptedException {
			String parentwindowhandle=driver.getWindowHandle();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"manage-btn\"]")).click();
			Thread.sleep(5000);
			for(String childtab:driver.getWindowHandles()) {
				driver.switchTo().window(childtab);
			}
		Thread.sleep(4000);
		String Actual=driver.getTitle();
		System.out.println(Actual);
		String Expected="Automated Tourbooks for Retail Real Estate | PropertyCapsule";
		if(Actual.equals(Expected)) {
			System.out.println("Tourbook page opened successfully");
		}
		else {
			System.out.println("Tourbook page is not opened");
		}
}
}
package property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task3 {
	
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
		public void Admin() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/header/div[3]/div[3]/a[1]")).click();
			Thread.sleep(5000);
			String Actual=driver.getTitle();
			System.out.println(Actual);
			String Expected="Property Capsule";
			
			if(Actual.equals(Expected)) {
				System.out.println("Admin page opened successfully");
			}
			else {
				System.out.println("Admin page not opened successfully");
			}
			

}
}
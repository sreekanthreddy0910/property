package property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Requestdemo {
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
	public void Demo() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/a[2]")).click();
	}

}

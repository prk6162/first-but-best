package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class following_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']//following::input[@id='email']")).sendKeys("pashya226511@gmail.com");
			driver.findElement(By.xpath("//*[@type='text']//following::input[@id='pass']")).sendKeys("123456");

		
	}
}
package selenium_sep_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasad\\Desktop\\All Drives and jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("pashya226511@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Prkul@6162");
		
		driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();// we use it for contains text
	}

}
